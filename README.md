# Basic Spring-Boot
Prática de conceitos basicos do Spring-Boot.

# Técnologias
- [Java](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Maven](https://maven.apache.org/)
- [Lombok](https://projectlombok.org/)

## Uso

Clone
```bash
$ git clone https://github.com/WillianFarias/basic-spring-boot.git
```

Execucao
```bash
mvn spring-boot:run
```

Execucao direta java-jar
```bash
mvn package
java -jar target/spring-boot-example-0.1.0.jar
```

Limpar o projeto e empacotar o mesmo
```bash
mvn clean package
```

Executar o jar do projeto (gerado por padrao na pasta target)
```bash
java -jar springboot-0.0.1-SNAPSHOT.jar
```

Comando responsavel por exebir todo o conteudo do nosso jar
```bash
jar tf springboot-0.0.1-SNAPSHOT.jar | less
```

Alterando o empacotamento para war
```bash
<packaging>war</packaging>
```

Para adicionar o projeto ao tomcat basta colocar o .war que se encontra na pasta
target dentro do webapps e subir o tomcat.
```bash
bin/./starup.sh
```
#### Demais temas que foram abordados durante o desenvolvimento
FatJar / UberJar

* Spring Boot Profiles

* Arquivos .yml

Argumentos passados por meio da linha de comando tem prioridade sobre o as config presentes nos arquivos .properties/.yml

mvn spring-boot:run -Dserver.port=8085

* Srping Boot e variáveis de ambiente com a anotação @Value({NOME_VARIAVEL})