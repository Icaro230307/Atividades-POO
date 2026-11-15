package model;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, Float comprimento, int patas, String cor, String ambiente, Float velocidade, String alimento) {
        
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override 
    public void dados(){
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
    
    
}
