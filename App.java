import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new java.util.Scanner(System.in);
        int nota1, nota2, nota3;

        System.out.println("Informe o primeira valor:");
        nota1 = sc.nextInt();
        if (nota1 > 10 || nota1 < 0) {
            System.out.println("Valor informado não atende a regra definida.");
            System.exit(0);
        }
    
        System.out.println("Informe o segundo valor:");
        nota2 = sc.nextInt();
        if (nota2 > 10 || nota2 < 0) {
            System.out.println("Valor informado não atende a regra definida.");
            System.exit(0);

        }

        System.out.println("Informe o terceiro valor:");
        nota3 = sc.nextInt();
        if (nota3 > 10 || nota3 < 0) {
            System.out.println("Valor informado não atende a regra definida.");
            System.exit(0);

        }

        if (nota1 > nota2 && nota1 > nota3) {
            System.out.println("O primeiro valor foi o maior = " + nota1 );

        }
        
        if (nota2 > nota1 && nota2 > nota3) {
            System.out.println("O segundo valor foi o maior = " + nota2 );

        }

        if (nota3 > nota1 && nota3 > nota2) {
            System.out.println("O terceiro valor foi o maior = " + nota3 );

        }
        
        if (nota1 < nota2 && nota1 < nota3) {
            System.out.println("O primeiro valor foi o menor = " + nota1 );

        }
        
        if (nota2 < nota1 && nota2 < nota3) {
            System.out.println("O segundo valor foi o menor = " + nota2 );

        }

        if (nota3 < nota1 && nota3 < nota2) {
            System.out.println("O terceiro valor foi o menor = " + nota3 );

        }
        

        

        
        
            


        
    
    }
}
