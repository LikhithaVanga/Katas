package edu.pdx.cs410J.vanga;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {


    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public  static String romanNumeralFor(int i) {
    String result = "";
    if(i < 50) {
      return romanNumeralForLessThan50(i);
    } else {
      int numberOfL = i / 50;
      for (int j = 1; j<= numberOfL;++j) {
        result += "L";
      }
      return result += romanNumeralForLessThan50(i %50);
    }
  }

  public  static String romanNumeralForLessThan50(int i) {
    String result = "";
    if(i < 10) {
      return romanNumeralFor1To9(i);
    } else {
        int numberOfX = i / 10;
        for (int j = 1; j<= numberOfX;++j) {
          result += "X";
        }
        return result += romanNumeralFor1To9(i %10);
    }
  }

  public  static String romanNumeralFor1To9(int i) {
    String result = "";

    if( i < 4) {
      for (int j = 1 ;j <= i; ++j) {
        result += "I";
      }
    }

    if (i ==4) {
      result += "IV";
    }

    if (i ==5) {
      return "V";
    }
    if (i ==6) {
      return "VI";
    }
    if (i ==7) {
      return "VII";
    }
    if (i ==8) {
      return "VIII";
    }
    if (i == 9) {
      return "IX";
    }

    return result;


  }
}