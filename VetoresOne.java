import java.util.Locale;
import java.util.Scanner;

public class VetoresOne {
    static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double vect[] = new double[n];

        for(int i = 0; i < 0; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (double altura : vect){
            sum += altura;
        }
        double avg = sum / n;
        System.out.printf("VERAGE HEIGHT: %.2f%n",  avg);


        sc.close();
    }
}
