package com.example.prog_abdallah.topmoves;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


import java.util.List;


/**
 * Created by ProG_AbdALlAh on 1/6/2017.
 */

public class MoviesAdapter extends ArrayAdapter<MoviesInfo> {

    Context context;

    public MoviesAdapter(Context context, List<MoviesInfo> movies) {
        super(context, 0, movies);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, viewGroup, false);
        }

        MoviesInfo moviesUtilities = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.movieTitle);
        String title = moviesUtilities.getTitle();
        titleView.setText(title);

        TextView releaseDateView = (TextView) listItemView.findViewById(R.id.movieDate);
        String releaseDate = moviesUtilities.getDate();
        releaseDateView.setText(releaseDate);
        TextView overview = (TextView)listItemView.findViewById(R.id.overview_id);
        String overviewText = moviesUtilities.getOverview();
        overview.setText(overviewText);

        Log.i("Movies Data  ", moviesUtilities.getDate() + moviesUtilities.getImageResource() + moviesUtilities.getTitle());


        return listItemView;
    }


}

