package com.sdajava.zamiana;

public class Main {

    public static void main(String[] args) {

        //wynosze 4 na koniec
        int[] tab = {4, 7, 8, 3, 5, 4};
        int[] tab2 = {4, 7, 8, 3, 5, 4};

        //przesuniecie na koniec
        for(int i=0; i<tab.length-1; i++){
                int tmp = tab[i];
                tab[i] = tab[i + 1];
                tab[i + 1] = tmp;
        }

        //parami
        for(int i=0; i<tab.length-1; i+=2) {

            int tmp = tab[i];
            tab[i] = tab[i + 1];
            tab[i + 1] = tmp;

        }
        for(int i=0; i<tab.length; i++){
            System.out.printf(tab[i] +" ");
        }

    }
}
