import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Digite o valor em que será aplicado 30% de desconto.");
	    double preco = scan.nextDouble();
	    double pDesconto = preco - preco * 0.3;
	    
	    System.out.println("Preço original: " + preco);
	    System.out.println("Preço com desconto: " + pDesconto);
	}
}
