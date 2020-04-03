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

import com.cris.model.PosDetails;
import com.cris.repository.PosDetailsRepository;

@Transactional
@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PosDetailsController {	
 
@Autowired
private PosDetailsRepository posDetailsRepository;


@CrossOrigin(origins="http://localhost:4200") 
@GetMapping(value="/posdetails",produces = MediaType.APPLICATION_JSON_VALUE)
public List<PosDetails> getAllPosTerminalDetails() {
  
  List<PosDetails> posdetails = new ArrayList<>();
  posDetailsRepository.findAll().forEach(posdetails::add); 
  return posdetails;
} 

@GetMapping("/posdetails/id/{id}")
public Optional<PosDetails> findById(@PathVariable Integer id) {

  Optional<PosDetails> posdetails = posDetailsRepository.findById(id);
  return posdetails;
}

@PostMapping("/posdetails/create")
public PosDetails postposDetails(@RequestBody PosDetails posdetails) {

try {
	posDetailsRepository.save(posdetails);
	  
}catch(Exception e) {
	  System.out.println("Exception" + e);
}
return posdetails;
}

@SuppressWarnings("hiding")
@DeleteMapping("/postrmldetails/delete")
public <Integer> ResponseEntity<PosDetails> deleteAllPosDetails() {
  System.out.println("Delete All Pos Details...");
  posDetailsRepository.deleteAll();

  return new ResponseEntity<PosDetails>(HttpStatus.OK);
 }

@PutMapping("/posdetails/{id}")
public ResponseEntity<PosDetails> updatePosDetails(@PathVariable("id") Integer id, @RequestBody PosDetails posDetails) {
  System.out.println("Update Terminal with ID = " + id + "...");
  Optional<PosDetails> terminalData = posDetailsRepository.findById(id); 
  if (terminalData.isPresent()) {
    PosDetails _terminal =terminalData.get();
    _terminal.setPosKey(posDetails.getPosKey());
    _terminal.setMid(posDetails.getMid());
    _terminal.setPosTid(posDetails.getPosTid());
    _terminal.setPosMac(posDetails.getPosMac());
    _terminal.setPosMake(posDetails.getPosMake());
    _terminal.setPosBankCode(posDetails.getPosBankCode());
    _terminal.setValidStatus(posDetails.getValidStatus());
    _terminal.setServiceProviderCode(posDetails.getServiceProviderCode());
    _terminal.setUpdatedBy(posDetails.getUpdatedBy());
    _terminal.setUpdatedOn(posDetails.getUpdatedOn());
    return new ResponseEntity<>(posDetailsRepository.save(_terminal), HttpStatus.OK);
  } else {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}

}
