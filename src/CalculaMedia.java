import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) throws CalculaMediaException{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de funcionários: ");
		String quantidadeFunc = entrada.nextLine();
		System.out.print("Digite os salários dos funcionários: ");
		String todosSalarios = entrada.nextLine();
		
		String[] salariosSeparados = todosSalarios.split(",");
		
		double[] salarios = new double[salariosSeparados.length];
		for(int i = 0; i < salariosSeparados.length; i++){
			salarios[i]  = Double.parseDouble(salariosSeparados[i]);
		}
		try {
			System.out.println("Média salarial: "+salario(Integer.parseInt(quantidadeFunc), salarios));
		}catch(CalculaMediaException e){
			System.out.println("A quantidade de funcionários é diferente da quantidade de salários!");
		}
		
	}
	
	public static double salario(int quantidadeFunc, double[] salarios) throws CalculaMediaException {
		double media = 0;
		
		if(salarios.length != quantidadeFunc ){
			throw new CalculaMediaException("A quantidade de funcionários é diferente da quantidade de salários!");
		}else{
			for(int i = 0; i < salarios.length; i++){
			media = Math.round(media + salarios[i] / quantidadeFunc);
			}
		}
		
		return media;
	}

	
}
