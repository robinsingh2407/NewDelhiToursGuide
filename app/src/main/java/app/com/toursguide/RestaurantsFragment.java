package app.com.toursguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_resource, container, false);

        final ArrayList<app.com.toursguide.TourGuide> tourGuides = new ArrayList<app.com.toursguide.TourGuide>();
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.indian_accent),
                getString(R.string.indian_accent_description),
                getString(R.string.indian_accent_address),
                getString(R.string.indiagate_time),
                getString(R.string.indian_accent_price),
                R.drawable.indianac
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.tamra),
                getString(R.string.tamra_description),
                getString(R.string.tamra_address),
                getString(R.string.tamra_time), getString(R.string.tamra_price),
                R.drawable.tamra
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.dakshin),
                getString(R.string.dakshin_description),
                getString(R.string.dakshin_address),
                getString(R.string.dakshin_time), getString(R.string.dakshin_price),
                R.drawable.dakshin
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.k3_restaurant),
                getString(R.string.k3_restaurant_description),
                getString(R.string.k3_restaurant_address),
                getString(R.string.k3_restaurant_time),
                getString(R.string.k3_restaurant_price),
                R.drawable.k3
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.dum_pukht),
                getString(R.string.dum_pukht_description),
                getString(R.string.dum_pukht_address),
                getString(R.string.dum_pukht_time),
                getString(R.string.dum_pukht_price),
                R.drawable.dum
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.bukhara),
                getString(R.string.bukhara_description),
                getString(R.string.bukhara_address),
                getString(R.string.bukhara_time),
                getString(R.string.bukhara_price),
                R.drawable.bukhara
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.oriental_octopus),
                getString(R.string.oriental_octopus_description),
                getString(R.string.oriental_octopus_address),
                getString(R.string.bukhara_time),
                getString(R.string.bukhara_price),
                R.drawable.oriental
        ));

        app.com.toursguide.TourGuideAdapter adapter = new app.com.toursguide.TourGuideAdapter(getActivity(), tourGuides);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
