package com.henrique.test;

import javax.swing.text.html.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListHashMapLooping {
    public static void main(String[] args) {

        // ARRAY

        String[] array = new String[]{"Array0", "Array1", "Array2", "Array3", "Array4"}; /* Array é uma lista
        de Strings que simplifica o uso delas para um só comando.*/
        System.out.println(array[2]); // Executa um o 3° array da String acima.

        // LIST

        List<String> list = new ArrayList<>();
        list.add("lista0");
        list.add("Lista1");
        System.out.println(list.get(1));

        // HASHMAP

        HashMap<String, String> map = new HashMap<>();
        map.put("Arena 5", "Arena 5 desbloqueada!");
        map.put("Arena 10", "Arena 10 desbloqueada!");
        map.put("Arena 20", "Arena 20 desbloqueada!");
        System.out.println(map.get(3));
        {

            // LOOPING COM HASMAP

            for (int m = 0; m < map.size(); m++) {
                System.out.println("Chave: " + map.keySet().toArray()[m]);
                System.out.println("Valor: " + map.values().toArray()[m]);
            }

            // LOOPING COM LIST

            for (int l = 0; l < list.size(); l++) {
                    System.out.println(list.get(l));

            }

            // LOOPING COM ARRAY

            for (int a = 0; a < array.length; a++) {
                    System.out.println(array[a]);
                }

            // LOOPING COM ARRAY02

            for(String string : array) {
                System.out.println(string);
            }
            // LOOPING COM LIST02

            for(String string : list) {
                System.out.println(string);
            }

            }

            // While loops

            int number = 0;
        while (number < 10) {
            System.out.println(number);
            number++;
        }

        }
    }
