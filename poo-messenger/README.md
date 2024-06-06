# Java: Pilares da Programação Orientada a Objetos (POO)

Neste repositório, aprendi alguns pontos importantes sobre os pilares da Programação Orientada a Objetos (POO) em Java e gostaria de destacá-los neste README.

## Pilares da POO

Os quatro pilares da Programação Orientada a Objetos são: Abstração, Encapsulamento, Herança e Polimorfismo. Cada um desses pilares contribui para a criação de código modular, reutilizável e fácil de manter.

### Abstração

A abstração é o processo de ocultar os detalhes complexos de uma implementação e mostrar apenas as funcionalidades essenciais. Em Java, a abstração pode ser alcançada usando classes abstratas e interfaces.

#### Exemplo:

```java
abstract class Animal {
    abstract void fazerSom();
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        meuCachorro.fazerSom(); // Output: Latido
    }
}
```
### Encapsulamento
O encapsulamento é o processo de envolver os dados (variáveis) e os métodos que operam nesses dados dentro de uma única unidade, ou classe. Ele restringe o acesso direto a alguns dos componentes de um objeto, o que pode ser conseguido usando modificadores de acesso.

#### Exemplo:

```java
public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setIdade(30);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
```
### Herança
A herança é o processo pelo qual uma classe (subclasse) herda os campos e métodos de outra classe (superclasse). Em Java, a herança é implementada usando a palavra-chave extends.

#### Exemplo:

```java
class Veiculo {
    void mover() {
        System.out.println("O veículo está se movendo");
    }
}

class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("O carro está se movendo");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.mover(); // Output: O carro está se movendo
    }
}
```
### Polimorfismo
O polimorfismo permite que uma única ação seja realizada de diferentes formas. Em Java, isso pode ser alcançado através de métodos sobrecarregados e sobrescritos.

#### Exemplo:

```java
class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O gato mia");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Gato();
        meuAnimal.fazerSom(); // Output: O gato mia
    }
}
```

##### Espero que este README tenha sido útil para entender os pilares da POO em Java. Sinta-se à vontade para explorar o código-fonte neste repositório e experimentar esses conceitos na prática!
