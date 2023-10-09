import java.util.Scanner;

class Calculadora {
     public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir por cero");
            return 0;
        }
    }
}

public class CalculadoraCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Primer valor: ");
            int valor1 = scanner.nextInt();

            System.out.print("Segundo valor: ");
            int valor2 = scanner.nextInt();

            System.out.print("Operación: ");
            char operador = scanner.next().charAt(0);

            int resultado = 0;

            switch (operador) {
                case '+':
                    resultado = Calculadora.sumar(valor1, valor2);
                    break;
                case '-':
                    resultado = Calculadora.restar(valor1, valor2);
                    break;
                case '*':
                    resultado = Calculadora.multiplicar(valor1, valor2);
                    break;
                case '/':
                    resultado = Calculadora.dividir(valor1, valor2);
                    break;
                default:
                    System.out.println("Operación no válida");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            if (resultado < 0) {
                System.out.println("Tené cuidado, el resultado es negativo!");
            } else if (resultado >= 0 && resultado < 10000) {
                System.out.println("Resultado dentro de los límites");
            } else {
                System.out.println("Error, resultado muy grande");
            }
        }

        System.out.println("Finalizando el programa");

        scanner.close();
    }
}
