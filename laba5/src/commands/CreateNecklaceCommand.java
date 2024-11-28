package commands;

import necklace.Necklace;

public class CreateNecklaceCommand implements Command {
    private Necklace necklace;

    public CreateNecklaceCommand(Necklace necklace) {
        this.necklace = necklace;
    }

    @Override
    public void execute() {
        System.out.println("Створення намиста");
    }
}
