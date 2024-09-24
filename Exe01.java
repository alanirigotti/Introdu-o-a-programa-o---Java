import java.util.Scanner;

// Autora: Alani Rigotti de Oliveira

public class Exe01 {
  
// Leia 2 valores inteiros e imprima sua soma.
    public static void main(String[] args) {  
        Scanner leitor = new Scanner(System.in); 

        System.out.println("Insira um número inteiro");  
        int num1 = leitor.nextInt();

        System.out.println("Insira o outro valor inteiro");  
        int num2 = leitor.nextInt();

        System.out.println("A soma dos valores é: " + (num1 + num2));     
        
        leitor.close();
    }  
}            