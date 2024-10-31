public class Ex_1446_ConsecutiveCharacters {

    public static final String OUTPUT = "Saída: ";

    public static void main(String[] args) {
        // Entrada: s = "leetcode"
        System.out.println(OUTPUT + maxPower("leetcode"));
        // Entrada: s = "abbcccddddeeeeedcba"
        System.out.println(OUTPUT + maxPower("abbcccddddeeeeedcba"));
    }

    //Método que calcula a "potência máxima" de uma string s.
    public static int maxPower(String s) {
        System.out.println("Entrada: " + s);

        // Variável para armazenar o comprimento máximo de uma substring com um único caractere
        int maxPower = 1;
        // Variável para contar o comprimento atual da substring com o mesmo caractere
        int currentPower = 1;
        // Caractere anterior inicializado como o primeiro caractere da string
        char previousChar = s.charAt(0);

        // Itera sobre a string a partir do segundo caractere
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Verifica se o caractere atual é igual ao anterior
            if (currentChar == previousChar) {
                currentPower++;
            } else {
                // Atualiza o comprimento máximo e reinicia o comprimento atual
                maxPower = Math.max(maxPower, currentPower);
                currentPower = 1;
                previousChar = currentChar;
            }
        }

        // Atualização final do comprimento máximo, caso a maior substring esteja no final
        return Math.max(maxPower, currentPower);
    }

}
