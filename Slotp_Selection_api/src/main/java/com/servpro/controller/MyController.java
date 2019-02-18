package com.servpro.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servpro.entity.SlotUtil;
import com.servpro.model.SlotMsg;
import com.servpro.repository.SlotRepository;
import com.servpro.repository.UserRepository;


@RestController
public class MyController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SlotRepository slotRepository;
	
	@GetMapping("/getDetails")
	public SlotUtil getData() {
		
		SlotUtil st = new SlotUtil();
		
		st.setSlotStatus(true);
		st.setSlotName("slot1");
		st.setSlotTiming("09AM-01PM");
		try {
			st.setLastModifiedDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-02-15"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		userRepository.save(st);
		
		SlotUtil st2 = new SlotUtil();
		st2.setSlotStatus(false);
		st2.setSlotName("slot2");
		st2.setSlotTiming("02PM-04PM");
		try {
			st2.setLastModifiedDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-02-15"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SlotUtil st3 = new SlotUtil();
		st3.setSlotStatus(true);
		st3.setSlotName("slot3");
		st3.setSlotTiming("04PM-06PM");
		try {
			st3.setLastModifiedDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-02-15"));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		 userRepository.save(st3);
		 
			SlotUtil st4 = new SlotUtil();
			st4.setSlotStatus(false);
			st4.setSlotName("slot4");
			st4.setSlotTiming("06AM-09AM");
			try {
				st4.setLastModifiedDate(new SimpleDateFormat("yyyy-MM-dd").parse("2019-02-15"));
			} catch (ParseException e) {
					e.printStackTrace();
			}
			 userRepository.save(st4);
		
		return userRepository.save(st2);
		
		
	}
	
	
	@GetMapping("/getSlot")
	public List<SlotUtil> getSlot(){
		boolean slotStatus = false;
		return userRepository.findBySlotStatus(slotStatus);
	}
	
	@PostMapping("book/{date}/{sId}")
	public ResponseEntity<?> selectSlot(@DateTimeFormat(pattern="yyyy-MM-dd") @PathVariable("date") Date date ,@PathVariable("sId") int sId){
		boolean slotStatus = false;
		SlotUtil slt =  slotRepository.findBySlotStatus(slotStatus);
       if(sId == slt.getSrNo()) {
    	   slt.setSlotStatus(true);
    	   userRepository.save(slt);
    	   return new ResponseEntity<>(new SlotMsg("success"),HttpStatus.OK);
       }
       else {
    	   return new ResponseEntity<>(new SlotMsg("error"),HttpStatus.NOT_FOUND);
       } 
	} 
}
