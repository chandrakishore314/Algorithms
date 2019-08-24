package org.bridgelabz.autowiringlists.main;

import org.bridgelabz.autowiringlists.model.CollectionConfig;
import org.bridgelabz.autowiringlists.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireListMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollectionConfig.class);
		Person  collectionsBean = context.getBean(
		 Person.class);
		collectionsBean.printDataList();
	}

}
