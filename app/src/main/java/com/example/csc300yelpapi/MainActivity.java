package com.example.csc300yelpapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YelpAPI yelp = new YelpAPI();
        yelp.start();
    }

    public void onLolButtonClicked(View vy)
    {
        Intent i = new Intent(this, RestaurantsActivity.class);
        this.startActivity(i);
    }
}
