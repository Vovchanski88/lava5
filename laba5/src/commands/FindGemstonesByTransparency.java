package commands;

import necklace.Necklace;

public class FindGemstonesByTransparency implements Command{
    private Necklace necklace;

    public FindGemstonesByTransparency(Necklace necklace) {
        this.necklace = necklace;
    }
    @Override
    public void execute() {
        System.out.println("Пошук каменів в намисті за прозорістю");
    }
}
