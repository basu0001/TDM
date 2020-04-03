package com.cris.controller;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cris.model.*;
import com.cris.repository.LocationMasterRepository;
    
    @Transactional
	@Controller
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RestController
	public class LocationMasterController {
		
	  @Autowired
	  private LocationMasterRepository locationMasterRepository;
	  
	  @CrossOrigin(origins="http://localhost:4200") 
	  @GetMapping(value="/locationmaster",produces = MediaType.APPLICATION_JSON_VALUE)
	  public List<LocationMaster> getAllLocationMasters() {
	    
	    List<LocationMaster> locmaster = new ArrayList<>();
	    locationMasterRepository.findAll().forEach(locmaster::add); 
	    return locmaster;
	    }
	 
	  @GetMapping("/locationmaster/id/{id}")
	  public Optional<LocationMaster> findById(@PathVariable Integer id) {
	 
	    Optional<LocationMaster> lm = locationMasterRepository.findById(id);
	    return lm;
	  }

	  @PostMapping("/locationmaster/create")
	  public LocationMaster postLocationMaster(@RequestBody LocationMaster locationmaster) {
	 
	  try {
		  locationMasterRepository.save(locationmaster);
		  
	  }catch(Exception e) {
		  System.out.println("Exception" + e);
	  }
	  return locationmaster;
	  }

	  @SuppressWarnings("hiding")
	@DeleteMapping("/locationmaster/delete")
	  public <Integer> ResponseEntity<LocationMaster> deleteAllLocations() {
	    System.out.println("Delete All Locations..");
	    locationMasterRepository.deleteAll();
	 
	    return new ResponseEntity<LocationMaster>(HttpStatus.OK);
	   }
	  
	  @PutMapping("/locationmaster/{id}")
	  public ResponseEntity<LocationMaster> updateLocationMaster(@PathVariable("id") Integer id, @RequestBody LocationMaster lm) {
	    System.out.println("Update Location Master with ID = " + id + "...");
	    Optional<LocationMaster> terminalData = locationMasterRepository.findById(id); 
	    if (terminalData.isPresent()) {
	    	LocationMaster _terminal =terminalData.get();
	      _terminal.setLocationId(lm.getLocationId());
	      _terminal.setLocCode(lm.getLocCode());
	      _terminal.setLocName(lm.getLocName());
	      _terminal.setLocType(lm.getLocType());
	      _terminal.setDivisionId(lm.getDivisionId());
	      _terminal.setZoneId(lm.getZoneId());
	      _terminal.setStateIndex(lm.getStateIndex());
	      _terminal.setCommisionDate(lm.getCommisionDate());
	      _terminal.setValidStatus(lm.getValidStatus());
	      _terminal.setValidFrom(lm.getValidFrom());
	      _terminal.setValidUpto(lm.getValidUpto());
	      _terminal.setUpdatedBy(lm.getUpdatedBy());
	      _terminal.setUpdatedOn(lm.getUpdatedOn());
	      return new ResponseEntity<>(locationMasterRepository.save(_terminal), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  
	  
	  
 }
	
