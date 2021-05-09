/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico;

import java.util.Scanner;

/**
 *
 * @author Brayan David
 */
public class Ejercico {

    
    public static void main(String[] args) {
       
       
        
       
        
        int seleccion = 0;
        
        Scanner leer = new Scanner(System.in);
        do{
        
         System.out.println("\n");
         System.out.println("1. Suma");
         System.out.println("2.Resta");
         System.out.println("3.Multiplicacion");
         System.out.println("4.Division");
         System.out.println("5.Raiz");
         System.out.println("6.Potencia");
         System.out.println("7.SALIR ");
        System.out.println(" ");
         
         seleccion = leer.nextInt();
        
         if(seleccion != 7){
        
                         }
         
         switch(seleccion){
             
             
             
             case 1:
                 System.out.println("\n");
                 System.out.println("Usted a seleccionado la Suma: ");
                 Scanner ac = new Scanner(System.in);
                 System.out.println("Ingrese su primer numero: ");
                  double x = ac.nextDouble();

                System.out.println("Ingrese su segundo numero: ");
                double y = ac.nextDouble();

                
                Calculadora cal = new Calculadora();
                System.out.println(" La  es Suma: " + cal.suma(x, y));  
                
                
                break;
                
             case 2:   
                 
                 System.out.println("\n");
                 System.out.println("Usted a seleccionado la Resta: ");
                 
                 Scanner a = new Scanner(System.in);
                 System.out.println("Ingrese su primer numero: ");
                 double b = a.nextDouble();

                 System.out.println("Ingrese su segundo numero: ");
                 double c = a.nextDouble();
                 Calculadora ca = new Calculadora();
                 System.out.println(" La  es Resta: " + ca.resta(b, c));
                 
                  break;
                  
             case 3:    
               
                 System.out.println("\n");
                 System.out.println("Usted a seleccionado la Multiplicacion: ");
                 
                 Scanner xp = new Scanner(System.in);
                 System.out.println("Ingrese su primer numero: ");
                 double o = xp.nextDouble();

                 System.out.println("Ingrese su segundo numero: ");
                 double p = xp.nextDouble();
                 Calculadora t = new Calculadora();
                 System.out.println(" La  es Multiplicacion: " + t.multiplicar(o, p));
                 
                  break;
                  
                  
             case 4: 
                  
                 System.out.println("\n");
                 System.out.println("Usted a seleccionado la Division: ");
                 
                 Scanner ot = new Scanner(System.in);
                 System.out.println("Ingrese su primer numero: ");
                 double nt = ot.nextDouble();

                 System.out.println("Ingrese su segundo numero: ");
                 double q = ot.nextDouble();
                 Calculadora l = new Calculadora();
                 System.out.println(" La  divison es : " + l.dividir(nt, q));
                
                  break;
                 
                 
             case 5: 
              System.out.println("\n");
                 System.out.println("Usted a seleccionado la Raiz cuadrada: ");
                 
                 Scanner or = new Scanner(System.in);
                 System.out.println("Ingrese su primer numero: ");
                 double z = or.nextDouble();
                 Calculadora w = new Calculadora();
                 System.out.println(" La  Raiz es : " + w.raiz(z));
                 
                  break;
                 
             case 6: 
                System.out.println("\n");
                 System.out.println("Usted a seleccionado un numero elevado a cualquier potencia: ");
                 
                 Scanner pr = new Scanner(System.in);
                 System.out.println("Ingrese su primer numero: ");
                 double pt = pr.nextDouble();

                 System.out.println("Ingrese su segundo numero: ");
                 double pc = pr.nextDouble();
                 Calculadora i = new Calculadora();
                 System.out.println(" La  potencia es : " + i.potencia(pt, pc));
                   
                  break;
             case 7: 
                 
                 System.out.println("Gracias  ");
                 
                 break;
         }
        
        
        }while(seleccion != 7);
    
    
    
    
    
    }
    
}
