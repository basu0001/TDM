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

import com.cris.model.MasterTerminalParameter;
import com.cris.repository.MasterTerminalParameterRepository;

@Transactional
@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class MasterTerminalParameterController {
	 
		@Autowired
		private MasterTerminalParameterRepository masterTerminalParameterRepository;
		
		  @CrossOrigin(origins="http://localhost:4200") 
		  @GetMapping(value="/terminalparameters",produces = MediaType.APPLICATION_JSON_VALUE)
		  public List<MasterTerminalParameter> getAllTerminalParameters() {
		    
		    List<MasterTerminalParameter> terminalparameters = new ArrayList<>();
		    masterTerminalParameterRepository.findAll().forEach(terminalparameters::add); 
		    return terminalparameters;
		  } 
		  
		  @GetMapping("/terminalparameters/id/{id}")
		  public Optional<MasterTerminalParameter> findById(@PathVariable Integer id) {
		 
		    Optional<MasterTerminalParameter> terminalparameter = masterTerminalParameterRepository.findById(id);
		    return terminalparameter;
		  }

		  @PostMapping("/terminalparameters/create")
		  public MasterTerminalParameter postTerminalParameterMaster(@RequestBody MasterTerminalParameter terminalparameter) {
		 
		  try {
			  masterTerminalParameterRepository.save(terminalparameter);
			  
		  }catch(Exception e) {
			  System.out.println("Exception occurred" + e);
		  }
		  return terminalparameter;
		  }

		  @SuppressWarnings("hiding")
		@DeleteMapping("/terminalparamters/delete")
		  public <Integer> ResponseEntity<MasterTerminalParameter> deleteAllTerminalParameters() {
		    System.out.println("Delete All Terminal Parameters...");
		    masterTerminalParameterRepository.deleteAll();
		 
		    return new ResponseEntity<MasterTerminalParameter>(HttpStatus.OK);
		   }
		  
		  @PutMapping("/terminalparameters/{id}")
		  public ResponseEntity<MasterTerminalParameter> updateTerminalParameterMaster(@PathVariable("id") Integer id, @RequestBody MasterTerminalParameter terminalparameter) {
		    System.out.println("Update Terminal Parameter with ID = " + id + "...");
		    Optional<MasterTerminalParameter> terminalParameterData = masterTerminalParameterRepository.findById(id); 
		    if (terminalParameterData.isPresent()) {
		      MasterTerminalParameter _terminalparameter =terminalParameterData.get();
		      _terminalparameter.setTerminalParameterUid(terminalparameter.getTerminalParameterUid());
		      _terminalparameter.setAppId(terminalparameter.getAppId());
		      _terminalparameter.setParamType(terminalparameter.getParamType());
		      _terminalparameter.setName(terminalparameter.getName());
		      _terminalparameter.setValue(terminalparameter.getValue());
		      _terminalparameter.setDescription(terminalparameter.getDescription());
		      _terminalparameter.setValidStatus(terminalparameter.getValidStatus());
		      _terminalparameter.setValidFrom(terminalparameter.getValidFrom());
		      _terminalparameter.setValidUpto(terminalparameter.getValidUpto());
		      _terminalparameter.setSerialNumber(terminalparameter.getSerialNumber());
		      _terminalparameter.setUpdatedBy(terminalparameter.getUpdatedBy());
		      _terminalparameter.setUpdatedOn(terminalparameter.getUpdatedOn());
		      return new ResponseEntity<>(masterTerminalParameterRepository.save(_terminalparameter), HttpStatus.OK);
		       } else {
		      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		    }
		}  

}
