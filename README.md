# struts-app

Aplicação web de exemplo construída com Apache Struts 2 e Maven. Fornece páginas JSP para criar e listar encomendas (modelo `Order`), usando actions em `com.danilo.lima.actions`.

## Sumário rápido
- Sobre
- Pré-requisitos
- Como compilar
- Como executar / deploy
- Endpoints principais / páginas
- Validações (cliente/servidor)
- Estrutura do projeto
- Testes
- Próximos passos / melhorias
- Troubleshooting

## Sobre
Projeto de demonstração para aprendizado de Struts 2 (tags, forms e actions). Contém um formulário de criação de encomendas e listagem de encomendas.

## Pré-requisitos
- Java 11
- Maven 3.6+
- Um servlet container compatível (Tomcat 9+, Payara, WildFly, etc.) que suporte Jakarta Servlet API 5.0

## Como compilar
Gerar o WAR com Maven:
```bash
mvn -DskipTests package
```
O artefato gerado estará em `target/struts-app.war` (nome final conforme `pom.xml`).

## Como executar / deploy
1. Copie o WAR para o diretório `webapps` do Tomcat (ou use seu processo de deploy).
2. Acesse a aplicação via navegador em:
	 - `/struts-app/` ou `/struts-app/index.jsp` (dependendo do contexto)
	 - Ações Struts: `order-list.action`, `order-create.action` (consulte `src/main/resources/struts.xml` para confirmações)

Dica de desenvolvimento: para facilitar execução local você pode adicionar um plugin de servidor embutido (ex.: Jetty/Tomcat Maven plugin) ao `pom.xml` para rodar com `mvn jetty:run` ou `mvn tomcat7:run`.

## Páginas / Endpoints principais
- `index.jsp` — página inicial
- `order-create.jsp` — formulário para criar encomendas
- `order-list.jsp` — lista de encomendas
- Actions Java em `com.danilo.lima.actions` (ver `OrderAction.java`)

## Validação
- Cliente: o `order-create.jsp` já contém validação de campos via tags Struts (`required` e `requiredMessage` para `order.recipientName` e `order.address`) — isto mostra mensagens no formulário.
- Servidor (recomendado): adicione validação no Action ou via Struts Validation (arquivo `validation.xml`) para garantir regras no backend (essencial para evitar entrada inválida que bypassa cliente).

## Estrutura de código (visão rápida)
- `src/main/java/com/danilo/lima/actions` — Actions Struts (lógica de controlador)
- `src/main/java/com/danilo/lima/models` — Modelos (ex.: `Order.java`)
- `src/main/java/com/danilo/lima/enums` — Enums (ex.: `StatusEnum.java`)
- `src/main/resources/struts.xml` — Configuração Struts
- `src/main/webapp` — JSPs e recursos web

## Testes
- Atualmente não há testes automatizados.

## Próximos passos / melhorias sugeridas
- Implementar validação no servidor (Struts validation XML ou lógica no Action).
- Adicionar testes automatizados (unit + integração).
- Incluir plugin Maven para rodar a app localmente (Jetty/Tomcat) e documentar o comando.
- Adicionar Dockerfile para empacotar a aplicação e facilitar deploy.
- Melhorar experiência do formulário: exibir erros por campo ao lado do input (usar `<s:fielderror field="order.recipientName"/>` se quiser).
- Internacionalização (i18n) das mensagens (mensagens de validação em `messages.properties`).

## Troubleshooting
- Erro de versão do Servlet API na runtime: verifique se o container suporta Jakarta Servlet 5 (dependência `jakarta.servlet-api` está como provided).
- Mensagens de validação não aparecem: confirme se o theme do form e os tags estão configurados corretamente.
