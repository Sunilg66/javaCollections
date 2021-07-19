package com.sunil.dataStore.dto.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.sunil.dataStore.constants.HighwayType;
import com.sunil.dataStore.dto.HighwayDTO;

public class HighwayDAOImpl implements HighwayDAO {

	private List<HighwayDTO> list = new ArrayList<HighwayDTO>();

	@Override
	public boolean save(HighwayDTO dto) {
		boolean adding = list.add(dto);
		System.out.println("dto : " + dto);
		System.out.println("dto added : " + adding);
		return adding;

	}

	@Override
	public int totalItems() {
		int total = list.size();
		System.out.println("size : " + total);
		return total;
	}

	@Override
	public Collection<HighwayDTO> findAll() {

		return this.list;
	}

	@Override
	public Collection<Integer> findAllNumber() {
		Collection<Integer> collection = new ArrayList<Integer>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO highway = itr.next();
			collection.add(highway.getNumber());
			System.out.println("all numbers : " + highway.getNumber());
		}
		return collection;
	}

	@Override
	public Collection<HighwayDTO> findNumberByStateName(String name) {
		Collection<HighwayDTO> collection = new ArrayList<>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO number = itr.next();
			if (number.getStateName().equals(name)) {
				System.out.println("find number by state name : " + number);
				collection.add(number);
			}
		}
		return collection;
	}

	@Override
	public boolean exist(HighwayDTO dto) {
		boolean contain = this.list.contains(dto);
		System.out.println("contains : " + contain);
		return contain;
	}

	@Override
	public Collection<HighwayDTO> findByStateName(String sname) {
		Collection<HighwayDTO> collection = new ArrayList<HighwayDTO>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO dt = itr.next();
			if (dt.getStateName().equals(sname)) {
				System.out.println("find number by state name : " + dt);
				collection.add(dt);
			}
		}
		return collection;
	}

	@Override
	public Collection<HighwayDTO> findByHighwayType(HighwayType type) {
		Collection<HighwayDTO> collection = new ArrayList<>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO high = itr.next();
			if (high.getType().equals(type)) {
				System.out.println("find by highwaytype : " + high);
				collection.add(high);
			}
		}

		return collection;
	}

	@Override
	public boolean isCondition(int num) {
		Iterator<HighwayDTO> itr = this.list.iterator();
		boolean condition = false;
		while (itr.hasNext()) {
			HighwayDTO no = itr.next();
			if (no.getNumber() == (num)) {
				System.out.println("condition : " + no.isCondition());

			}
		}
		return condition;
	}

	@Override
	public double lengthByNumber(int no) {
		Iterator<HighwayDTO> itr = this.list.iterator();
		double leng = 0;
		while (itr.hasNext()) {
			HighwayDTO num = itr.next();
			if (num.getNumber() == (no)) {
				leng = num.getLength();
			}

		}
		return leng;
	}

	@Override
	public HighwayDTO findByMaxLength() {
		HighwayDTO max = null;
		 max=Collections.max(list);
		System.out.println("max length : " + max);

		return max;
	}

	@Override
	public HighwayDTO findByminLength() {
		HighwayDTO min = null;
		 min=Collections.min(list);
		System.out.println("min length : " + min);
		return min;
	}

	
}
