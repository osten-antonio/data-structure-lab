import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        OrderQueue restaurant_queue = new OrderQueue();
        restaurant_queue.addPriorityQueue("Hamburger");
        restaurant_queue.addPriorityQueue("Hamburger1");
        restaurant_queue.addPriorityQueue("Hamburger2");
        restaurant_queue.addPriorityQueue("Hamburger3");
        restaurant_queue.addReg("Hamburger");
        restaurant_queue.addReg("Hamburger a");
        restaurant_queue.addReg("Hamburger b");

        restaurant_queue.showAll();
        System.out.println();
        if(restaurant_queue.cancelOrder("Hamburger")){
            System.out.println("Success cancel");
        }else{
            System.out.println("Not success");
        }
        if(restaurant_queue.cancelOrder("Hamburger a")){
            System.out.println("Success cancel");
        }else{
            System.out.println("Not success");
        }
        if(restaurant_queue.cancelOrder("Hamburger2")){
            System.out.println("Success cancel");
        }else{
            System.out.println("Not success");
        }
        if(restaurant_queue.cancelOrder("Chimkin")){
            System.out.println("Success cancel");
        }else{
            System.out.println("Not success");
        }
        System.out.println();
        restaurant_queue.showAll();
        System.out.println();
        restaurant_queue.processOrder();
        System.out.println();
        restaurant_queue.showAll();
    }
}
