# Orientação a Objetos com Java - Instituto Tecnológico de Aeronáutica

## Identificando Classes e Objetos
Entidades no Sistema:
- São as partes do sistema que fazem parte do negócio, como cães, produtos de pet-shop e usuários (donos de animais).

Classes:
- São abstrações que representam entidades no sistema.

Exemplo: Uma classe "Cadeira" é uma abstração que descreve a ideia de uma cadeira, com diferentes tipos (madeira, plástico, com rodinhas, etc.).

Objetos:
- São instâncias concretas das classes.

Exemplo: Uma cadeira específica em que você está sentado é um objeto da classe "Cadeira".
- Objetos são únicos, mesmo que sejam da mesma classe.

Diferenciação entre Classes e Objetos:
- Classe: Abstração, generalização.
- Objeto: Concreto, representa uma instância específica.

Instanciação de Objetos:
- As classes criam ou instanciam objetos com base na abstração que representam.

Identificação de Objetos da Classe "Cadeira":
- Cadeira de rodas e cadeira de bebê são instâncias da classe "Cadeira", pois se encaixam na abstração de cadeira.
- Banquinho não é uma instância de cadeira, pois não se encaixa na abstração de cadeira.

## Comportamento e Estado das Classes

Estado e Comportamento:
- Estado: São as características de uma classe, representadas pelos atributos.

Exemplo: Para a classe "Cadeira", os atributos podem ser encosto, assento e pés.
- Comportamento: São as ações que uma classe pode realizar, representadas pelos métodos.

Exemplo: O método "mover" pode mudar a posição da cadeira.

Atributos e Métodos:
- Atributos: Representam o estado da classe.
- Métodos: Representam o comportamento da classe.

Exemplo: Para uma classe "Carro", os atributos podem ser potência do motor e velocidade, enquanto os métodos podem ser "acelerar" e "frear".

Diferença entre Classe e Objeto:
- Classe: Abstração, define a estrutura e comportamento.

Exemplo: A classe "Carro" define a estrutura e comportamento de todos os carros.
- Objeto: Instância concreta de uma classe, tem valores específicos para os atributos e executa os métodos.

Exemplo: O carro do sogro, com potência do motor de 2.0 e velocidade de 60 km/h, pode acelerar e frear.

## Criando Classes com Java

Importação de Classes:
- Para utilizar classes pré-definidas, como a classe Math, é necessário importá-las usando a declaração import java.lang.Math.
- Para classes próprias, pode-se usar import org.veículos.* para importar todas as classes do pacote org.veículos ou import org.veículos.Carro para importar apenas a classe Carro.

Declaração de Atributos:
- Os atributos armazenam informações da classe, como potência e velocidade para um carro.
- Atributos têm um tipo, podendo ser primitivos (como int) ou de classes.
  
Exemplo: int potência; e float velocidade;.

Criação de Objetos:
- Usa-se o operador new para criar instâncias de classes.

Exemplo: Carro fusca = new Carro(); cria um objeto do tipo Carro chamado fusca.

Acesso aos Atributos:
- Os atributos de um objeto podem ser acessados usando a notação de ponto (.).

Exemplo: fusca.potência = 2; atribui o valor 2 ao atributo potência do objeto fusca.

Métodos:
- Métodos definem o comportamento da classe e são definidos usando a palavra-chave void se não retornam valor.

Exemplo: void acelerar() e void frear() são métodos para aumentar e diminuir a velocidade de um carro.

Invocação de Métodos:
- Métodos são chamados usando a notação de ponto (.) após o nome do objeto.

Exemplo: fusca.acelerar(); e fusca.frear(); chamam os métodos acelerar e frear do objeto fusca.

## Construtores de Classes

Construtores:
- São métodos especiais utilizados para criar novos objetos.
- Permitem a parametrização da criação de objetos, possibilitando que sejam definidas características específicas para cada objeto.
- Têm o mesmo nome da classe e não possuem retorno.

Utilização de Construtores:
- Os construtores podem ser utilizados para inicializar atributos dos objetos.
- Podem receber parâmetros para definir características específicas do objeto.

Exemplo: Carro(int potência) { this.potência = potência; }.

Palavra Reservada "this":
-Utilizada para referenciar elementos da própria classe, como métodos ou atributos.
-Ajuda a diferenciar parâmetros de atributos com o mesmo nome.

Construtor Padrão:
- Se nenhum construtor é definido na classe, o Java fornece um construtor padrão vazio automaticamente.
- Esse construtor padrão não faz nada e não recebe parâmetros.

Múltiplos Construtores:
- Uma classe pode ter mais de um construtor, desde que tenham tipos de parâmetros diferentes.

Exemplo: Carro(int potência) e Carro(String marca) são dois construtores diferentes.

Flexibilidade dos Construtores:
- Os construtores podem ter lógicas diferentes de inicialização dos objetos.
- Permitem criar objetos com diferentes estados iniciais.

## Relacionamento entre Classes

