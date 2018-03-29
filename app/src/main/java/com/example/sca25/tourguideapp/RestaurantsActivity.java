package com.example.sca25.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.RestOneTitle), getString(R.string.RestOneDesc), R.drawable.italy));
        words.add(new Word(getString(R.string.RestTwoTitle), getString(R.string.RestTwoDesc), R.drawable.usa));
        words.add(new Word(getString(R.string.RestThreeTitle), getString(R.string.RestThreeDesc), R.drawable.bbq));

        WordAdapter adapter = new WordAdapter(this, words, R.color.rest_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
