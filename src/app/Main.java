package app;

import financeiro.Imposto;
import financeiro.Pagamento;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        char opcao;
        char confirmacao = 's';
        
        Scanner input = new Scanner(System.in);
        Pagamento impostoPago =  new Pagamento();
        
        do{
            Imposto imposto = new Imposto();
            
            System.out.println("\t--Pagamento de Impostos--");
            System.out.println("Informe o nome da empresa:");
            imposto.setEmpresa(input.next());
            System.out.println("Informe o tipo de imposto: P - PIS / I - IPI");
            opcao = input.next().charAt(0);
            
            if(opcao  == 'P' || opcao  == 'p'){
                imposto.setImposto("PIS");
            }else if(opcao == 'I'|| opcao  == 'i'){
                imposto.setImposto("IPI");
            }
            
            switch(opcao){
                case 'P','p':
                    System.out.println("Insira o valor do débito:");
                    imposto.setDebito(input.nextDouble());
                    System.out.println("Insira o valor do crédito:");
                    imposto.setCredito(input.nextDouble());
                    
                    impostoPago.adicionarNaLista(imposto);
                    break;
                case 'I','i':
                    System.out.println("Infome as informações sobre o produto:\n"
                            + "Valor do produto:");
                    imposto.setValor_produto(input.nextDouble());
                    System.out.println("Informe o valor do frete:");
                    imposto.setFrete(input.nextDouble());
                    System.out.println("Informe o valor do seguro:");
                    imposto.setSeguro(input.nextDouble());
                    System.out.println("Informe o valor das despesas:");
                    imposto.setDespesas(input.nextDouble());
                    System.out.println("Informe o valor da alíquota(%):");
                    imposto.setAliquota(input.nextDouble());
                    
                    impostoPago.adicionarNaLista(imposto);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
                      
            System.out.println("Informar outro imposto? s/n");
            confirmacao =  input.next().charAt(0);
            
        }while(confirmacao == 's');
        
        System.out.println("\t--Lista de impostos cadastrados--");
        impostoPago.listar();
        
    }
}
