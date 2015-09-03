package br.com.example.brunovitor.lwarrray;

import java.io.Serializable;

/**
 * Created by BrunoVitor on 02/09/2015.
 */
public class Filmes implements Serializable {

    public static final int SPIDER_MAN = 0;
    public static final int IRON_MAN = 1;
    public static final int THE_HOUSE = 2;
    public static final int PARIS = 3;
    public static final int WAR_IN_THE_CITY = 4;

    public Filmes (int filmId, String nomeFilm, String anoFilm, String direcaoFilm, String resumoFilm){
        this.filmId = filmId;
        this.nomeFilm = nomeFilm;
        this.anoFilm = anoFilm;
        this.direcaoFilm = direcaoFilm;
        this.resumoFilm = resumoFilm;



    }


    int filmId;
    String nomeFilm;
    String anoFilm;
    String direcaoFilm;
    String resumoFilm;
}
