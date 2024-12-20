package personne.orientation;

public class Personnage {
    public static String tourner(int nbr){
        String chaine="NORD";
        if(nbr%4==1){
            chaine="EST";
            return chaine;
        }

        return chaine;}
}
