## Design Patterns

### Definição
Soluções típicas para problemas comuns. Os padrões de projeto são divididos em três partes:

- **Criacionais**: Focam na criação de objetos (exemplo: Singleton).
- **Estruturais**: Lidam com a composição de classes e objetos (exemplo: Facade).
- **Comportamentais**: Concentram-se em como os objetos interagem e se comunicam (exemplo: Strategy).

---

### Singleton
- Garante que uma única instância de uma classe seja criada e que essa instância seja acessível globalmente. O código do Singleton assegura que não teremos múltiplas instâncias sendo criadas.
- **Vantagem**: A instância só é criada quando realmente necessária, economizando recursos, especialmente se a classe for pesada e complexa.

---

### Strategy
- Este padrão permite atribuir comportamentos diferentes a um objeto, permitindo que esses comportamentos sejam trocados de forma flexível durante a execução do programa. Ele é útil quando você deseja que um objeto execute diferentes comportamentos sem precisar alterar sua estrutura.
- **Resumindo**:
    1. **Interface comum**: Define um método que todas as estratégias devem implementar.
    2. **Implementações específicas**: Cada estratégia (comportamento) é uma classe que implementa a interface de forma diferente.
    3. **Contexto**: A classe que usa as estratégias trabalha com a interface, permitindo trocar o comportamento dinamicamente usando polimorfismo.

---

### Facade
- Proporciona uma interface que reduz a complexidade nas integrações com subsistemas.
- **Facade**: É uma classe que contém métodos que encapsulam as interações com vários subsistemas.
- **Vantagens**: O usuário do sistema não precisa entender a complexidade interna; ele pode apenas usar a interface.

---

