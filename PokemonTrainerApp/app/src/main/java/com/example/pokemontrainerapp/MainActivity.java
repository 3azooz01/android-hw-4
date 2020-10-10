package com.example.pokemontrainerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Pokemon> pokeball = new ArrayList<>();

        Pokemon p1 = new Pokemon("Bulbasaur",R.drawable.bulbasaur, 49, 49, 98);
        Pokemon p2 = new Pokemon("Articuno", R.drawable.articuno, 85, 100, 185 );
        Pokemon p3 = new Pokemon("Charizard", R.drawable.charizard,84, 78, 162);
        Pokemon p4 = new Pokemon("Eevee", R.drawable.eevee, 55, 50 , 105);
        Pokemon p5 = new Pokemon("Pikachu", R.drawable.pikachu, 55, 40, 95);
        Pokemon p6 = new Pokemon("Squirtle", R.drawable.squirtle, 48, 65, 113);


        pokeball.add(p1);
        pokeball.add(p2);
        pokeball.add(p3);
        pokeball.add(p4);
        pokeball.add(p5);
        pokeball.add(p6);

        RecyclerView rv = findViewById(R.id.recyclerView);
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lay = new LinearLayoutManager(this);
        rv.setLayoutManager(lay);




        PokeAdapter pa = new PokeAdapter(pokeball,this);
        rv.setAdapter(pa);
    }
}