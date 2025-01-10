package ch.hslu.mepfs20;

import java.util.ArrayList;
import java.util.List;

public class Messer implements MesserInterface{
    private String messerArt;
    private final List<Generation> compatibleGenerations;

    public Messer(String messerArt) {
        this.messerArt = messerArt;
        this.compatibleGenerations = new ArrayList<>();
        this.addCompatibleCollectionsToList();
    }

    public Messer() {
        this.messerArt = "Kochmesser";
        this.compatibleGenerations = new ArrayList<>();
        this.addCompatibleCollectionsToList();
    }


    public String getMesserArt() {
        return this.messerArt;
    }

    public void setMesserArt(final String messerArt) {
        this.messerArt = messerArt;
    }

    @Override
    public String toString() {
        return "Messer[messerArt=" + this.messerArt + "]";
    }

    private void addCompatibleCollectionsToList(){
        this.compatibleGenerations.add(Generation.G1);
        this.compatibleGenerations.add(Generation.G2);
    }

    @Override
    public boolean isCompatibleTo(Generation to) {
        if (this.compatibleGenerations.contains(to)) {
            return true;
        }

        throw new IllegalArgumentException("Generation not compatible");
    }
}
