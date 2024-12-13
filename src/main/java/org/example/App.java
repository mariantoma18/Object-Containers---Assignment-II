package org.example;

import java.util.TreeSet;

/**
 * DESCRIPTION
 *
 * implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order
 * the sorting should be done based on the amount of revenue generated via sales
 * each representative has a number of sales, and a quota / sale
 * after the sorting, the first object should be the representative with the most revenue generated
 * the last object in the array should be the representative with the least revenue generated
 *
 */
public class App {
    public static void main( String[] args ) {

        TreeSet<SalesRepresentative> representatives = new TreeSet<>();
        SalesRepresentative representative1 = new SalesRepresentative(10,30);
        SalesRepresentative representative2 = new SalesRepresentative(10,40);
        SalesRepresentative representative3 = new SalesRepresentative(10,50);
        SalesRepresentative representative4 = new SalesRepresentative(10,60);

        representatives.add(representative1);
        representatives.add(representative2);
        representatives.add(representative3);
        representatives.add(representative4);

        System.out.println(representatives);

    }
}
