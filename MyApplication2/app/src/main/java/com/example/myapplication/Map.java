package com.example.myapplication;

import android.app.FragmentManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map extends AppCompatActivity implements OnMapReadyCallback {
    private FragmentManager fragmentManager;
    private MapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        fragmentManager = getFragmentManager();
        mapFragment = (MapFragment)fragmentManager.findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng location = new LatLng(35.847054, 127.129389);
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.title("전북대");
        markerOptions.position(location);
        googleMap.addMarker(markerOptions);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 14));
    }
}
