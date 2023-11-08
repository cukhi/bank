public class Klient{
    String nazwa;
    int id;

    String adres;

    public Klient(String nazwa,int id,String adres) {
        setNazwa(nazwa);
        setId(id);
        setAdres(adres);

    }

    public String getNazwa() {
        return nazwa;
    }

    public int getId() {
        return id;
    }

    public String getAdres() {
        return adres;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
