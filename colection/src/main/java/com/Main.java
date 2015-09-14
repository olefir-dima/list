package com;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.toString());

        list.remove(20);

        System.out.println(list.toString());
    }

}