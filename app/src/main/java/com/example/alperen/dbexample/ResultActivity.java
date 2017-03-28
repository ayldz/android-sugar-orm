package com.example.alperen.dbexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Alperen on 24.03.2017.
 */

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        LinearLayout list = (LinearLayout) findViewById(R.id.ShowList);

        List<Book> books = Book.listAll(Book.class);

        for (Book item : books ){
            TextView msg = new TextView(getApplicationContext());
            msg.setText(item.title + " " + item.edition);
            msg.setTextSize(20);
            list.addView(msg);
        }
    }
}
