package financeiro;

import java.util.ArrayList;

public class Pagamento {
    private String empresa;
    private ArrayList<Imposto> lista_impostos = new ArrayList();

    public Pagamento(String empresa) {
        this.empresa = empresa;
    }

    public Pagamento() {
        
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public void adicionarNaLista(Imposto p) {
        this.lista_impostos.add(p);
    }
    
    public void listar() {
        for(int i = 0;i < lista_impostos.size();i++){
            System.out.println((i + 1) + " - Imposto tipo " + this.lista_impostos.get(i).getImposto());
            if(this.lista_impostos.get(i).getImposto().equals("PIS")){
                System.out.println("Nome da empresa:" + this.lista_impostos.get(i).getEmpresa());
                System.out.println("Valor imposto: R$" + this.lista_impostos.get(i).calcularImposto(this.lista_impostos.get(i).getDebito(),this.lista_impostos.get(i).getCredito(), 0) + "\n");
            }else if(this.lista_impostos.get(i).getImposto().equals("IPI")){
                System.out.println("Nome da empresa:" + this.lista_impostos.get(i).getEmpresa());
                System.out.println("Valor imposto: R$:" + this.lista_impostos.get(i).calcularImposto(this.lista_impostos.get(i).getValor_produto(), this.lista_impostos.get(i).getFrete(),this.lista_impostos.get(i).getSeguro(),this.lista_impostos.get(i).getDespesas(),this.lista_impostos.get(i).getAliquota(),0) + "\n");               
            }        
        }
    }  
}
