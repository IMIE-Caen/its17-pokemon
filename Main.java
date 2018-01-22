/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author clement
 */
public class Main {
    public static void main(String[] args) {
        
        Arene kanto = new Arene();
        kanto.add(new Pikachu());
        kanto.add(new Bulbizarre());
        kanto.run();
        pln(kanto);

    } 
    
    public static void pln(Object obj){
        System.out.println(obj);
    }
}
