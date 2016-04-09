package drcasa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AutoInmuneTest {

	private AutoInmune lupus;
	
	@Before
	public void inicializarFixture() {
		lupus = new AutoInmune(); 
	}
	
	@Test
	public void siNoPasaronDiasNoEsAgresiva () {
	
		boolean esAgresiva = lupus.esAgresiva();
		Assert.assertFalse(esAgresiva);
	}

	@Test
	public void siPasoMasDeUnMesEsAgresiva () {
		
		for (int i = 0; i < 31; i++) {
			lupus.pasarUnDia();
		}
		
		boolean esAgresiva = lupus.esAgresiva();
		Assert.assertTrue(esAgresiva);
	}
}
