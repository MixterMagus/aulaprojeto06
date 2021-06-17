package one.digitalinnovation.aulaprojeto06;

public class TesteWhile {

    Pessoas joaozinho = new Pessoas(10, "joãozinho", 10.5f);
    Pessoas mariazinha = new Pessoas(10, "mariazinha", 10.5f);

    public void testeWhileJoaozinho() {
        while (joaozinho.getIdade() < 20) {
            int idade = joaozinho.getIdade();
            System.out.println("Joãozinho tem " + joaozinho.getIdade() + " anos.");
            System.out.println("Joãozinho está crescendo...");
            ++idade;
            joaozinho.setIdade(idade);
        }
    }


    public void testeDoWhileMariazinha(){
        do{
            int idade = mariazinha.getIdade();
            System.out.println();
            System.out.println("Mariazinha tem " + mariazinha.getIdade() + " anos.");
            System.out.println("Mariazinha está crescendo...");
            ++idade;
            mariazinha.setIdade(idade);
            }while(mariazinha.getIdade()<20);

            }
        }

