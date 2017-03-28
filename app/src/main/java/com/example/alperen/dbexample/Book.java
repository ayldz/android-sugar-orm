package com.example.alperen.dbexample;

import com.orm.SugarRecord;

/**
 * Created by Alperen on 24.03.2017.
 */

public class Book extends SugarRecord {
    String title;
    String edition;

    public Book(){}

    public Book(String title, String edition){
        this.title = title;
        this.edition = edition;
    }

}
