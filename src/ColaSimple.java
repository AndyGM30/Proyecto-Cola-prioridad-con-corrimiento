/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andet
 */
public class ColaSimple {
    protected Prioridad [] vector;
    protected int ini;
    protected int fin;

    public ColaSimple(int tamano) {
        vector = new Prioridad [tamano];
        ini = -1;fin=-1;
    }
    
    public boolean insertar(char dato, int nivel){
        if(estaColaLlena()){
            return false;
    }
        fin++;
        vector[fin] = new Prioridad(dato,nivel);
        if(ini == -1){
            ini = 0;
        }
        return true;
    }
    
     private boolean estaColaLlena(){
            return fin == vector.length-1;
        }
     
     public boolean eliminar(){
         if(estaColaVacia())return false;
         if(hayUnSoloDato()){
             ini = -1; fin = -1;
             return true;
         }
         ini++;
         return true;
     }
     
     protected boolean estaColaVacia(){
         return ini==-1 && fin==-1;
     }
    
     protected boolean hayUnSoloDato(){
         return ini == fin;
     }
     
    public char getValor(int pos){
        return (char)(vector[pos].getDato());
    }
    
    public int getNivel(int pos){
        return (int)(vector[pos].getNivel());
    }
    
    public int getIni(){
        return ini;
    }
    
    public int getFin(){
        return fin;
    }
}