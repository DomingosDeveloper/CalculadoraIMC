import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sua altura? Em metros.");
        Calculadora calculadora = new Calculadora();

        String alturaS = scanner.nextLine();
        Double alturaD = Double.valueOf(alturaS);

        calculadora.setAltura(alturaD);

        System.out.println("Qual seu peso?");
        String pesoS = scanner.nextLine();
        Double pesoD = Double.valueOf(pesoS);

        calculadora.calculaIMC(pesoD, alturaD);
    }
}