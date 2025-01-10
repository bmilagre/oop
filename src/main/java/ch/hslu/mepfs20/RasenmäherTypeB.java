package ch.hslu.mepfs20;

public class RasenmäherTypeB extends Rasenmäher {

    public RasenmäherTypeB(Antrieb antrieb) {
        super(antrieb, Generation.G2);
    }

    public static void main(String[] args) {
        RasenmäherTypeB rasenmäherTypeB = new RasenmäherTypeB(new Antrieb());
        System.out.println(rasenmäherTypeB.toString());
    }

    @Override
    public String toString() {
        return "RasenmäherTypeB " + super.toString();
    }
}
