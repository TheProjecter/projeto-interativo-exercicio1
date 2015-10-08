Uma lista ligada ou lista encadeada é uma estrutura de dados linear e dinâmica. Ela é composta por células que apontam para o próximo elemento da lista. Para "ter" uma lista ligada/encadeada, basta guardar seu primeiro elemento, e seu último elemento aponta para uma célula nula. O esquema a seguir representa uma lista ligada/encadeada com 5 elementos:

Célula 1 ----> Célula 2 ---> Célula 3 ---> Célula 4 ---> Célula 5 ---> (Nulo)

Para inserir dados ou remover dados é necessário ter um ponteiro que aponte para o 1º elemento e outro que aponte para o fim, porque se queremos inserir ou apagar dados que estão nessas posições, a operação é rapidamente executada. Caso seja necessário editar um nó que esteja no meio da lista haverá uma busca pela posição desejada.