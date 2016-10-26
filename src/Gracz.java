import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * Created by Jola on 2016-10-26.
 */
public class Gracz {
    int liczba = 0;
    public void zaladuj(){
        liczba = (int) (Match.random () *10);
        System.out.println ("Typuje liczbę" + liczba);




    }



}
