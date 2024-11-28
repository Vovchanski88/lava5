package commands;

import necklace.Necklace;

public class SortByPrice implements Command{
    private Necklace necklace;

    public SortByPrice (Necklace necklace) {
        this.necklace = necklace;
    }
    @Override
    public void execute() {
        System.out.println("Сортувати камені в намисті за ціною");
    }
}
