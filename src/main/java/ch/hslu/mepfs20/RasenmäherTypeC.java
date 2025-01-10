package ch.hslu.mepfs20;

public class RasenmäherTypeC extends Rasenmäher {

    public RasenmäherTypeC(Antrieb antrieb) {
        super(antrieb, Generation.G3);
    }

    public static void main(String[] args) {
        RasenmäherTypeC rasenmäherTypeC = new RasenmäherTypeC(new Antrieb());
        System.out.println(rasenmäherTypeC.toString());
    }

    @Override
    public String toString() {
        return "RasenmäherTypeC " + super.toString();
    }
}
