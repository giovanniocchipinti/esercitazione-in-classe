import java.util.Scanner;

public class Fattoriale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il numero del quale vuoi calcolare il fattoriale");
        int numeroFattoriale = scan.nextInt();
        int fattoriale = 1;

        for (int i = 1; i <= numeroFattoriale; i++) {
            fattoriale = fattoriale * i;
        }
        
        System.out.println("Il numero fattoriale di" + " " + numeroFattoriale + " " + "è" + " " + "=" + " " + fattoriale);

        
        scan.close();
    }
}
