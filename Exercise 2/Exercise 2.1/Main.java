import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
//        Runnable tast1 = () -> iterateCubes(5);
//        Runnable task2 = () -> iterateSquares(5);
//        PerformanceMetrics.measureRuntime(tast1);
//        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
//        PerformanceMetrics.measureRuntime(task2);
        ArrayList<Integer> testArray = generateRandomArray(10000);
        ArrayList<Integer> arratTwo = new ArrayList<>(testArray);
//        System.out.println(testArray);
        Runnable soart1 = () -> Sort.bubbleSort1(testArray);
        Runnable sorat2 = () -> Sort.bubbleSort2(arratTwo);
        PerformanceMetrics.measureRuntime(soart1);
        PerformanceMetrics.measureRuntime(sorat2);
    }

    public static void iterateCubes(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                for(int k = 0;k<n;k++){
                    System.out.println("i: " + i + " j: " + j + " k: " + k);
                }
            }
        }
    }
    public static void iterateSquares(int n){
        for(int i = 0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" i: "+ i + " j: " + j);
            }
        }
    }
    public static ArrayList<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i =0;i<n;i++){
            list.add(random.nextInt(100000));
        }
        return list;
    }
}