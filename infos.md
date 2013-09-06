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
<%@ %>


// Declarativa
<%! %>


// Scriptlet
<% %>

// Expressão
<%= %>

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

### Servlet?
- Busca e atualiza o model da página

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


