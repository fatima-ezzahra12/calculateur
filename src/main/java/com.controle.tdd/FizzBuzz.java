package com.controle.tdd;

public class FizzBuzz {
    public static String de(int nbr) {
        String chaine="";
        if(nbr%3==0) { // CYCLE2
            if (nbr % 5 == 0) { //CYCLE4
                chaine = "FizzBuzz";
            } else chaine = "Fizz";
        }
        else if(nbr%5==0) //CYCLE3
             chaine="Buzz";
         else chaine= String.valueOf(nbr) ;//cycle1
       return chaine;
    }
}
