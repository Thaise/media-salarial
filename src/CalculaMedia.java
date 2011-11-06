import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) throws CalculaMediaException{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de funcion�rios: ");
		String quantidadeFunc = entrada.nextLine();
		System.out.print("Digite os sal�rios dos funcion�rios: ");
		String todosSalarios = entrada.nextLine();
		
		String[] salariosSeparados = todosSalarios.split(",");
		
		double[] salarios = new double[salariosSeparados.length];
		for(int i = 0; i < salariosSeparados.length; i++){
			salarios[i]  = Double.parseDouble(salariosSeparados[i]);
		}
		try {
			System.out.println("M�dia salarial: "+salario(Integer.parseInt(quantidadeFunc), salarios));
		}catch(CalculaMediaException e){
			System.out.println("A quantidade de funcion�rios não corresponde à quantidade de sal�rios!");
		}
		
	}
	
	public static double salario(int quantidadeFunc, double[] salarios) throws CalculaMediaException {
		double media = 0;
		
		if(salarios.length != quantidadeFunc ){
			throw new CalculaMediaException("A quantidade de funcion�rios não corresponde à quantidade de sal�rios!");
		}else{
			for(int i = 0; i < salarios.length; i++){
			media = Math.round(media + salarios[i] / quantidadeFunc);
			}
		}
		
		return media;
	}

	
}
