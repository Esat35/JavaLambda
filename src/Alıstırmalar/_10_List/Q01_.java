package Alıstırmalar._10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Q01_ {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> isimler = new ArrayList<String>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        //asList()--> String olarak verilen ifadelerin hepsini ArrayList!'in içine atar.
        // Yani list oluşturur. tek tek add demek zorunda kalmayiz


        aolmayanlar(isimler);
    }


    public static void aolmayanlar(ArrayList<String> isimler) {
        System.out.println(isimler.stream().filter(t -> !t.toLowerCase(Locale.ROOT).contains("a")).collect(Collectors.toList()));
    }
}
