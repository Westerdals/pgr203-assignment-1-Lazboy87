package no.kristiania.RomanNumerals;

public class romanConverter {



  static String toRoman(int number){
      StringBuilder result= new StringBuilder();


    number = toRomanDigit(number, result,10,"X");
    number = toRomanDigit(number, result,9,"IX");
    number = toRomanDigit(number, result,5,"V");
    number = toRomanDigit(number, result,4,"IV");
    number = toRomanDigit(number, result,1,"I");



      return result.toString();
  }

  private static int toRomanDigit(int number, StringBuilder result, int digitvalue, String digitsymbol) {
    while (number >= digitvalue){
      result.append(digitsymbol);
      number -= digitvalue;
    }
    return number;
  }
}
