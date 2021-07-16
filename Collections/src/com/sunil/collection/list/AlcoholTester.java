package com.sunil.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sunil.collection.list.dto.AlcoholDTO;
import com.sunil.collection.list.dto.constants.AlcoholType;

public class AlcoholTester {

	public static void main(String[] args) {

		AlcoholDTO dto = new AlcoholDTO("MagicMoments", 350, false, 180, AlcoholType.VODKA);
		AlcoholDTO dto1 = new AlcoholDTO("BlendersPride", 365, false, 180, AlcoholType.WHISKEY);
		AlcoholDTO dto2 = new AlcoholDTO("BombaySapphire", 1500, false, 700, AlcoholType.GIN);
		AlcoholDTO dto3 = new AlcoholDTO("Tuborg", 150, false, 250, AlcoholType.BEER);
		AlcoholDTO dto4 = new AlcoholDTO("100Pipers", 350, false, 180, AlcoholType.WHISKEY);

		List<AlcoholDTO> list = new ArrayList<AlcoholDTO>();
		list.add(dto);
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);

		Collections.sort(list, Collections.reverseOrder());
		for (AlcoholDTO alcohol : list) {
			System.out.println(alcohol);
			System.out.println(alcohol.getBrand());
		}

	}

}
