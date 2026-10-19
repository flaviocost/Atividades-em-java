import java.util.Locale;
import java.util.Scanner;

public class calculoVetores {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números deseja digitar: ");
        int n = sc.nextInt();
        double[] vects = new double[n];

        for(int i = 0; i < vects.length; i++){
            sc.nextLine();
            System.out.println("Digite um valor: ");
            double valor = sc.nextDouble();
            vects[i] = valor;
        }
        double soma = 0.0;

        for(double calculo : vects){
            soma += calculo;
        }

        double media = soma / n;

        System.out.println("VALORES = ");
        for (double vect : vects){
            System.out.printf("%.1f  ", vect);
        }

      System.out.printf("\nSOMA: %.1f%n", soma);
      System.out.printf("MÉDIA: %.1f%n", media);


    sc.close();
    }
}