Importância do Relacionamento entre Classes:
- Em orientação a objetos, é fundamental entender como diferentes classes colaboram para criar funcionalidades em um sistema.
- Em vez de construir um grande bloco de código (ou "pedra"), é melhor dividir o sistema em pequenas peças reutilizáveis (como Lego), facilitando a manutenção e modificação do código.

Exemplo Prático:

Imagine o desenvolvimento de um sistema de uma pizzaria online, onde o preço da pizza depende dos ingredientes e o custo da entrega depende do dia da semana e da distância.
Em vez de colocar todas as funcionalidades em um único local, devemos identificar as responsabilidades e dividir entre diferentes classes.

Classes Envolvidas:

Na pizzaria, poderíamos ter as classes:
- Pizza: Responsável por calcular o preço com base nos ingredientes.
- Entrega: Responsável por calcular o custo da entrega.
- CarrinhoDeCompras: Responsável por gerenciar os produtos selecionados pelo cliente e calcular o valor total da compra.

Colaboração entre Classes:

Cada classe tem responsabilidades específicas e colabora com outras para cumprir a funcionalidade geral do sistema.
O CarrinhoDeCompras solicita o preço de cada produto à Pizza e à Entrega para calcular o valor total da compra.

Vantagens do Relacionamento Adequado:
- Permite modificar partes do sistema sem afetar outras.
- Se novos ingredientes forem adicionados ou se houver alterações na política de entrega, apenas as classes relevantes precisam ser modificadas.

Conclusão:
- O principal objetivo da modelagem orientada a objetos é identificar as classes envolvidas e como elas colaboram para criar a funcionalidade desejada.
- Ao entender o relacionamento entre as classes, podemos criar sistemas mais flexíveis e fáceis de manter.

  ## Métodos e Atributos Estáticos

Atributos e métodos estáticos pertencem à classe em vez de pertencerem a instâncias individuais da classe.
Eles são compartilhados entre todas as instâncias da classe e podem ser acessados ​​sem a necessidade de instanciar um objeto da classe.

Uso de Atributos Estáticos:
- São úteis para armazenar informações que são comuns a todas as instâncias da classe, como um contador de instâncias.
- Para declarar um atributo estático, utiliza-se o modificador static.

Cuidados ao Usar Atributos Estáticos:
- Devem ser usados com cautela, evitando criar "variáveis globais" que podem tornar o código difícil de manter.
- É importante lembrar que variáveis estáticas são compartilhadas entre todas as instâncias da classe.

Uso de Métodos Estáticos:
- São semelhantes a funções na programação estruturada e podem ser usados para operações auxiliares.
- São declarados com o modificador static e podem ser chamados diretamente a partir do nome da classe, sem a necessidade de instanciar um objeto.

Design Orientado a Objetos vs. Design Estruturado:
- Ao usar métodos e atributos estáticos, é importante não cair na armadilha de criar um design estruturado em uma linguagem orientada a objetos.
- Métodos estáticos devem ser usados para operações simples e auxiliares, enquanto métodos de instância são mais adequados para comportamentos relacionados a objetos específicos.

Uso de import static:

É possível importar métodos e atributos estáticos de uma classe para evitar a repetição do nome da classe ao chamá-los.
Isso é feito com a sintaxe import static.

Conclusão:

Métodos e atributos estáticos são úteis em Java para operações compartilhadas entre todas as instâncias de uma classe.
No entanto, é essencial usá-los com cuidado e garantir que eles não sejam usados indevidamente como variáveis globais ou funções genéricas.
Entendendo a diferença entre métodos e atributos estáticos e instâncias, é possível criar um código mais eficiente e orientado a objetos.

## Pensando em Métodos Orientados a Objetos

Comparação com Programação Estruturada:

Na programação estruturada, as funções operam com parâmetros passados ​​externamente e, às vezes, acessam variáveis globais.
Na programação orientada a objetos, os métodos operam com base nos dados internos do objeto e podem receber parâmetros externos, se necessário.

Objetos e Seus Dados Internos:

Cada objeto tem seu próprio estado interno, representado por variáveis de instância que armazenam informações específicas do objeto.
Métodos de um objeto geralmente utilizam essas variáveis internas para realizar operações específicas.

Exemplo de um Carrinho de Compras:

Considere uma classe Carrinho que representa um carrinho de compras em um sistema de e-commerce.
Para calcular o valor total do carrinho, o método pode iterar sobre os produtos no carrinho e somar seus preços.
Para calcular o valor do frete, o método pode precisar do endereço do comprador, que não é uma informação do carrinho em si.

Parâmetros de Métodos e Escopo de Informações:

Ao projetar métodos orientados a objetos, é crucial considerar quais informações pertencem ao escopo do objeto e quais podem ser passadas como parâmetros.
Por exemplo, se o endereço não é uma informação do carrinho, mas é necessária para calcular o frete, pode ser passado como parâmetro para o método de cálculo de frete.

Delegação entre Classes:

