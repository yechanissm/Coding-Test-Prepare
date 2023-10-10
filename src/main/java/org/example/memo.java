package org.example;

class Parent {
    public void show() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println("child");
    }
}

public class memo {
    public static void main(String[] args) {
        Parent pa = new Child();
        pa.show();
    }
}
