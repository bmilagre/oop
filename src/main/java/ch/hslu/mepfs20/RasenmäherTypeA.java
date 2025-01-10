package ch.hslu.mepfs20;

public class RasenmäherTypeA extends Rasenmäher {
    public RasenmäherTypeA(Antrieb antrieb) {
        super(antrieb, Generation.G1);
    }

    public static void main(String[] args) {
        RasenmäherTypeA rasenmäherTypeA = new RasenmäherTypeA(new Antrieb());
        System.out.println(rasenmäherTypeA.toString());
    }

    @Override
    public String toString() {
        return "RasenmäherTypeA " + super.toString();
    }
}