Classes diferentes podem colaborar para fornecer funcionalidades completas.
Por exemplo, a classe Compra pode ter métodos que delegam parte de sua execução para objetos internos, como o carrinho de compras.

Conclusão:

Ao pensar em métodos orientados a objetos, é fundamental considerar quais dados pertencem ao escopo do objeto e quais são passados como parâmetros.
Com uma compreensão clara do escopo das informações e da colaboração entre classes, é possível criar sistemas orientados a objetos de forma eficaz e coesa.

## Importância de Testes

Importância dos testes de software:
- Evitam erros que podem levar a prejuízos financeiros e danos à imagem da empresa.
- Os testes não apenas identificam erros, mas também suas consequências.
- Testar previamente pode prevenir problemas graves no desenvolvimento e na entrega do software.

Experiência com testes:
- No passado, os testes eram frequentemente negligenciados e vistos como uma atividade menos importante.
- Os testes eram deixados para serem feitos por último, muitas vezes por pessoas inexperientes e sem treinamento adequado.
- A responsabilidade recaía sobre os testadores quando ocorriam problemas, criando uma atmosfera desfavorável em relação aos testes.

Mudança de perspectiva:
- Os métodos ágeis deram mais importância aos testes, integrando-os ao processo de desenvolvimento desde o início.
- Hoje, as empresas valorizam os testadores como profissionais essenciais para garantir a qualidade do software.

Importância dos testes automatizados:
- Permitem verificar rapidamente se uma modificação introduziu erros no software.
- O Test Driven Development (TDD) é uma técnica que enfatiza a criação de testes antes do código.
- Desenvolver software sem testes automatizados é considerado inaceitável devido aos riscos envolvidos.

## Testes Automatizados com JUnit

Importância da automação de testes:
- Automatizar os testes é fundamental para verificar se novas implementações não afetam o comportamento anterior do código.
- Os testes de regressão garantem que as novas funcionalidades não causem problemas nas funcionalidades existentes.

Tipos de testes:
- Teste de unidade: Testa uma única classe ou método isoladamente.
- Teste de integração: Testa a interação entre diferentes componentes ou funcionalidades.
- Teste funcional: Testa o software do ponto de vista do usuário, independentemente de detalhes de implementação.

JUnit como ferramenta de teste:

O JUnit é uma biblioteca padrão para criar testes automatizados em Java.
Pode ser utilizado para testes de unidade, integração e funcional.
As anotações, como @Test, são usadas para identificar métodos de teste.
É importante configurar o cenário necessário antes de executar o teste, incluindo preparar variáveis e objetos.
Métodos de assert, como assertEquals, são utilizados para verificar se os resultados esperados são alcançados.

Abordagem prática:

A prática de imprimir resultados na tela para testar deve ser substituída pela criação de testes automatizados.
Automatizar os testes permite verificar constantemente se o código continua funcionando conforme esperado, mesmo após modificações.

## Antes e Depois de um Teste

Importância de inicialização e finalização nos testes:

Antes de executar os testes, pode ser necessário preparar o ambiente, como ler arquivos de configuração ou criar objetos.
Após a execução dos testes, é comum limpar recursos utilizados, como fechar conexões de banco de dados.

Evitar duplicação de código:

Duplicar o código de inicialização e finalização em cada método de teste é propenso a erros e difícil de manter.
É desejável ter métodos de inicialização e finalização que sejam compartilhados por todos os testes.

Anotações do JUnit para inicialização e finalização:

- @Before: Anotação para métodos que devem ser executados antes de cada método de teste.
- @After: Anotação para métodos que devem ser executados após cada método de teste.
- @BeforeClass e @AfterClass: Anotações para métodos que devem ser executados uma vez antes e após todos os testes, respectivamente.

Sequência de execução:

- Os métodos marcados com @Before e @After são executados antes e após cada método de teste.
- Os métodos marcados com @BeforeClass e @AfterClass são executados uma vez antes e após todos os testes.

## Trabalhando com Níveis de Abstração

Níveis de abstração:

No contexto da programação orientada a objetos, é possível trabalhar com diferentes níveis de abstração.

Exemplo: Gato (abstração geral) -> Gato de rua (especialização) -> Gato doméstico (especialização adicional).

Exemplo concreto de classes:

Exemplo das classes Empregado e Gerente, onde Gerente é uma especialização de Empregado com características adicionais, como o bônus.

Problemas de abordagens alternativas:

Tentar resolver o problema da duplicação de código colocando todas as informações em uma única classe pode levar a problemas como métodos não utilizáveis para todos os objetos e confusão de informações opcionais.

Importância da herança:

A herança permite representar a relação de especialização entre classes.

Exemplo: Gerente estendendo a classe Empregado para herdar características comuns e adicionar comportamentos específicos.

## Utilizando Herança

Conceito de herança:

Herança é um conceito fundamental na programação orientada a objetos que permite estender as características de uma classe base (superclasse) para criar uma classe mais específica (subclasse).

