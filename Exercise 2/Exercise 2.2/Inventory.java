import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    // Constructor
    public Inventory() {
        items = new ArrayList<>();
    }

    // Method to add an item to the inventory
    public void addItem(Item item) {
        // Adds an item
        items.add(item);
        System.out.println(item + " added to inventory");
    }

    // Method to remove an item from the inventory
    public void removeItem(Item item) {
        // Removes an item if it exists, if it doesn't then implement proper error handling
        if(items.contains(item)) {
            items.remove(items.indexOf(item));
            System.out.println(item + " removed from inventory");
        }
        else System.out.println("Dont have item in inventory");
    }

    // Method to check if an item exists in the inventory
    public boolean hasItem(Item item) {
        // Checks if an item exists
        return items.contains(item); // Placeholder return
    }

    // Method to display all items in the inventory
    public void displayItems() {
        // Displays all items
        System.out.println("Items in inventory:");
        for (Item item: items) System.out.println(item);
    }

    // Method to get the total number of items
    public int getItemCount() {
        // Gets the total number of items
        return items.size(); // Placeholder return
    }
}
