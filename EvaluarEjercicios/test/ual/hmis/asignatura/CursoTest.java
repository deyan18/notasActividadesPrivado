package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CursoTest {
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({	"2017, 1o Educacion Infantil",
		"2016, 2o Educacion Infantil",
		"2015, 3o Educacion Infantil",
		"2014, 1o Educacion Primaria",
		"2013, 2o Educacion Primaria",
		"2012, 3o Educacion Primaria",
		"2011, 4o Educacion Primaria",
		"2010, 5o Educacion Primaria",
		"2009, 6o Educacion Primaria",
		"2008, 1o Educacion Secundaria",
		"2007, 2o Educacion Secundaria",
		"2006, 3o Educacion Secundaria",
		"2005, 4o Educacion Secundaria",
		"2004, Error en la edad",})

	
	void testNotaActividad(int entrada, String salida) {
		Alumno a = new Alumno();
		assertEquals(salida, a.cursoSegunEdad(entrada));
	} 
}
