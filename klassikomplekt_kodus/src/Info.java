public class Info {
    String mudel;
    int hindP2ev;
    int labis6it;
    String tyyp;

    public Info(String mudel, int hindP2ev, int labis6it, String tyyp) {
        this.mudel = mudel;
        this.hindP2ev = hindP2ev;
        this.labis6it = labis6it;
        this.tyyp = tyyp;
    }

    public void muudaHinda(int hindP2ev) {
        this.hindP2ev = hindP2ev;
    }

    public String kuvaTyyp() {
        return tyyp;
    }
}