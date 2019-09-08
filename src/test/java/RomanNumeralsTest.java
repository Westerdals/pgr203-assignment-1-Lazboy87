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
      StringBuilder inputNumber= new StringBuilder();


      //Needs refoactoring

      if (number ==10){
        inputNumber = new StringBuilder("X"); number -=10;}
      if (number ==9){
        inputNumber = new StringBuilder("IX"); number -=9;}


      if (number>=5)
      {
        inputNumber.append("V");
        number -=5;

      }



    if (number==4){
      inputNumber = new StringBuilder("IV");
      number = 0;
    }


      for (int i = 1; i <=number ; i++) {
        inputNumber.append("I");

      }

      return inputNumber.toString();
  }




}
