package financeiro;

public class Imposto extends Pagamento implements Calculo{
    private double debito;
    private double credito;
    private double aliquota;
    private double valor_produto;
    private double frete;
    private double seguro;
    private double despesas;
    private String imposto;

    public Imposto(double debito, double credito, double aliquota, double valor_produto, double frete, double seguro, double despesas, String imposto, String empresa) {
        super(empresa);
        this.debito = debito;
        this.credito = credito;
        this.aliquota = aliquota;
        this.valor_produto = valor_produto;
        this.frete = frete;
        this.seguro = seguro;
        this.despesas = despesas;
        this.imposto = imposto;
    }

    public double getDebito() {
        return debito;
    }

    public double getCredito() {
        return credito;
    }

    public double getAliquota() {
        return aliquota;
    }

    public double getValor_produto() {
        return valor_produto;
    }

    public double getFrete() {
        return frete;
    }

    public double getSeguro() {
        return seguro;
    }

    public double getDespesas() {
        return despesas;
    }

    public String getImposto() {
        return imposto;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public void setImposto(String imposto) {
        this.imposto = imposto;
    }

    @Override
    public double calcularImposto(double debito, double credito, double pis) {
        return pis;
    }

    @Override
    public double calcularImposto(double valor_produto, double frete, double seguro, double despesas, double aliquota, double ipi) {
        return ipi;
    }
    
    
    
    
    
    
    
}
