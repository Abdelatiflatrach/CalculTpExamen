package ic.com.dev;

import junit.framework.TestCase;

public class CalculTest extends TestCase {

	private Calcul metier;
	
	protected void setUp() throws Exception{
		super.setUp();
		metier = new Calcul();
		
	}
	
	public void testSomme(){
		assertTrue(metier.Somme(10, 9) == 19);
	}
	
	public void testProduit(){
		assertTrue(metier.Produit(2, 2)==4);
	}
}
