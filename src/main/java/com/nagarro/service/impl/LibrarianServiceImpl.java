package com.nagarro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.model.Librarian;
import com.nagarro.repository.LibrarianRepository;
import com.nagarro.service.LibrarianService;

@Component
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	LibrarianRepository librarianRepository;
	
	//This method searches for the Librarian is present in database
	public Librarian librarian(Librarian librarian) {
		return librarianRepository.findByUsernameAndPassword(librarian.getUsername(), librarian.getPassword());
	}
}
