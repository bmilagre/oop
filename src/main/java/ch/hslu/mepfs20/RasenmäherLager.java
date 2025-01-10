package ch.hslu.mepfs20;

import java.util.HashMap;
import java.util.Map;

public final class RasenmäherLager {
    private Map<String, Rasenmäher> lager = new HashMap<String, Rasenmäher>();

    public static void main(final String[] args) {
        new RasenmäherLager();
    }

    public RasenmäherLager(){
        RasenmäherTypeA rasenmäherTypeA1 = new RasenmäherTypeA(new Antrieb());
        RasenmäherTypeA rasenmäherTypeA2 = new RasenmäherTypeA(new Antrieb());
        RasenmäherTypeB rasenmäherTypeB1 = new RasenmäherTypeB(new Antrieb());

        lager.put(rasenmäherTypeA1.getSerienNummer(), rasenmäherTypeA1);
        lager.put(rasenmäherTypeA2.getSerienNummer(), rasenmäherTypeA2);
        lager.put(rasenmäherTypeB1.getSerienNummer(), rasenmäherTypeB1);

        for(Map.Entry<String, Rasenmäher> e : lager.entrySet()) {
           System.out.println(e.toString());
        }
    }

    public int getAnzahlGeneration(final Generation generation) {
        int count = 0;
        for (Rasenmäher rasenmäher : lager.values()) {
            if (rasenmäher.getGeneration() == generation) {
                count++;
            }
        }

        return count;
    }
}
