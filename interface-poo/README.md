# Java: Interface na Programação Orientada a Objetos (POO)

Neste repositório, aprendi alguns pontos importantes sobre interfaces na Programação Orientada a Objetos (POO) em Java e gostaria de destacá-los neste README.

## Interface na POO

Uma interface em Java é um tipo de referência que é similar a uma classe, mas que é usado para especificar métodos que uma classe deve implementar. As interfaces permitem definir um contrato que as classes devem cumprir, garantindo que elas implementem métodos específicos.

### O que é

Uma interface é uma coleção de métodos abstratos (sem implementação) que podem ser implementados por qualquer classe. Uma classe que implementa uma interface deve fornecer implementações para todos os métodos declarados na interface. Interfaces podem também incluir constantes, métodos padrão (default), métodos estáticos e métodos privados (a partir do Java 9).

### Como usar

Para usar uma interface em Java:

1. **Definir a interface**: Use a palavra-chave `interface` para definir uma interface.
2. **Implementar a interface**: Use a palavra-chave `implements` em uma classe para implementar a interface e fornecer implementações para todos os métodos da interface.

### Exemplos

#### Definição de uma Interface

```java
public interface Animal {
    void fazerSom();
    void mover();
}
```
### Implementação de uma Interface

```java
public class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro corre");
    }
}

public class Gato implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia");
    }

    @Override
    public void mover() {
        System.out.println("O gato anda silenciosamente");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        meuCachorro.fazerSom();  // Output: O cachorro late
        meuCachorro.mover();     // Output: O cachorro corre

        Animal meuGato = new Gato();
        meuGato.fazerSom();  // Output: O gato mia
        meuGato.mover();     // Output: O gato anda silenciosamente
    }
}
```
### Métodos Default e Estáticos em Interfaces
A partir do Java 8, interfaces podem ter métodos com implementações padrão (default) e métodos estáticos.

#### Exemplo com Método Default

```java
public interface Animal {
    void fazerSom();
    
    default void dormir() {
        System.out.println("O animal está dormindo");
    }
}

public class Passaro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O pássaro canta");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuPassaro = new Passaro();
        meuPassaro.fazerSom();  // Output: O pássaro canta
        meuPassaro.dormir();    // Output: O animal está dormindo
    }
}
```

##### Espero que este README tenha sido útil para entender os conceitos importantes sobre interfaces na POO em Java. Sinta-se à vontade para explorar o código-fonte neste repositório e experimentar esses conceitos na prática!