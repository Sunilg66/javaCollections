package com.sunil.dataStore.dto.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.sunil.dataStore.dto.TempleDTO;

public class TempleDAOImpl implements TempleDAO {

	private List<TempleDTO> list = new ArrayList<TempleDTO>();

	@Override
	public boolean save(TempleDTO dto) {
		boolean adding = list.add(dto);
		System.out.println("dto : " + dto);
		System.out.println("dto added : " + adding);
		return adding;
	}

	// delete(TempleDTO dto)//
	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("delete : " + dto);
		}
		return this.list.remove(dto);
	}

	// totalItems();//
	@Override
	public int totalItems() {
		int totalItems = list.size();

		return totalItems;
	}

	@Override
	public TempleDTO findFirstItem() {

		return this.list.get(0);
	}

	@Override
	public TempleDTO findLastItem() {

		return list.get(list.size() - 1);
	}

	// findByName//
	@Override
	public TempleDTO findByName(String name) {
		TempleDTO dto = null;

		Iterator<TempleDTO> findByName = this.list.iterator();
		while (findByName.hasNext()) {
			TempleDTO byName = findByName.next();
			if (byName.getName().equals(name)) {
				dto = byName;
				break;

			}
		}
		return dto;

	}

	// findByLocation//
	@Override
	public TempleDTO findByLocation(String location) {

		TempleDTO dt = null;

		Iterator<TempleDTO> byLocation = this.list.iterator();

		while (byLocation.hasNext()) {
			TempleDTO place = byLocation.next();
			if (place.getLocation().equals(location)) {
				dt = place;
				break;
			}
		}

		return dt;
	}

	// findByLocationAndName//
	@Override
	public TempleDTO findByLocationAndName(String location, String name) {

		TempleDTO dto = null;

		Iterator<TempleDTO> byLocationAndName = this.list.iterator();
		while (byLocationAndName.hasNext()) {
			TempleDTO temple = byLocationAndName.next();
			if (temple.getLocation().equals(location) && (temple.getName().equals(name))) {
				dto = temple;
				break;
			}
		}

		return dto;
	}

	@Override
	public Collection<TempleDTO> findAll() {

		return this.list;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByLocationStartsWith(char character) {
		char c = character;
		String s = Character.toString(c);
		Collection<TempleDTO> collection = new ArrayList<TempleDTO>();
		Iterator<TempleDTO> templeByLocation = this.list.iterator();
		while (templeByLocation.hasNext()) {
			TempleDTO temp = templeByLocation.next();
			if (temp.getLocation().startsWith(s)) {
				System.out.println(" temple by location starts with : " + temp);
				collection.add(temp);
			}
		}
		return collection;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {
		Iterator<TempleDTO> entryFeeGreaterThan = this.list.iterator();
		Collection<TempleDTO> coll = new ArrayList<TempleDTO>();
		while (entryFeeGreaterThan.hasNext()) {
			TempleDTO dt = entryFeeGreaterThan.next();
			if (dt.getEntryFee() > cost) {
				System.out.println("Entry fee greater than : " + dt);
				coll.add(dt);
			}
		}
		return coll;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByNoOfPoojariesGreaterThan(int num) {
		Iterator<TempleDTO> noOfPoojaries = this.list.iterator();
		Collection<TempleDTO> collection = new ArrayList<TempleDTO>();
		while (noOfPoojaries.hasNext()) {
			TempleDTO temp = noOfPoojaries.next();
			if (temp.getNoOfPoojaries() > num) {
				System.out.println("Number of poojaries greater than is : " + temp);
				collection.add(temp);
			}
		}
		return collection;
	}

	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> locationByName = this.list.iterator();
		String locationbyname = null;
		while (locationByName.hasNext()) {
			TempleDTO temple = locationByName.next();
			if (temple.getName().equals(name)) {
				System.out.println("find by location : " + temple.getLocation());
				locationbyname = name;

			}
		}

		return locationbyname;
	}

	@Override
	public Collection<String> findAllLocation() {
		Iterator<TempleDTO> alllocation = this.list.iterator();
		Collection<String> str = new ArrayList<String>();
		while (alllocation.hasNext()) {
			TempleDTO findalllocation = alllocation.next();
			System.out.println("findall location : " + findalllocation.getLocation());
			str.add(findalllocation.getLocation());
		}

		return str;
	}

}
