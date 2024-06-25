# Exercício: Utilização de Arrays de Objetos em Java

## Objetivo
O objetivo deste exercício é praticar a criação e manipulação de arrays que suportam objetos em Java. Você irá desenvolver uma aplicação para calcular o preço médio de uma lista de produtos fornecida pelo usuário.

## Pré-requisitos
- Conhecimento básico de Java
- Ambiente de desenvolvimento Java instalado (JDK)
- Uma IDE ou editor de texto de sua preferência (por exemplo, IntelliJ IDEA, Eclipse, VSCode)

## Descrição do Exercício
Neste exercício, você criará uma aplicação Java dividida em dois pacotes:

1. **entities**: Contendo a classe Product.
2. **application**: Contendo a classe Program que será o ponto de entrada da aplicação.

## Classe Product
A classe Product representa um produto com os seguintes atributos:

- name (String): O nome do produto.
- price (Double): O preço do produto.

## Classe Program
A classe Program contém o método main que realiza as seguintes operações:

- Solicita ao usuário a quantidade de produtos.
- Cria um array de Product com o tamanho especificado.
- Para cada produto, solicita o nome e o preço ao usuário e armazena no array.
- Calcula e imprime o preço médio dos produtos.

## Estrutura do Projeto
O projeto terá a seguinte estrutura de diretórios e arquivos:

```css
projeto-arrays-objetos/
│
├── src/
│   ├── entities/
│   │   └── Product.java
│   └── application/
│       └── Program.java
│
└── README.md
```