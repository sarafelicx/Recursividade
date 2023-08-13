public class atv1 {

    public static void main(String[] args) {
        RecursivaController controller = new RecursivaController();
        int n = 5; // Número de naturais para calcular o somatório
        int resultado = controller.calcularSomatorio(n);
        System.out.println("Somatório dos " + n + " primeiros números naturais: " + resultado);
    }
}

