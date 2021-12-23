package com.wjp.utils;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class SendJMail {

    private static String from = "490396255@qq.com"; // 发件人邮箱地址
    private static String user = "土匪书城"; // 发件人称号
    private static String password = "mzwnkwkuukrcbhaa"; // 发件人邮箱客户端授权码，不是邮箱密码！！！

    /**
     * 发邮件工具类
     * @param to  		收件人邮箱账号
     * @param text  邮件内容
     * @return
     */
    public static boolean sendMail(String to, String text) {
        try {
            MailSSLSocketFactory sf=new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            //获取系统属性
            Properties properties = new Properties();
            properties.put("mail.smtp.host", "smtp.qq.com");// 主机名
            properties.put("mail.smtp.port", "465");//使用465端口号
            properties.put("mail.smtp.auth", "true");//开启认证
            properties.put("mail.smtp.ssl.enable", "true");//允许使用ssl加密传输
            properties.put("mail.smtp.ssl.socketFactory", sf);
            properties.put("mail.debug", "true");// 显示debug信息

            // 得到会话对象
            Session session = Session.getInstance(properties);
            // 获取邮件对象
            Message message = new MimeMessage(session);
            // 设置发件人邮箱地址
            message.setFrom(new InternetAddress(from));
            // 设置收件人邮箱地址，一次向多个邮箱发送
            //message.setRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress("xxx@qq.com"),new InternetAddress("xxx@qq.com"),new InternetAddress("xxx@qq.com")});
            // 设置收件人邮箱地址，一次向一个邮箱发送
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));//一个收件人
            // 设置邮件标题
            message.setSubject("Your bill !");
            // 设置邮件内容
            message.setContent((text),"text/html;charset=utf-8");
            // 得到邮差对象
            Transport transport = session.getTransport();
            // 连接自己的邮箱账户
            transport.connect(from, password);// 密码为QQ邮箱开通的stmp服务后得到的客户端授权码
            // 发送邮件
            transport.sendMessage(message, message.getAllRecipients());
            // 关闭资源
            transport.close();
            return true;
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return false;
        }
    }

}