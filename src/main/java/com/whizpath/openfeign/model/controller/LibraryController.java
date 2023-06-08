package com.whizpath.openfeign.model.controller;

import com.whizpath.openfeign.model.Book;
import com.whizpath.openfeign.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping(path="/library/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public Book getLibraryData(@PathVariable("id")String id, @RequestParam("name")String name){
        return libraryService.getBookData1ForId(id,name);
    }

    @GetMapping(path="/library2/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public Book getLibraryData2(@PathVariable("id")String id, @RequestParam("name")String name){
        return libraryService.getBookData2ForId(id,name);
    }
}
