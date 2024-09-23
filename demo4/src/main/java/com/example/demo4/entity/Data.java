package com.example.demo4.entity;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Book> getData() {
        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book(1,"楚辞","屈原","中国文联出版社","0","/img/book1.jpg"));
        books.add(new Book(2,"纳兰词","纳兰性德","中国文联出版社","1","/img/book2.jpg"));
        books.add(new Book(3,"西游记","吴承恩","中国文联出版社","2","/img/book3.jpg"));
        return books;
    }
}
