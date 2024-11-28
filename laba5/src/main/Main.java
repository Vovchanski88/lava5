package main;

import commands.*;
import menu.Menu;
import necklace.Necklace;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Necklace necklace = new Necklace();
        Menu menu = new Menu();

        menu.addCommand("1", new CreateNecklaceCommand(necklace));
        menu.addCommand("2", new FindGemstonesByTransparency(necklace));
        menu.addCommand("3", new ShowTotalWeightAndPriceCommand(necklace));
        menu.addCommand("4", new SortByPrice(necklace));

        while (true) {
            System.out.println("\nЛаскаво просимо до ювелірної крамниці");
            System.out.println("1: Створити нове намисто");
            System.out.println("2: Знайти каміння за прозорістю");
            System.out.println("3: Показати загальну вагу та ціну намиста");
            System.out.println("4: Сортувати каміння за ціною");
            System.out.println("5: Вихід");

            System.out.println("Будь ласка, введіть команду: ");
            String choice = scanner.nextLine();

            if (choice.equals("5")) {
                System.out.println("Дякуємо за використання ювелірної крамниці!");
                break;
            }
            menu.executeCommand(choice);
        }

        scanner.close();
    }
}
