package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToBuyFragment extends Fragment {

    public ToBuyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.tobuy_title_vogelenmarkt), getString(R.string.tobuy_summary_vogelenmarkt)));
        locations.add(new Location(getString(R.string.tobuy_title_exotic_market), getString(R.string.tobuy_summary_exotic_market)));
        locations.add(new Location(getString(R.string.tobuy_title_friday_market), getString(R.string.tobuy_summary_friday_market)));
        locations.add(new Location(getString(R.string.tobuy_title_bio_market), getString(R.string.tobuy_summary_bio_market)));
        locations.add(new Location(getString(R.string.tobuy_title_boekenplein), getString(R.string.tobuy_summary_boekenplein)));
        locations.add(new Location(getString(R.string.tobuy_title_market_for_tomorrow), getString(R.string.tobuy_summary_market_for_tomorrow)));
        locations.add(new Location(getString(R.string.tobuy_title_brocantwerpen), getString(R.string.tobuy_summary_brocantwerpen)));
        locations.add(new Location(getString(R.string.tobuy_title_swan_market), getString(R.string.tobuy_summary_swan_market)));
        locations.add(new Location(getString(R.string.tobuy_title_rubens_market), getString(R.string.tobuy_summary_rubens_market)));
        locations.add(new Location(getString(R.string.tobuy_title_christmas_market), getString(R.string.tobuy_summary_christmas_market)));
        locations.add(new Location(getString(R.string.tobuy_title_dubieus_design), getString(R.string.tobuy_summary_dubieus_design)));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each location in the list of locations.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}