Implementação em Java:

Em Java, a herança é implementada usando a palavra-chave extends.

Exemplo: class Gerente extends Empregado { ... }.

O que é permitido na herança:
- Adicionar métodos e atributos na subclasse.
- Modificar métodos (polimorfismo) - detalhado em aulas subsequentes.

O que não é permitido na herança:
- Remover métodos ou atributos da superclasse.
- Estender mais de uma classe (herança múltipla) - Java não suporta.

Manutenção dos contratos:
- A subclasse deve manter os contratos definidos pela superclasse.
- Não pode quebrar as expectativas de uso definidas na superclasse.

Herança implícita:
- Todas as classes em Java estendem implicitamente a classe Object.
- Mesmo que não seja especificado, todas as classes têm uma relação de herança com Object.

Classe Object:
- Object é a classe principal em Java, e todas as outras classes são implicitamente subclasse dela.
- Possui métodos como equals() para comparação de objetos.

## Modificadores de Acesso

Introdução aos modificadores de acesso:

Os modificadores de acesso permitem controlar o acesso aos membros (atributos e métodos) de uma classe, evitando acessos não autorizados e garantindo a consistência dos dados.

Tipos de modificadores de acesso em Java:
- Private: Restringe o acesso ao membro apenas à própria classe. É útil para proteger dados sensíveis e manter a integridade interna da classe.
- Public: Permite que qualquer classe acesse o membro. Deve ser usado com cautela para garantir que o acesso público não comprometa a consistência dos dados.
- Protected: Permite o acesso ao membro pela própria classe, suas subclasses e classes do mesmo pacote. É útil para permitir o acesso controlado por subclasses, mantendo a privacidade para classes externas.
- Default (sem especificação): Restringe o acesso ao membro para classes do mesmo pacote. É o nível de acesso padrão quando nenhum outro modificador é especificado.

Importância de não expor além do necessário:
- Evitar a exposição pública desnecessária de membros da classe, pois isso pode levar a inconsistências e bugs no sistema.
- Ao expor membros publicamente, eles se tornam mais difíceis de serem alterados posteriormente, aumentando a complexidade da manutenção do código.
- Proteger membros privados e controlar o acesso apenas através de métodos específicos ajuda a garantir a consistência e a integridade dos dados.

Cuidados ao utilizar modificadores de acesso:
- Sempre considere o princípio do encapsulamento ao definir os modificadores de acesso, expondo apenas o que é necessário para o funcionamento correto da classe.
- Evite a exposição pública de membros que podem ser modificados de maneira inadequada por classes externas.
- Lembre-se de que as subclasses também podem acessar membros protegidos, portanto, use-os com cuidado para manter a coesão e a consistência das classes.

Benefícios dos modificadores de acesso:
- Facilitam o controle e a manutenção do código, ajudando a prevenir erros e a garantir a consistência dos dados.
- Promovem a boa prática de programação ao encapsular o comportamento da classe e fornecer uma interface controlada para interações externas.

## Sobreposição de Métodos

Introdução à sobrescrita de métodos:

Sobrescrita de métodos é quando uma subclasse redefine o comportamento de um método que já existe na superclasse.
Esse mecanismo permite especializar o comportamento da subclasse sem modificar a superclasse diretamente.

Exemplo de sobrescrita de método:

Um exemplo dado foi o método liquido na classe Gerente, que sobrescreve o método com o mesmo nome na classe Empregado.
O método liquido na classe Gerente calcula o salário líquido considerando um bônus adicional além do salário base.

Uso da palavra-chave super:

A palavra-chave super é utilizada para chamar o método da superclasse dentro da subclasse.
Isso é útil para evitar duplicação de código e manter a consistência entre a implementação na superclasse e na subclasse.

Modificador final em classes, métodos e variáveis:

- Quando uma classe é declarada com o modificador final, ela não pode ser estendida.
- Quando um método é declarado com final, ele não pode ser sobrescrito por subclasses.
- Quando uma variável é declarada com final, sua referência não pode ser alterada, mas os valores dos seus atributos podem ser modificados se ela for uma referência para um objeto.

Exemplo de uso do modificador final:

- A classe String do Java é um exemplo de classe final, que não pode ser estendida.
- Métodos importantes que não devem ser alterados podem ser declarados como final para garantir que sua funcionalidade seja preservada nas subclasses.
- Variáveis que referenciam objetos podem ser declaradas como final para garantir que a referência não seja alterada, mas os valores dos atributos do objeto podem ser modificados.

## Classes Abstratas

O que são Classes Abstratas?

Classes abstratas são classes em Java que não podem ser instanciadas diretamente. Elas são usadas como base para outras classes. A ideia é fornecer uma superclasse que defina métodos abstratos obrigatórios que as subclasses devem implementar, bem como oferecer implementação de métodos que podem ser compartilhados entre as subclasses.

