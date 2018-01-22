/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

public abstract class Pokemon {
    protected int pointsVie = 10 ;
    protected int pointsDefense = 0;
    protected int pointsAttaque = 1;
    protected int experience = 0;

    public void attaque(Pokemon cible){
        if(estMort()){
            return;
        }
        cible.pointsVie -= this.pointsAttaque
                                 - cible.pointsDefense ;
        if(cible.pointsVie < 0){
            cible.pointsVie = 0;
        }
    }
    
    public boolean estMort(){
        return pointsVie <= 0;
    }
    
    
    public String toString() {
        return getClass().getSimpleName() + " {mort=" +
                estMort() + ", pointsVie=" + pointsVie +
                ", pointsDefense=" + pointsDefense +
                ", pointsAttaque=" + pointsAttaque + 
                ", experience=" + experience + '}';
    }
    
    
}
