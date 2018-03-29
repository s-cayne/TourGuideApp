package com.example.sca25.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set to ListView
        setContentView(R.layout.word_list);
        //new Array of Word, words
        final ArrayList<Word> words = new ArrayList<>();
        //add entries into 'words'
        words.add(new Word(getString(R.string.RestOneTitle), getString(R.string.RestOneDesc), R.drawable.italy));
        words.add(new Word(getString(R.string.RestTwoTitle), getString(R.string.RestTwoDesc), R.drawable.usa));
        words.add(new Word(getString(R.string.RestThreeTitle), getString(R.string.RestThreeDesc), R.drawable.bbq));
        //background color for this Activity
        WordAdapter adapter = new WordAdapter(this, words, R.color.rest_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
