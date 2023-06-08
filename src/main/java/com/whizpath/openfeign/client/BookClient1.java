package com.whizpath.openfeign.client;

import com.whizpath.openfeign.config.BookClientConfig1;
import com.whizpath.openfeign.fallback.BookFallback1;
import com.whizpath.openfeign.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(
        name = "${book-service-client.name}",
        url ="${book-service-client.domain-url}",
        configuration = BookClientConfig1.class,
        fallback = BookFallback1.class

)
public interface BookClient1 {
    @GetMapping(path="${book-service-client.retrieve-book.url}")
    Book getBookData(@PathVariable("id") String id, @RequestParam("name") String name);
}
