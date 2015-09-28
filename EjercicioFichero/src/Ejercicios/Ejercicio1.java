package Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

Scanner teclado= new Scanner(System.in);
PrintWriter salida= null;
try{
	File fichero=new File("registrodeusuario.txt");
	fichero.createNewFile();
	FileWriter ficherowrite=new FileWriter(fichero,true);
	salida=new PrintWriter(ficherowrite);
	String cadena;
	System.out.println("Escriba un texto y para terminar escriba FIN");
	cadena=teclado.nextLine();
	while(!cadena.equalsIgnoreCase("FIN")){
	salida.println(cadena);
	cadena=teclado.nextLine();
}
salida.flush();
	}
catch(FileNotFoundException e){
	System.out.println(e.getMessage());
	
}finally{
	salida.close();
	}

}
}