package com.srivastava.springmvcwithjpa;

import java.util.List;
import java.util.Optional;

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

@RequestMapping("/item/{id}")
public Optional<ItemDTO> showItem(@PathVariable  int id){
	return service.getItemById(id);
}

@RequestMapping("/additem/{id}/{name}/{balance}")
public String addItems(@PathVariable  int id,@PathVariable  String name,@PathVariable  double balance){
	return service.addItem(new ItemDTO(id, name, balance))?"Added":"Not Added";
}

}
