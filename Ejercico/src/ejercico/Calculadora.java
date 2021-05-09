/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico;

/**
 *
 * @author Brayan David
 */
public class Calculadora {
    
    double resultado;
    
    public double suma(double x, double y){
    
    resultado = x + y;
    
    return resultado;
    }
    
    public double resta(double x, double y){
    
    resultado = x - y;
    
    return resultado;
    }
    
     public double multiplicar (double x, double y){
    
    resultado = x * y;
    
    return resultado;
    }
    
    public double dividir (double x, double y){
    
      if(x == 0 && y == 0){
          System.out.println("Error");
      }else{
         resultado = x / y;
      }
    
    
    return resultado;
    }
    
    public double potencia (double x, double y){
    
   
     resultado = Math.pow(x, y);
   
     return resultado;
    }
    
    public double raiz (double x){
    
   
     resultado = Math.sqrt(x);
   
     return resultado;
    }

    public double getResultado() {
        
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
    
    
    
}
