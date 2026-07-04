package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService(){
        System.out.println("Book service bean created");
    }

    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public void repoService(){
        bookRepository.addBookRepo();
    }

}
