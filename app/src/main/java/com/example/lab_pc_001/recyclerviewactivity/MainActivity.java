package com.example.lab_pc_001.recyclerviewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lab_pc_001.recyclerviewactivity.adapters.GenreAdapter;
import com.example.lab_pc_001.recyclerviewactivity.models.Artist;
import com.example.lab_pc_001.recyclerviewactivity.models.Genre;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//variables
    private RecyclerView mRecyclerView;
    private GenreAdapter mAdapter;
    private List<Genre> genres;

    public void getGenres() {
        genres=new ArrayList<>(6);
        for (int i=0;i<6;i++){
            List<Artist> artists=new ArrayList<>(3);
            artists.add(new Artist("Paramore"));
            artists.add(new Artist("Fly Leaf"));
            artists.add(new Artist("The script"));
            genres.add(new Genre("Rock_"+i,artists));

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=(RecyclerView)findViewById(R.id.recycler_view);
         getGenres();
        mAdapter=new GenreAdapter(genres);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mRecyclerView.setAdapter(mAdapter);
    }
}
