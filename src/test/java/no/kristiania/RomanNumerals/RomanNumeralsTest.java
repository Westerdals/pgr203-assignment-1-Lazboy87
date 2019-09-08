package no.kristiania.RomanNumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

  @Test
  void Conver1toI(){
   assertEquals("I", romanConverter.toRoman(1));
  }
  @Test
  void Conver2toII(){
   assertEquals("II", romanConverter.toRoman(2));
  }
  @Test
  void Conver3toIII(){
    assertEquals("III", romanConverter.toRoman(3));
  }
  @Test
  void Conver4toIV(){
    assertEquals("IV", romanConverter.toRoman(4));
  }
  @Test  void Conver5toV(){
    assertEquals("V", romanConverter.toRoman(5));
  }
  @Test
  void Conver6toVI(){
    assertEquals("VI", romanConverter.toRoman(6));
  }
  @Test
  void Conver7toVII(){
    assertEquals("VII", romanConverter.toRoman(7));
  }
  @Test
  void Conver8toVIII(){
    assertEquals("VIII", romanConverter.toRoman(8));
  }

  @Test
  void Conver9toIX(){
    assertEquals("IX", romanConverter.toRoman(9));
  }

  @Test
  void Conver10toX(){
    assertEquals("X", romanConverter.toRoman(10));
  }


}
