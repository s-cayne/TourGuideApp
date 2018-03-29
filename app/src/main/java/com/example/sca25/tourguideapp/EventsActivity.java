package com.example.sca25.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set to ListView
        setContentView(R.layout.word_list);
        //create new Array of Word
        final ArrayList<Word> words = new ArrayList<>();
        //add items into list( Word(Title,Description,Image Resource))
        words.add(new Word(getString(R.string.EventOneTitle), getString(R.string.EventOneDesc), R.drawable.river));
        words.add(new Word(getString(R.string.EventTwoTitle), getString(R.string.EventTwoDesc), R.drawable.art));
        //this view's  background color
        WordAdapter adapter = new WordAdapter(this, words, R.color.event_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
