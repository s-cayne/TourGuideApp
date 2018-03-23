package com.example.sca25.tourguideapp;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("National River Cleanup Day: Morgan Hill Creek Cleanup", "This is a wonderful opportunity for individuals, families and groups to enhance the health of West Little Llagas Creek and its wildlife. We will concentrate on picking up litter from Edes Court north to Spring Avenue and south to Edmundson Avenue- gloves, bags and litter grabbers will be provided.", R.drawable.river));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
