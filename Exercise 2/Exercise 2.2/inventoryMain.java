import java.util.ArrayList;

public class inventoryMain {
    public static void main(String[] args){
        Inventory inventory = new Inventory();

        ArrayList<Item> itemlist = new ArrayList<>();
        for(int i = 0;i < 5;i++){
            itemlist.add(new Item(""+i));
        }

        for(Item item:itemlist){
            inventory.addItem(item);
        }

        System.out.println();

        inventory.displayItems();
        System.out.println("count: " + inventory.getItemCount());
        inventory.removeItem(itemlist.get(3));
        inventory.displayItems();
        System.out.println("count: " + inventory.getItemCount());

        System.out.println();

        System.out.println(inventory.hasItem(itemlist.get(0)));
        System.out.println(inventory.hasItem(itemlist.get(3)));

    }
}
