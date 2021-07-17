package com.sunil.dataStore.dto.dao;

import java.util.Collection;

import com.sunil.dataStore.dto.TempleDTO;

public interface TempleDAO {

	boolean save(TempleDTO dto);

	boolean delete(TempleDTO dto);

	int totalItems();

	TempleDTO findByName(String name);

	TempleDTO findByLocation(String name);

	TempleDTO findByLocationAndName(String location, String name);

	TempleDTO findFirstItem();

	TempleDTO findLastItem();

	Collection<TempleDTO> findAll();

	Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost);

	Collection<TempleDTO> findAllTempleByNoOfPoojariesGreaterThan(int num);

	Collection<TempleDTO> findAllTempleByLocationStartsWith(char character);

	String findLocationByName(String name);
	
	Collection<String> findAllLocation();

}
