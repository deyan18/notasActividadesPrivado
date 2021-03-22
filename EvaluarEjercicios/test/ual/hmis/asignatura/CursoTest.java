package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CursoTest {
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({	"2017, 1º Educación Infantil",
		"2016, 2º Educación Infantil",
		"2015, 3º Educación Infantil",
		"2014, 1º Educación Primaria",
		"2013, 2º Educación Primaria",
		"2012, 3º Educación Primaria",
		"2011, 4º Educación Primaria",
		"2010, 5º Educación Primaria",
		"2009, 6º Educación Primaria",
		"2008, 1º Educación Secundaria",
		"2007, 2º Educación Secundaria",
		"2006, 3º Educación Secundaria",
		"2005, 4º Educación Secundaria",
		"2004, Error en la edad",})

	
	void testNotaActividad(int entrada, String salida) {
		Alumno a = new Alumno();
		assertEquals(salida, a.cursoSegunEdad(entrada));
		// assertTrue(c.transformar(input)==expected);
	} 
}
