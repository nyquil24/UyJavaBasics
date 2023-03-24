package org.example;public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        sayHelloWorld();
        sayHelloWorld();
        sayHelloWorld();
        sayHelloTo("charlie");
        sayHelloTo("John");
       int x = returnFive();

        System.out.println(x);

    }

    static void sayHelloTo(String name){
        System.out.println("hello, " + name);
    }

    static int returnFive(){
        return 5;
    }

    static void sayHelloWorld() {
        System.out.println("Hello, world!");
    }


}