package com.sunil.dataStore;

import com.sunil.dataStore.dto.RiverDTO;
import com.sunil.dataStore.dto.dao.RiverDAO;
import com.sunil.dataStore.dto.dao.RiverDAOImpl;

public class RiverDAOTester {

	public static void main(String[] args) {

		RiverDTO dto = new RiverDTO("Kaveri", "Talakaveri", 805, 4, true);

		RiverDTO dto1 = new RiverDTO("Sharavathi", "Amboothirtha", 165, 1, true);

		RiverDAO dao = new RiverDAOImpl();
		dao.save(dto);
		dao.save(dto1);

		System.out.println(dao.totalItems());

		RiverDTO kaveriupdate = new RiverDTO("Cauvery", "TalaKaadu", 808, 4, true);
		dao.update(kaveriupdate);
		System.out.println("total items" + dao.totalItems());

		RiverDTO deletedto = new RiverDTO("Sharavathi", "Kundadri", 198, 1, true);
		dao.delete(deletedto);
		System.out.println(dao.totalItems());
		
		RiverDTO dt = dao.findByName("Kaveri");
		System.out.println(dt);

	}

}
