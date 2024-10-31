public class Ex_509_FibonacciNumber {

    public static final String OUTPUT = "Saída: ";

    public static void main(String[] args) {
        // Entrada: n = 2
        System.out.println(OUTPUT + fib(2));
        // Entrada: n = 3
        System.out.println(OUTPUT + fib(3));
        // Entrada: n = 4
        System.out.println(OUTPUT + fib(4));
    }

    // Método que calcula o n-ésimo número de Fibonacci
    public static int fib(int n) {
        System.out.println("Entrada: " + n);

        // Caso base: se n é 0 ou 1, o valor de Fibonacci é igual a n
        if (n <= 1) {
            return n;
        }

        // Inicializa as variáveis para os dois primeiros números de Fibonacci
        int fib0 = 0; // Representa Fibonacci(0)
        int fib1 = 1; // Representa Fibonacci(1)
        int fibN = 1; // Variável para armazenar o valor de Fibonacci(n) durante o cálculo

        // Loop que calcula o valor de Fibonacci para cada número de 2 até n
        for (int i = 2; i <= n; i++) {
            // Atualiza o valor atual de Fibonacci usando os dois valores anteriores
            fibN = fib0 + fib1;

            // Atualiza os valores para os próximos cálculos:
            // fib0 assume o valor de fib1, e fib1 assume o valor de fibN
            fib0 = fib1;
            fib1 = fibN;
        }

        // Retorna o valor de Fibonacci(n) após o cálculo do loop
        return fibN;
    }

}
