import java.util.*;

public class OrderQueue {
    private Queue<String> RegularQueue;
    private Queue<String> priorityQueueue;
    OrderQueue(){
        RegularQueue = new LinkedList<>();
        priorityQueueue = new LinkedList<>();
    }
    public void addReg(String order){
        RegularQueue.add(order);
    }
    public void addPriorityQueue(String order){
        priorityQueueue.add(order);
    }
    public void processOrder(){
        if(!priorityQueueue.isEmpty()){
            System.out.println("Processed " + priorityQueueue.peek());
            priorityQueueue.remove();
            return;
        }else{
            if(!RegularQueue.isEmpty()){
                System.out.println("Processed " + RegularQueue.peek());
                RegularQueue.remove();
                return;
            }
        }
        System.out.println("Nothing to process");
    }
    public boolean cancelOrder(String order){
        if(!priorityQueueue.isEmpty() && recurseSearch(new LinkedList<>(priorityQueueue),order)){
            priorityQueueue.remove(order);
            return true;
        }else if (!RegularQueue.isEmpty() && recurseSearch(new LinkedList<>(RegularQueue),order)){
            RegularQueue.remove(order);
            return true;
        }
        return false;
    }
    private boolean recurseSearch(Queue<String> queue, String order){
        if(queue.isEmpty()){
            return false;
        }
        if(queue.peek().equals(order)){
            return true;
        }
        queue.remove();
        return recurseSearch(queue,order);
    }
    public void showAll(){
        Iterator<String> ite = priorityQueueue.iterator();
        while(ite.hasNext()){
            System.out.println("Priority: "+ite.next());
        }
        ite = RegularQueue.iterator();
        while(ite.hasNext()){
            System.out.println("Regular: "+ite.next());
        }
    }

}
