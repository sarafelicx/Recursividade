public class RecursivaController {

    public int calcularSomatorio(int n) {
        // Condição de parada: se n for menor ou igual a 0, retorna 0
        if (n <= 0) {
            return 0;
        } else {
            // Relação de chamada: chama a função recursivamente com n-1 e soma com n
            return n + calcularSomatorio(n - 1);
        }
    }
}
