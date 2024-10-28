/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeon.crawler.project;
import Entities.Entity;
import Entities.Monster;
import Entities.Player;
import Items.Item;
import java.util.Scanner;
/**
*
* @author liz10
* File Version 2.0 
* 10/27/24
*/

public class Run {
    private Player player;
    private Dungeon dungeon;
    private Inventory inventory;
    private int currentFloor;
    private Scanner scanner;
    private int itemChoice;

    public Run() {
        player = new Player(18, 10, 13, 20, "Player"); // Initialize the player
        inventory = new Inventory();
        currentFloor = 1; // Start from floor 1
        scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Welcome to the Dungeon");

        while (player.getHP() > 0) {
            dungeon = new Dungeon(currentFloor);
            dungeon.createDungeon(); // Create a dungeon for the current floor
            dungeon.getStartRoom();

            System.out.println("\nYou enter floor " + currentFloor + "...");
            exploreDungeon();

            if (player.getHP() > 0) {
                System.out.println("\nCongratulations! You have cleared floor " + currentFloor + "!");
                currentFloor++;
            }

        }

        if (player.getHP() <= 0) {
            System.out.println("\nYou have been defeated! Game Over.");
        }
        
        scanner.close();
    }

    private void exploreDungeon() {//This method allows for dungeon exploring
        while (player.getHP() > 0 && !dungeon.isDungeonCleared()) {
            dungeon.drawRooms();
            System.out.println("Player Stats");
            player.printStats();
            System.out.println("\n" + dungeon.getCurrentRoom().toString()); // Print the room description
            
            Entity currentEntity = dungeon.getCurrentRoomEntity();
            
            if (currentEntity instanceof Monster) {
                // Battle logic
                Monster monster = (Monster) currentEntity;
                Battle battle = new Battle(player, monster);
                battle.battleSequence();

                if (player.getHP() > 0) {
                    // Player won the battle
                    dungeon.clearCurrentEntity(); // Remove the defeated monster from the room
                }
            } else if (currentEntity instanceof Item) {
                // Item logic
                Item item = (Item) currentEntity;
                System.out.println("You found a " + item.getName() + "! Do you want to pick it up? (y/n)");
                String input = scanner.nextLine().trim().toLowerCase();
                if (input.equals("y")) {
                    inventory.addItem(item);
                    System.out.println(item.getName() + " added to your inventory.");
                    dungeon.clearCurrentEntity(); // Remove the item from the room
                }
            }
            handleMovement();
        }
    }

    public void handleMovement() {//this handles movement and inventory
        System.out.println("Which way would you like to move? (1 for next, 2 for previous, 3 for inventory, or 4 to use an item)");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        while (true) {
            switch (choice) {
                case 1:
                    dungeon.moveNext();
                    return; // Exit method after moving
                case 2:
                    dungeon.movePrevious();
                    return; // Exit method after moving
                case 3:
                    inventory.displayInventory();
                    return; // Exit method after displaying inventory
                case 4: 
                	System.out.println("Press the number starting at zero that is associated with your item (Top item is zero, then 1, 2, etc)");
                	itemChoice = scanner.nextInt();
                	player.useItem(inventory.useItem(itemChoice),player);
                	inventory.removeItem(itemChoice);
                	return;
                default:
                    System.out.println("Invalid choice. Try again");
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
            }
        }
    }
}
