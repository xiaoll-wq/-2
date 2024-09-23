package com.example.demo4.controller;

import com.example.demo4.entity.Book;
import com.example.demo4.entity.Data;
import com.example.demo4.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping("book")
public class BookController {
    ArrayList<Book> books = Data.getData();

    @RequestMapping("list")
    public String findBook(Model model, HttpSession session) {
        session.setAttribute("user", new User("zhangsan","ADMIN"));
        model.addAttribute("books",books);
        return "books";
    }

    @RequestMapping("search")
    public String searchBook(Book book, Model model, HttpSession session) {
        ArrayList<Book> bs = new ArrayList<>();
        String bname = book.getName();
        String bauthor = book.getAuthor();
        if (bname.isEmpty() && bauthor.isEmpty()) {
            bs = books;
        }else {
            for (Book b : books) {
                if ((!bname.isEmpty() && b.getName().contains(bname)) ||
                        (!bauthor.isEmpty() && b.getAuthor().contains(bauthor))) {
                    bs.add(b);
                }
            }
        }
        session.setAttribute("user",new User("zhangsan","ADMIN"));
        model.addAttribute("books",bs);
        return "books";
    }

    @RequestMapping("find/{id}")
    public String findBook(@PathVariable Integer id, Model model) {
        System.out.println("申请借阅图书的id:"+id);
        for (Book b : books) {
            if (b.getId().equals(id)) {
                b.setStatus("1");
            }
        }
        model.addAttribute("books",books);
        return "books";
    }

    @RequestMapping("return/{id}")
    public String returnBook(@PathVariable Integer id, Model model) {
        System.out.println("申请借阅图书的id:"+id);
        for (Book b : books) {
            if (b.getId().equals(id)) {
                b.setStatus("0");
            }
        }
        model.addAttribute("books",books);
        return "books";
    }
}
