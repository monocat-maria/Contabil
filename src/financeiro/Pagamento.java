package financeiro;

import java.util.ArrayList;

public class Pagamento {
    private String empresa;
    private ArrayList<Imposto> lista_impostos = new ArrayList();

    public Pagamento(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
