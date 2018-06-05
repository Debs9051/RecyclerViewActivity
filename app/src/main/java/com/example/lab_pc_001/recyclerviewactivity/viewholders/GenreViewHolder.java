package com.example.lab_pc_001.recyclerviewactivity.viewholders;

import android.view.View;
import android.widget.TextView;

import com.example.lab_pc_001.recyclerviewactivity.R;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class GenreViewHolder extends GroupViewHolder {
 private TextView genreTitle;
 public GenreViewHolder(View itemView){
     super(itemView);
     genreTitle=(TextView)itemView.findViewById(R.id.list_item_genre_name);
 }
 public void setGenreName(String name){
     genreTitle.setText(name);
 }
}
