### DAO:
- DAO (Data Access Object): é um padrão de projeto que abstrai e encapsula os mecanismos de acesso a dados escondendo os detalhes da execução da origem dos dados.

---

### Exemplo formulário...

```html
<form action="phpisbetterthanjava.php" method="post">
  <label for="name">Name:</label>
  <input type="text" name="name" class="login-input" id="name"/>

  <label for="password">Password:</label>
  <input type="password" name="password" class="login-input" id="password" />

  <input type="submit" value="Go!" />
</form>
```


---

### JEE: 
- Especificação para construir aplicações corporativas (enterprise), de "alta" escalabilidade, com segurança, etc...

### JRE: 
- Java Runtime Edition:  Máquina virtual para rodar o binário do java.

### JSE: 
- Java Standart Edition: Ambiente de desenvolvimento do computador.

### Container:
- Ambiente de execução
- Para rodar dentro de um container, precisa estender alguém que conheça o container

### Web Container:
- Rodamos alguns estereótipos de classes Java, tais como; JSP, Servlets, Taglib entre outros.
- JSP estende Servlet.
- Quando uma página JSP é construída, implicitamente você está estendendo um servelet, pois a página JSP quando é executada pela primeira vez ela é transformada em um servlet.
- O frontend da aplicação web.

### EJBs: Enterprise Java Bean 

### 3 camadas web
- HTML: Estruturação do conteúdo.
- CSS: Apresentação, estilo.
- JS: Comportamento.

### DOM:
- Document Object Model.
- Hierarquia.

### JSP:
- Java Server Page.
- Tecnologia de páginas dinâmicas em Java

#### Tags JSP

```java

// Diretiva
// Elementos que permitem enviar mensagens para o container JSP e que 
// afetam como são compiladas as páginas JSP. 
// As principais diretivas são page, include e taglib.
// Exemplo:
<%@ include file=”header.jsp” %>


// Declarativa
// Nas declarações JSP, pode-se colocar qualquer coisa que seja válida pôr em uma classe. Por
// exemplo, definições de campos , definições de métodos, definições de classes internas, blocos
// estáticos de inicialização.Na prática, porém, usam-se declarações para declarar e inicializar
// campos, bem como para implementar métodos.
// Como as declarações não geram saídas, elas comumente são usadas em conjunto com
// expressões ou scriptlets.
<%! campo ou método %>


// Scriptlet
// Usa-se scriptlet para fazer algo mais complexo do que simplesmente produzir 
// o valor de uma expressão. Por exemplo, para executar código que contenha 
// iterações (loops), decisões ou outras operações complexas como escrever 
// para o registro do servidor (server log) e produzir HTML condicionalmente.
// Scriptlets também têm acesso às variáveis definidas automaticamente como 
// request, response, session, out.
// O uso excessivo de scriptlets pode levar a páginas JSP que são difíceis de 
// entender e manter.
// Por isso, deve-se restringir seu uso à geração de listas ou tabelas de dados 
// que resultam de consultas a bancos de dados.
<% código Java %>

// Expressão
// Usam-se expressões para inserir valores na página enviada ao cliente.
// Quando uma página é requisitada, a expressão é avaliada, convertida para 
// uma string e inserida na página. Ou seja, expressões são avaliadas em 
// tempo de execução.
<%= expressão Java %>

```

### Objetos implícitos
- São instanciados pelo container.

| Objetos                   | Descrição                                                           |
|--------------------------- | ------------------------------------------------------------- |
| Out                          | Método do tipo Writter, utilizado para exibir dados na página. exemplo: `out.println(“Ola Mundo”);`|
| Request                  | Objeto que permite acesso a parâmetros enviados pelo cliente, pelo método HTTP (GET ou POST). |
| Response               | Permite acesso à resposta que será enviada ao usuário |
| Session                  | Acesso a sessões |
| application | Objeto que referencia a classe ServletContext e permite que sejam armazenados valores, ao quais serão compartilhados por toda aplicação, por meio dos métodos setAttribute e getAttribute.|
| Config | Objeto utilizado para a leitura de parâmetros de inicialização.|
| exception | Permite que as páginas JSP sejam definidas como páginas de erros. |
| pageContext | Objeto que é um ponto de acesso a muitos atributos da página |
| Page | Semelhante a referência `this` utilizada em classes java. |

### Servlet
- Busca e atualiza o model da página
- Servlets são classes Java, desenvolvidas de acordo com uma estrutura bem definida, e que, quando instaladas junto a um Servidor que implemente um Servlet Container (um servidor que permita a execução de Servlets, muitas vezes chamado de Servidor de Aplicações Java), podem tratar requisições recebidas de clientes.
- 3 fases: inicialização, atendimento de requisições e finalização.

### O que é um Java Bean?
- Java Object Notation.
- Getter & Setter.
- Método construtor default.

### JSON
- JavaScript Object Notation

```javascript
// M27 Infantry Automatic Rifle
{
  "name": "M27 IAR",
  "type": "Squad Automatic Rifle",
  "designer": "H&K",
  "designed": "2008",
  "weight": "3.6Kg empty",
  "cartridge": "5.56x45mm NATO"
}

// Alunos...
{ "Aluno" : [ 
        { "nome": "João", "notas": [ 8, 9, 7 ]  },
        { "nome": "Maria", "notas": [ 8, 10, 7 ] },
        { "nome": "Pedro", "notas": [ 10, 10, 9 ] } 
    ]
}
```

---

### O que é internet?
- É um conjunto de redes de computadores que utilizam o protocolo TCP/IP para comunicar entre si.

### O que é www?
- É uma aplicação criada para permitir o compartilhamento de arquivos (HTML e outros), tendo o  navegador como ferramenta de acesso a web.

#### Resumindo, Internet é rede de computadores. WWW é uma aplicação para rodar nessas redes.

---

### Sessions:
- Sessions permite definir desde de parâmetros, configurações e objetos que são persistidas durante toda a sessão do usuário. Uma sessão é única  por browser e IP. Logo cada sessão persiste suas próprias definições...

---
 TODO

* O que é uma request?
* O que tem dentro de uma request?
* O que é um response?
* O que tem dentro de um response?
* O que é um objeto page?
* O que é um objeto session?
* Pra que serve Session?


