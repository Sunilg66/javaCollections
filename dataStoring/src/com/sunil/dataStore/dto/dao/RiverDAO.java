package com.sunil.dataStore.dto.dao;

import com.sunil.dataStore.dto.RiverDTO;

public interface RiverDAO {

	boolean save(RiverDTO dto);

	int totalItems();

	void update(RiverDTO dto);

	boolean delete(RiverDTO dto);

	RiverDTO findByName(String name);

}
