package me.mauricioserna.holamundo;

import java.util.ArrayList;

/**
 * Created by mauricio on 7/06/17.
 */

public class HelloWorld {

    public static void main(String[] args) {
        /*
        Con FINAL declaramos constantes en Java
        Por convencion las constantes van con Mayusculas
         */

        System.out.println("Hello world!");

        byte age = 1;
        System.out.println("This is my age: " + age);

        final byte a = 1;
        final byte b = 2;

        byte c = a + b;

        System.out.println("The sum is: " + c);

        /*
        Casteo de tipos
         */

        double d = 10;
        System.out.println("Without casting: " + d);

        int i = (int)(d);
        System.out.println("Casting: " + i);

        /*
        Arreglos
         */


        int[] awesomeIntegerArray;
        double[] otherAwesomeDoubleArray;

        awesomeIntegerArray = new int[10];


        // Asignar
        for (int j = 0; j < 10; j++) {
            awesomeIntegerArray[j] = j + 1;
        }

        // Imprimir

        for (int j = 0; j < awesomeIntegerArray.length; j++) {
            System.out.println("AwesomeIntegerArray: " + "[" + j + "] has the number " + awesomeIntegerArray[j]);
        }

        System.out.println("___________________________________________");
        System.out.println("Basic operators");

        int k = 3;
        k++;

        System.out.println("K: " + k);
        ++k;
        System.out.println("K again: " + k);

        System.out.println("___________________________________________");
        System.out.println("Lists");
        System.out.println("___________________________________________");

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Mauricio");
        myList.add("PCJIC");
        myList.add("Computer Science Student");

        myList.forEach(s -> System.out.println(s));

    }

}
