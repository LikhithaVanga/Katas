package edu.pdx.cs410J.vanga;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.*;

public class KataTest
{

  @Test
  public void given1ReturnI() {
    assertThat(Kata.romanNumeralFor(1), equalTo("I"));
  }

  @Test
  public void given2ReturnII() {
    assertThat(Kata.romanNumeralFor(2), equalTo("II"));
  }

  @Test
  public void given3ReturnIII() {
    assertThat(Kata.romanNumeralFor(3), equalTo("III"));
  }

  @Test
  public void given4ReturnIV() {
    assertThat(Kata.romanNumeralFor(4), equalTo("IV"));
  }

  @Test
  public void given5ReturnV() {
    assertThat(Kata.romanNumeralFor(5), equalTo("V"));
  }

  @Test
  public void given9ReturnIX() {
    assertThat(Kata.romanNumeralFor(9), equalTo("IX"));
  }


  @Test
  public void given10ReturnX() {
    assertThat(Kata.romanNumeralFor(10), equalTo("X"));
  }
  @Test
  public void given11ReturnXI() {
    assertThat(Kata.romanNumeralFor(11), equalTo("XI"));
  }

  @Test
  public void given20ReturnXX() {
    assertThat(Kata.romanNumeralFor(20), equalTo("XX"));
  }
  @Test
  public void given29ReturnXXIX() {
    assertThat(Kata.romanNumeralFor(29), equalTo("XXIX"));
  }

  @Test
  public void given32ReturnXXXII() {
    assertThat(Kata.romanNumeralFor(32), equalTo("XXXII"));
  }

  @Test
  public void given35ReturnXXXV() {
    assertThat(Kata.romanNumeralFor(35), equalTo("XXXV"));
  }
  @Test
  public void given36ReturnXXXVI() {
    assertThat(Kata.romanNumeralFor(36), equalTo("XXXVI"));
  }
  @Test
  public void given37ReturnXXXVII() {
    assertThat(Kata.romanNumeralFor(37), equalTo("XXXVII"));
  }
  @Test
  public void given38ReturnXXXVIII() {
    assertThat(Kata.romanNumeralFor(38), equalTo("XXXVIII"));
  }

  @Test
  public void given49ReturnIL() {
    assertThat(Kata.romanNumeralFor(50), equalTo("L"));
  }

}
