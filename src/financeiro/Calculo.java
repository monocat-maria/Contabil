
package financeiro;

public interface Calculo {
    public double calcularImposto(double debito,double credito,double pis);
    public double calcularImposto(double valor_produto,double frete,double seguro,double despesas,double aliquota,double ipi);
}
