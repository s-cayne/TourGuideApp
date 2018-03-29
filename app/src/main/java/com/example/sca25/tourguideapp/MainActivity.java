package com.example.sca25.tourguideapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView events = (TextView)findViewById(R.id.events);
        TextView parks = (TextView)findViewById(R.id.parks);
        TextView restaurants = (TextView)findViewById(R.id.restaurants);
        TextView shopping = (TextView)findViewById(R.id.shopping);

        events.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent eventsIntent = new Intent(MainActivity.this,
                        EventsActivity.class);

                startActivity(eventsIntent);
            }
        });

        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parksIntent = new Intent(MainActivity.this,
                        ParksActivity.class);

                startActivity(parksIntent);
            }
        });

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MainActivity.this,
                        RestaurantsActivity.class);

                startActivity(restaurantsIntent);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shoppingIntent = new Intent(MainActivity.this,
                        ShoppingActivity.class);

                startActivity(shoppingIntent);
            }
        });
    }
}
