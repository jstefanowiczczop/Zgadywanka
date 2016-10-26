/**
 * Created by Jola on 2016-10-26.
 */
public class Zgadywanka {

        Gracz p1;
        Gracz p2;
    Gracz p3;

    public void rozpocznijGre(){

        p1 = new Gracz ();
        p2 = new Gracz ();
        p3 = new Gracz ();



        int typp1 = 0;
        int typp2 = 0;
        int typp3 = 0;


        boolean p1odgad1 = false;
        boolean p1odgad2 = false;
        boolean p1odgad3 = false;

      int.liczbaOdgadywana = (int)(Math.random() *10);
        System.out.println("Myślę o liczbie z zakresu od 0 do 9....");

        while(true){
            System.out.println("Należy wytypować liczbę :" + liczbaodgadywana);

            p1.zagaduj ();
            p2.zagaduj ();
            p3.zagaduj();

            typp1=p1.liczba;
            System.out.println ("Gracz pierwszy wytypował liczbę: +typ1");

            typp2=p2.liczba;
            System.out.println ("Gracz drugi wytypował liczbę: +typ2");

            typp3=p3.liczba;
            System.out.println ("Gracz trzeci wytypował liczbę: +typ13);

                if (typp1 = LiczbaOdgadywana) {
                poldgad1 = true;
                (typp2 = LiczbaOdgadywana) {
                    poldgad2 = true;

                    (typp3 = LiczbaOdgadywana) {
                        poldgad3 = true;
                    }
                    {if (p1odgad1 II p2odglad II p3odgadl){




                    }
                        System.out.println ("Mamy zwycięzcę");
                        System.out,println("Czy gracz pierwszy wytypował poprawnie ? +p1odglad");
                        System.out,println("Czy gracz drugo wytypował poprawnie ? +p2odglad");
                        System.out,println("Czy gracz trzeci wytypował poprawnie ? + p3odglad");

                        System.out.println("Koniec gry");


            }
else {
                        System.out,println("Gracz musi spróbować jeszcze raz");
                    }
        }

    }



}



