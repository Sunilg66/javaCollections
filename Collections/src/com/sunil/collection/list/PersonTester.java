package com.sunil.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sunil.collection.list.dto.PersonDTO;

public class PersonTester {

	public static void main(String[] args) {

		PersonDTO dto = new PersonDTO("Sunil", 26, "sunil@xworkz.in");
		PersonDTO dto1 = new PersonDTO("Sachin", 24, "sachin@gmail.com");
		PersonDTO dto2 = new PersonDTO("Aishwarya", 14, "aishwarya@gmail.in");
		PersonDTO dto3 = new PersonDTO("Darshan", 23, "darshan@xworkz.com");
		PersonDTO dto4 = new PersonDTO("sunnyleone", 40, "sunnyleone@bollywood.in");

		List<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(dto);
		list.add(dto1);

		List<PersonDTO> list1 = new ArrayList<PersonDTO>();
		list1.add(dto4);
		list1.add(dto2);
		list1.add(dto3);

		list1.addAll(list);
		System.out.println(list1.size());

		Collections.sort(list1);
		for (PersonDTO person : list1) {
			System.out.println(person);
		}

	}

}


