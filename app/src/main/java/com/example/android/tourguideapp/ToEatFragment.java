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
 *  All pictures were taken from Visit Antwer webpage in December 2017: https://www.visitantwerpen.be
 *  Star icons were taken from https://material.io/icons/ in December 2017.
 */
public class ToEatFragment extends Fragment {


    public ToEatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Meat Factory", "Grote Markt 28, Antwerp", R.drawable.toeat_meat_factory, R.drawable.ic_four_half_stars));
        words.add(new Word("Sombat Thai Cuisine", "Desguinlei 196, Antwerp.", R.drawable.toeat_sombat_thai_cuisine, R.drawable.ic_four_half_stars));
        words.add(new Word("Billie's Bier Kafetaria", "Kammenstraat 12, Antwerp.", R.drawable.toeat_billies_bier_kafetaria, R.drawable.ic_four_half_stars));
        words.add(new Word("Bia Mara", "Maalderijstraat 1, Antwerp.", R.drawable.toeat_bia_mara, R.drawable.ic_four_half_stars));
        words.add(new Word("Kapitein Zeppos", "Vleminckveld 78, Antwerp.", R.drawable.toeat_kapitein_zeppos, R.drawable.ic_four_stars));
        words.add(new Word("No Worries", "Kribbestraat 20, Antwerp.", R.drawable.toeat_no_worries, R.drawable.ic_five_stars));
        words.add(new Word("Elfde Gebod", "Torfbrug 10, Antwerp.", R.drawable.toeat_elfde_gebod, R.drawable.ic_four_stars));

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
