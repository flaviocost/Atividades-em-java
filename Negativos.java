import java.util.Scanner;

public class Negativos {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números que deseja digitar: ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Digite um valor: ");
            int valor = sc.nextInt();
            vect[i] =  valor;
        }

        System.out.println("NÚMEROS NEGATIVOS:");

        for (int verificacao : vect){
            if (verificacao < 0){
                System.out.printf("%n%d%n",verificacao);
            }
        }
        sc.close();
    }
}
