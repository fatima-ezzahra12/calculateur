package personne.orientation;

public class Personnage {
    public static String tourner(int nbr){
        String chaine="NORD";
        if(nbr%4==1){
            chaine="EST";
            return chaine;
        }
        else if(nbr%4==2){
            chaine="SUD";
            return chaine;
        }
        else if(nbr%4==3){
            chaine="OUEST";
            return chaine;
        }

        return chaine;}
}
