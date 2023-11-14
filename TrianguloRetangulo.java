public class TrianguloRetangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    public TrianguloRetangulo (double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (largura * altura) / 2;
    }
}
