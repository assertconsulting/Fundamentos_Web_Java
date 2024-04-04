# Serverest Web Automation - Java

## Objetivo do Framework
Este framework utiliza Java e Selenium WebDriver para automatizar testes de login na aplicação web Serverest. O objetivo é validar a funcionalidade de login, garantindo que os usuários possam acessar a aplicação com suas credenciais.

## Pré-requisitos
- Java: A linguagem de programação utilizada para escrever os testes.
- Selenium WebDriver: Uma biblioteca em Java para automação de navegadores web.
- ChromeDriver: O driver para o navegador Chrome que permite ao Selenium interagir com o navegador.
- IDE: IntelliJ

## Configuração do Ambiente
- Instale o JDK (Java Development Kit) a partir do [site oficial](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

## Instalação das Dependências
- Instale o Java e configure o JAVA_HOME em seu sistema.

## Executando o Teste
Compile e execute o arquivo `LoginTest.java`. Se estiver usando uma IDE como IntelliJ IDEA ou Eclipse, você pode executar o arquivo diretamente pela IDE.

## Estrutura do Código
- `LoginTest.java`: Contém o código do teste automatizado. Inclui métodos anotados para a configuração inicial (`@BeforeEach`), execução do teste (`@Test`) e limpeza (`@AfterEach`).

## Descrição dos Métodos
- `setUp`: Prepara o ambiente de teste, inicializando o WebDriver.
- `testSuccessfulLogin`: Executa o teste de login propriamente dito, incluindo navegação, preenchimento de credenciais e submissão do formulário.
- `tearDown`: Fecha o navegador e finaliza a sessão de teste após a execução.

## Notações Usadas
- `@BeforeEach`: Executa o método antes de cada teste.
- `@Test`: Indica que o método é um teste.
- `@AfterEach`: Executa após cada teste para limpeza.
