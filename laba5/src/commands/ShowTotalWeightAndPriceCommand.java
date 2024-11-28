package commands;

import necklace.Necklace;

public class ShowTotalWeightAndPriceCommand implements Command {
    private Necklace necklace;

    public ShowTotalWeightAndPriceCommand (Necklace necklace) {
        this.necklace = necklace;
    }
    @Override
    public void execute() {
        System.out.println("Показати загальну вагу та ціну намиста");
    }
}
