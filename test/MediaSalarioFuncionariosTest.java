import static org.junit.Assert.*;

import org.junit.Test;

public class MediaSalarioFuncionariosTest {

	@Test
	public void deveCalcularMediaDeSalariosDe8Funcionarios() throws CalculaMediaException{
		double[] salarios = {590, 1500, 780, 965, 675, 675, 2485, 5900};
		double media = CalculaMedia.salario(8, salarios);
		assertEquals(1698, media, 0);
	}
	
	@Test
	public void deveCalcularMediaDeSalariosDe3Funcionarios() throws CalculaMediaException{
		double[] salarios = {590, 690,250};
		double media = CalculaMedia.salario(3, salarios);
		assertEquals(510, media, 0);
	}
	
	@Test(expected = CalculaMediaException.class)
	public void naoDeveCalcularMediaDeSalariosDeFuncionarios() throws CalculaMediaException{
		double[] salarios = {590, 690, 250};
		double media = CalculaMedia.salario(5, salarios);
		assertEquals(510, media, 0);
	}
}
