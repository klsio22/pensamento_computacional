package URI;
//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;
import  java.util.Locale;
public class ex1021 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner ent = new Scanner(System.in);
        double n = ent.nextDouble() ;
        int notas = (int) n , moedas = (int) ((n - notas) * 100.0);
        int cemR , cinqR , vinteR , dezR , cincoR ,
                doisR, umR,cinqCetavos, vinteCincoCentavos,
                dezCentevos, cincoCentavos,umCentavo;

        cemR = notas / 100;
        notas= notas % 100;

        cinqR = notas / 50;
        notas = notas % 50;

        vinteR = notas / 20;
        notas = notas % 20;

        dezR = notas / 10;
        notas = notas % 10;

        cincoR = notas / 5;
        notas = notas % 5;

        doisR= notas / 2;
        notas = notas % 2;

        umR = notas ;

        cinqCetavos = moedas / 50;
        moedas = moedas % 50;

        vinteCincoCentavos = moedas / 25;
        moedas = moedas % 25;

        dezCentevos = moedas / 10;
        moedas = moedas % 10;

        cincoCentavos = moedas / 5;
        moedas = moedas % 5;

        umCentavo = moedas;

        System.out.printf("NOTAS:\n" +
                "%d nota(s) de R$ 100.00\n" +
                "%d nota(s) de R$ 50.00\n" +
                "%d nota(s) de R$ 20.00\n" +
                "%d nota(s) de R$ 10.00\n" +
                "%d nota(s) de R$ 5.00\n" +
                "%d nota(s) de R$ 2.00\n",
                cemR, cinqR, vinteR, dezR, cincoR, doisR);
        System.out.printf("MOEDAS:\n"+
                        "%d moeda(s) de R$ 1.00\n" +
                        "%d moeda(s) de R$ 0.50\n" +
                        "%d moeda(s) de R$ 0.25\n" +
                        "%d moeda(s) de R$ 0.10\n" +
                        "%d moeda(s) de R$ 0.05\n" +
                        "%d moeda(s) de R$ 0.01\n",
                    umR,cinqCetavos, vinteCincoCentavos,
                    dezCentevos, cincoCentavos, umCentavo);
        ent.close();
    }
}
