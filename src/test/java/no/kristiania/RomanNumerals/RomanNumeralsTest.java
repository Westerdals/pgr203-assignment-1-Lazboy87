package no.kristiania.RomanNumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {


  @Test
  void Conver4toIV(){
    assertEquals("IV", romanConverter.toRoman(4));
  }

  @Test
  void Conver5toV(){
    assertEquals("V", romanConverter.toRoman(5));
  }

  @Test
  void Conver9toIX(){
    assertEquals("IX", romanConverter.toRoman(9));
  }

  @Test
  void convertTestSimple(){
    assertEquals("MCMXCIX", romanConverter.toRoman(1999));
  }




}
