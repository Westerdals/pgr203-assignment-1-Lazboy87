package no.kristiania.romanNumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

// Lasse Og fredrik sitt arbeidkrav
  @Test
  void Conver4toIV(){
    assertEquals("IV", RomanConverter.toRoman(4));
  }

  @Test
  void Conver5toV(){
    assertEquals("V", RomanConverter.toRoman(5));
  }

  @Test
  void Conver9toIX(){
    assertEquals("IX", RomanConverter.toRoman(9));
  }

  @Test
  void convertTestSimple(){
    assertEquals("MCMXCIX", RomanConverter.toRoman(1999));
  }




}
