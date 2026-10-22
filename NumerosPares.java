    import java.util.Scanner;

    public class NumerosPares {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe quantos números deseja digitar: ");
            int n = sc.nextInt();

            int[] vect = new int[n];

            sc.nextLine();

            for(int i = 0; i < vect.length; i++){
                System.out.println("Informe um número ");
                int valor = sc.nextInt();
                vect[i] = valor;
            }

            int cont = 0;
            for (int valores : vect){
                if (valores % 2 == 0){
                    cont += 1;
                    System.out.printf("%d ", valores);
                }
            }

            System.out.printf("%nQUANTIDADE DE PARES = %d", cont);
            sc.close();
        }
    }
