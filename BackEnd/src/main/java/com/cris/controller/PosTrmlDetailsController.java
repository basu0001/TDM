
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
@Controller()
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PosTrmlDetailsController {	
 
@Autowired
private PosTrmlDetailsRepository posTrmlDetailsRepository;

@CrossOrigin(origins="http://localhost:4200") 
@GetMapping(value="/postrmldetails",produces = MediaType.APPLICATION_JSON_VALUE)
public List<PosTrmlDetails> getAllPosTrmlDetails() {
  
  List<PosTrmlDetails> posterminals = new ArrayList<>();
  posTrmlDetailsRepository.findAll().forEach(posterminals::add); 
  return posterminals;
} 

@GetMapping("/postrmldetails/id/{id}")
public Optional<PosTrmlDetails> findById(@PathVariable Integer id) {

  Optional<PosTrmlDetails> posterminal = posTrmlDetailsRepository.findById(id);
  return posterminal;
}

@PostMapping("/postrmldetails/create")
public PosTrmlDetails postposTrmlDetails(@RequestBody PosTrmlDetails posterminal) {

try {
	posTrmlDetailsRepository.save(posterminal);
	  
}catch(Exception e) {
	  System.out.println("Exception" + e);
}
return posterminal;
}

@SuppressWarnings("hiding")
@DeleteMapping("/delete")
public <Integer> ResponseEntity<PosTrmlDetails> deleteAllPosTrmlDetails() {
  System.out.println("Delete All Pos Terminal Details...");
  posTrmlDetailsRepository.deleteAll();

  return new ResponseEntity<PosTrmlDetails>(HttpStatus.OK);
 }

@PutMapping("/postrmldetails/{id}")
public ResponseEntity<PosTrmlDetails> updatePosTerminalDetails(@PathVariable("id") Integer id, @RequestBody PosTrmlDetails posTerminalDetails) {
  System.out.println("Update Terminal with ID = " + id + "...");
  Optional<PosTrmlDetails> terminalData = posTrmlDetailsRepository.findById(id); 
  if (terminalData.isPresent()) {
    PosTrmlDetails _terminal =terminalData.get();
    _terminal.setPosTrmlUid(posTerminalDetails.getPosTrmlUid());
    _terminal.setPosKey(posTerminalDetails.getPosKey());
    _terminal.setTerminalId(posTerminalDetails.getTerminalId());
    _terminal.setTerminalTypeId(posTerminalDetails.getTerminalTypeId());
    _terminal.setLocationId(posTerminalDetails.getLocationId());
    _terminal.setValidFrom(posTerminalDetails.getValidFrom());
    _terminal.setValidUpto(posTerminalDetails.getValidUpto());
    _terminal.setValidStatus(posTerminalDetails.getValidStatus());
    _terminal.setUpdatedBy(posTerminalDetails.getUpdatedBy());
    _terminal.setUpdatedBy(posTerminalDetails.getUpdatedBy());
    _terminal.setUpdatedOn(posTerminalDetails.getUpdatedOn());
    return new ResponseEntity<>(posTrmlDetailsRepository.save(_terminal), HttpStatus.OK);
  } else {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
}
