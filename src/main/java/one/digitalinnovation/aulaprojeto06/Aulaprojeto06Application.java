package one.digitalinnovation.aulaprojeto06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.*;
import java.util.Scanner;

@SpringBootApplication
public class Aulaprojeto06Application {
	//trabalhando com laços de repetição
	public static void main(String[] args) {
		SpringApplication.run(Aulaprojeto06Application.class, args);
		Scanner ler = new Scanner(System.in);
		int numeroDePessoas;
		System.out.println("-- Cadastro de Pessoas --");
		System.out.println("Quantas pessoas deseja cadastrar ?");
		numeroDePessoas=ler.nextInt();
		if (numeroDePessoas>0){
			System.out.println("vamos iniciar o cadastro!");
			Pessoas[] arrayPessoas = new Pessoas[numeroDePessoas];
			int ii=1;
			for (int i=0;i<numeroDePessoas;i++){
				int idade;String nome;float peso;
				System.out.println("Pessoa "+ii+" :");
				System.out.println("Nome: ");
				nome=ler.next();
				System.out.println("Idade: ");
				idade=ler.nextInt();
				System.out.println("Peso: ");
				peso=ler.nextFloat();
				arrayPessoas[i] = new Pessoas(idade,nome,peso);
				ii++;
			}
			String yesOrNo;
			System.out.println("Exibir pessoas cadastradas? s/n");
			yesOrNo = ler.next();
			if (yesOrNo.equals("s")){

				for (Pessoas exibir:arrayPessoas) {
					System.out.println("Nome: "+exibir.getNome());
					System.out.println("Idade: "+exibir.getIdade());
					System.out.println("Peso: "+exibir.getPeso());
					System.out.println("-------------------------");

				}
				System.exit(0);

				}else{
				System.exit(0);
			}
		}else {
			System.exit(0);
		}

	}





}
