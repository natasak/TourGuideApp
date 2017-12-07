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

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Antwerp ZOO", "One of the oldest and best-known zoos in Europe.", R.drawable.tosee_zoo));
        words.add(new Word("The Ruien (Antwerp Canals)", "A truly unique attraction, a walk through Antwerp's former canals and sewers. ", R.drawable.tosee_ruien));
        words.add(new Word("Comics Station", "New indoor park based on Belgian cartoon characters at Antwerp’s Central Station.", R.drawable.tosee_comics_station));
        words.add(new Word("Antwerp City Brewery", "Experience centre of the beers of De Koninck that allows visitors to hear, see and taste the brewery’s story.", R.drawable.tosee_city_brewery));
        words.add(new Word("EcoHouse", "EcoHuis is Antwerp’s green epicentre. Here you can find out how to build and live sustainably in the city.", R.drawable.tosee_ecohuis));
        words.add(new Word("The Silver Pavilion", "Here in this unique location, you can admire masterpieces from DIVA’s collection.", R.drawable.tosee_silver_pavilion));
        words.add(new Word("Carriage ride", "A sightseeing tour in the historical city of Antwerp on the rhythm of a draft-horse carriage.", R.drawable.tosee_carriage_ride));
        words.add(new Word("The Rubens House", "In the heart of Antwerp is the home of Peter Paul Rubens, the famous 16th-17th--century Baroque painter.", R.drawable.tosee_rubens_house));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);




        return rootView;
    }

}
