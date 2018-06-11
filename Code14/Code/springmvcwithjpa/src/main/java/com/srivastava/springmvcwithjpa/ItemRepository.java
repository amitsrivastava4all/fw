package com.srivastava.springmvcwithjpa;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemDTO, Integer> {

}
