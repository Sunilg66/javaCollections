package com.sunil.dataStore;

import java.util.Collection;
import java.util.Iterator;

import com.sunil.dataStore.dto.TempleDTO;
import com.sunil.dataStore.dto.dao.TempleDAO;
import com.sunil.dataStore.dto.dao.TempleDAOImpl;

public class TempleDAOTester {

	public static void main(String[] args) {

		TempleDTO dto = new TempleDTO(1, "Sri Kshetra Dharmasthala Temple", "Dharmasthala", 150.00d, true, 13, true,
				"Sri Manjunatheshwara", true);

		TempleDTO dto1 = new TempleDTO(2, "Kukke shri Subramanya Temple", "KukkeSubramanya", 130.00d, true, 16, true,
				"Karthikeya", true);

		TempleDTO dto2 = new TempleDTO(3, "Sringeri Sharada Peetha", "Sringeri", 100.00d, true, 9, false, "Sharadambe",
				true);

		TempleDTO dto3 = new TempleDTO(4, "Sri Kshetra Horanadu", "Horanadu", 110.00d, true, 11, false,
				"Annapoorneshwari", true);

		TempleDAO dao = new TempleDAOImpl();
		boolean c = dao.save(dto);
		System.out.println(c);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);

		System.out.println("total items : " + dao.totalItems());

		dao.delete(dto3);
		System.out.println("total items : " + dao.totalItems());

		System.out.println(dao.findFirstItem());
		System.out.println(dao.findLastItem());

		TempleDTO findByName = dao.findByName("Kukke shri Subramanya Temple");
		System.out.println("find by name: " + findByName);

		TempleDTO findByLocation = dao.findByLocation("Sringeri");
		System.out.println("find by location : " + findByLocation);

		TempleDTO findByloctionandName = dao.findByLocationAndName("Dharmasthala", "Sri Kshetra Dharmasthala Temple");
		System.out.println("find by location and name : " + findByloctionandName);

		Collection<TempleDTO> dt = dao.findAll();
		for (TempleDTO temp : dt) {
			System.out.println(temp);
		}
		Collection<TempleDTO> collection = dao.findAllTempleByEntryFeeGreaterThan(120.00d);
		for (TempleDTO templedto : collection) {
			System.out.println(templedto);
		}
		Collection<TempleDTO> coll = dao.findAllTempleByNoOfPoojariesGreaterThan(12);
		for (TempleDTO temp : coll) {
			System.out.println(temp);
		}
		String str = dao.findLocationByName("Sri Kshetra Horanadu");
		System.out.println(str);

		Collection<String> collect = dao.findAllLocation();
		for (String st : collect) {
			System.out.println(st);

		}
		Collection<TempleDTO> colldto = dao.findAllTempleByLocationStartsWith('H');
		for (TempleDTO templeDTO : colldto) {
			System.out.println(templeDTO);

		}

	}

}
