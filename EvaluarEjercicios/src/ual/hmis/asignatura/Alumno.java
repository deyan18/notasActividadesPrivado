package ual.hmis.asignatura;

import java.util.ArrayList;
import java.util.*;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		double resultado = -1;
		
		for(Actividad a: getActividadesAsignadas()) {
			if(a.getNombre().equals(nombreActividad)) {
				resultado = 0;
				double i = 0.0;
				for(Ejercicio e: a.getEjercicios()) {
					i++;
					resultado += e.getPuntuacion();
				}
				resultado = resultado/i;
				a.setPuntuacionTotal(resultado);
			}
		}
		
		return resultado;
	}

	public String calificacion (double nota){
		
		if(nota < 0 || nota > 10)
			return "Error en la nota";
		if(nota < 5)
			return "Suspenso";
		if(nota < 7)
			return "Aprobado";
		if(nota < 9)
			return "Notable";
		if(nota < 10)
			return "Sobresaliente";
		else
			return "Matricula";
			
	}
	
	public String cursoSegunEdad (int anyoNacimiento) {
		if(anyoNacimiento == 2017)
			return "1o Educacion Infantil";
		if(anyoNacimiento == 2016)
			return "2o Educacion Infantil";
		if(anyoNacimiento == 2015)
			return "3o Educacion Infantil";
		if(anyoNacimiento == 2014)
			return "1o Educacion Primaria";
		if(anyoNacimiento == 2013)
			return "2o Educacion Primaria";
		if(anyoNacimiento == 2012)
			return "3o Educacion Primaria";
		if(anyoNacimiento == 2011)
			return "4o Educacion Primaria";
		if(anyoNacimiento == 2010)
			return "5o Educacion Primaria";
		if(anyoNacimiento == 2009)
			return "6o Educacion Primaria";
		if(anyoNacimiento == 2008)
			return "1o Educacion Secundaria";
		if(anyoNacimiento == 2007)
			return "2o Educacion Secundaria";
		if(anyoNacimiento == 2006)
			return "3o Educacion Secundaria";
		if(anyoNacimiento == 2005)
			return "4o Educacion Secundaria";
		else
			return "Error en la edad";
	}
	
}
