package com.whizpath.openfeign.service;

import com.whizpath.openfeign.client.BookClient1;
import com.whizpath.openfeign.client.BookClient2;
import com.whizpath.openfeign.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LibraryService {
    private final BookClient1 bookClient1;

    private final BookClient2 bookClient2;

    public Book getBookData1ForId(String id, String name){
        return bookClient1.getBookData(id,name);
    }
    public Book getBookData2ForId(String id, String name){
        return bookClient2.getBookData(id,name);
    }
}
