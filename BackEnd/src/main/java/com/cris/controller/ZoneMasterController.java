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
@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class ZoneMasterController {
@Autowired
private ZoneMasterRepository zoneMasterRepository;


@GetMapping(value="/zonemaster",produces = MediaType.APPLICATION_JSON_VALUE)
public List<ZoneMaster> getAllZoneMasters() {
  
  List<ZoneMaster> zonemaster = new ArrayList<>();
  zoneMasterRepository.findAll().forEach(zonemaster::add); 
  return zonemaster;
}

@GetMapping("/zonemaster/id/{id}")
public Optional<ZoneMaster> findById(@PathVariable Integer id) {

  Optional<ZoneMaster> zm = zoneMasterRepository.findById(id);
  return zm;
}

@PostMapping("/zonemaster/create")
public ZoneMaster postposTerminalDetails(@RequestBody ZoneMaster zonemaster) {

try {
	zoneMasterRepository.save(zonemaster);
	  
}catch(Exception e) {
	  System.out.println("Exception" + e);
}
return zonemaster;
}

@SuppressWarnings("hiding")
@DeleteMapping("/zonemaster/delete")
public <Integer> ResponseEntity<ZoneMaster> deleteAllZoneMaster() {
  System.out.println("Delete All Pos Terminal Details...");
  zoneMasterRepository.deleteAll();

  return new ResponseEntity<ZoneMaster>(HttpStatus.OK);
 }

@PutMapping("/zonemaster/{id}")
public ResponseEntity<ZoneMaster> updateZoneMaster(@PathVariable("id") Integer id, @RequestBody ZoneMaster zm) {
  System.out.println("Update Terminal with ID = " + id + "...");
  Optional<ZoneMaster> terminalData = zoneMasterRepository.findById(id); 
  if (terminalData.isPresent()) {
	 ZoneMaster _terminal =terminalData.get();
    _terminal.setZoneId(zm.getZoneId());
    _terminal.setZoneName(zm.getZoneName());
    _terminal.setValidStatus(zm.getValidStatus());
    _terminal.setUpdatedBy(zm.getUpdatedBy());
    _terminal.setUpdatedOn(zm.getUpdatedOn());
    _terminal.setZoneCode(zm.getZoneCode());
    return new ResponseEntity<>(zoneMasterRepository.save(_terminal), HttpStatus.OK);
  } else {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}


	
	  }
	  

