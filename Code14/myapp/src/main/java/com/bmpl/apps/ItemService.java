package com.bmpl.apps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	public List<ItemDTO> getAllItems(double balance){
		ArrayList<ItemDTO> items = new ArrayList<>();
		items.add(new ItemDTO(1001,"Apple",9999));
		items.add(new ItemDTO(1002,"Samsung",29999));
		items.add(new ItemDTO(1003,"Nokia",39999));
		return items.stream().
		filter(itemObject->itemObject.getBalance()>=balance)
		.collect(Collectors.toList());
		//return items;
		
	}

}
