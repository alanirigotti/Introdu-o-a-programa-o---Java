import java.util.Scanner;

// Autora: Alani Rigotti de Oliveira

public class Exe02 {

// Leia 2 valores inteiros e imprima sua soma.
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um valor inteiro: "); 
        int num1 = leitor.nextInt();  
 
        System.out.println("Informe outro valor inteiro: "); 
        int num2 = leitor.nextInt();  
 
        int resultado = (num1 * num2);      
    
        System.out.println("A multiplicação dos valores inseridos é de: "+resultado );
        
        leitor.close();
    }  
    
}   