Quando usar Classes Abstratas?
- Representação de conceitos abstratos: Como no seu exemplo de "Veículo", que é um conceito amplo demais para ser representado como um objeto concreto. Classes abstratas são perfeitas para modelar tais conceitos.
- Compartilhamento de código: Quando várias classes têm métodos com o mesmo código, esse código pode ser colocado na classe abstrata, reduzindo a duplicação.
- Forçar a implementação de métodos: Quando você quer garantir que todas as subclasses implementem certos métodos críticos de maneiras específicas.

```java
abstract class Veiculo {
    private double velocidade;
    
    // Método abstrato
    abstract void mover();

    // Método concreto
    public void setVelocidade(double v) {
        this.velocidade = v;
    }
}

class Carro extends Veiculo {
    @Override
    void mover() {
        System.out.println("O carro está se movendo a uma velocidade de " + velocidade + " km/h.");
    }
}


class Barco extends Veiculo {
    @Override
    void mover() {
        System.out.println("O barco está navegando.");
    }
}
```
## Cadeia de Construtores

Conceito Geral:
Quando uma classe é instanciada em Java, especialmente em uma hierarquia de classes (classes que têm subclasses e superclasses), é importante entender como os construtores dessas classes são chamados. O processo de inicialização de uma instância inicia na classe base (superclasse) e segue até a classe mais específica (subclasse).

Funcionamento dos Construtores:

Chamada Automática de Construtores:

Em Java, quando um objeto é criado, o construtor da classe correspondente é chamado. Se essa classe tem uma superclasse, o construtor da superclasse é chamado primeiro.
Isso garante que todos os atributos herdados da superclasse são inicializados antes da inicialização dos atributos da subclasse.

Uso de super() e this():
- super(): Usado para invocar explicitamente o construtor da superclasse. Se não invocado explicitamente, o compilador insere uma chamada a super() sem parâmetros no início de cada construtor de subclasse.
- this(): Usado para invocar outro construtor na mesma classe, facilitando a reutilização do código de inicialização em vários construtores.

Construtores Default:

Se uma classe não tem nenhum construtor definido, o compilador automaticamente cria um construtor padrão sem parâmetros (construtor default).
Este construtor padrão invocará o construtor padrão da superclasse com super().

Implicações da Definição de Construtores:

Se uma superclasse define um construtor que requer parâmetros e não fornece um construtor sem parâmetros, qualquer subclasse deve explicitamente chamar um dos construtores disponíveis da superclasse usando super(parametros).
Isso é necessário porque, por padrão, o construtor de uma subclasse tentará chamar o construtor padrão (sem parâmetros) da superclasse.

## Importância do Encapsulamento

O que é Encapsulamento?

Encapsulamento é um dos pilares fundamentais da programação orientada a objetos. Ele se refere à prática de esconder os detalhes internos do funcionamento de uma classe e expor apenas o que é necessário para a interação com outras partes do sistema através de uma interface bem definida.

Por que Encapsulamento é Importante?

Simplicidade: Encapsulamento permite aos desenvolvedores interagir com componentes complexos sem entender todos os detalhes internos, similar a como usamos uma televisão sem saber como ela funciona por dentro.

Manutenção: Com o encapsulamento, alterações em uma parte do sistema podem ser feitas com menor risco de impactar outras partes. Isso é crucial em sistemas grandes onde diferentes equipes trabalham em diferentes componentes.

Reusabilidade: Componentes encapsulados podem ser reutilizados em diferentes partes de um sistema ou em diferentes projetos, já que sua implementação interna pode mudar sem afetar aqueles que a utilizam.

Exemplo Prático: A TV e o Controle Remoto

- Usuário de uma TV: Não precisa saber como a TV processa sinais ou gera imagens, apenas como usar o controle remoto.
- Desenvolvedor de software: Não precisa conhecer todas as linhas de código em um sistema grande, mas deve entender bem as interfaces dos módulos com os quais interage.

Aplicando Encapsulamento na Prática

Ao desenvolver um sistema:

- Separação de responsabilidades: Cada classe ou componente deve ter responsabilidades claras e bem definidas. Internamente, como essas responsabilidades são realizadas pode permanecer oculto.
- Definição de interfaces claras: As interações entre diferentes partes do sistema devem ocorrer através de interfaces bem definidas, permitindo que detalhes internos possam evoluir sem impactar outras partes do sistema.

## Métodos de Acesso

Conceito de Métodos de Acesso

Os métodos de acesso, comumente conhecidos como getters e setters, são ferramentas essenciais na programação orientada a objetos para implementar o conceito de encapsulamento. Eles servem como pontes para controlar o acesso aos atributos de uma classe.

Importância dos Métodos de Acesso

- Controle de Acesso: Eles controlam como os atributos de uma classe são acessados e modificados. Isso permite proteger os dados, garantindo que sejam manipulados apenas de maneiras aprovadas.

- Flexibilidade e Manutenção: Mudanças na representação ou no armazenamento de dados da classe não afetam as classes que dependem desses dados, desde que os métodos de acesso se mantenham consistentes.

