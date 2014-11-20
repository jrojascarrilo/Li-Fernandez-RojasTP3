package com.tp3.preguntec;


public class Nodo{
// atributos de la clase
   int cod;
   int valor;
   String prod;
   Nodo sig;

//Construtor  Crea un nodo del tipo Object
Nodo (int  codigo, String producto){
	cod= codigo;
	prod= producto;
	valor= 1;
	sig= null;  //siguiente con valor de nulo
	}

//Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
Nodo (int codigo, String producto, Nodo siguiente){
	cod= codigo;
	prod= producto;
	valor= 1;
	sig = siguiente; //siguiente se refiere al siguiente nodo
	}
}