package com.driver;
import java.util.*;
public class Main {
    public static class A {
        public String meth() {
            System.out.println("A is called");
          return  "Invoking method from class A";
        }

    }
    public static class B extends A{
            public String meth(){
                System.out.println("B is called");
               return "Method is overridden in Extendend class B";
            }
        }
    public static void main(String[] args) {
         B obj =new B();
         obj.meth();
        }

  
}
