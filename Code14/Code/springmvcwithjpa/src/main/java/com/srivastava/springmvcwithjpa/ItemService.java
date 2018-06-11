package com.srivastava.springmvcwithjpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	public Optional<ItemDTO> getItemById(int id) {
		
		return itemRepository.findById(id);
	}
	
	public boolean addItem(ItemDTO itemDTO) {
		itemRepository.save(itemDTO);
		return true;
	}
	
	public List<ItemDTO> getAllItems(double balance){
		List<ItemDTO> itemList= new ArrayList<>(); 
		itemRepository.findAll().forEach(itemList::add);
		return itemList;
//		ArrayList<ItemDTO> items = new ArrayList<>();
//		items.add(new ItemDTO(1001,"Apple",9999));
//		items.add(new ItemDTO(1002,"Samsung",29999));
//		items.add(new ItemDTO(1003,"Nokia",39999));
//		return items.stream().
//		filter(itemObject->itemObject.getBalance()>=balance)
//		.collect(Collectors.toList());
		//return items;
		
	}

}
