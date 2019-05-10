package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Letter> letters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        RecyclerView r = (RecyclerView)findViewById(R.id.recycler);
        DataAdapter adapter = new DataAdapter(this, letters);
        r.setLayoutManager(new LinearLayoutManager(this));
        r.setAdapter(adapter);
    }

    private void setData(){
        letters = new ArrayList<>();
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
        letters.add(new Letter("sam.cassel@yandex.ru", "Some letter theme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit,", "10 may"));
    }
}
