import java.lang.Integer;import java.lang.String;import java.lang.System;import java.util.Arrays;
import java.util.List;

/**
 * Created by Micha? on 2016-05-05.
 */
public class Osoba {
    String imie,nazwsiko;

    static List<Integer> array = Arrays.asList(1,0,1,1,1);
    static List<Integer> array1 = Arrays.asList(1,0,1,1,1);

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwsiko() {
        return nazwsiko;
    }
    public void setNazwsiko(String nazwsiko) {
        this.nazwsiko = nazwsiko;
    }

    public static List<Integer> getArray1() {
        return array1;
    }

    public static void setArray1(List<Integer> array1) {
        Osoba.array1 = array1;
    }

    public static List<Integer> getArray() {
        return array;
    }

    public static void setArray(List<Integer> array) {
        Osoba.array = array;
    }

    public Osoba(String imie,String nazwsiko,List<Integer> array,List<Integer> array1){
        setImie(imie);
        setNazwsiko(nazwsiko);
        setArray(array);
        setArray1(array1);
    }

    public static void main(String[] args) {

        Osoba o = new Osoba("asd","asd",array,array1);
        Osoba w = new Osoba("asds","dasd",array,array1);
        Kalendarz k = new Kalendarz();
       k.metodaprobna();
        k.szukajka();
        //metoda(o.getArray(),w.getArray1());
        //searchFree(o.getArray(),w.getArray1());

        // for(int i:kalendarz)
        // System.out.println(o.getKalendarz()[i]);
    }
    public static void metoda(List<Integer> array, List<Integer> array1){
        for(int i=0 ;i<array.size() ;i++)
        {

            if(array.get(i)==array1.get(i) && array.get(i)==0)
            {
                System.out.println("dzien "+i+" wolny");
            }else if(array.get(i)==array1.get(i) || array.get(i)==1||array.get(i)==0){
                System.out.println("zajete");
            }
        }
    }
    public static void searchFree(List<Integer> array, List<Integer> array1){
        // System.out.println("szuakmy wolnego dnia"+ Arrays.binarySearch(kalendarz,0));
//        int dzien = Arrays.binarySearch(array,0) ;
//        int dzien1 = Arrays.binarySearch(array1,0);
//        if(dzien== dzien1){
//            System.out.println("Ekstra najbli?szy termin mamy: " + dzien );
//        }else System.out.println(  "nie wchodzi");
    }
}