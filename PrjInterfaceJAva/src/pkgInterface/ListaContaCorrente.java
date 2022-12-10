/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgInterface;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Professor
 */
public class ListaContaCorrente {
    private ContaCorrente vetConta[];
    
    private int ultimo, posAtual;
    
    public ListaContaCorrente()
    {
        vetConta = new ContaCorrente[100];
        ultimo = 0;
        posAtual = 0;
    }
    
    public void insereConta(ContaCorrente cc)
    {
        posAtual = ultimo;
        vetConta[ultimo] = cc;
        ultimo++;
    }
    
    public ContaCorrente primeira(){
        posAtual = 0;
        return vetConta[0];
    }

    public ContaCorrente proxima(){
        if (posAtual < ultimo)
        {
            posAtual++;
            return vetConta[posAtual];
        }
        else
            return null;
    }

    public ContaCorrente anterior(){
        if (posAtual > 0)
        {
            posAtual--;
            return vetConta[posAtual];
        }
        else
            return null;
    }
    
    public ContaCorrente ultima(){
        posAtual = ultimo - 1;
        return vetConta[ultimo-1];
    }
    
    public void GravarArquivo(String nomeArquivo)
    {
        Formatter saida;
        try {
            saida = new Formatter(nomeArquivo);
            ContaCorrente cc;
            
            for (int i = 0; i < ultimo; i++)
            {
                cc = vetConta[i];
                
                saida.format("%d %d %.2f\n", 
                        cc.getNumero(),
                        cc.getAgencia(),
                        cc.getSaldo());
            }
            saida.close();
        } // fim do try
        catch (Exception minhaExcecao) {
            System.err.println("Erro ao tentar abrir o arquivo!");
            System.exit(1);
        }// fim do catch		
    }

    public void CarregarArquivo(String nomeArquivo){
        Scanner entrada;
        try {
            entrada = new Scanner(new File(nomeArquivo));

            int numero, agencia;
            double saldo;
            ContaCorrente cc;
            
            while (entrada.hasNext()) {
                numero = entrada.nextInt();
                agencia = entrada.nextInt();
                saldo = entrada.nextDouble();
                cc = new ContaCorrente(numero, agencia);
                cc.setSaldo(saldo);
                insereConta(cc);
            } // fim do while
            entrada.close();
        } // fim do try
        catch (Exception minhaExcecao) {
                System.err.println("Erro ao tentar abrir o arquivo!");
                System.exit(1);
        }// fim do catch		
        
    }

}
