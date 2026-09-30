# 🌳 Árvore Binária de Busca (BST)

Implementação de uma **Árvore Binária de Busca** em linguagem C, com operações fundamentais de inserção, remoção, busca e percursos.

---

## 📌 Sobre o projeto

Este projeto tem como objetivo implementar uma **Árvore Binária de Busca (Binary Search Tree - BST)**, aplicando conceitos de:

- Estruturas de dados dinâmicas
- Ponteiros e alocação dinâmica de memória
- Recursividade
- Complexidade de algoritmos

A árvore mantém a propriedade fundamental de BST:

> Para qualquer nó, todos os valores da subárvore esquerda são menores, e todos os valores da subárvore direita são maiores.

---

## ⚙️ Funcionalidades

- [x] Inserir nó
- [x] Buscar nó
- [x] Remover nó
- [x] Percurso em ordem (in-order)
- [x] Percurso pré-ordem (pre-order)
- [x] Percurso pós-ordem (post-order)
- [x] Encontrar mínimo e máximo
- [x] Calcular altura da árvore
- [x] Contar nós
- [x] Liberar memória da árvore

---

## 📂 Estrutura do projeto

```bash
Arvore_Binaria_de_Busca/
│
├── src/
│   ├── main.c          # Arquivo principal (menu / testes)
│   ├── arvore.c        # Implementação das funções da árvore
│   └── arvore.h        # Definições de estruturas e protótipos
│
├── Makefile            # Automação de compilação
└── README.md           # Documentação do projeto
```

> Ajuste esta estrutura conforme os arquivos reais do seu repositório.

---

## 🧠 Estrutura de dados

```c
typedef struct No {
    int valor;
    struct No *esquerda;
    struct No *direita;
} No;
```

---

## 🚀 Como compilar e executar

### Pré-requisitos

- GCC instalado
- Make (opcional)

### Compilação manual

```bash
gcc src/*.c -o arvore
```

### Compilação com Makefile

```bash
make
```

### Executar

```bash
./arvore
```

---

## 🖥️ Exemplo de uso

```text
===== ÁRVORE BINÁRIA DE BUSCA =====
1 - Inserir
2 - Buscar
3 - Remover
4 - Exibir em ordem
5 - Exibir pré-ordem
6 - Exibir pós-ordem
7 - Altura da árvore
8 - Sair
Escolha uma opção:
```

---

## 📊 Complexidade

| Operação | Melhor caso | Caso médio | Pior caso |
|----------|-------------|------------|-----------|
| Busca    | O(log n)    | O(log n)   | O(n)      |
| Inserção | O(log n)    | O(log n)   | O(n)      |
| Remoção  | O(log n)    | O(log n)   | O(n)      |

> O pior caso ocorre quando a árvore se torna degenerada (semelhante a uma lista).

---

## 🧪 Testes

Exemplo de sequência de valores para teste:

```text
50, 30, 70, 20, 40, 60, 80
```

Resultado esperado do percurso **em ordem**:

```text
20 30 40 50 60 70 80
```

---

## 🤝 Contribuições

Contribuições são bem-vindas!

1. Faça um fork do projeto
2. Crie uma branch: `git checkout -b minha-feature`
3. Commit: `git commit -m "feat: minha nova funcionalidade"`
4. Push: `git push origin minha-feature`
5. Abra um Pull Request

---

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.

---

## 👨‍💻 Autor

**Victor Hugo**

- GitHub: [@victorhugoEngineer](https://github.com/victorhugoEngineer)
