# **Design Patterns**

Atualmente existem 23 padrões catalogados, eles estão divididos em:

### Creational (Criacional): trata da criação de objetos.
* **Builder**: separa a construção de um objeto complexo de sua representação, de modo que o mesmo processo de construção passa a criar diferentes representações.
* **Factory Method**: define uma interface para criar um objeto, mas deixa que as sub-classes decidam qual classe instanciar.
* **Prototype**: cria objetos por cópia de um objeto existente, permitindo a adição ou modificação de propriedades na cópia, sem alterar o original.
* **Singleton**: garante que uma classe tenha apenas uma instância, e fornece um ponto de acesso global a essa instância.
### Structural (Estrutural): relação entre objetos e como eles interagem entre si (composição por exemplo).
* **Adapter**: permite que a interface de uma classe existente seja usada como outra interface.
* **Proxy**: fornece um substituto ou representante de outro objeto para controlar acesso a ele. 
### Behavioral (Comportamentais): comunicação entre os objetos, em termos de responsabilidades e algoritmos. Chamada de métodos, etc. 
* **Chain of Responsibility**: permite passar a solicitação ao longo de uma cadeia de handlers até que um deles a trate.
* **Strategy**: define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.
* **Template Method**: define o esqueleto de um algoritmo num método, transferindo alguns e seus passos para subclasses.