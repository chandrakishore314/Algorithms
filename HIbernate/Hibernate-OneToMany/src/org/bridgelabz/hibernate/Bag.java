package org.bridgelabz.hibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
@Entity
@Table(name="BAG1_DATA")
public class Bag {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String name;
@OneToMany(cascade = CascadeType.ALL)  
@JoinColumn(name="bid")  
@OrderColumn(name="type")  
List<Book> books;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
} 
}
