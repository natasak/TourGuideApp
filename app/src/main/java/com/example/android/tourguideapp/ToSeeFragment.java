package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple Fragment subclass.
 * All pictures were taken from Visit Antwer webpage in December 2017: https://www.visitantwerpen.be
 */
public class ToSeeFragment extends Fragment {


    public ToSeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.tosee_title_zoo), getString(R.string.tosee_summary_zoo), R.drawable.tosee_zoo));
        locations.add(new Location(getString(R.string.tosee_title_ruien), getString(R.string.tosee_summary_ruien), R.drawable.tosee_ruien));
        locations.add(new Location(getString(R.string.tosee_title_comics_station), getString(R.string.tosee_summary_comics_station), R.drawable.tosee_comics_station));
        locations.add(new Location(getString(R.string.tosee_title_city_brewery), getString(R.string.tosee_summary_city_brewery), R.drawable.tosee_city_brewery));
        locations.add(new Location(getString(R.string.tosee_title_ecohuis), getString(R.string.tosee_summary_ecohuis), R.drawable.tosee_ecohuis));
        locations.add(new Location(getString(R.string.tosee_title_silver_pavilion), getString(R.string.tosee_summary_silver_pavilion), R.drawable.tosee_silver_pavilion));
        locations.add(new Location(getString(R.string.tosee_title_carriage_ride), getString(R.string.tosee_summary_carriage_ride), R.drawable.tosee_carriage_ride));
        locations.add(new Location(getString(R.string.tosee_title_rubens_house), getString(R.string.tosee_summary_rubens_house), R.drawable.tosee_rubens_house));


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
