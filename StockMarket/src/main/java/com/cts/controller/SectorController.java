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

import com.cts.dao.SectorRepository;
import com.cts.pojos.Sector;

@RestController
@RequestMapping("/Sector")
@CrossOrigin(origins="*",allowedHeaders="*")
public class SectorController {
	@Autowired
	private SectorRepository sectorRepository;
	@RequestMapping("/getAllsector")

	public Iterable<Sector> getAllsector()
	{
		return sectorRepository.findAll();
	}

	@PostMapping("/saveSector")
	public Sector saveSector(@RequestBody Sector sector)
	{
		System.out.println(sector);
		sectorRepository.save(sector);
		return sector;
	}

	@PutMapping("/updateSector/{id}")
	public Sector updateSector(@RequestBody Sector sector,@PathVariable("id") String id)
	{
		sector.setId(id);
		System.out.println(sector);
		sectorRepository.save(sector);
		return sector;
	}
	
	@DeleteMapping("/deleteSector/{id}")
	 public boolean deleteSector(@PathVariable("id") String id) {
	 System.out.println(id);
	 sectorRepository.deleteById(id);
	 return true;
	 }
	
	 @GetMapping("/findOneInAll2/{id}")
	 public Sector findoneinall(@PathVariable("id") String id)
	 {
	 Optional<Sector> sector = sectorRepository.findById(id);
	 return sector.get();
	 }



}
