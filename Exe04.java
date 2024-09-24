import java.util.Scanner;

// Autora: Alani Rigotti de Oliveira

public class Exe04 {

    // Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a nota A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um valor inteiro: ");
        float num1 = leitor.nextFloat();

        System.out.println("Informe um valor inteiro: ");
        float num2 = leitor.nextFloat();
 
        float mediaPonderada = (num1 * 3.5f + num2 * 7.5f)/ 11;  

        System.out.println("A média ponderada dos valores inseridos é de: " + mediaPonderada);

        leitor.close();

    }  
    
}  
