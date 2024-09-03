import java.util.Scanner;

public class Ado9 {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int numTotal = lerNota("Me fale o total de notas:");
        media(0, 0, numTotal);
    }

    public static int lerNota(String mensagem) {
        System.out.println(mensagem);
        return ler.nextInt();
    }

    public static void media(int soma, int contador, int numTotal) {
        int nota = lerNota("Digite a nota " + (contador + 1) + ":");
        soma += nota;
        if (contador < numTotal - 1) {
            media(soma, contador + 1, numTotal);
        } else {
            int resultado = soma / numTotal;
            System.out.println("Sua média é: " + resultado);
        }
    }
}
