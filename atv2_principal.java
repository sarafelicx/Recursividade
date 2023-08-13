
import java.swing.*;


public class atv2 {

    public static void main(String[] args) {
        Atv2Controller controller = new Atv2Controller();
        
        int[] vetor = {10, 5, 8, 3, 7};
        int tamanho = vetor.length;
        int primeiroMenorValor = vetor[tamanho - 1];
        
        int menorValor = controller.encontrarMenorValor(vetor, tamanho - 1, primeiroMenorValor);
        System.out.println("Menor valor no vetor: " + menorValor);
    }
}
