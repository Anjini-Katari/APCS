Under // Under Pressure: Julia Kozak, Anjini Katari, Yat Long Chan
// APCS pd08
// HW81 -- Thank You, Next
// 2022-03-24
// time spent: 0.5hrs

/*
DISCO

QCC

SUMMARY 1
Allows for obtaining elements 1 at a time. 
hasNext() checks if a collection has another element.
next() returns the next element in the collection.
remove() removes the current element from iterator.
SUMMARY 2

*/

/***
 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators
 **/

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    for (Integer i : L) {
      if (i.equals(key)) {return true;}
    }
    return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    Iterator<Integer> it = L.iterator();
    while (it.hasNext()) {
      if (it.next().equals(key)) {return true;}
    }
    return false;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    List<Integer> ret = new ArrayList<Integer>();
    for (Integer i : L) {
      if (i % 2 == 1) {
        ret.add(i);
      }
    }
    return ret;
    /*** YOUR IMPLEMENTATION HERE ***/
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    List<Integer> ret = new ArrayList<Integer>();
    Iterator<Integer> it = L.iterator();
    while (it.hasNext()) {
      Integer i = (Integer)(it.next());
      if ( i % 2 == 1) {
        ret.add(i);
      }
    }
    return ret;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    Iterator<Integer> it = L.iterator();
    while (it.hasNext()) {
      if (it.next() % 2 == 0) {
        it.remove();
      }
    }
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  public static void main( String [] args )
  {
    ///*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~

    //var type: List   obj type: ArrayList
    List<Integer> L = new ArrayList<Integer>();

    for( int i = 0; i < 10; i++ )
      L.add(i);


    // TASK: write code to print the contents of L...

    // a) using a FOREACH loop
    System.out.println("Printing L w/ FOREACH ...");
    String ret = "{ ";
    for (Integer i : L) {
      ret += i + ", ";
    }
    ret = ret.substring(0, ret.length()-2);
    ret += " }";
    System.out.println(ret);



    // b) explicitly using an iterator
    System.out.println("Printing L w/ Iterator ...");
    ret = "{ ";
    Iterator<Integer> it = L.iterator();
    while (it.hasNext()) {
      ret += it.next() + ", ";
    }
    ret = ret.substring(0, ret.length()-2);
    ret += " }";
    System.out.println(ret);



    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );

    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );

    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);

    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);

    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
      //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class ItrWorkPressure: Julia Kozak, Anjini Katari, Yat Long Chan
APCS pd08
HW80 -- Generically Speaking
2022-03-22
time spent: 0.5 hours

DISCO
- Default type for generically typed classes is Object
- Refactoring LList required all DLLNodes to be typed to T


QCC
- none
