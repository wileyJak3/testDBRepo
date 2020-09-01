package com.example.springboottestdb.service;

import com.example.springboottestdb.models.Fantasy;
import com.example.springboottestdb.repositories.FantasyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class FantasyServiceImpl implements FantasyService {

	@Autowired
	private FantasyRepository fantasyRepository;


	@Override
	public Iterable<Fantasy> listUsers() {
		fantasyRepository.findAll();
	}

	@Override
	public Fantasy createFantasy(Fantasy fantasy) {
		return fantasyRepository.save(fantasy);
	}

	@Override
	public Fantasy createBook(String bookName, String authorName, Double bookPrice) {
		return fantasyRepository.createBook(bookName,authorName,bookPrice);
	}

	@Override
	public HttpStatus deleteUser(Long userId) {
		fantasyRepository.deleteById(userId);
		return HttpStatus.OK;
	}
}
