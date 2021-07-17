package com.sunil.dataStore;

import com.sunil.dataStore.dto.TempleDTO;
import com.sunil.dataStore.dto.dao.TempleDAO;
import com.sunil.dataStore.dto.dao.TempleDAOImpl;

public class TempleDAOTester {

	public static void main(String[] args) {
		
		TempleDTO dto = new TempleDTO(1,"Sri Kshetra Dharmasthala Temple","Dharmasthala",150.00d,true,13,true,"Sri Manjunatheshwara",true);
		
		TempleDTO dto1 = new TempleDTO(2,"Kukke shri Subramanya Temple","KukkeSubramanya",130.00d,true,16,true,"Karthikeya",true);
		
		TempleDTO dto2 = new TempleDTO(3,"Sringeri Sharada Peetha","Sringeri",100.00d,true,9,false,"Sharadambe",true);
		
		TempleDTO dto3 = new TempleDTO(4,"Sri Kshetra Horanadu","Horanadu",110.00d,true,11,false,"Annapoorneshwari",true);
		
	   TempleDAO dao = new TempleDAOImpl();
	   dao.save(dto);
	   dao.save(dto1);
	   dao.save(dto2);
	   dao.save(dto3);
	   
	   System.out.println("total items : " +  dao.totalItems());
	   
	   TempleDTO deleteTemple = new TempleDTO(3,"Sringeri Sharada Peetha","Sringeri",100.00d,true,9,false,"Sharadambe",true);
	   dao.delete(deleteTemple);
	   System.out.println("deleted temple : " + deleteTemple);
	   
	   dao.findFirstItem();
	   dao.findLastItem();
	   
	 TempleDTO findByName = dao.findByName("Kukke shri Subramanya Temple");
	 System.out.println("find by name: " +findByName);
	 
	 TempleDTO findByLocation = dao.findByLocation("Sringeri");
	 System.out.println("find by location : " + findByLocation);

	 TempleDTO findByloctionandName = dao.findByLocationAndName("Dharmasthala","Sri Kshetra Dharmasthala Temple");
     System.out.println("find by location and name : " + findByloctionandName);
     
     dao.findAll();
     dao.findAllTempleByEntryFeeGreaterThan(120.00d);
     dao.findAllTempleByNoOfPoojariesGreaterThan(12);
     dao.findLocationByName("Sri Kshetra Horanadu");
     dao.findAllLocation();
     dao.findAllTempleByLocationStartsWith('H');
     
	 
	 
	}

}
