public class FatorialPrincipal {

    public static void main(String[] args) {
        RecursionController controller = new RecursionController();
        int n = 10; // Número para calcular o fatorial
        int fatorial = controller.calcularFatorial(n);
        System.out.println("Fatorial de " + n + ": " + fatorial);
    }
}
