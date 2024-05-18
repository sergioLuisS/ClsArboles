package edu.ejercicios.ArbolCadena;

import edu.ejercicios.ArbolBinario.Nodo;

public class NodoCadena {
    protected int dato;
    protected edu.ejercicios.ArbolBinario.Nodo izdo;
    protected edu.ejercicios.ArbolBinario.Nodo dcho;

    public NodoCadena (int valor){
        dato = valor;
        izdo = dcho = null;
    }

    public NodoCadena (edu.ejercicios.ArbolBinario.Nodo ramaIzdo, int valor, edu.ejercicios.ArbolBinario.Nodo ramaDcho){
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }
    //operadores de acceso

    public int valorNodo(){return dato;}
    public edu.ejercicios.ArbolBinario.Nodo GetSubarbolIzdo() {return izdo;}
    public edu.ejercicios.ArbolBinario.Nodo GetSubarbolDcho() {return dcho;}

    public void nuevoValor(int d){dato =d;}
    public void SetRamaIzdo(edu.ejercicios.ArbolBinario.Nodo n){izdo = n;}
    public void SetRamaDcho(edu.ejercicios.ArbolBinario.Nodo n){dcho = n;}

    public void imprimirDato(){
        System.out.println(this.valorNodo());
    }

}




