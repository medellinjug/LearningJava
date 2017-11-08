# workshop1

## November 1st 2017

Ejemplo de como trabajar con  proyectos estructurados con  tecnología **maven** en repositorios git.
___

El proyecto contiene la siguiente estructura maven:

    
        LearningJava
        |-- pom.xml
        `-- src
            |-- main
            |   `-- java
            |       `-- com
            |           `-- hillmer
            |                   `-- MyClass.java
            `-- test
                `-- java
                    `-- com
    
    
___


## Plataformas

#### Descargue e instale `git` o `git-bash`

- Asegúrese de tener un cliente `git` instalado en su máquina local machine/VM/vagrant box, para usuarios Windows `git-bash` es recomendado o ejecutar el siguiente comando en la terminal:

    ```
        git --version
    ```

#### Descargue e instale Maven

- Asegúrese de tener instalado la tecnología Maven, puede verificar por la terminal ejecutando el siguiente comando: 

    ```
        mvn --version
    ```

#### Descargue e instale JDK 9

- Asegúrese de tener instalado el JDK 9, puede verificar por la terminal ejecutando los siguientes comandos: 

    ```
        java --version 
        javac --version
    ```


## Clonar el proyecto

#### Para ejecutar los comandos:

+ **Windows:** Terminal cmd o terminal de Git Bash
+ **Mac OS:** Terminal
+ **Linux:**  Terminal

+ Nos ubicamos en la ruta donde se desea agregar el proyecto y ejecutamos el comando **clone** para obtener el proyecto del repositorio.

    ```
        git clone https://github.com/medellinjug/LearningJava.git
    ```

## Comandos Maven

+ Para compilar el archivo **pom.xml** del proyecto ejecutamos el siguiente comando

    ```
        mvn compile
    ```

+ Luego lo empaquetamos

    ```
        mvn package
    ```


## Comandos GIT

+ Después de realizar cambios en el proyecto se verifica que si hayan quedado guardados los cambios.

    ```
        git status
    ```

**Nota:** Este comando **git status** nos muestra el estado de trabajo en el proyecto.

___


######  Cuando no se han generado cambios en el proyecto nos mostrara lo siguiente: nothing to commit, working tree clean

######  De lo contrario si se generaron cambios el mostrara la lista de archivos que se han modificado  y se han agregado al commit (Color rojo) y también nos muestra la lista de archivos que se han modificado y que se hayan agregado al commit (Color verde).

___

+ Después de revisar que se hayan guardado los cambios realizados en el proyecto ejecutamos el comando **add** para que al realizar el commit este tenga en cuenta estos archivos que se van agregar.

    ```
        git add .
    ```

**Nota:** El punto (.)  después del **add** nos indica que nos va a agregar todos los archivos que se han modificado, si no queremos agregar todos los archivos modificados sino agregar uno en especifico se ejecuta el siguiente comando: **git add nombreDelArchivo.java**

+ Al agregar los archivos podemos ejecutar el comando **commit**  para confirmar los cambios y enviarlos al repositorio remoto.

    ```
        git commit -m "Breve descripción de los cambios"
    ```

+ Ejecutamos el comando  **pull** para actualizar el proyecto, este comando trae el proyecto actualizado desde el repositorio de los cambios que han realizado otros desarrolladores.

    ```
        git pull
    ```

**Nota:** Este comando se debe ejecutar antes de realizar el **push** ya que para enviar commit al repositorio debemos tener el proyecto actualizado.

+ Por ultimo, se manda el commit confirmando los cambios al repositorio remoto de GitHub

    ```
        git push
    ```


## Recursos

### Lecturas recomendadas

- [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html "Maven in 5 Minutes")
- [Documentation git](https://git-scm.com/book/en/v2 "Documentation git")


### Otros recursos

- [JDK 9 / Jigsaw Resources](./Java-9-Resources.md "JDK 9")
- [Git](https://git-scm.com/downloads "Git")
- [Maven](https://maven.apache.org/download.cgi "Maven")
