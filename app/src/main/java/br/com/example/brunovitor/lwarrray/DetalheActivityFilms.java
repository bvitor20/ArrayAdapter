package br.com.example.brunovitor.lwarrray;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by BrunoVitor on 02/09/2015.
 */
public class DetalheActivityFilms extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Filmes film = (Filmes)getIntent().getSerializableExtra("film");

        ImageView img = (ImageView)findViewById(R.id.imageView_logo);
        TextView txtAnoFilme = (TextView)findViewById(R.id.textView_ano);
        TextView txtNomeFilme = (TextView)findViewById(R.id.textView_name);

        img.setImageResource(Util.getLogo(film.filmId));
        txtAnoFilme.setText(film.anoFilm);
        txtNomeFilme.setText(film.nomeFilm);

    }

}
