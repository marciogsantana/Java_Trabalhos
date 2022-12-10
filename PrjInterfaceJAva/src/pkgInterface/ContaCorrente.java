/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgInterface;

/**
 *
 * @author Professor
 */
public class ContaCorrente {
    private int numero, agencia;
    private double saldo;
    
    public ContaCorrente(int numero,
            int agencia)
    {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
    }
    
    public void depositar(double valor)
    {
        setSaldo(getSaldo() + valor);
    }
    
    public void sacar(double valor)
    {
        setSaldo(getSaldo() - valor);
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the agencia
     */
    public int getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