- Validação de Dados: Os setters permitem implementar validações, assegurando que apenas dados válidos sejam atribuídos aos atributos.

Exemplos Práticos

Classe Atriz: A classe poderia ter atributos como nome, idade, nomeArtístico, entre outros, todos marcados como privados para proteger esses dados. Os métodos de acesso permitem a leitura (e opcionalmente a modificação) desses atributos de forma controlada.

Getter (getNome): Retorna o nome da atriz. Pode, por exemplo, adicionar um título de cortesia baseado em outras propriedades.

Setter (setIdade): Permite definir a idade da atriz, mas com uma verificação para garantir que a idade não seja negativa.

Padrão JavaBeans

Em Java, é recomendado seguir o padrão JavaBeans, usando os prefixos get e set para métodos de leitura e escrita, respectivamente. Isso é importante porque muitos frameworks e bibliotecas Java esperam essa convenção para funcionar corretamente.

Variações nos Retornos dos Getters

Os getters não precisam retornar exatamente o valor do atributo. Por exemplo, ao invés de armazenar a idade, poderia se armazenar a data de nascimento e calcular a idade quando necessário.

Flexibilidade dos Métodos de Acesso

Ao alterar a implementação interna de uma classe (como mudar de idade para data de nascimento), os métodos de acesso podem ser mantidos sem alterações, evitando impactar outras partes do código que dependem dessa classe.

## Interfaces na Orientação a Objetos

Definição de Interfaces:

Uma interface define um conjunto de métodos, mas não fornece sua implementação. Em vez disso, ela estabelece um contrato que outras classes podem implementar.
Uma classe pode implementar múltiplas interfaces, o que permite que ela forneça várias funcionalidades diferentes.

Benefícios das Interfaces:

Flexibilidade: As interfaces permitem que diferentes classes compartilhem comportamentos comuns, mesmo que não tenham uma hierarquia de herança em comum.
Desacoplamento: Ao programar para interfaces em vez de classes concretas, reduzimos o acoplamento entre componentes do software, tornando-o mais flexível e fácil de manter.

Exemplo Prático:

Imagine um cenário em que precisamos modelar objetos que podem se mover, como carros e cavalos, para uma corrida.
Em vez de usar herança (que seria inadequada, pois carros e cavalos não têm uma relação de herança), criamos uma interface chamada Movel que define um método mover().
Tanto a classe Carro quanto a classe Cavalo implementam a interface Movel, fornecendo suas próprias implementações para o método mover().

Uso de Interfaces em Classes:

Uma classe que implementa uma interface é obrigada a fornecer implementações para todos os métodos definidos pela interface.
Isso cria um contrato claro entre a classe e o restante do programa, permitindo a interoperabilidade entre diferentes objetos.

Aplicação em Casos Reais:

Interfaces são amplamente usadas em Java e em muitas outras linguagens de programação para modelar comportamentos comuns e promover o reuso de código.
Elas são particularmente úteis em situações onde a herança não é apropriada ou quando precisamos que diferentes classes forneçam a mesma funcionalidade de maneiras diferentes.

## Interfaces em Java

Introdução:

- Interfaces em Java são contratos que definem comportamentos sem implementações.
- Permitem o compartilhamento de comportamentos comuns entre classes que não têm uma relação de herança direta.

Definição de Interfaces:

- Uma interface em Java é definida com a palavra-chave interface, seguida pelo nome da interface e pelos métodos que ela define.
- Todos os métodos em uma interface são implicitamente abstratos e não têm implementação.
- Além de métodos abstratos, uma interface pode definir constantes (atributos static e final).

Implementação de Interfaces:

- Uma classe implementa uma interface usando a palavra-chave implements.
- Uma classe que implementa uma interface deve fornecer uma implementação para todos os métodos definidos na interface.
- Se uma classe for abstrata, ela pode implementar uma interface sem fornecer implementações para os métodos, deixando-os para suas subclasses.

Herança de Interfaces:

- Uma interface pode estender outras interfaces usando a palavra-chave extends.
- Uma interface pode estender várias interfaces.
- Uma classe pode implementar várias interfaces, fornecendo implementações para todos os métodos definidos nas interfaces que ela implementa.
- Uma classe que implementa uma interface também implementa todas as interfaces estendidas por aquela interface.

Resumo:

- Interfaces em Java são contratos que definem comportamentos sem implementações.
- Permitem o compartilhamento de comportamentos comuns entre classes.
- Uma classe pode implementar várias interfaces e uma interface pode estender várias interfaces.
- Interfaces promovem flexibilidade, desacoplamento e reuso de código em Java.

## Exemplo de Interface

Exemplo Prático - Algoritmo de Ordenação:

O exemplo utilizado é o algoritmo de ordenação de listas de objetos.
Diferentes tipos de objetos podem ser ordenados de acordo com critérios específicos, como strings, números, datas, critérios de desempate em concursos, rankings de jogadores, entre outros.
Apesar das diferentes lógicas de ordenação, o algoritmo subjacente é o mesmo.

