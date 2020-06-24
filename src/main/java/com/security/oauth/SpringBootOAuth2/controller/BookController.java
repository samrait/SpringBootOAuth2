package com.security.oauth.SpringBootOAuth2.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.oauth.SpringBootOAuth2.entity.Book;
import com.security.oauth.SpringBootOAuth2.service.BookService;


@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/test/{name}")
	public String getStringName(@PathVariable(value = "name") String name) {
		//System.out.println("name: "+name);
		return name;
	}
	
	@GetMapping("/test")
    public String helloWorld() {
        return bookService.hello();
    }
	
	// Get All Notes
    @GetMapping("/books")
    public List<Book> getAllNotes() {
    	Book book = new Book(1L, "ABC", "ABC1", "ABC004");
		System.out.println("Book######################## "+String.valueOf(book));
    	return bookService.getAllBooks();
    }

    // Create a new Note
    @PostMapping(value = "/books/post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Book createNote(@RequestBody Book book) {
    	return bookService.saveBook(book);
    }
    
  //Get Book by isbn
    @GetMapping(value ="/books/name/{isbn}")
    public Book getBookByIsbn(@PathVariable(value = "isbn") String isBn){
    	return bookService.getBookByIsbn(isBn);
    	//return new Book();
    }
    
}
