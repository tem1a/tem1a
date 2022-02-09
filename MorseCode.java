// Temi Adejumobi
// Program reads in lines from the user and translates each line either to or
// from morse code.

import java.util.*;
import java.io.*;

public class MorseCode{

  public static void main(String[] args){

    Map<Character,String> morseDict = new TreeMap<Character,String>();
    morseDict.put('A',".-");
    morseDict.put('B',"-...");
    morseDict.put('C',"-.-.");
    morseDict.put('D',"-..");
    morseDict.put('E',".");
    morseDict.put('F',"..-.");
    morseDict.put('G',"--.");
    morseDict.put('H',"....");
    morseDict.put('I',"..");
    morseDict.put('J',".---");
    morseDict.put('K',"-.-");
    morseDict.put('L',".-..");
    morseDict.put('M',"--");
    morseDict.put('N',"-.");
    morseDict.put('O',"---");
    morseDict.put('P',".--.");
    morseDict.put('Q',"--.-");
    morseDict.put('R',".-.");
    morseDict.put('S',"...");
    morseDict.put('T',"-");
    morseDict.put('U',"..-");
    morseDict.put('V',"...-");
    morseDict.put('W',".--");
    morseDict.put('X',"-..-");
    morseDict.put('Y',"-.--");
    morseDict.put('Z',"--..");

    // reverse key and values in morseDict to make a new TreeMap

    Map<String, Character>  reverseDict = new TreeMap<String,Character>();
      for(Map.Entry<Character,String> entry : morseDict.entrySet())
        reverseDict.put(entry.getValue(), entry.getKey());

    // prompt for user input

    Scanner keyboard = new Scanner (System.in);
    System.out.printf("\nEnter a sequence, either letters or mose code:");
    String input = keyboard.nextLine();
    keyboard.close();

    // if the first character is a letter, tranlate to morse

    for(int i=0; i<input.length(); i++){
      char ch = Character.toUpperCase(input.charAt(i));

      if(Character.isLetter(ch)){
        System.out.printf("%s ",morseDict.get(ch));
      }
    }

    // if the first character is not a letter, translate from morse

    if(!(Character.isLetter(input.charAt(0)))){
      Scanner morseScanner = new Scanner(input);

      while(morseScanner.hasNext()){
        String morse = morseScanner.next();
        System.out.printf("%s",reverseDict.get(morse));
      }
    }
  }// end main
}
