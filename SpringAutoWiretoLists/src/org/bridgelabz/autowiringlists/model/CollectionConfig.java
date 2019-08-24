package org.bridgelabz.autowiringlists.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollectionConfig {
	@Bean
    public Person getPersonBean() {
        return new Person();
    }
	 @Bean
	    public List<String> data() {
	        return Arrays.asList("John", "Adam", "Harry");
	    }
}
