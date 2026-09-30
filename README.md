# 🌳 Árvore Binária de Busca (BST)

Implementação de uma **Árvore Binária de Busca** em **Java**, com menu interativo no terminal. O programa permite inserir e buscar valores, percorrer a árvore de cinco formas diferentes, calcular a altura e visualizar a estrutura hierárquica.

Projeto desenvolvido para a disciplina de **Laboratório de Informática 2** (UNIFAN – Centro Educacional Alfredo Nasser), sob orientação do professor Ricardo Vilaverde de Oliveira.

---

## 📌 Sobre o projeto

O objetivo é aplicar na prática os conceitos de:

- Estruturas de dados dinâmicas (nós e referências)
- Recursividade
- Filas (`Queue`) e pilhas (`Stack`)
- Algoritmos de busca e percurso em árvores
- Organização de código em classes com responsabilidades separadas

A árvore mantém a propriedade fundamental de uma BST:

> Para qualquer nó, todos os valores da subárvore esquerda são menores e todos os valores da subárvore direita são maiores.

Valores duplicados **não** são inseridos: o programa avisa que o valor já existe.

---

## ⚙️ Funcionalidades

- [x] Inserir valor (recursivo)
- [x] Buscar valor (versão recursiva e versão iterativa)
- [x] Percurso em pré-ordem (Raiz → Esquerda → Direita)
- [x] Percurso em ordem (Esquerda → Raiz → Direita)
- [x] Percurso em pós-ordem (Esquerda → Direita → Raiz)
- [x] BFS – busca em largura (usa fila)
- [x] DFS – busca em profundidade (usa pilha)
- [x] Calcular a altura da árvore
- [x] Exibir a estrutura hierárquica, marcando raiz (R), esquerda (E) e direita (D)
- [x] Menu interativo com validação de entrada

---

## 🧠 Arquitetura

O projeto tem três classes, cada uma com uma responsabilidade:

| Classe | Responsabilidade |
|--------|------------------|
| `No` | Representa cada elemento da árvore (valor e referências para os filhos) |
| `ArvoreBinariaBusca` | Organiza os nós e implementa inserção, busca, percursos, altura e visualização |
| `Main` | Interage com o usuário por meio do menu |

```text
Main  →  ArvoreBinariaBusca  →  No
```

### Estrutura do nó

```java
public class No {
    int valor;
    No esquerda;
    No direita;

    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}
```

---

## 📂 Estrutura do projeto

```text
Arvore_Binaria_de_Busca/
│
├── src/
│   └── model/
│       ├── Main.java                 # Menu interativo
│       ├── ArvoreBinariaBusca.java   # Lógica da árvore
│       └── No.java                   # Nó da árvore
│
└── README.md
```

> Ajuste esta estrutura se os arquivos do seu repositório estiverem em outro lugar.

---

## 🚀 Como compilar e executar

### Pré-requisitos

- JDK 8 ou superior

### Linha de comando

A partir da pasta `src`:

```bash
javac model/*.java
java model.Main
```

### Pela IDE

Abra o projeto no IntelliJ IDEA (ou outra IDE Java) e execute a classe `Main`.

---

## 🖥️ Exemplo de uso

```text
=========================================
    ARVORE BINARIA DE BUSCA (BST)
=========================================
1. Inserir valor
2. Buscar valor
3. Mostrar Pre-ordem (Raiz -> Esq -> Dir)
4. Mostrar Em ordem (Esq -> Raiz -> Dir)
5. Mostrar Pos-ordem (Esq -> Dir -> Raiz)
6. Mostrar BFS - Busca em Largura
7. Mostrar DFS - Busca em Profundidade
8. Mostrar altura da arvore
9. Mostrar estrutura da arvore
10. Sair
-----------------------------------------
Escolha uma opcao:
```

Entradas inválidas são tratadas: texto no lugar de número gera a mensagem *"Por favor, digite um numero valido."* e uma opção fora de 1 a 10 gera *"Opcao invalida! Tente novamente."*.

---

## 🧪 Exemplo de execução

Inserindo os valores `50, 30, 70, 20, 40, 60, 80`, a árvore fica assim:

```text
        50
       /  \
     30    70
    /  \   /  \
  20   40 60  80
```

| Operação | Resultado |
|----------|-----------|
| Pré-ordem | `50 30 20 40 70 60 80` |
| Em ordem | `20 30 40 50 60 70 80` |
| Pós-ordem | `20 40 30 60 80 70 50` |
| BFS | `50 30 70 20 40 60 80` |
| DFS | `50 30 20 40 70 60 80` |
| Altura | `2` |

O percurso **em ordem** devolve os valores em ordem crescente, propriedade característica da BST.

Como a DFS empilha o filho direito antes do esquerdo, sua saída coincide com a da pré-ordem.

A opção 9 exibe a estrutura assim:

```text
--- Estrutura Hierarquica ---
(R) 50
    |--(E) 30
    |   |--(E) 20
    |   `--(D) 40
    `--(D) 70
        |--(E) 60
        `--(D) 80
-----------------------------
```

---

## 📏 Convenção da altura

A altura é calculada de forma recursiva:

```text
H(n) = 1 + max(H(esquerda), H(direita))
```

- Árvore vazia: `-1`
- Folha (ou árvore com um único nó): `0`

---

## 📊 Complexidade

| Operação | Melhor caso | Caso médio | Pior caso |
|----------|-------------|------------|-----------|
| Busca | O(log n) | O(log n) | O(n) |
| Inserção | O(log n) | O(log n) | O(n) |
| Percursos (pré, em, pós, BFS, DFS) | O(n) | O(n) | O(n) |
| Altura | O(n) | O(n) | O(n) |

> O pior caso de busca e inserção ocorre quando a árvore fica degenerada, parecida com uma lista (por exemplo, ao inserir valores já ordenados).

---

## 🛣️ Próximos passos

Ideias para evoluir o projeto:

- [ ] Remoção de nós
- [ ] Encontrar mínimo e máximo
- [ ] Contar nós
- [ ] Balanceamento (árvore AVL)
- [ ] Testes automatizados com JUnit

---

## 🤝 Contribuições

Contribuições são bem-vindas!

1. Faça um fork do projeto
2. Crie uma branch: `git checkout -b minha-feature`
3. Faça o commit: `git commit -m "feat: minha nova funcionalidade"`
4. Envie: `git push origin minha-feature`
5. Abra um Pull Request

---

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

---

## 👨‍💻 Autor

**Victor Hugo Alves Vaz**

- GitHub: [@victorhugoEngineer](https://github.com/victorhugoEngineer)

