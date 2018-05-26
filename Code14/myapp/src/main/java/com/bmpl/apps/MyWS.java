package com.bmpl.apps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWS {
@RequestMapping("/welcome")	
public String welcome() {
	return "Welcome User";
}
@Autowired
ItemService service;
@RequestMapping("/items/{balance}")
public List<ItemDTO> showItems(@PathVariable  double balance){
	return service.getAllItems(balance);
}

}
