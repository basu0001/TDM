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

import com.cris.model.StateMaster;
import com.cris.repository.StateMasterRepository;

@Transactional
@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StateMasterController {
  @Autowired
  private StateMasterRepository stateMasterRepository;
  
  @CrossOrigin(origins="http://localhost:4200") 
  @GetMapping(value="/statemaster",produces = MediaType.APPLICATION_JSON_VALUE)
  public List<StateMaster> getAllStateMasters() {
    
    List<StateMaster> statemaster= new ArrayList<>();
    stateMasterRepository.findAll().forEach(statemaster::add); 
    return statemaster;
  } 
  
  @GetMapping("/statemaster/id/{id}")
  public Optional<StateMaster> findById(@PathVariable Integer id) {
 
    Optional<StateMaster> statemaster = stateMasterRepository.findById(id);
    return statemaster;
  }

  @PostMapping("/statemaster/create")
  public StateMaster postStateMaster(@RequestBody StateMaster statemaster) {
 
  try {
	  stateMasterRepository.save(statemaster);
	  
  }catch(Exception e) {
	  System.out.println("Exception occurred" + e);
  }
  return statemaster;
  }

  @SuppressWarnings("hiding")
@DeleteMapping("/statemaster/delete")
  public <Integer> ResponseEntity<StateMaster> deleteAllStateMasters() {
    System.out.println("Delete All State Masters...");
    stateMasterRepository.deleteAll();
 
    return new ResponseEntity<StateMaster>(HttpStatus.OK);
   }
  
  @PutMapping("/statemasters/{id}")
  public ResponseEntity<StateMaster> updateTerminalTiming(@PathVariable("id") Integer id, @RequestBody StateMaster statemaster) {
    System.out.println("Update State Master with ID = " + id + "...");
    Optional<StateMaster> stateMasterData = stateMasterRepository.findById(id); 
    if (stateMasterData.isPresent()) {
      StateMaster _statemaster =stateMasterData.get();
      _statemaster.setStateIndex(statemaster.getStateIndex());
      _statemaster.setStateCode(statemaster.getStateCode());
      _statemaster.setStateName(statemaster.getStateName());
      _statemaster.setStateCategory(statemaster.getStateCategory());
      _statemaster.setStateTin(statemaster.getStateTin());
      _statemaster.setStateGstin(statemaster.getStateGstin());
      _statemaster.setPrincipalOfficeZoneId(statemaster.getPrincipalOfficeZoneId());
      _statemaster.setIrPrincipalOfficeAddress(statemaster.getIrPrincipalOfficeAddress());
      return new ResponseEntity<>(stateMasterRepository.save(_statemaster), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
  
}
