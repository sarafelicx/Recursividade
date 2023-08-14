public class SomatoriaController {

    public double calcularSomatoria(int n) {
        if (n == 1) {
            // Condição de parada: quando n é igual a 1, retorna 1
            return 1.0;
        } else {
            // Relação de chamada: calcula 1/n e soma com a chamada recursiva para n-1
            double termoAtual = 1.0 / n;
            return termoAtual + calcularSomatoria(n - 1);
        }
    }
}
