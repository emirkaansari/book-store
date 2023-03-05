package com.bookstore.bookstore.service;
import java.util.zip.CRC32C;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookstore.bookstore.repository.BookRepository;
import com.bookstore.bookstore.entity.Book;


@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;

    public void save(Book b) {
        bRepo.save(b);
    }
}
