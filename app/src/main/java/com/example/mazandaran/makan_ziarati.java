package com.example.mazandaran;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class makan_ziarati extends Fragment {

    private String latitude;
    private String longitude;
    ImageView location_pahnekola;
    public makan_ziarati() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


          View rootView= inflater.inflate(R.layout.fragment_makan_ziarati, container, false);
          location_pahnekola=rootView.findViewById(R.id.location_pahnekola);
        HashMap<String, Integer> imgMap = new HashMap<>();
        location_pahnekola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "http://maps.google.com/maps?daddr=" + 36.662594 + "," + 53.074359;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
                return rootView;
    }

}
