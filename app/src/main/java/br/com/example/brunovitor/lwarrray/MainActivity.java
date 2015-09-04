package br.com.example.brunovitor.lwarrray;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> mListFilms;
    ListView mListView_films;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListFilms = new ArrayList<>();
        mListFilms.add(new Filmes(Filmes.SPIDER_MAN, "O Homem Aranha", "2003", "Ninguém Sabe", "Filme muito Bom!"));
        mListFilms.add(new Filmes(Filmes.IRON_MAN, "O Homem de Ferro", "2004", "Também Não Sei", "Filme Muito Rico! SQN"));
        mListFilms.add(new Filmes(Filmes.THE_HOUSE, "A Casa", "2005", "E quem Disse que Sei?!", "Um Grande Filme"));
        mListFilms.add(new Filmes(Filmes.PARIS, "Paris", "2006", "Algum Francês", "Um Dia numa Torre! - TomorrowLand "));
        mListFilms.add(new Filmes(Filmes.WAR_IN_THE_CITY, "Guerra na Cidade", "2020", "Vamos Descobrir", "Uma guerra e pá!"));

        mListView_films = (ListView) findViewById(R.id.listView_Films);

        mListView_films.setAdapter(new FilmesAdapter(this, mListFilms));

        mListView_films.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(MainActivity.this, DetalheActivityFilms.class);
                it.putExtra("film", mListFilms.get(position));
                startActivity(it);

            }
        });
    }

}
