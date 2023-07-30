package com.henrique.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        SegundaClasse segundaClasse = new SegundaClasse();

        segundaClasse.mensagem();



    List<Animais> racasAnimais = new ArrayList<>();
    racasAnimais.add(new Gato());
    racasAnimais.add(new Cachorro());

    racasAnimais.get(0).getCor();
        System.out.println(racasAnimais);

    }



    }

