package com.github.owlsaver3;

/**
 * Hello world!
 * This is a great program
 * It works really well
 *
 */
public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Arguments:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
        System.out.println("Hello to the World!");
        System.out.println("Have a nice day.");
    }
}
