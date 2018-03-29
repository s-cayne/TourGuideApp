package com.example.sca25.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set to ListView
        setContentView(R.layout.word_list);
        //new Array of Word called words
        final ArrayList<Word> words = new ArrayList<>();
        //add entries into 'words'
        words.add(new Word(getString(R.string.ShopOneTitle), getString(R.string.ShopOneDesc), R.drawable.beer));
        words.add(new Word(getString(R.string.ShopTwoTitle), getString(R.string.ShopTwoDesc), R.drawable.book));
        words.add(new Word(getString(R.string.ShopThreeTitle), getString(R.string.ShopThreeDesc), R.drawable.comic));
        //This activity's background color
        WordAdapter adapter = new WordAdapter(this, words, R.color.shop_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }

}
