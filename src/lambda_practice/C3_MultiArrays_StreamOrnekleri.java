package lambda_practice;
//multi arrayleri cevirirken flapMap kullaniriz yapilis sekli iki turludur
//1) lamda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc", "Erik"}
        };
        System.out.println("elemanYaz(arr) = " + elemanYaz(arr));
        doubleYaz(arr);
        System.out.println("eIleBaslayanList(arr) = " + eIleBaslayanList(arr));
        kIleBitenYıldızlı(arr);

    }

    // S1 : tum elemanlari list yapalim
    public static List<String> elemanYaz(String arr[][]) {
        return Arrays.stream(arr).flatMap(Arrays::stream).collect(Collectors.toList());
    }


    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim

    public static void doubleYaz(String arr[][]) {
        Arrays.stream(arr).flatMap(Arrays::stream).filter(t -> t.startsWith("E")).map(t -> t + t).forEach(System.out::println);
    }

    // S3: E ile baslayan elemanlari liste olarak yazdiralim
    public static List<String> eIleBaslayanList(String arr[][]) {
     return    Arrays.stream(arr).flatMap(Arrays::stream).filter(t -> t.startsWith("E")).collect(Collectors.toList());
    }

    //S4 : k ile bitenlerin sonuna '*' ekleyelim
public static void kIleBitenYıldızlı(String arr[][]){
        Arrays.stream(arr).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("k")).
                map(t->t+"*").
                forEach(System.out::println);
}

}
