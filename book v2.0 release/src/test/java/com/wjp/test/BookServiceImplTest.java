package com.wjp.test;

import com.wjp.pojo.Book;
import com.wjp.service.impl.BookServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BookServiceImplTest {

    private BookServiceImpl bookService = new BookServiceImpl();

    @Test
    public void addBook() {
        bookService.addBook(new Book(null, "第二本书", "1123", new BigDecimal(110),
                10000, 0, null));
    }

    @Test
    public void deleteBookById() {
        bookService.deleteBookById(18);
    }

    @Test
    public void updateBook() {
    }

    @Test
    public void queryBookById() {
    }

    @Test
    public void queryBooks() {
    }
}