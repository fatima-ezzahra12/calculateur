package com.pantxi.nombreromaines;

public class ArabicRomanNumerals {
    //metode_cycle1
   /* public String convert(int nbr) {
        String chaine = "";
        if (nbr <= 0 || nbr > 50) {
            return chaine;
        }
        return chaine;
    }

    //methode_cycle2
    public String convert(int nbr) {
        String chaine = "I";
        if (nbr == 1) {
            return chaine;
        }
        return chaine;
    }

    //methode3
    public String convert(int nbr) {
        String chaine = "IV";
        if (nbr == 4) {
            return chaine;
        }
        return chaine;
    }

    //methode4
    public String convert(int nbr) {
        String chaine = "V";
        if (nbr == 5) {
            return chaine;
        }
        return chaine;
    }

    //methode5
    /*public String convert(int nbr) {
        String chaine = "IX";
        if (nbr == 9) {
            return chaine;
        }
        return chaine;
    }

    //methode6
   /* public String convert(int nbr) {
        String chaine = "X";
        if (nbr == 10) {
            return chaine;
        }
        return chaine;
    }

    //methode7
   /* public String convert(int nbr) {
        String chaine = "XXXIX";
        if (nbr == 39) {
            return chaine;
        }
        return chaine;
    }

    //methode8
   /* public String convert(int nbr) {
        String chaine = "L";
        if (nbr == 40) {
            return chaine;
        }
        return chaine;
    }*/

    //methode_general
    public  static String convert(int nombre) {
        if (nombre <= 0 || nombre > 50)
            return "";
        int [] numbres = {50, 40, 10, 9, 5, 4, 1};
        String [] chiffres = {"L", "XL", "X", "IX", "V", "IV", "I"};
        String chif_Roman = "";
        for (int i = 0; i < numbres.length; i++) {
            while (nombre >= numbres[i]) {
                chif_Roman += chiffres[i];
                nombre -= numbres[i];
            }
        }

        return chif_Roman;
    }

}


