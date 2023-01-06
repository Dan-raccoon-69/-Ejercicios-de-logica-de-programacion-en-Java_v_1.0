public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(restarSinRestar(5, 1));
        
    }

    public static int restarSinRestar(int valor1, int valor2){
        return valor1 + ((-1)*valor2);
    }
}
