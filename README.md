# MD5 Hash - Java
Por Yan Pereira
### Sumário
- [Introdução](https://github.com/Yanzord/cifra-cesar#introdução)
- [Requisitos](https://github.com/Yanzord/cifra-cesar#requisitos)
- [Execução](https://github.com/Yanzord/cifra-cesar#execução)
- [Funcionamento](https://github.com/Yanzord/cifra-cesar#funcionamento)
## Introdução
Este programa foi desenvolvido para o trabalho de *Hash* da disciplina de Segurança da Informação, do curso
de Engenharia da computação do Centro Universitário de Técnologia - UNIFTEC.
O programa utiliza o algorítmo [MD5](https://pt.wikipedia.org/wiki/MD5) de geração de hash para realizar uma simulação de um ataque de força bruta, comparando as hashs
geradas a partir de um arquivo de palavras fornecido pelo usuário (*dicionario.txt*) com as hashs a serem descobertas de outro arquivo (*hashes.txt*), também fornecido pelo usuário.
## Requisitos
Para compilar e executar o programa é necessário alguns pré-requisitos configurados na máquina:
- O [Java JDK 8](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html) deve estar instalado, baixe a versão correspondente ao seu sistema e instale-a;
- As variáveis JAVA_HOME e CLASSPATH devem estar configuradas:
    1. Para windows 8 e 10:
        1. Abra o terminal;
        2. Execute os comandos abaixo:
            ```
            setx JAVA_HOME "<diretório-onde-jdk-foi-instalado>"
            setx CLASSPATH %JAVA_HOME%\lib
            setx PATH %PATH%;%JAVA_HOME%\bin
    	    ```
    	3. Feche o terminal.
    2. Para linux:
        1. Abra o Terminal;
        2. Edite o arquivo /etc/profile com o comando abaixo:
            ```
            sudo gedit /etc/profile
            ```
        3. Adicione as linhas abaixo no inicio do arquivo /etc/profile:
            ```
            JAVA_HOME=diretório-onde-jdk-foi-instalado
            CLASSPATH=.;$JAVA_HOME/lib
            PATH=$PATH:$JAVA_HOME/bin
            export JAVA_HOME
            export CLASSPATH
            export PATH
    		```
    	4. Salve o arquivo e efetue um logoff para que as variáveis de ambiente entrem em vigor.
## Execução
Para executar o programa é necessário compilá-lo:
- Abra o terminal;
    - Execute o comando abaixo para windows (para linux troque a \ por /):
        ```
        .\gradlew clean build
        ```
    - Após a execução do comando o programa será compilado na pasta build\libs.
- Após compilado, execute o programa:
    - No terminal, a partir do diretório do programa, acesse a pasta build\libs;
    - Execute o comando abaixo:
        ```
        java -jar java-md5-1.0-SNAPSHOT.jar
        ```
    - Após a execução do comando o programa será iniciado no terminal.
## Funcionamento
O programa é executado no console e não há input de dados, apenas a saída é apresentada com as hashs do arquivo *hashes.txt* e suas respectivas palavras, caso elas existam no arquivo *dicionario.txt*. Caso algum dos arquivos esteja vazio, o programa solicita o preenchimento e encerra a execução. Não é recomendado a execução do programa com arquivos grandes (como wordlists: *rockyou.txt*), pois o programa não é otimizado para tal.		    	    
