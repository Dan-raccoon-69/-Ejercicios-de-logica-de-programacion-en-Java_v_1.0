public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Factorial de un numero
         */

        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println(factorial(9));
        System.out.println(factorial(4));
    }

    public static String factorial(int numero) {
        int factorial = 1, i;
        for (i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        return "Factorial de " + numero + " es: " + factorial;
    }
}
