import java.lang.System;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by bartek on 2016-05-24.
 */
public class Kalendarz extends Dni
{
    final static int LICZBA_DNI=2;
    List<List> listy1 =new ArrayList<>(LICZBA_DNI);
    List<List> listy2 =new ArrayList<>(LICZBA_DNI);

    public void metodaprobna(){
        Dni dzien=new Dni();
        Dni dzien1 = new Dni();
            for(int i=0;i<LICZBA_DNI;i++) {
                // listy1.add(dzien.wypelnianieDnia());
                //listy2.add(dzien1.wypelnianieDnia());
               // System.out.println("podaj grafik dla dnia pierwszego listy 1");
               // listy1.add(dzien.wypDniaRecznie());
               // System.out.println("podaj grafik dal dnia pierwszego listy 2");
                //listy2.add(dzien1.wypDniaRecznie());
            }
         listy1 = Arrays.asList(Arrays.asList(1,1,1,1,1,1,1,0),Arrays.asList(1,0,1,1,1,1,1,1));
         listy2 = Arrays.asList(Arrays.asList(1,1,1,1,1,1,0,1),Arrays.asList(1,1,1,1,1,1,0,1));
        System.out.println();
        System.out.println(listy1);
        System.out.println(listy2);
    }
    public void szukajka(){
        boolean zmienna =false;
      //  for(int i=0;i<LICZBA_DNI;i++)
       // {
        //    for(int j=0;j<listy1.get(i).size();j++)
          //  {
            //    if(listy1.get(i).get(j)==listy2.get(i).get(j) && listy1.get(i).get(j).equals(0) )
              //  {
                //    System.out.println("pasuje "+i+" "+j);
                 //   zmienna=true;
               // }
            //}
       // }
        if(zmienna==false)
        {
            System.out.println("brak wolnych terminow, zaczynam zmiane grafiku");
            algorytmPierwszy();
        }
    }
    public void algorytmPierwszy()
    {
        boolean trwa=true;
        for(int i=0;i<LICZBA_DNI;i++)//przeszukiwanie po dniach
        {
            for(int j=0;j<listy1.get(i).size();j++)//przeszukiwanie po godzinach
            {
                if (listy1.get(i).get(j).equals(0) && listy2.get(i).get(j).equals(1) )// jezeli listy dnia i  godziny j jest rowne 0 i listy dnia i godziny j rowne 1 to..
                {
                    while (trwa==true) {
                        if (listy2.get(i).indexOf(0) > 0) {//przypisanie pierwszego zera bo pozniej zostaje zamieniona 1 na 0 i moze sie pojebac
                            int zero = listy2.get(i).indexOf(0);
                            listy2.get(i).set(j, listy1.get(i).get(j)); // lista 2 dnia i zmienia z 1 na 0
                            System.out.println("zmiana kupy w dniu " + i + " o indeksie " + j + "    " + zero);// takie dla sprawdzenia
                            listy2.get(i).set(zero, 1);
                            trwa = false;
                        } else {
                            int noweZero = listy2.get(i + 1).indexOf(0);
                            listy2.get(i).set(noweZero, 1); // pierwsze zero zamienione na 1 :)
                            System.out.println("zmiana kupy w dniu " + i + " o indeksie " + j + "    " + noweZero);// takie dla sprawdzenia
                            trwa = false;
                        }
                    }
                    //else listy2.get(i).set(zero, 1);
                    // drugi problem jak pomysle to taki ze to troche dziala jak sortowanie
                    // trzeba rozwazyc przpadki odwrotne ze w liscie1 jest 1 a w liscie2 jest 0
                    // dodatkowo trzeba rozwazyc przypadek lista1= 1 lista2=1 i co wtedy to jasnej ciasne ?! musk na scianie

                }
            }

        }
        System.out.println(listy1);
        System.out.println(listy2);
    }

}
