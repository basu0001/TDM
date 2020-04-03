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

import com.cris.model.TerminalAppLocParam;
import com.cris.repository.TerminalAppLocParamRepository;

@Transactional
@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class TerminalAppLocParamController {
	
	@Autowired
	private TerminalAppLocParamRepository terminalAppLocParamRepository;
	
	  @CrossOrigin(origins="http://localhost:4200") 
	  @GetMapping(value="/trmlapploc",produces = MediaType.APPLICATION_JSON_VALUE)
	  public List<TerminalAppLocParam> getAllTrmlAppLocParam() {
	    
	    List<TerminalAppLocParam> terminalparameters = new ArrayList<>();
	    terminalAppLocParamRepository.findAll().forEach(terminalparameters::add); 
	    return terminalparameters;
	  } 
	  
	  @GetMapping("/trmlapploc/id/{id}")
	  public Optional<TerminalAppLocParam> findById(@PathVariable Integer id) {
	 
	    Optional<TerminalAppLocParam> terminalparameter = terminalAppLocParamRepository.findById(id);
	    return terminalparameter;
	  }

	  @PostMapping("/trmlapploc/create")
	  public TerminalAppLocParam postTrmlAppLocParam(@RequestBody TerminalAppLocParam terminalparameter) {
	 
	  try {
		  terminalAppLocParamRepository.save(terminalparameter);
		  
	  }catch(Exception e) {
		  System.out.println("Exception occurred" + e);
	  }
	  return terminalparameter;
	  }

	  @SuppressWarnings("hiding")
	@DeleteMapping("/trmlapploc/delete")
	  public <Integer> ResponseEntity<TerminalAppLocParam> deleteAllTrmlAppLocParam() {
	    System.out.println("Delete All TerminalAppLocParam...");
	    terminalAppLocParamRepository.deleteAll();
	 
	    return new ResponseEntity<TerminalAppLocParam>(HttpStatus.OK);
	   }
	  
	  @PutMapping("/trmlapploc/{id}")
	  public ResponseEntity<TerminalAppLocParam> updateTrmlAppLocParam(@PathVariable("id") Integer id, @RequestBody TerminalAppLocParam terminalparameter) {
	    System.out.println("Update TerminalAppLocParam with ID = " + id + "...");
	    Optional<TerminalAppLocParam> terminalParameterData = terminalAppLocParamRepository.findById(id); 
	    if (terminalParameterData.isPresent()) {
	    	TerminalAppLocParam _terminalparameter =terminalParameterData.get();
	      _terminalparameter.setTrmlAppLocParamUid(terminalparameter.getTrmlAppLocParamUid());
	      _terminalparameter.setTerminalId(terminalparameter.getTerminalId());
	      _terminalparameter.setAppId(terminalparameter.getAppId());
	      _terminalparameter.setLocationId(terminalparameter.getLocationId());
	      _terminalparameter.setTerminalParameterUid(terminalparameter.getTerminalParameterUid());
	      _terminalparameter.setValidStatus(terminalparameter.getValidStatus());
	      _terminalparameter.setValidFrom(terminalparameter.getValidFrom());
	      _terminalparameter.setValidUpto(terminalparameter.getValidUpto());
	      _terminalparameter.setUpdatedBy(terminalparameter.getUpdatedBy());
	      _terminalparameter.setUpdatedOn(terminalparameter.getUpdatedOn());
	      return new ResponseEntity<>(terminalAppLocParamRepository.save(_terminalparameter), HttpStatus.OK);
	       } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}  


}
