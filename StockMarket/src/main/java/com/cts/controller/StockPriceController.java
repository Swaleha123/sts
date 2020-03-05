package com.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.StockPriceRepository;
import com.cts.pojos.StockPrice;

@RestController
@RequestMapping("/StockPrice")
@CrossOrigin(origins="*",allowedHeaders="*")
public class StockPriceController {

	@Autowired
	private StockPriceRepository stockpriceRepository;
	@RequestMapping("/getAllstockprice")

	public Iterable<StockPrice> getAllstockprice()
	{
		return stockpriceRepository.findAll();
	}

	@PostMapping("/saveStockPrice")
	public StockPrice saveStockPrice(@RequestBody StockPrice stockprice)
	{
		System.out.println(stockprice);
		stockpriceRepository.save(stockprice);
		return stockprice;
	}

	@PutMapping("/updateStockPrice/{companyCode}")
	public StockPrice updateStockPrice(@RequestBody StockPrice stockprice,@PathVariable("companyCode") String companycode)
	{
		stockprice.setCompanyCode(companycode);
		System.out.println(stockprice);
		stockpriceRepository.save(stockprice);
		return stockprice;
	}

	 @DeleteMapping("/deleteStockPrice/{companyCode}")
	 public boolean deleteStockPrice(@PathVariable("companyCode") String companycode) {
	 System.out.println(companycode);
	 Optional<StockPrice> stockprice = stockpriceRepository.findById(companycode);
	 stockpriceRepository.delete(stockprice.get());
	 return true;
	 }

	 @GetMapping("/findOneInAll8/{companyCode}")
	 public StockPrice findoneinall(@PathVariable("companyCode") String companycode)
	 {
	 Optional<StockPrice> stockprice = stockpriceRepository.findById(companycode);
	 return stockprice.get();
	 }

}
