package com.example.csc300yelpapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ListView rLV = this.findViewById(R.id.restaurantLV);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Core.theRestaurantStrings);
        rLV.setAdapter(aa);
        /*
        ArrayAdapter<MainActivity> aa2 = new ArrayAdapter<MainActivity>(this, android.R.layout.simple_list_item_1,new LinkedList<MainActivity>()){
            @androidx.annotation.NonNull
            @Override
            public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {
                return super.getView(position, convertView, parent);
            }
        }
        */
    }
}
