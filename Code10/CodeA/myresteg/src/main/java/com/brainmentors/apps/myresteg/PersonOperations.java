package com.brainmentors.apps.myresteg;

import java.util.ArrayList;

public class PersonOperations {
	private PersonOperations(){}
	static ArrayList<Person> personList = new ArrayList<>();
	public static Person addPerson(Person person){
		personList.add(person);
		return person;
	}
	public static ArrayList<Person> getPersons(){
		return personList;
	}

}
