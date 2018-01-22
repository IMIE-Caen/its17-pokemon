
package pokemon;

import java.util.ArrayList;

public class Arene extends ArrayList<Pokemon>{

    
    public int nombreDeSurvivants(){
        int nombreSurvivants = 0;
        for(int i = 0 ; i < size() ; i ++){
            if( ! get(i).estMort()){
                nombreSurvivants++;
            }
        }
        return nombreSurvivants;
    }
    
    
     public void tour(){
        for(int i = 0; i < size() ; i++  ){
            
            Pokemon attaquant = get(i);
            Pokemon cible = null;
            if(i == size()-1){
               cible = get(0);
            }
            else {
               cible = get(i + 1);
            }
            attaquant.attaque(cible);

        }       
    }
     
     public void run(){
         while(nombreDeSurvivants() > 1){// plus de 1 survivant
            tour();// chaque pokemon attaque un de ses adversaires
        }
     }

    @Override
    public String toString() {
        String str = "--- Arene ---\n";
        for(int i = 0 ; i < size() ; i ++){
            str += "" + get(i) + '\n';
        }
        return str;
    }
}
