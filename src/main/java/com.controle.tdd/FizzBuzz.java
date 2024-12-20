package com.controle.tdd;

public class FizzBuzz {
    public static String de(int nbr) {
        String chaine="";//cycle2
        if(nbr%3==0){
            chaine="Fizz";
        }
        else if (nbr%5==0) {
            chaine="Buzz";
        }
        else chaine= String.valueOf(nbr) ;//cycle1
       return chaine;
    }
}
