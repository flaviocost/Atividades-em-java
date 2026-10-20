import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        String[] nomes = new String[n];
        double[] alturas = new double[n];
        int[] idades = new int[n];
        int menores16 = 0;

        for (int i = 0; i < vect.length; i++){
            //Quebra de linha
            sc.nextLine();

            System.out.printf("Dados da %d° Pessoas %n", i + 1);
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            nomes[i] = nome;

            System.out.println("Idade : ");
            int idade = sc.nextInt();
            idades[i] = idade;

            System.out.println("Altura : ");
            double altura = sc.nextDouble();
            alturas[i] = altura;
        }
        //soma
        double soma = 0.0;
        for (double calculoAlturas : alturas){
            soma += calculoAlturas;
        }
        //média
        double mediaAltura = soma / n;

        for (int idade : idades){
            if (idade < 16){
                menores16++;
            }
        }

        double porcentagem = ((double) menores16 / idades.length)  * 100;

        System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", porcentagem);


        for(int i = 0; i < vect.length; i++){
            if(idades[i] < 16){
                System.out.printf("%s%n", nomes[i]);
            }

        }
    }
}
