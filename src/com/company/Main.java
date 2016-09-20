package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

//Task 1
    public static void main(String[] args) {
        Scanner s = new Scanner(new ClassWithArgument()).useDelimiter("/");
        while (s.hasNext()){
         System.out.println(s.next());
       }
        s.close();
    }
//2.4.
    A a1 = new A();
    A a2 = new A();

    B b2 = new B();


}
