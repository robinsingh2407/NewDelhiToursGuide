package app.com.toursguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_resource, container, false);

        final ArrayList<app.com.toursguide.TourGuide> tourGuides = new ArrayList<app.com.toursguide.TourGuide>();
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.connaught_place),
                getString(R.string.connaught_place_description),
                getString(R.string.connaught_place_address),
                getString(R.string.connaught_place_time),
                getString(R.string.connaught_place_price),
                R.drawable.cp
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.chandni_chowk),
                getString(R.string.chandni_chowk_description),
                getString(R.string.chandni_chowk_address),
                getString(R.string.chandni_chowk_time), getString(R.string.chandni_chowk_price),
                R.drawable.chandni
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.dilli_haat),
                getString(R.string.dilli_haat_description),
                getString(R.string.dilli_haat_address),
                getString(R.string.dilli_haat_time),
                getString(R.string.dilli_haat_price),
                R.drawable.dilli
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.palika_bazaar),
                getString(R.string.palika_bazaar_description),
                getString(R.string.palika_bazaar_address), getString(R.string.palika_bazaar_time),
                getString(R.string.palika_bazaar_price),
                R.drawable.paalika
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.karol_bagh),
                getString(R.string.karol_bagh_description),
                getString(R.string.karol_bagh_address), getString(R.string.karol_bagh_time),
                getString(R.string.karol_bagh_price),
                R.drawable.karol
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.lajpat_nagar),
                getString(R.string.lajpat_nagar_description),
                getString(R.string.lajpat_nagar_address),
                getString(R.string.lajpat_nagar_time),
                getString(R.string.lajpat_nagar_price),
                R.drawable.lagpat
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.sarojini_nagar_name),
                getString(R.string.sarojini_nagar_description),
                getString(R.string.sarojini_nagar_address),
                getString(R.string.sarojini_nagar_time),
                getString(R.string.sarojini_nagar_price),
                R.drawable.sarojni
        ));

        app.com.toursguide.TourGuideAdapter adapter = new app.com.toursguide.TourGuideAdapter(getActivity(), tourGuides);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}
