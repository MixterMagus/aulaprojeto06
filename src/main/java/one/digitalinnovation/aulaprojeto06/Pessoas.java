package one.digitalinnovation.aulaprojeto06;

public class Pessoas {
    private int idade;
    private String nome;
    private float peso;

    public Pessoas(int idade, String nome, float peso){
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
