package com.srivastava.springmvcwithjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan({"com.srivastava"})
@Controller

public class MyController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/iteminsert")
public String addNewItems(@RequestParam("id") int id, @RequestParam("name") String name,@RequestParam("balance") double balance) {
		
		ItemDTO itemDTO =new ItemDTO(id, name, balance);
	if(itemService.addItem(itemDTO)) {
		return "itemresult";
	}
	else {
		return "invalid";
	}
}
}
