public class Atv2Controller {

    public int encontrarMenorValor(int[] vetor, int posicao, int primeiroMenorValor) {
        // Condição de parada: quando a posição for menor que 0, retorna o primeiro menor valor
        if (posicao < 0) {
            return primeiroMenorValor;
        } else {
            // Relação de chamada: compara o valor na posição atual com o menor valor até agora,
            // atualizando o menor valor se necessário, e chama a função recursivamente com a próxima posição
            int valorAtual = vetor[posicao];
            int menorAteAgora = Math.min(valorAtual, primeiroMenorValor);
            return encontrarMenorValor(vetor, posicao - 1, menorAteAgora);
        }
    }
}
