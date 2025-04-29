package src;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("==Testing MyHashTable==");
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>(50);
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = random.nextInt(100000);
            String name = "User" + id;
            MyTestingClass key = new MyTestingClass(id, name);
            table.put(key, "Data" + i);
        }

        table.printBuckets();

        System.out.println("\n==Testing BST==");
        BST<Integer, String> tree = new BST<>();
        tree.put(5, "five");
        tree.put(2, "two");
        tree.put(8, "eight");
        tree.put(1, "one");
        tree.put(3, "three");

        System.out.println("Get 3: " + tree.get(3));
        System.out.println("Get 8: " + tree.get(8));

        System.out.println("iterating over tree (in-order):");
        for (BST.Entry<Integer, String> entry : tree) {
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
        }

        tree.delete(2);
        System.out.println("After deleting 2:");
        for (BST.Entry<Integer, String> entry : tree) {
            System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
        }
    }
}