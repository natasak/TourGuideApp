package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by natasam on 07/12/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param words A List of Word objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title_text_view
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the title text from the current Word object and
        // set this text on the title text TextView
        titleTextView.setText(currentWord.getTitleText());

        // Find the TextView in the list_item.xml layout with the ID summary_text_view
        TextView summaryTextView = (TextView) listItemView.findViewById(R.id.summary_text_view);
        // Get the summary text from the current Word object and
        // set this text on the summary text TextView
        summaryTextView.setText(currentWord.getSummaryTexy());


        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image from the current Word object and
        // set to the current image resource
        imageView.setImageResource(currentWord.getImageResourceId());

        // Find the ImageView in the list_item.xml layout with the ID icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icon);

        if (currentWord.hasIcon()) {
            //Set the ImageView to the image (icon) resource specified in the current Word
            iconView.setImageResource(currentWord.getIconResourceId());

            //Make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
        }
        else {
            //Otherwise hide the ImageView (set visibility to GONE)
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
