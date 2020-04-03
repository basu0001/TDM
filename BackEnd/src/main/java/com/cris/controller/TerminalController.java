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
import com.cris.repository.TerminalRepository;
import com.cris.model.*;


@Transactional
@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class TerminalController {
  @Autowired
  private TerminalRepository terminalRepository;
  
  @CrossOrigin(origins="http://localhost:4200") 
  @GetMapping(value="/terminals",produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Terminal> getAllTerminals() {
    
    List<Terminal> terminals = new ArrayList<>();
    terminalRepository.findAll().forEach(terminals::add); 
    return terminals;
  } 
  
  @GetMapping("/terminals1")
  public Optional<Terminal> findById(@PathVariable Integer id) {
 
    Optional<Terminal> terminal = terminalRepository.findById(id);
    return terminal;
  }
  @GetMapping("/terminals/id/{id}")
  public Optional<Terminal> findById1(@PathVariable Integer id) {
 
    Optional<Terminal> terminal = terminalRepository.findById(id);
    return terminal;
  }

  @PostMapping("/terminals/create")
  public Terminal postTerminal(@RequestBody Terminal terminal) {
 
  try {
	  terminalRepository.save(terminal);
	  
  }catch(Exception e) {
	  System.out.println("Exception" + e);
  }
  return terminal;
  }
  @PostMapping("/terminals1/create")
  public Terminal postTerminal1(@RequestBody Terminal terminal) {
 
  try {
	  terminalRepository.save(terminal);
	  
  }catch(Exception e) {
	  System.out.println("Exception" + e);
  }
  return terminal;
  }

  @SuppressWarnings("hiding")
@DeleteMapping("/terminals/delete")
  public <Integer> ResponseEntity<Terminal> deleteAllTerminals() {
    System.out.println("Delete All Terminals...");
    terminalRepository.deleteAll();
 
    return new ResponseEntity<Terminal>(HttpStatus.OK);
   }
  
  @PutMapping("/terminals/{id}")
  public ResponseEntity<Terminal> updateTerminal(@PathVariable("id") Integer id, @RequestBody Terminal terminal) {
    System.out.println("Update Terminal with ID = " + id + "...");
    Optional<Terminal> terminalData = terminalRepository.findById(id); 
    if (terminalData.isPresent()) {
      Terminal _terminal =terminalData.get();
      _terminal.setTerminalId(terminal.getTerminalId());
      _terminal.setTerminalCode(terminal.getTerminalCode());
      _terminal.setLocationId(terminal.getLocationId());
      _terminal.setTrmlSrvNumber(terminal.getTrmlSrvNumber());
      _terminal.setWindowNumber(terminal.getWindowNumber());
      _terminal.setValidStatus(terminal.getValidStatus());
      _terminal.setAdminId(terminal.getAdminId());
      _terminal.setTerminalIp(terminal.getTerminalIp());
      _terminal.setTrmlSrvType(terminal.getTrmlSrvType());
      _terminal.setUpdatedBy(terminal.getUpdatedBy());
      _terminal.setCommissionDate(terminal.getCommissionDate());
      _terminal.setUpdatedOn(terminal.getUpdatedOn());
      return new ResponseEntity<>(terminalRepository.save(_terminal), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  @PutMapping("/terminals/update/{id}")
  public ResponseEntity<Terminal> updateTerminal1(@PathVariable("id") Integer id, @RequestBody Terminal terminal) {
    System.out.println("Update Terminal with ID = " + id + "...");
    Optional<Terminal> terminalData = terminalRepository.findById(id); 
    if (terminalData.isPresent()) {
      Terminal _terminal =terminalData.get();
      _terminal.setTerminalId(terminal.getTerminalId());
      _terminal.setTerminalCode(terminal.getTerminalCode());
      _terminal.setLocationId(terminal.getLocationId());
      _terminal.setTrmlSrvNumber(terminal.getTrmlSrvNumber());
      _terminal.setWindowNumber(terminal.getWindowNumber());
      _terminal.setValidStatus(0);
      _terminal.setAdminId(terminal.getAdminId());
      _terminal.setTerminalIp(terminal.getTerminalIp());
      _terminal.setTrmlSrvType(terminal.getTrmlSrvType());
      _terminal.setUpdatedBy(terminal.getUpdatedBy());
      _terminal.setCommissionDate(terminal.getCommissionDate());
      _terminal.setUpdatedOn(terminal.getUpdatedOn());
      return new ResponseEntity<>(terminalRepository.save(_terminal), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
   
   
  
  @GetMapping(value="/join6",produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Join6> fetchJoin_Join6() {
 
    List<Join6> join = new ArrayList<Join6>();
    try {
    join = terminalRepository.fetchJoin_Join6();
    }catch(Exception e) {
    	System.out.println(e);
    }
    return join;
  }


}
