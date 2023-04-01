import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{



        Scanner s = new Scanner(System.in);
        int n,k;
        System.out.println("Inserisci K > 0: ");
        do {
            k = s.nextInt();
        }while(k < 0);
        System.out.println("Inserisci N > K: ");
        do {
            n = s.nextInt();
        }while(n<0 || n<=k);
        Fattoriale f1 = new Fattoriale("Fattoriale di N", n);
        Fattoriale f2 = new Fattoriale("Fattoriale di K", k);

        Fattoriale f3 = new Fattoriale("Fattoriale di N-K", n-k);

        f1.start();
        f2.start();
        f3.start();
        f1.join();
        f2.join();
        f3.join();
        System.out.println("Combinazione 4= "+ f1.getVal()/(f2.getVal()*f3.getVal()));
    }
}