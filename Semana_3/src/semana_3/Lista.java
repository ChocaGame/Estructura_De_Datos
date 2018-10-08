/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_3;

/**
 *
 * @author hp
 */
public class Lista {
    protected Nodo inicio,fin;//punteros para saber donde esta el incio y donde esta el final
    public Lista (){
        inicio=null;
        fin=null;
    }
    //metodo para agregar  un nodo al incio de la lista 
    public void agregaralinicio(int elemento){
        //creando al nodo:
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;            
        }        
    }
    // metodo par amostrar los datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
        System.out.println("");
        while(recorrer != null){
            System.out.print("{"+ recorrer.dato+"}----->");
            recorrer = recorrer.siguiente;
        }
    }
}
