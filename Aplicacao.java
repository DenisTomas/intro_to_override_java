public class Aplicacao {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo(5, 10);

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Triângulo Retângulo: " + trianguloRetangulo.calcularArea());
    }
}
