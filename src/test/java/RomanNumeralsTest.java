import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

  @Test
  void Conver1toI(){
   assertEquals("I",toRoman(1));
  }
  @Test
  void Conver2toII(){
   assertEquals("II",toRoman(2));
  }
  @Test
  void Conver3toIII(){
    assertEquals("III",toRoman(3));
  }
  @Test
  void Conver4toIV(){
    assertEquals("IV",toRoman(4));
  }
  @Test
  void Conver5toV(){
    assertEquals("V",toRoman(5));
  }
  @Test
  void Conver6toVI(){
    assertEquals("VI",toRoman(6));
  }
  @Test
  void Conver7toVII(){
    assertEquals("VII",toRoman(7));
  }
  @Test
  void Conver8toVIII(){
    assertEquals("VIII",toRoman(8));
  }

  @Test
  void Conver9toIX(){
    assertEquals("IX",toRoman(9));
  }

  @Test
  void Conver10toX(){
    assertEquals("X",toRoman(10));
  }





  private String toRoman(int number){
      StringBuilder result= new StringBuilder();


    number = toRomanDigit(number, result,10,"X");
    number = toRomanDigit(number, result,9,"IX");
    number = toRomanDigit(number, result,5,"V");
    number = toRomanDigit(number, result,4,"IV");
    number = toRomanDigit(number, result,1,"I");



      return result.toString();
  }

  private int toRomanDigit(int number, StringBuilder result,int digitvalue,String digitsymbol) {
    while (number >= digitvalue){
      result.append(digitsymbol);
      number -= digitvalue;
    }
    return number;
  }


}
