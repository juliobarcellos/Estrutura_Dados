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
