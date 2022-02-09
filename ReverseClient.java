// Temi Adejumobi
// January 31, 2022
// Homework #2
// Program displays the lines of an input file in reverse order

import java.util.*;
import java.io.*;

public class ReverseClient{

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    Scanner sc = null;

    while(sc==null){
      try{
        System.out.printf("\n Enter a file(.txt) name & press enter:");
        sc = new Scanner(new File(keyboard.next()));

      } catch (FileNotFoundException ex){
      	  throw new RuntimeException(ex.toString());
      }
    }

    // build stack and iterate through file, pushing each line onto the stack
    Stack<String> lines = new Stack<String>(); 

    while(sc.hasNextLine()){
      lines.push(sc.nextLine());
    }

    sc.close();

    // print lines in reverse order (lifo)
    for(int i = lines.size()-1; i>=0; i--){
      System.out.printf("\n%s", lines.pop());
    }
  }
}