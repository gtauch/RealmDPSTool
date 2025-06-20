package main;

import java.util.EnumMap;
import java.util.Map;

import enums.Stat;

public class StatUtils {
    public static EnumMap<Stat, Double> buildStats(Map<Stat, Number> input) {
        EnumMap<Stat, Double> stats = new EnumMap<>(Stat.class);
        for (Stat stat : Stat.values()) {
            stats.put(stat, input.getOrDefault(stat, 0).doubleValue());
        }
        return stats;
    }
}
