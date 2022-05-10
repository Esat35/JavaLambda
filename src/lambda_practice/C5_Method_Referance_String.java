package lambda_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");
        tumHarfBuyukBoslukluYaz(l);
        uzunlukSıraYaz(l);
        eIleBaslayanYaz(l);

    }

    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
    public static void tumHarfBuyukBoslukluYaz(List<String> list) {
        list.
                stream().
                map(t -> t.split("")).
                flatMap(Arrays::stream).
                map(String::toUpperCase).
                forEach(Methods::yazString);
    }

    //S2: Stringleri uzunluklarina gore siralayip yaziniz
    public static void uzunlukSıraYaz(List<String> list) {
        System.out.println();
        list.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(System.out::println);
    }


    //S3: E ILE Baslayanlari yazdiralim
    public static void eIleBaslayanYaz(List<String> list) {
        System.out.println();
        list.
                stream().
                filter(Methods::EbasliyorMu).
                forEach(Methods::yazString);
    }

}
