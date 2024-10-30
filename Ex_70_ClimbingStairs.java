public class Ex_70_ClimbingStairs {

    public static final String OUTPUT = "Saída: ";

    public static void main(String[] args) {
        // Entrada: n = 2
        System.out.println(OUTPUT + climbStairs(2));
        // Entrada: n = 3
        System.out.println(OUTPUT + climbStairs(3));
    }

    // Método que calcula o número de maneiras de subir uma escada com n degraus
    public static int climbStairs(int n) {
        System.out.println("Entrada: " + n);

        // Se n é 0 ou 1, há apenas uma maneira de subir a escada (não subir ou subir um degrau)
        if (n == 0 || n == 1) {
            return 1;
        }

        // Variáveis para armazenar o número de maneiras de chegar aos dois últimos degraus
        int prev1 = 1; // Número de maneiras de chegar ao degrau 1
        int prev2 = 1; // Número de maneiras de chegar ao degrau 0 (base)
        int current = 0; // Variável para armazenar o número atual de maneiras

        // Loop a partir do degrau 2 até o degrau n
        for (int i = 2; i <= n; i++) {
            // O número de maneiras de chegar ao degrau atual é a soma das maneiras de chegar aos dois degraus anteriores
            current = prev1 + prev2;

            // Atualiza prev2 para o valor de prev1 (preparando para a próxima iteração)
            prev2 = prev1;

            // Atualiza prev1 para o valor de current (o número de maneiras atuais)
            prev1 = current;
        }

        // Retorna o número total de maneiras de chegar ao topo (degrau n)
        return current;
    }

}
