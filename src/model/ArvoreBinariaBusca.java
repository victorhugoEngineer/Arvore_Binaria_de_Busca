package model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArvoreBinariaBusca {
    private No raiz;

    public ArvoreBinariaBusca() {
        this.raiz = null;
    }

    // Inserção mantendo as propriedades da BST (Recursivo)
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }
        if (valor < no.valor) {
            no.esquerda = inserirRecursivo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRecursivo(no.direita, valor);
        } else {
            System.out.println(">> O valor " + valor + " ja existe na arvore (duplicados ignorados).");
        }
        return no;
    }

    // Busca Recursiva
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(No no, int valor) {
        if (no == null) return false;
        if (no.valor == valor) return true;
        if (valor < no.valor) return buscarRecursivo(no.esquerda, valor);
        return buscarRecursivo(no.direita, valor);
    }

    // Busca Iterativa (Alternativa)
    public boolean buscarIterativo(int valor) {
        No atual = raiz;
        while (atual != null) {
            if (atual.valor == valor) return true;
            if (valor < atual.valor) atual = atual.esquerda;
            else atual = atual.direita;
        }
        return false;
    }

    // Percurso Pré-ordem: Raiz -> Esquerda -> Direita
    public void mostrarPreOrdem() {
        if (raiz == null) {
            System.out.println("Arvore vazia.");
        } else {
            preOrdemRecursivo(raiz);
            System.out.println();
        }
    }

    private void preOrdemRecursivo(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdemRecursivo(no.esquerda);
            preOrdemRecursivo(no.direita);
        }
    }

    // Percurso Em Ordem: Esquerda -> Raiz -> Direita
    public void mostrarEmOrdem() {
        if (raiz == null) {
            System.out.println("Arvore vazia.");
        } else {
            emOrdemRecursivo(raiz);
            System.out.println();
        }
    }

    private void emOrdemRecursivo(No no) {
        if (no != null) {
            emOrdemRecursivo(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdemRecursivo(no.direita);
        }
    }

    // Percurso Pós-ordem: Esquerda -> Direita -> Raiz
    public void mostrarPosOrdem() {
        if (raiz == null) {
            System.out.println("Arvore vazia.");
        } else {
            posOrdemRecursivo(raiz);
            System.out.println();
        }
    }

    private void posOrdemRecursivo(No no) {
        if (no != null) {
            posOrdemRecursivo(no.esquerda);
            posOrdemRecursivo(no.direita);
            System.out.print(no.valor + " ");
        }
    }

    // BFS - Busca em Largura (Utilizando Fila - Queue)
    public void mostrarBFS() {
        if (raiz == null) {
            System.out.println("Arvore vazia.");
            return;
        }
        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");

            if (atual.esquerda != null) fila.add(atual.esquerda);
            if (atual.direita != null) fila.add(atual.direita);
        }
        System.out.println();
    }

    // DFS - Busca em Profundidade (Utilizando Pilha - Stack)
    public void mostrarDFS() {
        if (raiz == null) {
            System.out.println("Arvore vazia.");
            return;
        }
        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            System.out.print(atual.valor + " ");

            // Empilha o filho direito primeiro para processar a esquerda antes
            if (atual.direita != null) pilha.push(atual.direita);
            if (atual.esquerda != null) pilha.push(atual.esquerda);
        }
        System.out.println();
    }

    // Solução Recursiva para calcular a Altura da Árvore
    // Convenção: árvore de 1 nó tem altura 0; árvore vazia tem altura -1.
    public void mostrarAltura() {
        if (raiz == null) {
            System.out.println("Arvore vazia (Altura: -1)");
        } else {
            System.out.println("Altura da arvore: " + calcularAlturaRecursivo(raiz));
        }
    }

    private int calcularAlturaRecursivo(No no) {
        if (no == null) {
            return -1;
        }
        return 1 + Math.max(calcularAlturaRecursivo(no.esquerda), calcularAlturaRecursivo(no.direita));
    }

    // Visualização da estrutura hierárquica identificando Esquerda (E) e Direita (D)
    public void mostrarEstrutura() {
        if (raiz == null) {
            System.out.println("Arvore vazia.");
            return;
        }
        System.out.println("\n--- Estrutura Hierarquica ---");
        System.out.println("(R) " + raiz.valor);
        exibirEstruturaRecursivo(raiz.esquerda, "    ", true);
        exibirEstruturaRecursivo(raiz.direita, "    ", false);
        System.out.println("-----------------------------");
    }

    private void exibirEstruturaRecursivo(No no, String prefixo, boolean ehEsquerda) {
        if (no != null) {
            System.out.print(prefixo);
            System.out.print(ehEsquerda ? "|--(E) " : "`--(D) ");
            System.out.println(no.valor);

            exibirEstruturaRecursivo(no.esquerda, prefixo + (ehEsquerda ? "|   " : "    "), true);
            exibirEstruturaRecursivo(no.direita, prefixo + (ehEsquerda ? "|   " : "    "), false);
        }
    }
}