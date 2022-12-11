import java.util.Scanner;

public class TempoDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EXERCÍCIO 18");
        System.out.println("Digite o tamanho do arquivo (em MBs) que deseja fazer download:");
        int mb = Integer.parseInt(scanner.next());
        System.out.println("Digite a velocidade de sua internet (Mbps):");
        int mbitps = Integer.parseInt(scanner.next());
        int mbit = mb*8;
        int temposec = mbit/mbitps;
        int tempomin = temposec/60;
        System.out.println("Você deve esperar "+tempomin+" minutos para fazer download desse arquivo.");
    }
}
