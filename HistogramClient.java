// Temi Adejumobi
// January 26, 2022
// Homework #1
// Program reads integers from a file and divedes them in ranges, creating a
// histogram of sorts

import java.util.*;
import java.io.*;

public class HistogramClient{
  
  public static void main(String args[]) throws FileNotFoundException{
    // prompt for user input and open file, uses commas as a delimiter
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("\n Input file with integers(.txt):");
    String fileName = keyboard.next();

    Scanner sc = new Scanner(new File(fileName));
    sc.useDelimiter(",");

    int range = 0;
    int num = 0;
    int count[] = new int[10];  // array stores count of ints 
    String star = "*";

    // frisk file and determine the number of values within each range (0-9...)
    for (int i=0; i<10;i++){
      while(sc.hasNext()){
        num = sc.nextInt();

        if (num<10)
          count[0]++;
        else if (num<20)
          count[1]++;
        else if (num<30)
          count[2]++;
        else if (num<40)
          count[3]++;
        else if (num<50)
          count[4]++;
        else if (num<60)
          count[5]++;
        else if (num<70)
          count[6]++;
        else if (num<80)
          count[7]++;
        else if (num<90)
          count[8]++;
        else{
          count[9]++;
        }
      }
    System.out.printf("\n %2d:%-3s",range,star.repeat(count[i]));
    range+=10;
    }
  }
} 
