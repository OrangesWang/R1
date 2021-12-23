package com.wjp.test;

import com.wjp.dao.impl.BookDaoImpl;
import com.wjp.pojo.Book;
import org.junit.Test;

import java.math.BigDecimal;

public class BookDaoImplTest {

    private BookDaoImpl bookDao = new BookDaoImpl();
    @Test
    public void addBook() {
        bookDao.addBook(new Book(null, "第一本书", "1232", new BigDecimal(909),
                1199, 0, null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(17);
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