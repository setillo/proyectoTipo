package proyectoTipo;

import static org.junit.Assert.*;

import org.junit.Test;

public class XTest {

	private X x = new X();
	@Test
	public void test() {
		assertEquals(120, x.fact(5));
	}

}
