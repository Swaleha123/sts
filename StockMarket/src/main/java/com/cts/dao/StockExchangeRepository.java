package com.cts.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.pojos.StockExchange;

public interface StockExchangeRepository extends CrudRepository<StockExchange,String>{

	Optional<StockExchange> findById(String id);

}
