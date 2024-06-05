# Java: Getters e Setters

Neste repositório, aprendi alguns pontos importantes sobre getters e setters em Java e gostaria de destacá-los neste README.

## Getters e Setters

Getters e setters são métodos especiais utilizados para acessar e modificar os valores dos campos de uma classe, respectivamente. Eles são parte importante da encapsulação em Java, permitindo o controle do acesso aos dados de uma classe.

### O que é

- **Getter**: Um método que é usado para recuperar (ou obter) o valor de um campo de uma classe.
- **Setter**: Um método que é usado para definir (ou modificar) o valor de um campo de uma classe.

### Como usar

- **Getters**: Um getter geralmente tem o nome no formato `getNomeDoCampo` e retorna o valor do campo.
  #### Exemplo:
  ```java
  public String getNome() {
      return this.nome;
  }
```
### Setters: Um setter geralmente tem o nome no formato setNomeDoCampo e recebe um parâmetro para definir o valor do campo.
#### Exemplo:

```
public void setNome(String nome) {
    this.nome = nome;
}
```
#### Exemplos:
```
public class Pessoa {
    private String nome;
    private int idade;

    // Getter para o campo 'nome'
    public String getNome() {
        return this.nome;
    }

    // Setter para o campo 'nome'
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o campo 'idade'
    public int getIdade() {
        return this.idade;
    }

    // Setter para o campo 'idade'
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```
Neste exemplo, a classe Pessoa possui campos privados nome e idade, e métodos públicos getNome, setNome, getIdade e setIdade para acessar e modificar esses campos, seguindo a convenção de getters e setters em Java.

##### Espero que este README tenha sido útil para entender os conceitos de getters e setters em Java. Sinta-se à vontade para explorar o código-fonte neste repositório e experimentar esses conceitos na prática!