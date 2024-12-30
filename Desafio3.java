package Desafio;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Desafio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] adicionar_codigo = new int[3];
        String[] adicionar_nome = new String[3];
        String[] adicionar_descricao = new String[3];
        int[] adicionar_quantidade = new int[3];
        int informacao;
        int opcoes;
        int contador = 0;
        String nome;

        while (true){

            try{
                System.out.println("----Bem vindo ao sistema da loja----");
                System.out.println("1- Cadastrar produto ");
                System.out.println("2- Visualizar produtos já cadastrados ");
                System.out.println("3- Editar produto ");
                System.out.println("4- Excluir produto ");
                System.out.println("5- Sair");
                System.out.println("Informe a opção que deseja:");
                opcoes = input.nextInt();

                if (opcoes < 1 || opcoes > 6){
                    System.out.println("Erro!! Informe um numero entre 1 e 6");
                    continue;
                }

            }catch (InputMismatchException e){
                System.out.println("Digite um valor válido!");
                input.nextLine();
                continue;
            }

            switch (opcoes){

                case 1:

                    if (contador < adicionar_codigo.length && contador < adicionar_nome.length && contador < adicionar_descricao.length && contador < adicionar_quantidade.length){

                        System.out.println("Informe o codigo do produto: ");
                        adicionar_codigo[contador] = input.nextInt();
                        input.nextLine();

                        System.out.println("Informe o nome do produto");
                        adicionar_nome[contador] = input.nextLine();

                        System.out.println("Informe a descricao do produto");
                        adicionar_descricao[contador] = input.nextLine();

                        System.out.println("Informe a quantidade do produto");
                        adicionar_quantidade[contador] = input.nextInt();
                        contador++;

                    }else {
                        System.out.println("Não é mais possível adicionar pois passou do range do array!!");
                        continue;
                    }
                    break;

                case 2:

                    for (int i = 0; i < contador; i++) {

                        if (adicionar_nome[i] != null && adicionar_codigo[i] != 0){
                            System.out.println("Codigo do produto "+adicionar_codigo[i]+" que é um(a) "+adicionar_nome[i]+
                                    " que é para "+adicionar_descricao[i]+" na quantidade de "+adicionar_quantidade[i]+" unidade(s)");
                        }
                    }
                    break;

                case 3:

                    for (int i = 0; i < contador; i++) {

                        if (adicionar_nome[i] != null && adicionar_codigo[i] != 0){
                            System.out.println("Codigo do produto "+adicionar_codigo[i]+" que é um(a) "+adicionar_nome[i]+
                                    " que é para "+adicionar_descricao[i]+" na quantidade de "+adicionar_quantidade[i]+" unidade(s)");
                        }
                    }

                    System.out.println("----O que você deseja mudar----");
                    System.out.println("----1. Codigo----");
                    System.out.println("----2. Nome----");
                    System.out.println("----3. Descrição----");
                    System.out.println("----4. Quantidade----");
                    informacao = input.nextInt();

                    switch (informacao){

                        case 1:

                            System.out.println("Qual produto você deseja mudar o codigo?");
                            nome = input.next();

                            boolean encontrado = false;

                            for (int i = 0; i < contador; i++) {
                                if (adicionar_nome[i] != null && adicionar_nome[i].equals(nome)) {
                                    System.out.println("Informe o novo código para o produto " + nome + ":");
                                    int novo_codigo = input.nextInt();
                                    adicionar_codigo[i] = novo_codigo;
                                    System.out.println("Código novo registrado com sucesso!");
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Nome do produto não encontrado. Favor digitar um produto que está cadastrado!");
                            }
                            break;

                        case 2:
                            System.out.println("Qual produto você deseja mudar o nome?");
                            nome = input.next();

                            boolean encontrado2 = false;

                            for (int i = 0; i < contador; i++) {
                                if (adicionar_nome[i] != null && adicionar_nome[i].equals(nome)) {
                                    System.out.println("Informe o novo nome para o produto " + nome + ":");
                                    String novo_nome = input.next();
                                    adicionar_nome[i] = novo_nome;
                                    System.out.println("Nome novo registrado com sucesso!");
                                    encontrado2 = true;
                                    break;
                                }
                            }
                            if (!encontrado2) {
                                System.out.println("Nome do produto não encontrado. Favor digitar um produto que está cadastrado!");
                            }
                            break;

                        case 3:
                            System.out.println("Qual produto você deseja mudar a descrição?");
                            nome = input.next();

                            boolean encontrado3 = false;

                            for (int i = 0; i < contador; i++) {
                                if (adicionar_nome[i] != null && adicionar_nome[i].equals(nome)) {
                                    System.out.println("Informe a nova descrição para o produto " + nome + ":");
                                    String nova_descricao = input.next();
                                    adicionar_descricao[i] = nova_descricao;
                                    System.out.println("Descrição nova registra com sucesso!");
                                    encontrado3 = true;
                                    break;
                                }
                            }
                            if (!encontrado3) {
                                System.out.println("Nome do produto não encontrado. Favor digitar um produto que está cadastrado!");
                            }
                            break;

                        case 4:
                            System.out.println("Qual produto você deseja mudar a quantidade");
                            nome = input.next();

                            boolean encontrado4 = false;

                            for (int i = 0; i < contador; i++) {
                                if (adicionar_nome[i] != null && adicionar_nome[i].equals(nome)) {
                                    System.out.println("Informe a nova quantidade para o produto " + nome + ":");
                                    int nova_quantidade = input.nextInt();
                                    adicionar_quantidade[i] = nova_quantidade;
                                    System.out.println("Nome novo registrado com sucesso!");
                                    encontrado4 = true;
                                    break;
                                }
                            }
                            if (!encontrado4) {
                                System.out.println("Nome do produto não encontrado. Favor digitar um produto que está cadastrado!");
                            }
                    }
                    break;

                case 4:

                    for (int i = 0; i < contador; i++) {

                        if (adicionar_nome[i] != null && adicionar_codigo[i] != 0){
                            System.out.println("Codigo do produto "+adicionar_codigo[i]+" que é um(a) "+adicionar_nome[i]+
                                    " que é para "+adicionar_descricao[i]+" na quantidade de "+adicionar_quantidade[i]+" unidade(s)");
                        }
                    }

                    System.out.println("Qual produto você deseja excluir?");
                    nome = input.next();

                    boolean encontrado5 = false;

                    for (int i = 0; i < contador; i++) {
                        if (adicionar_nome[i] != null && adicionar_nome[i].equals(nome)){
                            adicionar_nome[i] = null;
                            adicionar_codigo[i] = 0;
                            adicionar_descricao[i] = null;
                            adicionar_quantidade[i] = 0;
                            encontrado5 = true;
                            System.out.println("Produto foi apagado!");
                            break;
                        }
                    }if(!encontrado5) {
                    System.out.println("Nome do produto não encontrado. Favor digitar um produto que está cadastrado!");
                }
                break;

                default:
                    System.out.println("Saindo do programa....");
                    input.close();
                    return;
            }

        }
    }
}

