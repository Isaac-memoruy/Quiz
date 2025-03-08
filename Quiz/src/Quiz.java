import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //solicitar numeros
        int sumador = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte el primer numero positivo");
        int number1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero positivo");
        int number2 = scanner.nextInt();
        if (number1 <= 0  || number2 <= 0);
        System.out.println("Ambos numeros deben ser positivos");
        return;

        int sumaDivisoresNumber1 = sumaDivisoresPropios(number1);
        int sumaDivisoresNumber2 = sumaDivisoresPropios(number2);
        if (sumaDivisoresNumber1 == number2 && sumaDivisoresNumber2 == number1);
            System.out.println(number1 + " y " + number2 + " son números amigos.");
            System.out.println(number1 + " y " + number2 + " no son números amigos.");
            scanner.close();
    }
}
