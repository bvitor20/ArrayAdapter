package br.com.example.brunovitor.lwarrray;


public class Util {

    public static int getLogo(int filmID){

        int[] logos = new int[]{
                R.drawable.sm,
                R.drawable.im,
                R.drawable.th,
                R.drawable.p,
                R.drawable.w
        };

        return logos[filmID];
    }
}