Utilização de Interfaces para Reutilização de Código:

Interfaces, como Comparable em Java, permitem que objetos sejam comparáveis e ordenáveis.
O método Collections.sort() em Java pode ser usado para ordenar listas de objetos, desde que esses objetos implementem a interface Comparable.
O método sort() não depende das classes específicas dos objetos, mas sim do contrato definido pela interface Comparable.
Isso permite a reutilização de código, já que o método sort() pode ser usado com qualquer classe que implemente a interface Comparable, independentemente de quando ou por quem a classe foi criada.

## Entendendo Polimorfismo

Introdução ao Polimorfismo:

Polimorfismo é a capacidade que as classes têm de assumir a forma da sua superclasse ou das interfaces que implementam, de acordo com a necessidade.
Analogamente, na natureza, vemos exemplos de animais que assumem diferentes formas ao longo de sua vida, como a lagarta que se transforma em borboleta.

Aplicação do Polimorfismo:

Polimorfismo permite que objetos de diferentes classes sejam tratados de forma uniforme, desde que atendam aos contratos definidos pelas superclasses ou interfaces.
O polimorfismo possibilita a passagem de objetos de subclasses para métodos que aceitam a superclasse, ou objetos que implementam interfaces para métodos que aceitam essas interfaces.
Por exemplo, um método que aceita um animal como parâmetro pode receber objetos de diversas subclasses de animal, como cavalo, pássaro, ou aracnídeo.
Da mesma forma, um método que recebe um objeto móvel pode aceitar objetos de diferentes classes que implementam a interface móvel, como cavalo, carro ou bicicleta.

Comportamento Polimórfico:

Mesmo quando o mesmo método é chamado para diferentes objetos, o comportamento desse método pode variar de acordo com a classe real do objeto.
A implementação do método é definida pela classe concreta do objeto, mas o contrato é definido pela superclasse ou interface.
Assim, o comportamento do método pode ser estendido ou alterado simplesmente passando uma nova implementação da interface ou superclasse.

Importância do Polimorfismo:

O polimorfismo é fundamental para criar código flexível e reutilizável na orientação a objetos.
Permite que diferentes classes assumam a forma de uma interface ou superclasse, possibilitando a implementação de soluções flexíveis e altamente reutilizáveis.
O poder da orientação a objetos reside em grande parte no polimorfismo, que permite que o código seja escrito para contratos (interfaces ou superclasses) em vez de classes específicas.

## Tratamento de Erros

Retornar Valores Específicos para Indicar Erros:

- Retornar valores específicos (como -1) em métodos para indicar erros pode ser confuso e ambíguo.
- Dificuldade de compreensão para quem chama o método.
- Valores escolhidos podem ser válidos em outras situações, levando a ambiguidades.
- Falta de informações detalhadas sobre o erro específico que ocorreu.
- Não permite distinguir entre diferentes tipos de erros.

Guardar Erros em Variáveis Globais:

- Guardar erros em variáveis globais (ou estáticas) pode levar a problemas semelhantes aos das variáveis globais.
- Dificuldade de garantir a limpeza da variável após o tratamento do erro.
- Possibilidade de interferência entre processos concorrentes.

Introdução às Exceções:

- O Java e várias outras linguagens utilizam mecanismos de exceção para lidar com erros de forma mais eficaz.
- As exceções oferecem uma maneira mais robusta e flexível de lidar com situações de erro na programação orientada a objetos.

## Exceções em Java

Definição de Exceção:

Uma exceção é uma classe especial que representa um erro ou problema que ocorreu durante a execução de um programa.
Hierarquia de Classes de Exceção:

As exceções são subclasses da classe "Exception", que por sua vez é uma subclasse da classe "Throwable".

Existem duas categorias principais de exceções: "Error" e "Exception".
- "Error" inclui problemas mais graves, como falhas de hardware ou problemas no sistema operacional.
- "Exception" inclui erros que podem ser tratados no código, como exceções de banco de dados, de entrada e saída, de formatação de data, entre outras.

Exceções do Tipo "RuntimeException":

São exceções que ocorrem durante a execução do programa e não são verificadas em tempo de compilação.
Exemplos incluem "ArithmeticException", "ClassCastException", "NullPointerException", entre outras.
Não é obrigatório declarar ou tratar explicitamente exceções do tipo "RuntimeException".

Exceções do Tipo "Exception":

São exceções que podem ser verificadas em tempo de compilação e geralmente precisam ser tratadas.
Exemplos incluem "SQLException", "IOException", exceções de impressão, entre outras.
É necessário declarar ou tratar explicitamente exceções do tipo "Exception".

Declaração de Exceções:

Um método que pode lançar uma exceção deve declará-la na sua assinatura, utilizando a palavra-chave "throws".
Isso informa aos chamadores do método que eles devem estar preparados para lidar com a exceção.

Tratamento de Exceções:

