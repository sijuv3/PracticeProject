package list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkList = new LinkedList<>();
        linkList.add("John");
        linkList.add("Mark");
        linkList.add("Dan");
        linkList.add("Matt");

        System.out.println(linkList.contains("Dan"));
        System.out.println(linkList.size());

        linkList.removeFirst();

        linkList.forEach(x -> System.out.print(x + "->"));
    }
}
