public class ContagemPrincipal {

    public static void main(String[] args) {
        ContagemController controller = new ContagemController();

        int[] vetor = {-3, 5, -7, 10, -2, -8, 15};
        int totalNegativos = controller.contarNegativos(vetor, vetor.length - 1);
        System.out.println("Total de elementos negativos no vetor: " + totalNegativos);
    }
}
