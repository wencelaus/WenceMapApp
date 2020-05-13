package com.wencetechnologies.wsimiyu.wencemapsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

public class MainActivity extends AppCompatActivity {

    private MapView wenceMapView;
    private ArcGISMap wenceMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wenceMapView = findViewById(R.id.wenceMapView);
        wenceMap = new ArcGISMap(Basemap.Type.OPEN_STREET_MAP,0.478467 , 37.803972, 7);
        wenceMapView.setMap(wenceMap);

    }
    @Override
    protected void onPause(){
        wenceMapView.pause();
        super.onPause();
    }

    @Override
    protected void onResume(){
        super.onResume();
        wenceMapView.resume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        wenceMapView.dispose();
    }
}
