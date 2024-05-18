package edu.ejercicios.ArbolCadena;

import edu.ejercicios.ArbolBinario.Nodo;

public class ArbolCadenas {

        //nodo raiz del arbol
        private Nodo raiz;

        //constructor de la clase arbol
        public ArbolCadenas() {
            this.raiz = null;
        }

        //inserta un nodo con el valor dato, si el arbol esta vacio se crea un nodo

        public void insertar(int dato) {
            if (this.raiz == null) {
                this.raiz = new Nodo(dato);
            } else {
                this.insertar(this.raiz, dato);
            }
        }
        //si no tiene valor nulo, se inserta en un orden

        private void insertar(Nodo padre, int dato) {
            if (dato < padre.valorNodo()) {
                if (padre.GetSubarbolIzdo() == null) {
                    padre.SetRamaIzdo(new Nodo(dato));
                } else {
                    insertar(padre.GetSubarbolIzdo(), dato);
                }
            } else if (dato > padre.valorNodo()) {
                if (padre.GetSubarbolDcho() == null) {
                    padre.SetRamaDcho(new Nodo(dato));
                } else {
                    this.insertar(padre.GetSubarbolDcho(),dato);

                }

            }
        }
    }

