package com.whizpath.openfeign.fallback;

import com.whizpath.openfeign.client.BookClient2;
import com.whizpath.openfeign.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookFallback2 implements BookClient2 {
    @Override
    public Book getBookData(String id, String name) {
        return new Book("123","Whizpath-2","Technical blog-2");
    }
}