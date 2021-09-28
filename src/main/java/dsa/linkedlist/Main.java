package dsa.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Main {
    @Data
    @AllArgsConstructor
    public static class Student {
        private String name;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Student> students = new SinglyLinkedListImpl<>();
        System.out.println(students);
    }
}
