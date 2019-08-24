package org.bridgelabz.autowiringlists.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {
	@Autowired
	List<String> data;
	public void printDataList() {
        System.out.println(data);
    }

}
