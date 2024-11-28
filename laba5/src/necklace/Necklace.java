package necklace;

import gemstones.Gemstone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Necklace {
    private List<Gemstone> gemstones;

    public Necklace() {
        gemstones = new ArrayList<>();
    }

    public void addGemstone(Gemstone gemstone) {
        gemstones.add(gemstone);
    }
    
    public List<Gemstone> getGemstones() {
        return gemstones;
    }

    public double calculateTotalWeight() {
        return gemstones.stream().mapToDouble(Gemstone::getWeight).sum();
    }

    public double calculateTotalPrice() {
        return gemstones.stream().mapToDouble(Gemstone::getPrice).sum();
    }

    public void sortByPrice() {
        gemstones.sort(Comparator.comparingDouble(Gemstone::getPrice));
    }

    public List<Gemstone> findGemstonesByTransparency(double min, double max) {
        List<Gemstone> result = new ArrayList<>();
        for (Gemstone gem : gemstones) {
            if (gem.getTransparency() >= min && gem.getTransparency() <= max) {
                result.add(gem);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Necklace includes:\n");
        for (Gemstone gem : gemstones) {
            sb.append(gem.toString()).append("\n");
        }
        return sb.toString();
    }
}