Exceções podem ser tratadas utilizando blocos "try-catch", onde o código suscetível a erros é colocado dentro do bloco "try" e o tratamento do erro é realizado no bloco "catch".
Também é possível propagar a exceção para quem chamou o método, utilizando a declaração "throws" na assinatura do método.

## Stack Trace de Exceção

Definição de Stack Trace:

O Stack Trace é o rastro deixado por uma exceção, que mostra a pilha de execução do programa até o ponto onde a exceção ocorreu.

Importância do Stack Trace:

O Stack Trace é fundamental para a detecção e resolução de erros em um programa.
Ele fornece informações sobre a sequência de chamadas de métodos que levaram à exceção, ajudando a identificar a origem do erro.

Interpretação do Stack Trace:

Ao analisar o Stack Trace, é possível identificar a classe e o método onde a exceção ocorreu, bem como a linha de código específica.
Isso auxilia os desenvolvedores a localizar e corrigir o erro de forma mais eficiente.

Componentes do Stack Trace:

O Stack Trace inclui informações sobre as classes e métodos chamados, desde o método main até o ponto onde ocorreu a exceção.
Também pode conter informações sobre classes do sistema e do framework utilizadas pelo programa.

Utilização do Stack Trace para Debugging:

Ao enfrentar um erro, é importante ler e interpretar o Stack Trace para entender a causa do problema.
Isso permite aos desenvolvedores localizar o erro e tomar as medidas necessárias para corrigi-lo.

Exemplo de Leitura do Stack Trace:

O Stack Trace geralmente inclui o nome da exceção, a mensagem de erro, a sequência de chamadas de métodos e a linha de código onde ocorreu o erro.

## Tratando Exceções

Compreensão do Fluxo de Execução:

Quando uma exceção ocorre dentro de um bloco try, o fluxo de execução salta diretamente para o bloco catch correspondente. O código que segue o ponto onde a exceção ocorreu dentro do bloco try não é executado.

Tratamento de Exceções Múltiplas:

É possível ter vários blocos catch para tratar diferentes tipos de exceções. O primeiro bloco catch cuja exceção corresponder ao tipo lançado será executado. Por isso, é importante organizar os blocos catch com subclasses primeiro e superclasses depois.

Uso do Finally:

O bloco finally é executado independentemente de ocorrer uma exceção ou não. É frequentemente utilizado para garantir que recursos, como conexões de banco de dados ou arquivos, sejam fechados adequadamente, mesmo em caso de exceção.

Impacto do Posicionamento dos Blocos Try-Catch:

O posicionamento dos blocos try-catch pode afetar o comportamento do programa. Se um bloco try-catch estiver dentro de um loop, ele continuará a iterar após a exceção ser tratada. Se estiver fora do loop, a exceção interromperá o loop.

Considerações sobre o Tratamento de Exceções:

A correta manipulação de exceções é crucial para o funcionamento robusto de um software.
Erros de tratamento de exceções inadequado podem levar a problemas graves no software, especialmente quando ocorrem em produção.

Teste Adequado do Tratamento de Exceções:

É importante testar o tratamento de exceções, incluindo cenários de erro, durante o desenvolvimento do software para garantir que ele se comporte conforme o esperado em todas as situações.

Boas Práticas de Programação:

É fundamental seguir boas práticas ao lidar com exceções, como organizar os blocos catch corretamente, fechar recursos no bloco finally e posicionar os blocos try-catch de acordo com a lógica do programa.

## Testando Exceções

Teste de Funcionalidades que Lançam Exceções:

É essencial testar as funcionalidades de uma classe em cenários onde a execução não ocorre conforme o esperado, ou seja, quando ocorrem exceções.

Anotação @Test do JUnit:

A anotação @Test do JUnit pode ser utilizada para indicar que um teste espera que uma exceção específica seja lançada durante sua execução. Se a exceção ocorrer, o teste é considerado bem-sucedido.

Uso da Construção try-fail:

Quando se deseja que uma exceção ocorra em um ponto específico do código, pode-se utilizar a construção try-fail. Nesse caso, o ponto onde se espera a exceção é colocado dentro de um bloco try, seguido pelo método fail(), que faz o teste falhar se o código passar por ali sem lançar a exceção esperada.

Verificação de Informações da Exceção:

Para verificar informações específicas contidas na exceção lançada, pode-se realizar essa verificação dentro do bloco catch. Isso é útil quando se deseja garantir que determinados detalhes estejam presentes na mensagem de erro, por exemplo.

Declaração do throws no Método de Teste:

Se um método de teste pode lançar uma exceção durante sua execução, basta declarar essa exceção com a palavra-chave throws no próprio método de teste. Se a exceção ocorrer durante a execução do teste, ele será considerado falho.

Simplificação do Teste de Exceções:

Não é necessário adicionar blocos try-catch nos testes para verificar se uma exceção ocorreu. Basta declarar a exceção no método de teste e o framework de teste cuidará do restante.
