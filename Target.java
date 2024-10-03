

/* 

Autora: Alani Rigotti de Oliveira

3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora de todos os dias de um ano, faça um programa, na linguagem que desejar, que calcule e retorne:

- O menor valor de faturamento ocorrido em um dia do ano;
- O maior valor de faturamento ocorrido em um dia do ano;
- Número de dias no ano em que o valor de faturamento diário foi superior à média anual.

a) Considerar o vetor já carregado com as informações de valor de faturamento.

b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média.

c) Utilize o algoritmo mais veloz que puder definir. 

*/

public class Target { 
 
    public static void main(String[] args) {
        
        // Vetor com os valores de faturamento diário  
        double[] faturamentoDiario = {1755.00, 1988, 1200, 1735.25, 1250.87, 6874.54, 1254.69, 1698.20, 0, 0, 1000, 2070.10, 3000.74, 4800.98, 5000.78, 6650.05, 7000, 8000, 9000, 10398}; 
 
        double menorFaturamento = menorValor(faturamentoDiario); 
        double maiorFaturamento = maiorValor(faturamentoDiario);   
        int diasAcimaMedia = diasAcimaDaMedia(faturamentoDiario);    
          
        System.out.println("Menor valor de faturamento ocorrido em um dia do ano: " + menorFaturamento);  
        System.out.println("Maior valor de faturamento ocorrido em um dia do ano: " + maiorFaturamento);
        System.out.println("Número de dias no ano em que o valor de faturamento diário foi superior à média anual: " + diasAcimaMedia + " dias"); 
           
            
    }          
 
    // Método que retorna o menor valor de faturamento ocorrido em um dia do ano
        public static double menorValor(double[] faturamentoDiario) {
            double menor = faturamentoDiario[0];
            for (int i = 0; i < faturamentoDiario.length; i++) { 
                if(faturamentoDiario[i] == 0) {
                    continue;  
                }
                if (faturamentoDiario[i] < menor) {
                    menor = faturamentoDiario[i];
                } 
            }
            return menor;
        } 
        
    // Método que retorna o maior valor de faturamento ocorrido em um dia do ano
    public static double maiorValor(double[] faturamentoDiario) {
        double maior = faturamentoDiario[0];
        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > maior) {
                maior = faturamentoDiario[i]; 
            }  
        } 
        return maior;    
    }
 
    // Método que calcula a média anual, ignorando os dias sem faturamento
    public static int diasAcimaDaMedia(double[] faturamentoDiario) {

        double soma = 0; 

        for(int i = 0; i < faturamentoDiario.length; i++) {
            if(faturamentoDiario[i] != 0) {
                soma += faturamentoDiario[i]; 
            }     
            continue; 
        }    
 
        double media = soma / faturamentoDiario.length;
        int diasAcimaMedia = 0;

        for(int i = 0; i < faturamentoDiario.length; i++) {
            if(faturamentoDiario[i] > media) {
                diasAcimaMedia++; 
            }         
            continue;    
        }
  
        return diasAcimaMedia;
    }  
}
