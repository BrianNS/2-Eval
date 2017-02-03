import static org.junit.Assert.*;

import org.junit.Test;

public class Pal�ndromoTest {

		private static final String Vacaciones = null;
		private Pal�ndromo Palind;
	@Test
	public void testVac�o() {
		Palind = new Pal�ndromo(Vacaciones);
		String Line=this.Palind.pal�n();
		assertTrue(Line=="");
	}
	
	@Test
	public void testBlancoInicio(){
		String Line=this.Palind.pal�n();
		assertTrue(Line=="");
	}
	
	@Test
	public void testBlancoFin(){
		String Line=this.Palind.pal�n();
		assertTrue(Line==" VacacionessenoicacaV");
	}
	
	@Test
	public void testUno(){
		String Line=this.Palind.pal�n();
		assertTrue(Line=="VacacionessenoicacaV ");
	}
	
	@Test
	public void testTama�os4(){
		String Line=this.Palind.pal�n();
		assertTrue(Line=="VacaacaV");
	}
	
	@Test
	public void testTama�os10(){
		String Line=this.Palind.pal�n();
		assertTrue(Line=="VacacionessenoicacaV");
	}
	
	@Test
	public void testTama�os50(){
		String Line=this.Palind.pal�n();
		assertTrue(Line=="Vacaciones1234567890ABCEFFECBA0987654321senoicacaV");
	}
	
	@Test
	public void testMayus(){
		String Line=this.Palind.pal�n();
		assertTrue(Line=="VACACIONESSENOICACAV");
	}
}
