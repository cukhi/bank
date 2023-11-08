import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Klient k1 = new Klient("Bartosz",1,"Kopernika 9");
        Klient k2 = new Klient("Marcel",102,"Władysława 11");
        Klient k3 = new Klient("Bartosz",103,"Mikołaja 3");
       KontoBankowe bk1 = new KontoBankowe(12,1000,k1);
       KontoKredytowe kk1 = new KontoKredytowe(103,2000,k2,1000);
       KontoBankowe bk3 = new KontoBankowe(3,5000,k3);
       bk1.WyswietlStanKonta();
       bk1.WplacDoKonta(1000);
       bk1.WyswietlStanKonta();
       bk1.WyswietlInformacjeOKliencie();

        bk3.WyswietlStanKonta();
        bk3.WyplacZKonta(1000);
        bk3.WyswietlStanKonta();
        bk3.WyswietlInformacjeOKliencie();

        kk1.WezKredyt();
        kk1.SplacKredyt(200);


    }
}



