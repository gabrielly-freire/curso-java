# Resumo leitura de arquivos

## Lendo arquivo texto com classes File e Scanner

- Com Scanner é possivel fazer a leitura de dados de arquivo além da leitura do teclado, ou seja, essa classe fazer uso do conceito de polimorfismo;
- A classe File é responsável por representar um arquivo ou um diretorio. Ela recebe por parametro o caminho do arquivo ou diretório
    ```java
    File file = new File(path);```
- Para fazer a leitura do arquivo é preciso fazer o tratamento de excesso para caso de falha ao tentar abrir o arquivo  

[codigo](src/main/java/section17/exemples/exemple01/Program.java)

## FileReader e BufferedReader
- FileReader é uma classe responsável por fazer a leitura de um stream de caracteres de um arquivo. Ele trata o arquivo como uma sequência de caracteres, e você pode ler esses caracteres um por um.
- BufferedReader é usado para ler linhas inteiras de texto de um arquivo. Ele armazena em buffer os caracteres, o que pode melhorar a eficiência da leitura.
- No codigo de exemplo é feita a leitura linha a linha de um arquivo

[codigo](src/main/java/section17/exemples/exemple02/Program.java)

## Bloco try-with-resources
- É um bloco try que declara um ou mais recursos, e garante que essesrecursos serão fechados ao final do bloco
- Esse código é uma refatoração na versão anterior usando um try-with-resources que diminui a verbosidade da implementação

[codigo](src/main/java/section17/exemples/exemple03/Program.java)

## FileWriter e BufferedWriter
- Bem semelhante ao FileReader e BufferedRead
- BufferedWriter tem sobrecarga, uma ela pode passar por parametro apenas o FileWriter e a outra o FileWriter mais um boolean. 
- Apenas o FileWriter o arquivo e sobreescrito
- FileWriter+boolean vai haver um anexação dos conteúdo, ou seja, vai ser escrito abaixo
```java
BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
```
[codigo](src/main/java/section17/exemples/exemple04/Program.java)

## Manipulando pastas com File
[codigo](src/main/java/section17/exemples/exemple05/Program.java)

## Informações do caminho do arquivo
[codigo](src/main/java/section17/exemples/exemple06/Program.java)
