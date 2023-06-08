package com.whizpath.openfeign.client;

import com.whizpath.openfeign.config.BookClientConfig2;
import com.whizpath.openfeign.fallback.BookFallback2;
import com.whizpath.openfeign.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(
        name = "${book-service-client2.name}",
        url ="${book-service-client2.domain-url}",
        configuration = BookClientConfig2.class,
        fallback = BookFallback2.class

)
public interface BookClient2 {
    @GetMapping(path="${book-service-client2.retrieve-book.url}")
    Book getBookData(@PathVariable("id") String id, @RequestParam("name") String name);
}
