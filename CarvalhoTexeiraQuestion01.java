/**
 * 1. Faça um programa que dada a idade de uma pessoa verifique sua classe eleitoral:
 * • menor que 16 anos não pode votar;
 * • com 16 ou 17 anos ou mais que 65 anos, votar é facultativo;
 * • entre 18 e 65 anos (inclusive), votar é obrigatório.
 */

import java.util.Scanner; //Importando o 'método' que permitirar a leitura das informações

public class CarvalhoTexeiraQuestion01{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //Declarando uma variável Scanner 
        String name; //Nome do eleitor
        int age; //Idade do eleitor

        System.out.println("Verificar a sua classe elitoral");
        System.out.println("Informe o sue nome: ");
        name = ler.nextLine(); //Variável NAME recebe o nome do eleitor
        System.out.println("Informe a sua idade: ");
        age = ler.nextInt(); //Variável AGE recebe a idade do eleitor

        System.out.println();
        System.out.println("Imprimindo resultados:"); //Imprimindo os dados
        System.out.println("Nome: " + name); 
        System.out.println("Idade: " + age);
        //Uso do If Else
        if (age < 16) { //Caso o eleitor seja menor de 16
            System.out.println("Classe eleitoral: Ainda não pode votar");
        }
        else if (age >= 18 && age <= 65){ //Caso o eleitor tenha entre 18 e 65
            System.out.println("Classe eleitoral: Voto obrigatorio");
        }
         else{ //Caso o eleitor tenha idade igual ou superior a 16 e menor que 18 ou tenha idade superior a 65
            System.out.println("Classe eleitoral: Voto facultativo");
        }
    }
}