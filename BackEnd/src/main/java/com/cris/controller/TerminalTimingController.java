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
import com.cris.model.TerminalTiming;
import com.cris.repository.TerminalTimingRepository;

@Transactional
@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TerminalTimingController {
  @Autowired
  private TerminalTimingRepository terminalTimingRepository;
  
  @CrossOrigin(origins="http://localhost:4200") 
  @GetMapping(value="/terminaltiming",produces = MediaType.APPLICATION_JSON_VALUE)
  public List<TerminalTiming> getAllTerminalTiming() {
    
    List<TerminalTiming> terminaltiming= new ArrayList<>();
    terminalTimingRepository.findAll().forEach(terminaltiming::add); 
    return terminaltiming;
  } 
  
  @GetMapping("/terminaltiming/id/{id}")
  public Optional<TerminalTiming> findById(@PathVariable Integer id) {
 
    Optional<TerminalTiming> terminaltiming = terminalTimingRepository.findById(id);
    return terminaltiming;
  }

  @PostMapping("/terminaltiming/create")
  public TerminalTiming postTerminalTiming(@RequestBody TerminalTiming terminaltiming) {
 
  try {
	  terminalTimingRepository.save(terminaltiming);
	  
  }catch(Exception e) {
	  System.out.println("Exception occurred" + e);
  }
  return terminaltiming;
  }

  @SuppressWarnings("hiding")
@DeleteMapping("/terminaltiming/delete")
  public <Integer> ResponseEntity<TerminalTiming> deleteAllTerminalTimings() {
    System.out.println("Delete All Terminal Parameters...");
    terminalTimingRepository.deleteAll();
 
    return new ResponseEntity<TerminalTiming>(HttpStatus.OK);
   }
  
  @PutMapping("/terminaltimings/{id}")
  public ResponseEntity<TerminalTiming> updateTerminalTiming(@PathVariable("id") Integer id, @RequestBody TerminalTiming terminaltiming) {
    System.out.println("Update Terminal Timing with ID = " + id + "...");
    Optional<TerminalTiming> terminalTimingData = terminalTimingRepository.findById(id); 
    if (terminalTimingData.isPresent()) {
      TerminalTiming _terminaltiming =terminalTimingData.get();
      _terminaltiming.setTerminalTimingUid(terminaltiming.getTerminalTimingUid());
      _terminaltiming.setTerminalId(terminaltiming.getTerminalId());
      _terminaltiming.setAppId(terminaltiming.getAppId());
      _terminaltiming.setUsageFrequencyType(terminaltiming.getUsageFrequencyType());
      _terminaltiming.setUsageFrequencyValue(terminaltiming.getUsageFrequencyValue());
      _terminaltiming.setStartDate(terminaltiming.getStartDate());
      _terminaltiming.setEndDate(terminaltiming.getEndDate());
      _terminaltiming.setStartTime(terminaltiming.getStartTime());
      _terminaltiming.setEndTime(terminaltiming.getEndTime());
      return new ResponseEntity<>(terminalTimingRepository.save(_terminaltiming), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
}
