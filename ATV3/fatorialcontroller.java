public class FatorialController {

    public int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            // Condição de parada: fatorial de 0 e 1 é 1
            return 1;
        } else {
            // Fórmula recursiva: fatorial(n) = n * fatorial(n-1)
            return n * calcularFatorial(n - 1);
        }
    }
}
