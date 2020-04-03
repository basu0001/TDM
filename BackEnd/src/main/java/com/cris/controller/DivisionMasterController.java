package com.cris.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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
import com.cris.repository.*;

@Transactional
@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DivisionMasterController {
	@Autowired
	  private DivisionMasterRepository divisionMasterRepository;
	 
	  @CrossOrigin(origins="http://localhost:4200") 
	  @GetMapping(value="/divisions",produces = MediaType.APPLICATION_JSON_VALUE)
	  public List<DivisionMaster> getAllDivisions() {
	    
	    List<DivisionMaster> divisions = new ArrayList<>();
	    divisionMasterRepository.findAll().forEach(divisions::add); 
	    return divisions;
	  } 
	  
	  @GetMapping("/divisions/id/{id}")
	  public Optional<DivisionMaster> findById(@PathVariable Integer id) {
	 
	    Optional<DivisionMaster> divisions = divisionMasterRepository.findById(id);
	    return divisions;
	  }

	  @PostMapping("/divisions/create")
	  public DivisionMaster postDivisionMaster(@RequestBody DivisionMaster division) {
	 
	  try {
		  divisionMasterRepository.save(division);
		  
	  }catch(Exception e) {
		  System.out.println("Exception" + e);
	  }
	  return division;
	  }
	  
	@SuppressWarnings("hiding")
	@DeleteMapping("/divisions/delete")
	  public <Integer> ResponseEntity<DivisionMaster> deleteAllDivisions() {
	    System.out.println("Delete All Divisions...");
	    divisionMasterRepository.deleteAll();
	 
	    return new ResponseEntity<DivisionMaster>(HttpStatus.OK);
	   }
	  
	  @PutMapping("/divisions/{id}")
	  public ResponseEntity<DivisionMaster> updateDivisionMaster(@PathVariable("id") Integer id, @RequestBody DivisionMaster terminal) {
	    System.out.println("Update Division Master with ID = " + id + "...");
	    Optional<DivisionMaster> divisionData = divisionMasterRepository.findById(id); 
	    if (divisionData.isPresent()) {
	      DivisionMaster _terminal =divisionData.get();
	      _terminal.setDivisionId(terminal.getDivisionId());
	      _terminal.setDivisionName(terminal.getDivisionName());
	      _terminal.setValidStatus(terminal.getValidStatus());
	      _terminal.setUpdatedBy(terminal.getUpdatedBy());
	      _terminal.setUpdatedOn(terminal.getUpdatedOn());
	      _terminal.setDivisionCode(terminal.getDivisionCode());
	      return new ResponseEntity<>(divisionMasterRepository.save(_terminal), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	   

	  
}
