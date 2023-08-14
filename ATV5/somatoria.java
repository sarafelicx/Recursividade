public class SomatoriaPrincipal {

    public static void main(String[] args) {
        SomatarioController controller = new SomatoriaController();
        int n = 5; // Número inteiro para a somatória
        double resultado = controller.calcularSomatoria(n);
        System.out.println("Resultado da somatória para N = " + n + ": " + resultado);
    }
}
