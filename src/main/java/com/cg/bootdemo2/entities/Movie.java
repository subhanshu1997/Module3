package com.cg.bootdemo2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Movie {
@Id
private Integer id;
@Column
private String title;
@Column
private String director;
@Column
private Double budget;
public Movie(Integer id, String title, String director, Double budget, String genre) {
	super();
	this.id = id;
	this.title = title;
	this.director = director;
	this.budget = budget;
	this.genre = genre;
}
public Movie() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public Double getBudget() {
	return budget;
}
public void setBudget(Double budget) {
	this.budget = budget;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
@Column
private String genre;
}
