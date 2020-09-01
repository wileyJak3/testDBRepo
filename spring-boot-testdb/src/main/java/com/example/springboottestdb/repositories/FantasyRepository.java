package com.example.springboottestdb.repositories;

import com.example.springboottestdb.models.Fantasy;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface FantasyRepository extends CrudRepository <FantasyRepository,Long> {
	@Query("FROM Fantasy f WHERE u.bookName = ?1 and f.authorName = ?2 and f.bookPrice = ?3")
    public Fantasy createBook(String bookName, String authorName, Double bookPrice);
}
