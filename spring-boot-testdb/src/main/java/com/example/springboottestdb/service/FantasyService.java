package com.example.springboottestdb.service;

import com.example.springboottestdb.models.Fantasy;
import org.springframework.http.HttpStatus;

public interface FantasyService {
	public Iterable<Fantasy> listUsers();
    public Fantasy createFantasy(Fantasy fantasy);
    public Fantasy createBook(String bookName, String authorName, Double bookPrice);
    public HttpStatus deleteUser(Long userId);
}
