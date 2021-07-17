package com.sunil.dataStore.dto.dao;

import java.util.ArrayList;
import java.util.List;

import com.sunil.dataStore.dto.RiverDTO;

public class RiverDAOImpl implements RiverDAO {

	private List<RiverDTO> list = new ArrayList<RiverDTO>();

	@Override
	public boolean save(RiverDTO dto) {
		boolean add = list.add(dto);
		System.out.println("dto" + dto);
		System.out.println("dto added" + add);
		return add;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}

	@Override
	public void update(RiverDTO dto) {
		boolean contain = this.list.contains(dto);
		if (contain) {
			System.out.println("river exist and update" + dto);
			int indexOfRiver = this.list.indexOf(dto);
			this.list.set(indexOfRiver, dto);
		} else {
			System.out.println("river not found");
		}

	}

	@Override
	public boolean delete(RiverDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("delete " + dto);
		} else {
			System.out.println("river not found cannot delete");
		}

		return false;
	}

}
