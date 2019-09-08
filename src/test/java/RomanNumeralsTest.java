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


    number = toRomanDigit(number, result);

    if (number ==9){
        result.append("IX");
        number -=9;
      }

      if (number>=5)
      {
        result.append("V");
        number -=5;

      }



    if (number==4){
      result.append("IV");
      number = 0;
    }


      for (int i = 1; i <=number ; i++) {
        result.append("I");

      }

      return result.toString();
  }

  private int toRomanDigit(int number, StringBuilder result) {
    if (number >=10){
      result.append("X");
      number -=10;
    }
    return number;
  }


}
