package ual.hmis.asignatura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NotaTest {
	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"-1, Error en la nota",
				"11, Error en la nota",
				"2, Suspenso",
				"6, Aprobado",
				"8, Notable",
				"9.6, Sobresaliente",
				"10, Matricula",})
	
	void testNotaActividad(Double entrada, String salida) {
		Alumno a = new Alumno();
		assertEquals(salida, a.calificacion(entrada));
		// assertTrue(c.transformar(input)==expected);
	} 
}
