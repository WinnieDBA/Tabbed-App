package com.winnie.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list;
    CustomAdapter adapter;
    ArrayList people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listwatu);
        people = new ArrayList<Item>();
        Item mtu1 = new Item("Winnie Njeri","0721546789",R.drawable.kenya);
        Item mtu2= new Item("Susan Wambui","0743446789",R.drawable.kenya);
        Item mtu3 = new Item("David Njuguna","0341546789",R.drawable.kenya);
        Item mtu4 = new Item("Lilian Nyoike","0721676789",R.drawable.kenya);
        Item mtu5 = new Item("Annete Chep","0721546789",R.drawable.kenya);
        Item mtu6 = new Item("Winnie Njeri","0721546789",R.drawable.kenya);
        Item mtu7 = new Item("Winnie Njeri","0721546789",R.drawable.kenya);
        Item mtu8 = new Item("Winnie Njeri","0721546789",R.drawable.kenya);
        Item mtu9 = new Item("Winnie Njeri","0721546789",R.drawable.kenya);
        Item mtu10 = new Item("Winnie Njeri","0721546789",R.drawable.kenya);

        people.add(mtu1);
        people.add(mtu2);
        people.add(mtu3);
        people.add(mtu4);
        people.add(mtu5);
        people.add(mtu6);
        people.add(mtu7);
        people.add(mtu8);
        people.add(mtu9);
        people.add(mtu10);



        adapter = new CustomAdapter(this,people);
        list.setAdapter(adapter);

    }
}
