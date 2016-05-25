import java.lang.System;import java.util.ArrayList;
import java.util.List;


/**
 * Created by bartek on 2016-05-24.
 */
public class Kalendarz extends Dni
{
    final static int LICZBA_DNI=3;
    List<List> listy1 =new ArrayList<>(LICZBA_DNI);


    public void metodaprobna(){
        Dni dzien=new Dni();
            for(int i=0;i<LICZBA_DNI;i++) {
                 listy1.add(dzien.wypelnianieDnia());
            }
        System.out.println(listy1);

    }
    public void szukajka(){
        for(int i=0;i<LICZBA_DNI;i++)
        {
            int index = listy1.get(i).indexOf(0);
            System.out.println(index);
        }

    }
}
