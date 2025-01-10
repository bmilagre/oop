package ch.hslu.mep21fs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProduktLager {
    private Map<String, Double> storage = new HashMap<String, Double>();

    public ProduktLager() {
        Staubsauger staubsauger1 = new Staubsauger("Dyson 2", "Renaut", 6);
        Staubsauger staubsauger2 = new Staubsauger("Dyson 3", "Renaut", 11);
        Staubsauger staubsauger3 = new Staubsauger("Dyson 4", "Renaut", 14);

        storage.put(staubsauger1.getModel(), staubsauger1.getWeight());
        storage.put(staubsauger2.getModel(), staubsauger2.getWeight());
        storage.put(staubsauger3.getModel(), staubsauger3.getWeight());
    }

    public Double getTotalWeight() {
        Double totalWeight = 0.0;

        for(Map.Entry<String, Double> e : storage.entrySet()) {
            totalWeight += e.getValue();
        }

        return totalWeight;
    }

    public String max(){
        if(storage.isEmpty()){
            return null;
        }

        return Collections.max(storage.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
