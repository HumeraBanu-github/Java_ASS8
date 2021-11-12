package Ass7.ques8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ThreadMain {
    public static void main(String[] args) {
        List<Thread> list = Arrays.asList(
                new Thread(45),
                new Thread(98));
       Consumer<Thread> consumer = thread -> System.out.println(thread);
        list.forEach(consumer);
    }
}
