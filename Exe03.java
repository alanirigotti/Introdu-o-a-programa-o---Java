import java.util.Scanner;

// Autora: Alani Rigotti de Oliveira

public class Exe03 {

//Calcule a área da circunferência elevando o valor de raio ao quadrado e multiplicando por π (π = 3.14159).
 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");   
        double raio = leitor.nextDouble(); 

        double area = Math.PI * Math.pow(raio, 2);
           
        System.out.println("A área da circunferência é de: " + area);
   
    leitor.close();    
    }
  
}
