# basic-spring-boot

# Técnologias
Java 8 ou superior
Maven 3.5.2 ou superior

# Execucao
mvn spring-boot:run

Execucao direta unico java-jar
mvn package && java -jar target/spring-boot-example-0.1.0.jar

Limpar o projeto e empacotar o mesmo
mvn clean package

Executar o jar do projeto (gerado por padrao na pasta target)
java -jar springboot-0.0.1-SNAPSHOT.jar

Comando responsavel por exebir todo o conteudo do nosso jar
jar tf springboot-0.0.1-SNAPSHOT.jar | less

Alterando o empacotamento para war
<packaging>war</packaging>

Para adicionar o projeto ao tomcat basta colocar o .war que se encontra na pasta
target dentro do webapps e subir o tomcat.
bin/./starup.sh

FatJar / UberJar

* Spring Boot Profiles

* Arquivos .yml

Argumentos passados por meio da linha de comando tem prioridade sobre o as config presentes nos arquivos .properties/.yml

mvn spring-boot:run -Dserver.port=8085

* Srping Boot e variáveis de ambiente com a anotação @Value({NOME_VARIAVEL})