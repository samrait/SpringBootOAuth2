package com.security.oauth.SpringBootOAuth2.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.security.oauth.SpringBootOAuth2.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	@Query(value = "SELECT * FROM Books b WHERE b.isbn = :isbn", nativeQuery=true)
	public Book findBookByIsbn(@Param("isbn") String isBn);
	
}
