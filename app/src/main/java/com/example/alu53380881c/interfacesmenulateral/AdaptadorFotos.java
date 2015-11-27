package com.example.alu53380881c.interfacesmenulateral;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;


/**
 * Created by alu53380881c on 05/11/15.
 */
public class AdaptadorFotos extends RecyclerView.Adapter<AdaptadorFotos.TitularesViewHolder> implements View.OnClickListener {

    private ArrayList<Foto> datos;
    private View.OnClickListener listener;

    public AdaptadorFotos(ArrayList<Foto> datos) {
        this.datos = datos;
    }

    @Override
    public TitularesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_foto, parent, false);
        itemView.setOnClickListener(this);
        TitularesViewHolder tvh = new TitularesViewHolder(itemView);
        return tvh;
    }

    @Override
    public void onBindViewHolder(TitularesViewHolder holder, int position) {
        Foto item = datos.get(position);
        holder.bindTitular(item);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if (listener != null)
            listener.onClick(view);
    }

    public static class TitularesViewHolder
            extends RecyclerView.ViewHolder {

        private ImageView imgPhoto;
        private TextView imgText;
        private Spinner options;
        private Toolbar tb;

        public TitularesViewHolder(View itemView) {
            super(itemView);

            imgPhoto = (ImageView) itemView.findViewById(R.id.imgPhoto);
            //imgText = (TextView)itemView.findViewById(R.id.foto_name);
            //options = (Spinner)itemView.findViewById(R.id.spinner);
            tb = (Toolbar) itemView.findViewById(R.id.toolbar);
        }

        @TargetApi(Build.VERSION_CODES.LOLLIPOP)
        public void bindTitular(Foto t) {
            imgPhoto.setImageDrawable(t.getImagen());
            //imgText.setText(t.getTitulo());
            //options.setAdapter(t.getAdapter());
            tb.setTitle(t.getTitulo());
            tb.inflateMenu(R.menu.menu_foto);

        }

    }

}