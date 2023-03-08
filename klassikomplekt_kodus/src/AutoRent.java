public class AutoRent {
    Info info;
    int rendiPikkus;

    public AutoRent(Info info, int rendiPikkus) {
        this.info = info;
        this.rendiPikkus = rendiPikkus;
    }
    public void lisaInfo(Info info){
        this.info = info;
    }
    public void pikendaRenti(int aeg){
        this.rendiPikkus = this.rendiPikkus + aeg;
    }
}