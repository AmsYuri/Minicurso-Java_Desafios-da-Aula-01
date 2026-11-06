import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Digite a distância a ser percorrida (km).");
	    double distancia = scan.nextDouble();
	    
	    System.out.println("Digite o preço da gasolina");
	    double gasolina = scan.nextDouble();
	    
	    System.out.println("Digite o consumo do carro (km/l)");
	    double consumo = scan.nextDouble();
	    
	    double custo = distancia / consumo * gasolina;
	    double valorViagem = custo + custo * 0.45;
	    
	    System.out.println("Valor da viagem: " + valorViagem);
	}
}
