# alticci-sequence-challenge
Projeto fullstack simples em Java/Quarkus e Angular para implementar a sequencia de Alticci

A sequência Alticci - a(n) - é definida da seguinte forma:

n=0 => a(0) = 0

n=1 => a(1) = 1

n=2 => a(2) = 1

n>2 => a(n) = a(n-3) + a(n-2)

Exemplo dos primeiros valores da sequência:

0

1

1

1

2

2

3

4

5

7

9

[…]

Com base nisso foram criados dois projetos, um para o frontend (alticci-sequence-page), contendo uma tela simples e responsável pela chamada da API que gera o resultado. Tal API está implementada no projeto de backend (alticci-sequence) e que retorna o valor final da sequência de acordo com o parâmetro de entrada.

Para executar por completo o projeto é preciso ter os seguintes pré-requisitos:
* Apache Maven
* Docker
* Python

A partir disso, basta executar o script **startProject.py** e aguardar o fim do processo. Caso tudo tenha sido executado corretamente é possível acessar a página no endereço http://localhost

Para terminar a execução do projeto basta executar o script **stopProject.py**.

O swagger da API pode ser acessado em: http://www.localhost:8080/swagger-ui/