package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class AlumnoTest {
	Alumno alumno;
	@BeforeEach
	void setUp() {
		alumno = new Alumno();
		
		ArrayList<Actividad> listaActividades = new ArrayList<Actividad>();
		
		Actividad act1 = new Actividad();
		act1.setNombre("Actividad 1");
		Actividad act2 = new Actividad();
		act2.setNombre("Actividad 2");
		Actividad act3 = new Actividad();
		act3.setNombre("Actividad 3");

		act1.agregarEjercicioCalificado("ejercicio1", 4.0);
		act1.agregarEjercicioCalificado("ejercicio2", 6.0);
		act1.agregarEjercicioCalificado("ejercicio3", 8.0);
		
		act2.agregarEjercicioCalificado("ejercicio1", 9.0);
		act2.agregarEjercicioCalificado("ejercicio2", 4.0);
		act2.agregarEjercicioCalificado("ejercicio3", 2.0);
		act2.agregarEjercicioCalificado("ejercicio4", 3.0);
		act2.agregarEjercicioCalificado("ejercicio5", 7.0);
		
		act3.agregarEjercicioCalificado("ejercicio1", 3.0);
		act3.agregarEjercicioCalificado("ejercicio2", 2.0);
		act3.agregarEjercicioCalificado("ejercicio3", 7.0);
		act3.agregarEjercicioCalificado("ejercicio4", 8.0);
		
		listaActividades.add(act1);
		listaActividades.add(act2);
		listaActividades.add(act3);
		
		alumno.setActividadesAsignadas(listaActividades);


	}
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"Actividad 1, 6.0",
				"Actividad 2, 5.0",
				"Actividad 3, 5.0",
				"Actividad 4, -1",})
	
	void testNotaActividad(String nombre, double salida) {
		assertEquals(salida, alumno.calcularNotaActividad(nombre));
	} 
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"Deyan, Deyan"})
	
	void testNombreAlumno(String nombre, String salida) {
		alumno.setNombre(nombre);
		assertEquals(salida, alumno.getNombre());
	} 
	
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"ejercicio1, ejercicio1"})
	
	void testNombreEjercicio(String nombre, String salida) {
		Ejercicio e = new Ejercicio();
		e.setNombre(nombre);
		assertEquals(salida, e.getNombre());
	} 
}
