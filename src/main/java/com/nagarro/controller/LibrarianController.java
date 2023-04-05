package com.nagarro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.model.Librarian;
import com.nagarro.service.LibrarianService;

@RestController
@RequestMapping("/api/login")
public class LibrarianController {

	@Autowired
	LibrarianService librarianService;

	/**
	 * This method can be called to return librarian present in database
	 * @param librarian details of librarian
	 * @return librarian
	 */
	@PostMapping("/")
	public Librarian isLibrarianPresent(Librarian librarian) {
		return librarianService.librarian(librarian);
	}
}
