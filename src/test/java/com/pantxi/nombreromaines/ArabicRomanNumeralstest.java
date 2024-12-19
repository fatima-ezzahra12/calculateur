package com.pantxi.nombreromaines;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArabicRomanNumeralstest {
    //CYCLE1
    /*@Test
       void convert_test_cycle1(){
         ArabicRomanNumerals obj1=new ArabicRomanNumerals();
         String var=obj1.convert(0);
         assertEquals("",var);
    }

 //cycle2
 @Test
     void convert_test_cycle2() {
     ArabicRomanNumerals obj2 = new ArabicRomanNumerals();
     String var = obj2.convert(1);
     assertEquals("I", var);
 }
 //cycle3
 @Test
     void convert_test_cycle3() {
     ArabicRomanNumerals obj3 = new ArabicRomanNumerals();
     String var = obj3.convert(4);
     assertEquals("IV", var);
 }
 //cycle4
 @Test
    void convert_test_cycle4() {
        ArabicRomanNumerals obj4 = new ArabicRomanNumerals();
        String var = obj4.convert(5);
        assertEquals("V", var);
    }
    //cycle5
    @Test
    void convert_test_cycle5() {
        ArabicRomanNumerals obj5= new ArabicRomanNumerals();
        String var = obj5.convert(9);
        assertEquals("IX", var);
    }
 //cycle6
 @Test
 void convert_test_cycle6() {
     ArabicRomanNumerals obj6= new ArabicRomanNumerals();
     String var = obj6.convert(10);
     assertEquals("X", var);
 }
 //cycle7
 @Test
 void convert_test_cycle7() {
     ArabicRomanNumerals obj7= new ArabicRomanNumerals();
     String var = obj7.convert(39);
     assertEquals("XXXIX", var);
 }
 //cycle8
 @Test
 void convert_test_cycle8() {
     ArabicRomanNumerals obj8= new ArabicRomanNumerals();
     String var = obj8.convert(50);
     assertEquals("L", var);
 }*/
    //test gnerale
 /*@Test
 void convert_test(){
    assertEquals("I", ArabicRomanNumerals.convert(1));
    assertEquals("III", ArabicRomanNumerals.convert(3));
    assertEquals("IV", ArabicRomanNumerals.convert(4));
    assertEquals("X", ArabicRomanNumerals.convert(10));
    assertEquals("XXXIX", ArabicRomanNumerals.convert(39));
    assertEquals("L", ArabicRomanNumerals.convert(50));
    assertEquals("", ArabicRomanNumerals.convert(0));
    assertEquals("", ArabicRomanNumerals.convert(51));
}*/
    @Test
    public void convert_general_test() {
        String [] expected_results = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L"};
        for (int i = 1; i <= 50; i++) {
            String expected;
            expected = expected_results [i-1];
            assertEquals(expected, ArabicRomanNumerals.convert(i));
        }

    }
}
