package com.example.alu53380881c.interfacesmenulateral;


import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class SunFragment extends Fragment {


    private RecyclerView recView;
    private ArrayList<Foto> datos;

    public SunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sun, container, false);


        TextView header = (TextView) view.findViewById(R.id.header);
        Typeface face = Typeface.createFromAsset(getActivity().getAssets(),"angrybirdregular.ttf");
        header.setTypeface(face);

        datos = new ArrayList<Foto>();
        datos.add(new Foto("Corona", getResources().getDrawable(R.drawable.corona_solar)));
        datos.add(new Foto("Erupcion", getResources().getDrawable(R.drawable.erupcionsolar)));
        datos.add(new Foto("Espiculas", getResources().getDrawable(R.drawable.espiculas)));
        datos.add(new Foto("Filamentos",getResources().getDrawable( R.drawable.filamentos)));
        datos.add(new Foto("Magnetosfera", getResources().getDrawable(R.drawable.magnetosfera)));
        datos.add(new Foto("Mancha",getResources().getDrawable( R.drawable.manchasolar)));

        recView = (RecyclerView) view.findViewById(R.id.recView);
        recView.setHasFixedSize(true);

        final AdaptadorFotos adaptador = new AdaptadorFotos(datos);
        recView.setAdapter(adaptador);
        recView.setLayoutManager(
                new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        return view;
    }


}
