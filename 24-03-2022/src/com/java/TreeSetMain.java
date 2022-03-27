package com.java;
//TreeSet class elements are sorted

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

public static void main(String[] args) {
TreeSet<Double> tob=new TreeSet<Double>();
tob.add(678.9);
tob.add(98.7);
tob.add(12.78);
tob.add(56.8);
System.out.println(tob);

//Individual elements to be displayed
//Ascending
System.out.println("Ascending order");
Iterator<Double> it=tob.iterator();
while(it.hasNext()) {
 System.out.println(it.next());
}
//Descending order
System.out.println("Descending order");
Iterator<Double> it1=tob.descendingIterator();
while(it1.hasNext()) {
 System.out.println(it1.next());
}

}

}




