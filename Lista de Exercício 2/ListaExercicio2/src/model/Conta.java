package model;

public class Conta {

    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, Data dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void sacar(double valor) {
        saldo -= valor; 
    }

    public void depositar(double valor) {
        saldo += valor; 
    }

    public double calcularRendimento() {
        return saldo * 0.1; 
    }

    public String recuperaDadosParaImpressao() {
        return "Titular: " + titular
               + "\nNúmero: " + numero
               + "\nAgência: " + agencia
               + "\ndata de abertura: " + dataAbertura
               + "\nSaldo: " + saldo;

    }
}