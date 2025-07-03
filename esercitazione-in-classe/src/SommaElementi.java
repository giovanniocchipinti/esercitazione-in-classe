public class SommaElementi {
    public static void main(String[] args) {
        int elementiDaSommare [] = {1,2,3,4,5};
        int somma = 0;
        
        for (int i = 0; i < elementiDaSommare.length; i++) {
            somma = somma + elementiDaSommare[i];
        }

        System.out.println("La somma degli elementi è"+" "+somma);
    }
}
