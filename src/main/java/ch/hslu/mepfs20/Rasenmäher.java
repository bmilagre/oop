package ch.hslu.mepfs20;

import java.util.Objects;

public abstract class Rasenmäher implements Comparable<Rasenmäher> {
    private Antrieb antrieb;
    private Messer messer;
    private String serienNummer;
    private Generation generation;
    private static int counter = 20000;

    public Rasenmäher(final Antrieb antrieb, Generation generation) {
            this.messer = new Messer();
            this.messer.isCompatibleTo(generation);

            this.antrieb = antrieb;
            this.serienNummer = this.addSerialNumber();
            this.generation = generation;
    }

    public Messer getMesser() {
        return this.messer;
    }

    public Antrieb getAntrieb() {
        return this.antrieb;
    }

    public String getSerienNummer() {
        return this.serienNummer;
    }

    public Generation getGeneration() {
        return this.generation;
    }

    private String addSerialNumber() {
        return "SV" + counter++;
    }

    private int getInternalSerialNumber() {
        // Ich weiss nicht schön, aber sonst fällt mir nichts ein :)
        return Integer.parseInt(this.getSerienNummer().substring(2));
    }

    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Rasenmäher rasenmäher)) {
            return false;
        }

        return Objects.equals(rasenmäher.antrieb, this.antrieb) && Objects.equals(rasenmäher.messer, this.messer) && Objects.equals(rasenmäher.serienNummer, this.serienNummer) && Objects.equals(rasenmäher.generation, this.generation);
    }

    public int hashCode() {
        return Objects.hash(this.antrieb, this.messer, this.serienNummer, this.generation);
    }

    @Override
    public String toString() {
        return "Rasenmäher[Antriebstechnik=" + this.antrieb + "; Messertechnik=" + this.messer + "; Seriennummer=" + this.serienNummer + "; Generation=" + this.generation + "]";
    }

    @Override
    public int compareTo(Rasenmäher o) {
        return Integer.compare(this.getInternalSerialNumber(), o.getInternalSerialNumber());
    }
}
