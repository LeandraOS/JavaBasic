package EstruturasDeDados;

import java.util.Scanner;

public class FilaLinked {
    private static Node fila;

    public static void main(String[] args) {
        fila = new Node();
        Scanner sc = new Scanner(System.in);
        menu(sc);
    }

    private static void menu(Scanner sc) {
        String[] choice = sc.nextLine().split(" ");
        while (!choice[0].toLowerCase().equals("end")) {
            switch(choice[0].toLowerCase()) {
                case "print":
                    print();
                    break;
                case "add":
                    if (choice.length == 2)
                        add(Integer.parseInt(choice[1]));
                    break;
                case "remove":
                    remove();
                    break;
                case "element":
                    element();
                    break;
                case "search":
                    if (choice.length == 2)
                        search(Integer.parseInt(choice[1]));
                    break;
            }
            choice = sc.nextLine().split(" ");
        }
    }

    private static void search(int n) {
        System.out.println(fila.indexOf(n));
    }

    private static void element() {
        if (fila.head() != null)
            System.out.println(Integer.toString(fila.head()));
        else
            System.out.println("empty");
    }

    private static void remove() {
        if (fila.isEmpty())
            System.out.println("empty");
        else
            fila.removeFirst();
    }

    private static void add(int n) {
        fila.insert(n);
    }

    private static void print() {
        if (fila.isEmpty())
            System.out.println("empty");
        else
            System.out.println(fila.toString());
    }

}

class Node {
    private Integer data;
    private Node next;
    private Node previous;

    public Node() {
        this(null, null, null);
    }

    public Node (Integer data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int size() {
        if (this.data != null) {
            int size = (this.next != null) ? 1 + this.next.size() : 1;
            return size;
        }
        return 0;
    }

    public void removeFirst() {
        if (!this.isEmpty()) {
            if (this.previous == null) {
                if (this.next != null) {
                    this.data = this.next.data;
                    this.next.previous = this;
                    this.next = this.next.next;
                } else
                    this.data = null;
            }
        }
    }

    public void insert(Integer n) {
        if (n != null) {
            if (this.data == null)
                this.data = n;
            else if (this.next == null)
                this.next = new Node(n, null, this);
            else
                this.next.insert(n);
        }
    }

    public int indexOf(Integer n) {
        if (n != null) {
            if (this.data != null) {
                if (this.data.equals(n))
                    return 0;

                if (this.next != null) {
                    int index = this.next.indexOf(n);
                    if (index != -1) return 1 + index;
                }
            }
        }
        return -1;
    }

    public Integer head() {
        return this.data;
    }

    @Override
    public String toString() {
        return toStr("");
    }

    private String toStr(String dataDoubleLinkedList) {
        if (this.next != null) {
            dataDoubleLinkedList += this.data + " ";
            return this.next.toStr(dataDoubleLinkedList);
        } else if (!this.isEmpty())
            dataDoubleLinkedList += this.data;

        return dataDoubleLinkedList;
    }
}