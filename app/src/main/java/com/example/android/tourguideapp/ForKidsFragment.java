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
 * All pictures were taken from Visit Antwer webpage in December 2017: https://www.visitantwerpen.be and https://www.uitinvlaanderen.be/.
 */
public class ForKidsFragment extends Fragment {

    public ForKidsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.kids_title_robinsontuin), getString(R.string.kids_summary_robinsontuin), R.drawable.kids_robinsontuin, R.drawable.ic_outside));
        locations.add(new Location(getString(R.string.kids_title_playground), getString(R.string.kids_summary_playground), R.drawable.kids_playground, R.drawable.ic_inside));
        locations.add(new Location(getString(R.string.kids_title_wandeldijk), getString(R.string.kids_summary_wandeldijk), R.drawable.kids_wandeldijk, R.drawable.ic_outside));
        locations.add(new Location(getString(R.string.kids_title_stadspark), getString(R.string.kids_summary_stadspark), R.drawable.kids_stadspark, R.drawable.ic_outside));
        locations.add(new Location(getString(R.string.kids_title_park_spoor_noord), getString(R.string.kids_summary_park_spoor_noord), R.drawable.kids_park_spoor_noord, R.drawable.ic_outside));
        locations.add(new Location(getString(R.string.kids_title_rivierenhof), getString(R.string.kids_summary_rivierenhof), R.drawable.kids_rivierenhof, R.drawable.ic_outside));

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
        // 1 argument, which is the {@link ArrayAdapter}.
        listView.setAdapter(adapter);

        return rootView;
    }
}