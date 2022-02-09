/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package main;

import clases.*;

public class MainAPP {

	public static void main(String[] args) {

		Mysql.openConnection();		
		System.out.println("");
		
		Mysql.createDB("Tienda_Informatica");
		
		Mysql.createTable("Tienda_Informatica", "Fabricantes", Inserciones.tablaFabricantesCampos);
		Mysql.createTable("Tienda_Informatica", "Articulos", Inserciones.tablaArticulosCampos);
		
		Mysql.insertData("Tienda_Informatica", "Fabricantes", Inserciones.insercionTablaFabricantes);
		Mysql.insertData("Tienda_Informatica", "Articulos", Inserciones.insercionTablaArticulos);
		
		Mysql.getValues("Tienda_Informatica", "Articulos");
		
		Mysql.deleteRecord("Tienda_Informatica", "Articulos", 1);
		
		Mysql.getValues("Tienda_Informatica", "Articulos");
		
		System.out.println("");
		Mysql.closeConnection();
	}

}
