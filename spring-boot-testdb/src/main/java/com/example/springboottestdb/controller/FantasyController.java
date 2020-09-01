package com.example.springboottestdb.controller;

import com.example.springboottestdb.models.Fantasy;
import com.example.springboottestdb.service.FantasyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/fantasy")
public class FantasyController {

@Autowired
    FantasyService fantasyService;

@GetMapping
    public Iterable<Fantasy> findAll() {
        return fantasyService.listUsers();
    }

    @PostMapping
    public Fantasy createFantasy(@RequestBody Fantasy fantasyParam) {
        return fantasyService.createFantasy(fantasyParam);
    }
    @GetMapping("/createBook/{bookNameParam}/{authorNameParam}/{bookPriceParam}")
    public Fantasy createBook(@PathVariable String bookNameParam,
                            @PathVariable String authorNameParam,
                              @PathVariable Double bookPriceParam) {
        return fantasyService.createBook(bookNameParam, authorNameParam, bookPriceParam);
    }
@DeleteMapping("/{fantasyId}")
    public HttpStatus deleteUser(@PathVariable Long userId) {
        return fantasyService.deleteUser(userId);
    }



}
