package pl.ttpsc.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WeightedInts {

    private Map<Integer, Integer> weightedKeys = new HashMap<>();
    private int minKey = Integer.MAX_VALUE;
    private int maxKey = Integer.MIN_VALUE;

    public WeightedInts(List<Integer> keys) {
        keys.forEach(this::putAndSetWeight);
    }

    public void putAndSetWeight(Integer key) {
        if (weightedKeys.containsKey(key)) {
            Integer weight = weightedKeys.get(key);
            weightedKeys.put(key, weight + 1);
        } else {
            weightedKeys.put(key, 1);
        }

        checkMinMax(key);
    }

    public double calculateWeightedAverage() {
        double div = 0;
        double sum = 0;
        for (Entry<Integer, Integer> u : weightedKeys.entrySet()) {
            div += u.getValue();
            sum += u.getKey() * u.getValue();
        }
        return sum / div;
    }

    public int getWeightSafe(int key) {
        return weightedKeys.getOrDefault(key, 0);
    }

    //TODO: future use when i will know what my name and number are
    public String getFizzBuzzNumber(int number) {
        //TODO: implement
        return null;
    }

    public int getMinKey() {
        return minKey;
    }

    public int getMaxKey() {
        return maxKey;
    }

    private void checkMinMax(int value) {
        if (value < minKey) {
            minKey = value;
        }

        if (value > maxKey) {
            maxKey = value;
        }
    }
}