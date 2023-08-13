public class FatorialPrincipal {

    public static void main(String[] args) {
        FatorialController controller = new FatorialController();
        int n = 10; // Número para calcular o fatorial
        int fatorial = controller.calcularFatorial(n);
        System.out.println("Fatorial de " + n + ": " + fatorial);
    }
}
