public class KontoKredytowe extends  KontoBankowe{
    private  int wartoscKredytu;

    public  KontoKredytowe(int numerKonta,int saldo, Klient wlasciciel,int wartoscKredytu){
        super(numerKonta,saldo,wlasciciel);
        setWartoscKredytu(wartoscKredytu);


    }

    public int getWartoscKredytu() {
        return wartoscKredytu;
    }

    public void setWartoscKredytu(int wartoscKredytu) {
        this.wartoscKredytu = wartoscKredytu;
    }

    void   WezKredyt(){
        try{
            super.setSaldo(super.getSaldo()+getWartoscKredytu());
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Wzięto kredyt o wartosci: " + getWartoscKredytu());


    }

    void SplacKredyt(int splata)  {

        try{
            while(getWartoscKredytu() > 0){
                System.out.println("Splacono " + splata + " zł");
                setWartoscKredytu(getWartoscKredytu() - splata);
                System.out.println(getWartoscKredytu());
                Thread.sleep(1000);
            }
            if(getWartoscKredytu() == 0){
                System.out.println("Spłacono cały kredyt");
            }

        }
        catch (Exception e){
            System.out.println("An error has occured in SplacKredyt function: " + e);

        }

    }


}
