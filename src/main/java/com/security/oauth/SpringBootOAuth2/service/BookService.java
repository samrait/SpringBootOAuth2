package com.security.oauth.SpringBootOAuth2.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.oauth.SpringBootOAuth2.entity.Book;
import com.security.oauth.SpringBootOAuth2.repo.BookRepository;


@Service
public class BookService {

	@Autowired
    BookRepository bookRepository;
	
	public String hello() {
		// TODO Auto-generated method stub
		return "Shishir M.";
	}
	
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	public Book getBookByIsbn(String isBn) {
		// TODO Auto-generated method stub
		return bookRepository.findBookByIsbn(isBn);
	}

}
