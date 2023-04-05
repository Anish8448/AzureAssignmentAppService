package com.nagarro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.model.Librarian;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, String> {

	public Librarian findByUsernameAndPassword(String username, String password);
}
