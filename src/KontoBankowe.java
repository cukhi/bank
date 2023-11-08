public class KontoBankowe {
    private int numerKonta;
    private int saldo;
    private Klient wlasciciel;

    public KontoBankowe(int numerKonta,int saldo,Klient wlasciciel ){
        setNumerKonta(numerKonta);
        setSaldo(saldo);
        setWlasciciel(wlasciciel);
    }

    public void setNumerKonta(int numerKonta) {
        this.numerKonta = numerKonta;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setWlasciciel(Klient wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public int getNumerKonta() {
        return numerKonta;
    }

    public int getSaldo() {
        return saldo;
    }

    public Klient getWlasciciel() {
        return wlasciciel;
    }

    void WplacDoKonta(int wartoscWplacona){
        try{
            setSaldo(getSaldo() + wartoscWplacona);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    void WyplacZKonta(int wartoscWyplacona){
        try{
            if(getSaldo() < wartoscWyplacona){
                System.out.println("Nie możesz wypłacic tyle funduszy");
            }else{
                setSaldo(getSaldo() - wartoscWyplacona);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
    void WyswietlStanKonta(){
        System.out.println("Aktualny stan konta to " + getSaldo() + " zł");
    }
    void WyswietlInformacjeOKliencie(){
        System.out.println("imie: " +  getWlasciciel().nazwa + " adres: " + getWlasciciel().adres + " id: " + getWlasciciel().id);
    }


}
