package com.sunil.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sunil.collection.list.dto.ProductDTO;

public class ProductTester {
	
	public static void main(String[] args) {

		ProductDTO dto = new ProductDTO("Mobile", "Xiaomi", 12000.00, 2);
		ProductDTO dto1 = new ProductDTO("Laptop", "HP", 32000.00, 1);
		ProductDTO dto2 = new ProductDTO("Bat", "kokkabura", 6000.00, 3);
		ProductDTO dto3 = new ProductDTO("Refrigerator", "Samsung", 30000.00, 1);
		ProductDTO dto4 = new ProductDTO("Washingmachine", "IFB", 20000.00, 1);

		List<ProductDTO> list = new ArrayList<ProductDTO>();
		list.add(dto);
		list.add(dto4);
		list.add(dto1);

		List<ProductDTO> list1 = new ArrayList<ProductDTO>();
		list1.add(dto3);
		list1.add(dto2);

		list1.addAll(list);
		System.out.println(list1.size());

		Collections.sort(list1);

		for (ProductDTO product : list1) {
			System.out.println(product);
			System.out.println(product.getPrice());
		}
	}

}


