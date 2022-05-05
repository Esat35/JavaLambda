package Alıstırmalar._10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_ {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("liste atamak için sayi giriniz \nyeterli sayiya ulastiginizda 'q' giriniz");

        String islem = "";
        while (!islem.equalsIgnoreCase("q")) {
            System.out.println("sayi giriniz : ");
            islem = scan.next();
            list.add(islem);
        }

        list.remove(list.size() - 1);//icinde q bulunmayan sadece sayi bulun list haline geldi


        System.out.println("kareler toplamı : "+list.stream().mapToInt(Integer::parseInt).map(t->t*t).reduce(Integer::sum));



    }

}

