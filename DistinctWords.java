// Temi Adejumobi
// January 31, 2022
// Homework #2
// Program counts the number of unique words in a file and prints out the set.

import java.util.*;
import java.io.*;


public class DistinctWords{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);  // prompt for user input
    Scanner sc = null;

    while(sc==null){
      try{
        System.out.printf("\n Enter a file(.txt) name & press enter:");
        sc = new Scanner(new File(keyboard.next()));

      } catch (FileNotFoundException ex){
      	  throw new RuntimeException(ex.toString());
      }
    }

    // create a set of unique words and iterate through file
    // if the set does not already contain it, the word is added (case ignored)

    Set<String> distinctWords = new HashSet<String>();

    while(sc.hasNextLine()){
      Scanner wordChecker = new Scanner(sc.nextLine());

      while (wordChecker.hasNext()){
        String wordInQuestion = wordChecker.next();
        String caseFilter = wordInQuestion.toLowerCase();
        if(!(distinctWords.contains(caseFilter))){
          distinctWords.add(wordInQuestion.toLowerCase());
        }else;
      }
    }

    for (String word:distinctWords){
      System.out.printf("\n%s", word);
    }

  }// end main
}
