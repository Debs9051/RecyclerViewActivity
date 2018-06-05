package com.example.lab_pc_001.recyclerviewactivity.adapters;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import com.example.lab_pc_001.recyclerviewactivity.R;
        import com.example.lab_pc_001.recyclerviewactivity.models.Artist;
        import com.example.lab_pc_001.recyclerviewactivity.viewholders.ArtistViewHolder;
        import com.example.lab_pc_001.recyclerviewactivity.viewholders.GenreViewHolder;
        import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
        import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

        import java.security.acl.Group;
        import java.util.List;

public class GenreAdapter extends ExpandableRecyclerViewAdapter<GenreViewHolder,ArtistViewHolder> {


    private Object title;

    public GenreAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);

    }

    @Override
    public GenreViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_genre,parent,false);
        return  new GenreViewHolder(view);
    }

    @Override
    public ArtistViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_artist,parent,false);
     return  new ArtistViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(ArtistViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        Artist artist=(Artist) group.getItems().get(childIndex);
        holder.setArtistName(artist.getName());

    }

    @Override
    public void onBindGroupViewHolder(GenreViewHolder holder, int flatPosition, ExpandableGroup group) {

        holder.setGenreName(group.getTitle());

    }




}
