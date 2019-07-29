package com.cg.bootdemo2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bootdemo2.entities.Movie;
import com.cg.bootdemo2.services.MovieService;

@RestController
public class MovieController {
@Autowired MovieService movie;
@GetMapping("/")
public void main() {
	movie.save(new Movie(101,"Harry Potter","Subhanshu",5000.00,"Thriller"));
}
@GetMapping("/find")
	public Movie find(@RequestParam("id") Integer id) {
		return movie.findById(id);
	}
}
