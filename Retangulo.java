public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double altura, double largura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return  largura * altura;
    }
}
