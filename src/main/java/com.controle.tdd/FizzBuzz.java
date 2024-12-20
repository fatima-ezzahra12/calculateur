package com.controle.tdd;

public class FizzBuzz {
    public static String de(int n) {
        String chaine="";//cycle2
        if(n%3==0){
            chaine="Fizz";
        }
       else chaine= String.valueOf(n) ;//cycle1
       return chaine;
    }
}
