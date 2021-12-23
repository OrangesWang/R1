package com.wjp.test;

import com.wjp.utils.SendJMail;
import org.junit.Test;

import static org.junit.Assert.*;

public class SendJMailTest {

    @Test
    public void sendMail() {
        System.out.println(SendJMail.sendMail("2858887974@qq.com", "test content"));
    }
}