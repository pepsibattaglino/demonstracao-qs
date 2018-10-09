# Demonstração Selenim - Qualidade de Software

O ojetivo deste projeto é testar o site [automationpractice.com](http://automationpractice.com/index.php), como demonstração prática de conhecimento em automação de testes de software usando Selenium para a cadeira de Qualidade de Software do curso Senac POA.

## Começando

Siga as instruções a seguir.

### Pré-requisitos

Para o correto funcionamento é necessário ter instalado no próprio ambiente o [Java Development Kit (JDK)](http://www.oracle.com/technetwork/java/javase/downloads/index.html) e o [Maven](https://maven.apache.org/download.cgi).

### Instalação para Windows

Após ter efetuado o download do [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) para indicar a sua localização no sistema operacional, é preciso criar a variável de ambiente `JAVA_HOME`.

![](https://javapointers.com/wp-content/uploads/2014/04/new-system-variable.png)

O próximo passo é instalar o [Maven](https://maven.apache.org/download.cgi), para isso descompacte o arquivo baixado e adicione o diretório `bin` à variável de ambiente `PATH`.

Para verificar a correta instalação abra o prompt e digite o comando:
```
mvn --version
```
ou
```
mvn -v
```

O sistema deverá retornar a versão que foi instalada do Maven.

Para maiores informações consulte a [documentação oficial](https://maven.apache.org/install.html).

## Execução dos testes

Para iniciar a execução dos testes, abra o prompt e execute o comando:
```
mvn clean test
```

## Tecnologias e ferramentas

* [Java](http://www.oracle.com/technetwork/java/javase/overview/index.html) - Linguagem de programação
* [Maven](https://maven.apache.org/) - Gerenciamento de projeto e dependências
* [JUnit ](https://junit.org/junit4/) - Framework para escrita dos testes
* [Selenium WebDriver](https://www.seleniumhq.org/projects/webdriver/) - Framework para automação de testes de software 
* [WebDriver Manager](https://github.com/bonigarcia/webdrivermanager) - Gerenciamento automático de binários do Selenium WebDriver
* [Travis CI](https://travis-ci.org/) - CI
* [Eclipse](https://www.eclipse.org/) - IDE

## Autores

* **Giuseppe Battaglino** - [LinkedIn](https://www.linkedin.com/in/giuseppe-battaglino-1990/)
* **Bernardo Araujo** - [LinkedIn](https://www.linkedin.com/in/bernardo-c-araujo/)
