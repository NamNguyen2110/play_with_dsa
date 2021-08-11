package dsa.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Node<T> {
    private T data;
    private Node<T> next;
}
