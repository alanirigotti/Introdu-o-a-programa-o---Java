import java.util.Scanner;

// Autora: Alani Rigotti de Oliveira

public class Exe05 {
    
    // Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 

        System.out.println("Informe um valor inteiro para A: ");
        int A = leitor.nextInt();

        System.out.println("Informe um valor inteiro para A: ");
        int B = leitor.nextInt();

        System.out.println("Informe um valor inteiro para A: ");
        int C = leitor.nextInt();

        System.out.println("Informe um valor inteiro para A: ");
        int D = leitor.nextInt();  

        int resultado = ((A * B) - (C * D));  

        System.out.println("A diferença do produto de A e B pelo produto de C e D é de: " + resultado);

        leitor.close();
        
    }
}
