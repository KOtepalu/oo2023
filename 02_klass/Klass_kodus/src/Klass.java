public class Klass {
    String nimi;
    String telefon;
    String kuuPaev;
    String aeg;
    boolean broneeritud;

    public Klass(String nimi, String telefon,String kuuPaev, String aeg) {
        this.nimi = nimi;
        this.telefon = telefon;
        this.kuuPaev = kuuPaev;
        this.aeg = aeg;
        this.broneeritud = true;
    }
    public String loobuBroneeringust() {
        this.broneeritud = false;
        return "Broneering kustutatud!";
    }
    public String muudaBroneeringut(String uusNimi, String uusTelefon, String uusKuuPaev, String uusAeg){
        this.nimi = uusNimi;
        this.telefon = uusTelefon;
        this.kuuPaev = uusKuuPaev;
        this.aeg = uusAeg;
        return "Broneering muudetud!";
    }
}

