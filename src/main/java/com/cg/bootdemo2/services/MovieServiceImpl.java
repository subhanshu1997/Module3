package com.cg.bootdemo2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bootdemo2.dao.MovieDAO;
import com.cg.bootdemo2.entities.Movie;
@Service
@Transactional
public class MovieServiceImpl implements MovieService{
	@Autowired MovieDAO dao;
	@Override
	@Transactional
	public void save(Movie m) {
		dao.save(m);
		
	}

	@Override
	public Movie findById(Integer id) {
		return dao.findById(id).get();
	}

}
