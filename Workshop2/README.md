# Workshop2 RestFul con SpringBoot



Esta sesión tiene como intención crear un RestFul services usando SpringBoot 
___

**Nivel:** Básico
___
**Conocimientos previos:**

- Maven
- Git
- JSON

**Herramientas a utilizar:**

- cmd o terminal
- IDE para trabajar con SpringBoot
- [Advanced REST client](https://chrome.google.com/webstore/detail/advanced-rest-client/hgmloofddffdnphfgcellkdfbfbjeloo)


# Archivos

En esta sesion trabajaremos con tres archivos:

- Developer.java = Es una clase con 3 propiedades (id, firstName, lastName)
- DeveloperController.java = Recibe las peticiones HTTP
- DeveloperServiceBean.java = Contiene los métodos para la manipulación de los registros
- DeveloperReader.java = contiene los registros del objeto Developer en formato JSON


# ¿Qué es RESTFUL?

es un estilo de Arquitectura a la hora de realizar una comunicación que se ejecuta sobre HTTP entre cliente y servidor.

#Métodos de RESTFUL

- **POST** para crear un registro
- **GET** para obtener un registro
- **PUT** para cambiar algún campo del registro
- **DELETE** para eliminar un registro
___

# ¿Que es SpringBoot?


[Spring Boot](https://projects.spring.io/spring-boot/) nace con la intención de simplificar los pasos de configurar jar en el proyecto y desplegar en servidor y que solo nos podamos centrar en el desarrollo de nuestra aplicación. 

# Procedimiento

**1.** Clonar el proyecto desde github

```
git clone https://github.com/medellinjug/LearningJava.git
```
**2.** En cmd o en la terminal entrar al proyecto

**3.** Entrar a la carpeta workshop2 y con Maven hacer clean, compile y package

**4.** Ejecutar el .jar que se encuentra en la carpeta target

```
java -jar (archivo ejecutable).jar
```
**5.** Abrimos [Advanced REST client](https://chrome.google.com/webstore/detail/advanced-rest-client/hgmloofddffdnphfgcellkdfbfbjeloo):

- En la lista de **method** seleccionar GET, en el campo **Request URL**: http://localhost:8080/developers y luego seleccionar **SEND**
(Nos debe traer todos los developers en formato JSON)

- En la lista de **method** seleccionar POST, en el campo **Request URL**: http://localhost:8080/developers, seleccionar la pestaña Body, en Body content type seleccionar application/json y en el cuadro de texto escribir
  en formato JSON cinco registros con las propiedades firstName y lastName, al terminar dar clic en **SEND**
  (Nos debe crear los registros que escribimos)

- En la lista de **method** seleccionar GET, en el campo **Request URL**: http://localhost:8080/developers/firtsName/P y luego seleccionar **SEND**
(Nos debe traer todos los registros que tenga en el nombre la letra P en formato JSON)

- En la lista de **method** seleccionar PUT, en el campo **Request URL**: http://localhost:8080/developers/1 seleccionar la pestaña Body, en Body content type seleccionar application/json y en el cuadro de texto escribir
en formato JSON  las propiedades y el campo que desea modificar, al terminar dar clic en **SEND** (Debe cambiar los campos que modificamos)

- En la lista de **method** seleccionar DELETE, en el campo **Request URL**: http://localhost:8080/developers/1 
  y dar clic en **SEND** (Se elimina el registro que tenia el id=1)
  
**6.** En la clase DeveloperController.java en la linea 54 crear el método que filtre por lastName y comprobar su funcionamiento.
___  






