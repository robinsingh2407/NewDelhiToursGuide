package app.com.toursguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TouristAttractionsFragment extends Fragment {


    public TouristAttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_resource, container, false);

        final ArrayList<app.com.toursguide.TourGuide> tourGuides = new ArrayList<app.com.toursguide.TourGuide>();
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.red_fort),
                getString(R.string.redfort_description),
                getString(R.string.redfort_address),
                getString(R.string.redfort_time),
                getString(R.string.redfort_price),
                R.drawable.redfort
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.india_gate),
                getString(R.string.indiagate_description),
                getString(R.string.indiagate_address),
                getString(R.string.indiagate_time),
                getString(R.string.indiagate_price),
                R.drawable.indiagate
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.qutab_minar),
                getString(R.string.qutabminar_description),
                getString(R.string.qutabminar_address),
                getString(R.string.qutabminar_time),
                getString(R.string.qutabminar_price),
                R.drawable.qutub
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.lotus_temple),
                getString(R.string.lotustemple_description),
                getString(R.string.lotustemple_address),
                getString(R.string.lotustemple_time),
                getString(R.string.lotustemple_price),
                R.drawable.lotus
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.akshardham),
                getString(R.string.akshardham_description),
                getString(R.string.akshardham_address),
                getString(R.string.akshardham_time),
                getString(R.string.akshardham_price),
                R.drawable.akshardham
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.jantar_mantar),
                getString(R.string.jantar_mantar_description),
                getString(R.string.jantar_mantar_address),
                getString(R.string.jantar_mantar_time),
                getString(R.string.jantar_mantar_price),
                R.drawable.jantar
        ));
        tourGuides.add(new app.com.toursguide.TourGuide(getString(R.string.humayun_tomb),
                getString(R.string.humayun_tomb_description),
                getString(R.string.humayun_tomb_address),
                getString(R.string.humayun_tomb_time),
                getString(R.string.humayun_tomb_price),
                R.drawable.humayun
        ));

        app.com.toursguide.TourGuideAdapter adapter = new app.com.toursguide.TourGuideAdapter(getActivity(), tourGuides);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }
}
