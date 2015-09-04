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
    public View getView(int position, View convertView, ViewGroup parent){

        ViewHolder viewHolder;
        Filmes film = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.film_item, null);

            viewHolder = new ViewHolder();
            viewHolder.imgLogo = (ImageView) convertView.findViewById(R.id.img_logo_film);
            viewHolder.txtNome = (TextView) convertView.findViewById(R.id.textView_name);
            viewHolder.txtAnoFilm = (TextView) convertView.findViewById(R.id.textView_ano);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }
        viewHolder.imgLogo.setImageResource(Util.getLogo(film.filmId));
        viewHolder.txtAnoFilm.setText(film.anoFilm);
        viewHolder.txtNome.setText(film.nomeFilm);

        //Retornando a view
        return convertView;
    }
    static class ViewHolder {
        ImageView imgLogo;
        TextView txtAnoFilm;
        TextView txtNome;

    }
}
