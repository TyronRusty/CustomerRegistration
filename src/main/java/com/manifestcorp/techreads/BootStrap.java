package com.manifestcorp.techreads;

import com.manifestcorp.techreads.model.Book;
import com.manifestcorp.techreads.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements ApplicationListener<ContextRefreshedEvent> {
    private BookRepository bookRepository;

    @Autowired
    public BootStrap(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (bookRepository.count() < 3) {
            bookRepository.save(Book.builder().title("Beginning Groovy and Grails").build());
            bookRepository.save(Book.builder().title("Pro Eclipse JST").build());
            bookRepository.save(Book.builder().title("Enterprise Java Development on a Budget").build());
        }
    }
}
