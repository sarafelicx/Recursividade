public class ContagemController {

    public int contarNegativos(int[] vetor, int posicao) {
        if (posicao < 0) {
            // Condição de parada: retorna 0 quando a posição chega ao início do vetor
            return 0;
        } else {
            // Relação de chamada: soma 1 ao total de negativos se o valor atual for negativo
            // e chama a função recursivamente com a posição anterior
            int valorAtual = vetor[posicao];
            int totalAteAgora = contarNegativos(vetor, posicao - 1);
            if (valorAtual < 0) {
                return totalAteAgora + 1;
            } else {
                return totalAteAgora;
            }
        }
    }
}
