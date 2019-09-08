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




  private String toRoman(int number){
    String inputNumber="";
    if (number==5){inputNumber="V";}
    else
    if (number==4){inputNumber="IV";}
    else
      for (int i = 1; i <=number ; i++) {
        inputNumber  +="I";

      }

      return inputNumber;
  }




}
