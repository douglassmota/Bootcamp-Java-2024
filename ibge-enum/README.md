# Java: Classe Enum

Neste repositório, aprendi alguns pontos importantes sobre classes Enum em Java e gostaria de destacá-los neste README.

## Classe Enum

A classe Enum em Java é uma forma de representar um conjunto fixo de constantes (valores pré-definidos) que são tratadas como tipos de dados próprios. Ela oferece uma maneira conveniente de definir e trabalhar com um conjunto restrito de valores que não devem ser alterados durante a execução do programa.

### O que é

Uma classe Enum em Java é uma classe especial que representa um conjunto de constantes. Ela é definida usando a palavra-chave `enum` e pode conter campos, métodos e construtores.

### Como usar

- **Definição**: Para definir uma classe Enum em Java, use a palavra-chave `enum`, seguida dos nomes das constantes entre chaves `{}`.

- **Acesso aos valores**: Os valores da classe Enum são acessados usando o nome da classe Enum seguido do valor desejado, como se fosse um membro estático.

### Exemplos:

```java
public enum DiaDaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}
```

Neste exemplo, definimos uma classe Enum DiaDaSemana que representa os dias da semana como constantes. Cada constante é tratada como um objeto da classe DiaDaSemana, e pode ser acessada usando o nome da classe Enum seguido do valor desejado, por exemplo: DiaDaSemana.SEGUNDA.

```java
public enum Estado {
    ATIVO("Ativo"),
    INATIVO("Inativo"),
    SUSPenso("Suspenso");

    private final String descricao;

    Estado(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
```
Neste exemplo, definimos uma classe Enum Estado com constantes que representam os estados de um objeto. Cada constante tem uma descrição associada, que pode ser acessada usando o método getDescricao.

##### Espero que este README tenha sido útil para entender os conceitos importantes sobre classes Enum em Java. Sinta-se à vontade para explorar o código-fonte neste repositório e experimentar esses conceitos na prática!