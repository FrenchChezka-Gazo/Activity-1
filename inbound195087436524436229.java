package Gazo;

public class countingduplicatecharacter {

  public static void main(String[] args) {
   
   String string1 = "Ning";
      int count;
     
    // converts given string into a character array
    char string[] =string1. toCharArray();
    
    System.out.println("Duplicate characters in a given string");
    System.out.println();
    // counts each character in the string
   
   for (int i = 0; i <string.length; i++)    {
     count = 1;
     for (int j = i+1; j <string.length; j++) {
       if(string[i] == string[j] && string[i] != ' ') {
         count++;
    string[j] = '0';
    
       }
     }
     if(count > 1 && string[i] != '0')
     System.out.println(string[i]);
   }

  }

}