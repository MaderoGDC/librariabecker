/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beckerlibreria;

/**
 *BeckerLibreria 
 * @author Estudiante
 */
import becker.robots.*;
import java.awt.Color;
public class BeckerLibreria {
    private City ciudad;
    private Robot robot1;
    
   public BeckerLibreria (){
       this.ciudad = new City();
       int l = 1;
       for(int i=1;i<=6;i++){
       Wall  parriba = new Wall(ciudad,1,i,Direction.NORTH);
       Wall  pabajo= new Wall(ciudad,6,i,Direction.SOUTH);
       Wall paizqui = new Wall(ciudad,i,1,Direction.WEST);
       Wall padere = new Wall(ciudad,i,6,Direction.EAST);
       }
       Thing t1 = new Thing(this.ciudad,1,0);
       t1.getIcon().setColor(Color.RED);
       t1.getIcon().setLabel("TO");
     
       for(int i=1,o=1; i<=6;i++,o++){
        Thing diag= new Thing(this.ciudad,i,o);
       }
       //¿Como cambiar sus propiedades 1*1?
       this.robot1 = new Robot(ciudad,4,4,Direction.EAST);
       this.robot1.setColor(Color.magenta);
       this.robot1.setLabel("Chofer");
       
   
       }
    public void ejecutar(){
           for(int i=0;i<2;i++ ){
               this.robot1.move();
                              
           }
       
       
   }

    
}
