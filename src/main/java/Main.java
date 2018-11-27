import algorithm.*;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Main {
    final static int ARRAY_SIZE = 20_000;
    public static void main(String[] args) {
        System.out.println("Testing time of sorting algorithms on random array");
        System.out.println("Array size: " + ARRAY_SIZE);
        printSortTime(new MergeSort<Integer>());
        printSortTime(new QuickSort<Integer>());
        printSortTime(new RadixSort());
        printSortTime(new BubbleSort<Integer>());
    }

    static Integer[] getRandomArray(int size) {
        Random random = new Random();
        Integer[] testArray = new Integer[size];
        for (int i = 0; i < testArray.length; ++i) {
                testArray[i] = Math.abs(random.nextInt());
        }
        return testArray;
    }
    static void printSortTime(SortingAlgorithm<Integer> algorithm) {
        Instant start = Instant.now();
        algorithm.sort(getRandomArray(ARRAY_SIZE));
        Duration duration = Duration.between(start,Instant.now());
        String className = algorithm.getClass().getSimpleName();
        System.out.println(className + " time : " + duration.toMillis() + " ms");
    }

}
