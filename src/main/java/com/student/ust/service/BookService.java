package com.student.ust.service;
import com.student.ust.entity.Book;
import com.student.ust.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
@Service
public class BookService {



    @Autowired
    BookRepository bookRepository;
    public Book getBookByID(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }
    public void saveBook(Book book){
        bookRepository.save(book);
    }



    public void deleteBook1(Integer id) {
        bookRepository.deleteById(id);
    }
    public Book updateBook(Book book){
        Book updateBook=bookRepository.findById(book.getBookId()).orElseThrow(()->new NoSuchElementException());
        updateBook.setAuthorName(book.getAuthorName());
        updateBook.setBookName(book.getBookName());
        updateBook.setIsbnNumber(book.getIsbnNumber());
        bookRepository.save(updateBook);
        return updateBook;
    }

    public List<Book> getBookAll() {
        return bookRepository.findAll();
    }
}