/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andet
 */
public class ColaCorrimiento extends ColaSimple{
    
    public ColaCorrimiento(int tamano) {
        super(tamano);
    }
    
    public boolean insertar(char dato, int nivel){
        boolean respuesta = super.insertar(dato,nivel);
        if(respuesta == true){
            return respuesta;
        }
        if(ini > 0){
            corrimiento();
            return super.insertar(dato,nivel);
        }
        //Aqui se asegura que ini es == 0 y fin == tamano-1, por lo que hay cola llena totalmente
        return false;
    }
    
    private void corrimiento(){
        int recibe, envia;
        for(recibe = 0,envia = ini; envia <= fin; envia++, recibe++){
            vector[recibe] = vector[envia];
        }
        ini = 0; fin = recibe -1;
    }
    
     public void ordenar(){
         boolean validar=false;
         int pos = fin;
             for(int i = 0;i < vector.length-1; i++){
            if(pos!=0){
                 if(vector[pos].getNivel()>vector[pos-1].getNivel()){
                     Prioridad aux = new Prioridad();
                     aux = vector[pos-1];
                     vector[pos-1] = vector[pos];
                     vector[pos] = aux;
                     pos--;
                 }
             }else break;
    }
}
}