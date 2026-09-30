package model;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            exibirMenu();
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Por favor, digite um numero valido.");
                scanner.next(); // Limpa a entrada inválida
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    int valInserir = scanner.nextInt();
                    arvore.inserir(valInserir);
                    System.out.println("Valor " + valInserir + " inserido.");
                    break;

                case 2:
                    System.out.print("Digite o valor para buscar: ");
                    int valBuscar = scanner.nextInt();
                    if (arvore.buscar(valBuscar)) {
                        System.out.println(">> SUCESSO: O valor " + valBuscar + " FOI ENCONTRADO na arvore.");
                    } else {
                        System.out.println(">> AVISO: O valor " + valBuscar + " NAO FOI ENCONTRADO na arvore.");
                    }
                    break;

                case 3:
                    System.out.print("Percurso Pre-ordem: ");
                    arvore.mostrarPreOrdem();
                    break;

                case 4:
                    System.out.print("Percurso Em ordem: ");
                    arvore.mostrarEmOrdem();
                    break;

                case 5:
                    System.out.print("Percurso Pos-ordem: ");
                    arvore.mostrarPosOrdem();
                    break;

                case 6:
                    System.out.print("Percurso BFS (Busca em Largura): ");
                    arvore.mostrarBFS();
                    break;

                case 7:
                    System.out.print("Percurso DFS (Busca em Profundidade): ");
                    arvore.mostrarDFS();
                    break;

                case 8:
                    arvore.mostrarAltura();
                    break;

                case 9:
                    arvore.mostrarEstrutura();
                    break;

                case 10:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }
        } while (opcao != 10);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=========================================");
        System.out.println("    ARVORE BINARIA DE BUSCA (BST)");
        System.out.println("=========================================");
        System.out.println("1. Inserir valor");
        System.out.println("2. Buscar valor");
        System.out.println("3. Mostrar Pre-ordem (Raiz -> Esq -> Dir)");
        System.out.println("4. Mostrar Em ordem (Esq -> Raiz -> Dir)");
        System.out.println("5. Mostrar Pos-ordem (Esq -> Dir -> Raiz)");
        System.out.println("6. Mostrar BFS - Busca em Largura");
        System.out.println("7. Mostrar DFS - Busca em Profundidade");
        System.out.println("8. Mostrar altura da arvore");
        System.out.println("9. Mostrar estrutura da arvore");
        System.out.println("10. Sair");
        System.out.println("-----------------------------------------");
        System.out.print("Escolha uma opcao: ");
    }
}