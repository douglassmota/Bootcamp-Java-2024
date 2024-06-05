# Java: Criação de Pacotes e Visibilidade de Recursos

Este repositório apresenta conceitos fundamentais sobre criação de pacotes em Java e a visibilidade de recursos por meio de modificadores de acesso.

## Criação de Pacotes em Java

Os pacotes em Java são usados para organizar e agrupar classes relacionadas. Eles ajudam na modularidade, facilitando a organização e manutenção do código. Para criar um pacote em Java, basta incluir uma declaração de pacote no início do arquivo Java.

### Exemplo:

```java
package com.exemplo.pacote;

public class MinhaClasse {
    // Conteúdo da classe aqui
}

### Visibilidade dos Recursos
Em Java, a visibilidade dos recursos (métodos, variáveis e classes) é controlada por modificadores de acesso. Existem três modificadores de acesso principais em Java: public, protected, default (ou pacote-private) e private.

### Modificador public
O modificador public torna o recurso acessível de qualquer lugar, tanto dentro quanto fora do pacote em que está definido.

## Exemplo:

package com.exemplo.pacote;

public class MinhaClasse {
    public void meuMetodoPublico() {
        // Conteúdo do método aqui
    }
}

### Modificador default (ou pacote-private)
O modificador default (ou pacote-private) torna o recurso acessível apenas dentro do mesmo pacote em que está definido. Se nenhum modificador for especificado, o recurso é considerado default.

## Exemplo:

package com.exemplo.pacote;

class MinhaClasse {
    void meuMetodoDefault() {
        // Conteúdo do método aqui
    }
}

### Modificador private
O modificador private torna o recurso acessível apenas dentro da própria classe em que está definido. Ele é o nível de visibilidade mais restrito.

## Exemplo:

package com.exemplo.pacote;

public class MinhaClasse {
    private int minhaVariavelPrivada;

    private void meuMetodoPrivado() {
        // Conteúdo do método aqui
    }
}

### Espero que este README tenha sido útil para entender esses conceitos importantes em Java. Sinta-se à vontade para explorar o código-fonte neste repositório e experimentar esses conceitos na prática!

