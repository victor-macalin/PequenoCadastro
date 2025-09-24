package Cadastro;

import java.util.Scanner;

public class CadastroJava {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        String[] pessoas = new String[5];

//        contadores
        int pessoasCadastrados = 0;
        int opcoes = 0;


        do {

            System.out.println("=========== Menu Cadastro de Vagas ============");
            System.out.println("1. Cadastrar-se para vaga");
            System.out.println("2. Listar de pessoas cadastradas");
            System.out.println("3. Sair");
            opcoes = teclado.nextInt();
            teclado.nextLine();

            switch (opcoes) {
                case 1:

                    if (pessoasCadastrados < pessoas.length) {
                        System.out.println("Digite seu nome:");
                        String nome = teclado.nextLine();
                        pessoas[pessoasCadastrados] = nome;
                        pessoasCadastrados++;
                        System.out.println("Cadastro realizado com sucesso.");

                    } else {
                        System.out.println("A lista de cadastro esta lotada.");
                    }
                    break;
                case 2:
                    if (pessoasCadastrados == 0) {
                        System.out.println("Ainda não tem pessoas cadastradas.");
                    } else {
                        for (String pessoa : pessoas) {
                            System.out.println(pessoa);
                        }
                    }
                    break;
                case 3:
                    for (String pessoa : pessoas) {
                        System.out.println(pessoa);
                    }
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Essa opção é invalida.");
            }

            }while (opcoes != 3);
        }
    }