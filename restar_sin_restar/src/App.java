public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println(restarSinRestar(5, 1)); // 4
        System.out.println(restarSinRestar(15, 10)); // 5
        System.out.println(restarSinRestar(10, 0)); // 10
        System.out.println(restarSinRestar(10, 20)); // -10
        System.out.println(restarSinRestar(-10, -13)); // 3
        System.out.println(restarSinRestar(-15, -20)); // 5
        System.out.println(restarSinRestar(-4, -3)); // -1
        System.out.println(restarSinRestar(-20, -15)); // -5
        System.out.println(restarSinRestar(-4, 2)); // -6
        System.out.println(restarSinRestar(-4, 3)); // -7
        System.out.println(restarSinRestar(10, -20)); // 30
        System.out.println(restarSinRestar(5, -30)); // 35
        
        System.out.println();
        System.out.println(restarSinRestarV2(5, 1));
        System.out.println(restarSinRestarV2(15, 10));
        System.out.println(restarSinRestarV2(-10, -13));
        System.out.println(restarSinRestarV2(-4, -3));
        System.out.println(restarSinRestarV2(10, -20));
        System.out.println(restarSinRestarV2(5, -30));

    }

    public static int restarSinRestar(int valor1, int valor2) {
        System.out.println("Resta de: " + valor1 + " (-) " + valor2);
        return valor1 + ((-1) * valor2);
    }

    public static int restarSinRestarV2(int valor1, int valor2) {
        System.out.println("Resta de: " + valor1 + " (-) " + valor2);
        int value = 0;
        while (valor1 > valor2) {
            valor2++;
            value++;
        }
        return value;
    }

}
