package app.com.toursguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_resource, container, false);
        // Inflate the layout for this fragment
        final ArrayList<app.com.toursguide.TourGuide> tourGuides = new ArrayList<app.com.toursguide.TourGuide>();
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.wood_castle),
                getString(R.string.wood_castle_description),
                getString(R.string.wood_castle_address),
                getString(R.string.wood_castle_time),
                getString(R.string.wood_castle_price),
                R.drawable.wood
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.the_leela),
                getString(R.string.the_leela_description),
                getString(R.string.the_leela_address),
                getString(R.string.the_leela_time),
                getString(R.string.the_leela_price),
                R.drawable.leela
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.the_oberoi),
                getString(R.string.the_oberoi_description),
                getString(R.string.the_oberoi_address),
                getString(R.string.the_oberoi_time),
                getString(R.string.the_oberoi_price),
                R.drawable.oberoi
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.shanti_home),
                getString(R.string.shanti_home_description),
                getString(R.string.shanti_home_address),
                getString(R.string.shanti_home_time),
                getString(R.string.shanti_home_price),
                R.drawable.shanti
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.the_taj_palace),
                getString(R.string.the_taj_palace_description),
                getString(R.string.the_taj_palace_address),
                getString(R.string.the_taj_palace_time),
                getString(R.string.the_taj_palace_price),
                R.drawable.tajp));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.the_taj_mahal),
                getString(R.string.the_taj_mahal_description),
                getString(R.string.the_taj_mahal_address),
                getString(R.string.the_taj_mahal_time),
                getString(R.string.the_taj_mahal_price),
                R.drawable.tajm
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.the_imperial),
                getString(R.string.the_imperial_description),
                getString(R.string.the_imperial_address),
                getString(R.string.the_imperial_time),
                getString(R.string.the_imperial_price),
                R.drawable.imperial));


        app.com.toursguide.TourGuideAdapter adapter = new app.com.toursguide.TourGuideAdapter(getActivity(), tourGuides);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}
