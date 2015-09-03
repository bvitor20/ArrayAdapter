package br.com.example.brunovitor.lwarrray;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by BrunoVitor on 02/09/2015.
 */
public class FilmesAdapter extends ArrayAdapter<Filmes>{

    public FilmesAdapter(Context context, List<Filmes> objects){
        super(context, 0, objects);

    }
    @Override
    public View getView(int posicao, View convertView, ViewGroup parent){

        //Implementando uma View
        View view = LayoutInflater.from(getContext()).inflate(R.layout.film_item, null);

        //Pegando a posição
        Filmes film = getItem(posicao);


        //Configurando os dados no Layout
        ImageView imgLogo = (ImageView) view.findViewById(R.id.img_logo_film);
        TextView txtAnoFilm = (TextView) view.findViewById(R.id.textView_ano);
        TextView txtNome = (TextView) view.findViewById(R.id.textView_name);

        imgLogo.setImageResource(Util.getLogo(film.filmId));
        txtAnoFilm.setText(film.anoFilm);
        txtNome.setText(film.nomeFilm);


        //Retornando a view
        return view;
    }

}
