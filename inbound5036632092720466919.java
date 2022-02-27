package Gazo;

public class findingthenonrepeatedcharacter {

  public static void main(String[] args) {
   
  String inputStr = " Ning Ning";
  for(char i : inputStr. toCharArray()) {
    if(inputStr.indexOf(i) == inputStr. lastIndexOf(i)) {
      
      System.out.println("First non repeated character is; " +i);
      
    }
  }
  

  }

}