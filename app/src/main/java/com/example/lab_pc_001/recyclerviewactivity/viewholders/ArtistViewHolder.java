package com.example.lab_pc_001.recyclerviewactivity.viewholders;

import android.icu.lang.UCharacter;
import android.view.View;
import android.widget.TextView;

import com.example.lab_pc_001.recyclerviewactivity.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ArtistViewHolder extends ChildViewHolder {
    private TextView artistName;
    public ArtistViewHolder(View itemView){
        super(itemView);
        artistName=(TextView)itemView.findViewById(R.id.list_item_artist_name);

    }
    public void setArtistName(String name){
        artistName.setText(name);
    }
}
