# Estrutura_Dados

Conteúdo das aulas e exercícios propostos na matéria, cursada no 3º semestre do curso de análise e desenvolvimento de sistemas.

## Configuração do projeto

Todas as aulas e exercícios foram feitos utilizando as seguintes ferramentas:
* [Eclipse-JEE](https://www.eclipse.org/downloads/packages/release/2020-12/r/eclipse-ide-enterprise-java-developers) - versão 2018-12

## Informações gerais

### [ED_Aula_1](ED_Aula_1/src/controller/metodos.java)
Exemplos de algorítmos de busca em vetores. Temos um algorítmo que busca o maior número em um vetor, e um segundo que pesquisa se um número específico existe no vetor

### ED_Aula_2 
Nesta aula aprendemos a manipular classes e métodos de forma melhor, o conceito do tipo `Object`, alocação dinâmica de memória e como construir uma estrutura 
de lista com seus devidos métodos utilizando um vetor.
 
- O arquivo [Exemplos](ED_Aula_2/src/Exemplos.java) contém um método simples para imprimir no console um `Object`, o que faz com que o Java imprima por padrão seu endereço de memória, o método foi 
criado para exemplificar e auxiliar no conceito de ponteiros. Além dele temos um método que faz a soma dos números pares entre 0 e o número informado, apenas para 
demonstrar a diferença entre métodos públicos, privados e estáticos

- O arquivo [Vetor](ED_Aula_2/src/controller/Vetor.java) contém a construção do Objeto vetor com suas devidas variáveis e métodos para funcionar como uma lista

- O arquivo [Aluno](ED_Aula_2/src/model/Aluno.java) contém uma entidade simples que será gravada no vetor de Objetos
 
- O arquivo [Principal](ED_Aula_2/src/view/Principal.java) cria uma nova instância de vetor e o preenche com alguns alunos, utilizando alguns métodos para exemplificar o funcionamento e interação entre as classes
 
### [ED_Recursivas](ED_Recursivas/src/controller/Metodos.java)
Tivemos uma aula apenas para reforçar o conceito de funções recursivas, e foram passados alguns algorítmos para exemplificar as diferenças no tempo de execução de cada função.
Os métodos apresentados foram: busca linear, pesquisa binária, pesquisa binária recursiva, soma linear recursiva, soma binária recursiva e maior recursiva

### [ED_Ex4_Lista](https://github.com/juliobarcellos/Estrutura_Dados/tree/master/ED_Ex4_Lista/src)
Crie uma Lista Ligada em Java do tipo Aluno.
- A classe [Aluno](ED_Ex4_Lista/src/controller/Aluno.java) deve conter um número de matrícula, nome, disciplina, notas 1, 2 e 3 e o ponteiro para o próximo livro;
- A classe [ListaLigada](ED_Ex4_Lista/src/controller/LinkedListS.java) deve conter os métodos abaixo:
  - Inicializar uma nova lista (construtor);
  - Adicionar um aluno no início da lista;
  - Adicionar um aluno em uma posição específica;
  - Remover um aluno do início da lista;
  - Remover um aluno de uma posição específica;
  - Listar os alunos cadastrados;
  - Pesquisar se um aluno está cadastrado na lista.
  
Criei uma classe [Principal](ED_Ex4_Lista/src/view/PrincipalEx4.java) para testar e exemplificar as classes funcionando.

### [ED_Ex5_Lista](https://github.com/juliobarcellos/Estrutura_Dados/tree/master/ED_Ex5_Lista/src/controller)
Concluir a classe [SLinkedList](ED_Ex5_Lista/Ex5_Lista.pdf) com as 6 operações abaixo:
1. Adicionar um elemento no fim da Lista.
2. Adicionar um elemento em uma determinada posição.
3. Pegar o elemento de uma determinada posição.
4. Remover o elemento de uma determinada posição.
5. Verificar se um elemento está armazenado.
6. Informar o número de elementos armazenados.

### ED_Ex_Lista_Livros
Crie uma ListaLigada dinâmica em Java do tipo Livro.
- A classe [Livro](ED_Ex_Lista_Livros/src/controler/Livro.java) deve conter um número de registro, título, autor, preço e o ponteiro para o livro anterior;
- A classe [ListaLigada](ED_Ex_Lista_Livros/src/controler/ListaLigada.java) deve conter os métodos abaixo:
  - Inicializar uma nova lista (construtor);
  - Adicionar um livro no início da lista;
  - Adicionar um livro em uma posição específica;
  - Listar os livros cadastrados;
  - Remover um livro do início da lista;
  - Remover um livro de uma posição específica;
  - "Pegar" um livro para consulta;
  - Pesquisar se um livro está cadastrado na lista;
  - Pesquisar a quantidade de livros cadastrados.
  
Criei duas classes principais, uma feita com [JOptionPane](ED_Ex_Lista_Livros/src/view/PrincipalListaDinamica.java) para simular o funcionamento do sistema como um todo,
e uma [sem interface](ED_Ex_Lista_Livros/src/view/PrincipalSemJOP.java) apenas para testes.
  
### ED_Ex_PilhaDinamica
Crie uma Pilha dinâmica em Java do tipo Livro.
- A classe [Livro](ED_Ex_PilhaDinamica/src/controller/Livro.java) deve conter um número de registro, título, autor, preço e o ponteiro para o próximo livro;
- A classe [PilhaDinamica](ED_Ex_PilhaDinamica/src/controller/PilhaDinamica.java) deve conter os métodos abaixo:
  - Inicializar uma nova pilha (construtor);
  - Verificar se a pilha está vazia;
  - Consultar o tamanho da pilha;
  - Empilhar um livro (push);
  - Desempilhar um livro (pop);
  - Consultar o livro que está no topo da pilha.
  
Criei uma classe [Principal](ED_Ex_PilhaDinamica/src/view/PrincipalPilhaDinamica.java) para testar e exemplificar as classes funcionando.
  
### ED_Ex_PilhaEstatica
 Crie uma Pilha estática em Java do tipo Livro.
- A classe [Livro](ED_Ex_PilhaEstatica/src/controller/Livro.java) deve conter um número de registro, título, autor, preço e o ponteiro para o próximo livro;
- A classe [PilhaEstatica](ED_Ex_PilhaEstatica/src/controller/PilhaEstatica.java) deve conter os métodos abaixo:
  - Verificar se a pilha está vazia;
  - Consultar o tamanho da pilha;
  - Verificar se a pilha está cheia;
  - Empilhar um livro (push);
  - Desempilhar um livro (pop);
  - Consultar o livro que está no topo da pilha.
  
Criei uma classe [Principal](ED_Ex_PilhaEstatica/src/view/PrincipalPilhaEstatica.java) para testar e exemplificar as classes funcionando.

### ED_Ex_FilaEstatica
Criar uma fila estática em Java (usando vetor) de pessoas.
- A classe [Pessoa](ED_Ex_FilaEstatica/src/controller/Pessoa.java) deve conter um id, nome e email;
- A classe [FilaEstatica](ED_Ex_FilaEstatica/src/controller/FilaEstatica.java) deve conter os métodos abaixo:
  - Inicializar uma nova fila (construtor);
  - Inserir uma pessoa no fim da fila (enfileirar - enqueue);
  - Remover uma pessoa do início da fila (desenfileirar - dequeue);
  - Localizar uma pessoa na fila para consulta (getFrente - peek) ou alteração (buscar) da informação.
  - Verificar se a fila está vazia.
  - Verificar se a fila está cheia.
  - Verificar o tamanho da fila.

Criei uma classe [Principal](ED_Ex_FilaEstatica/src/view/PrincipalFilaEstatica.java) para testar e exemplificar as classes funcionando.

### [ED_Arvores](https://github.com/juliobarcellos/Estrutura_Dados/tree/master/ED_Arvores/src)
Conteúdo prático da aula sobre árvores. 
- No package [tree](https://github.com/juliobarcellos/Estrutura_Dados/tree/master/ED_Arvores/src/tree) temos a implementação de uma estrutura de [árvore](ED_Arvores/src/tree/No.java) comum e uma classe [principal](ED_Arvores/src/tree/Principal.java) contendo alguns métodos para exemplificar a utilização da estrutura.
- No package [binaryTree](https://github.com/juliobarcellos/Estrutura_Dados/tree/master/ED_Arvores/src/binaryTree) temos:
  - A implementação de uma [árvore binária](ED_Arvores/src/binaryTree/ArvoreBinaria.java) com os métodos para inicializar, adicionar um nó, remover um nó, buscar um nó e getRaiz. 
  - A classe [NoBinario](ED_Arvores/src/binaryTree/NoBinario.java) simples
  - Uma classe de [percursos](ED_Arvores/src/binaryTree/Percursos.java) com os métodos de percurso (inOrder, preOrder e posOrder) além de alguns métodos extras para calcular a quantidade de nós da árvore, sua altura, folhas, nós maior e menor. 
  - Por fim, uma classe [principal](ED_Arvores/src/binaryTree/Principal.java) contendo um exemplo do uso dos métodos utilizados com árvores binárias.

### [ED_SortMethods](https://github.com/juliobarcellos/Estrutura_Dados/tree/master/ED_Sort_Methods/src)
Conteúdo das aulas sobre métodos de ordenação.
- No package [controller](https://github.com/juliobarcellos/Estrutura_Dados/tree/master/ED_Sort_Methods/src/controller) temos o arquivo com os [métodos de ordenação](ED_Sort_Methods/src/controller/SortMethods.java) contendo um método pra preencher vetores de inteiros aleatoriamente, um método para exibir o vetor, e os métodos de ordenação abaixo:
  - BubbleSort;
  - QuickSort;
  - InsertionSort;
  - InsertionSortBinary;
  - SelectionSort;
  - HeapSort (Max e Min, com os métodos MaxHeapify e MinHeapify);
  - MergeSort (Recursivo, acompanhado do método Merge).
- No package [view](https://github.com/juliobarcellos/Estrutura_Dados/tree/master/ED_Sort_Methods/src/view) temos a classe [principal](ED_Sort_Methods/src/view/Principal.java) com um exemplo de comparação do tempo de execução de todos os métodos de ordenação em cima de um vetor inteiro de 50000 posições.

### [ED_Collections](https://github.com/juliobarcellos/Estrutura_Dados/tree/master/ED_Collections/src/controller)
Conteúdo das aulas sobre Collections Java.
- Temos exemplos do uso de List e ArrayList e alguns métodos como o add, remove, clear, for each e o Collections.sort() (Aprendemos também sobre LinkedList porém não tivemos um exemplo em código) [Listas](ED_Collections/src/controller/Listas.java). Em [HashSets](ED_Collections/src/controller/HashSets.java) aprendemos a lógica dos Hashs e também a usar o iterator com as collections. Temos uma implementação simples de [LinkedHashSet](ED_Collections/src/controller/LinkedHashSets.java), o [TreeSet](ED_Collections/src/controller/TreeSets.java) e sua natureza de ordenação automática (utilizando como exemplo a classe [Dog](ED_Collections/src/controller/Dog.java) implementando a interface `Comparable<>`, o [HashMap](ED_Collections/src/controller/HashMaps.java) trazendo o conceito de armazenamento de chave e valor, e por fim a classe [Comparador](ED_Collections/src/controller/Comparador.java) contendo a implementação de um HashSet, um TreeSet e um LinkedHashSet para mostrar a diferença no tempo de execução de cada uma dessas collections usando como base a inserção de 1000 elementos em cada collection.
