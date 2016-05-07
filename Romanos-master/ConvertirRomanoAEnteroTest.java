package prueba;

/*
 * @author Santiago Zapata
 * @version 1.0
 * Esta clase prueba, permite probar 
*/

import static org.junit.Assert.*;
import org.junit.Test;
import src.ConvertirRomanoAEntero;


public class ConvertirRomanoAEnteroTest {
	ConvertirRomanoAEntero entero = new ConvertirRomanoAEntero();
	int n;
	@Test
	public void testI() {
		 n = entero.romanoAEntero("I");
		assertEquals(1, n);
	}

	@Test
	public void testXXVI() {
		 n = entero.romanoAEntero("XXVI");
		assertEquals(26, n);
	}

	@Test
	public void testXCII() {
		n = entero.romanoAEntero("XCII");
		assertEquals(92, n);
	}

	@Test
	public void testLXXXII() {		
		n = entero.romanoAEntero("LXXXII");
		assertEquals(82, n);
	}
	
	@Test
	public void testCDXCVIII () {
		n = entero.romanoAEntero("CDXCVIII");
		assertEquals(498, n);
	}
}