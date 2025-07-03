import java.util.Scanner;

public class Tabellina {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Inserisci un numero del quale si vuole la tabellina");
    int numeroTabellina = scan.nextInt();
    System.out.println("Inserisci un numero fino a dove moltiplicare");
    int numeroFineTabellina = scan.nextInt();
    

    for (int i = 0; i <= numeroFineTabellina; i++) {
        System.out.println(numeroTabellina + "x" + i + "=" + numeroTabellina * i);
    }
    scan.close();
}
}
