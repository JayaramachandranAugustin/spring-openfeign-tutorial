package com.whizpath.openfeign.fallback;

import com.whizpath.openfeign.client.BookClient1;
import com.whizpath.openfeign.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookFallback1 implements BookClient1 {
    @Override
    public Book getBookData(String id, String name) {
        return new Book("123","Whizpath","Technical blog");
    }
}
