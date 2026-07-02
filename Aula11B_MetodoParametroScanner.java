import java.util.Scanner;

public class Aula11B_MetodoParametroScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CalculadoraSimples calc = new CalculadoraSimples();

        System.out.println("Digite o primeiro valor: ");
        int num1 = teclado.nextInt();

        System.out.println("Agora, o segundo valor: ");
        int num2 = teclado.nextInt();

        calc.somarDoisNumeros(num1, num2);
        teclado.close();
    }
}