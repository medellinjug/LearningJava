# Workshop3 HTML5 + Bootstrap + Angular JS

Esta sesión tiene como intención crear la vista del proyecto con HTML5, Bootstrap y Angular JS
___

**Nivel:** Básico
___
**Conocimientos previos:**

- HTML5
- Bootstrap
- Angular JS

**Herramientas a utilizar:**

- cmd o terminal
- IDE para trabajar con SpringBoot

# Archivos

En esta sesión trabajaremos con los siguientes archivos:

- DeveloperController.js= Es un archivo JavaScript que contiene el código angular js para ejecutar los metodos del service
- developerAdd.html, developerShow.html y index.html = Son archivos HTML donde se realiza la vista del proyecto junto al Angular y Bootstrap

# Procedimiento

**1.** Clonar el proyecto desde github

```
git clone https://github.com/medellinjug/LearningJava.git
```
**2.** En cmd o en la terminal entrar al proyecto 

**3.** Entrar a la carpeta workshop3 y con Maven hacer clean, compile y package

**4.** Ejecutar el .jar que se encuentra en la carpeta target

```
java -jar (archivo ejecutable).jar
```
**5.** Al abrir el archivo DeveloperController.js podemos observar las funciones para buscar todos los developers y agregar un developer.


*Show all developers*

```
$scope.searchAllDeveloper = function () {

            $scope.developerList = null;

            $http.get($scope.urlDeveloper).then(function (response) {
                $scope.developerList = response.data;
            });


        }
```

*Add developer*

```
        $scope.addDeveloper = function () {

            var developer = {
                firstName: $scope.firstName,
                lastName: $scope.lastName
            };

            var res = $http.post($scope.urlDeveloper, JSON.stringify(developer), {
                headers: {'Content-Type': 'application/json'}
            });


            res.success(function (data, status, headers, config) {
                $scope.message = data;
                alert("Developer has successfully registered");
                $scope.goHome();
            });
            res.error(function (data, status, headers, config) {
                alert("failure message: " + +JSON.stringify({data: data}));
            });

        }
```


**6.** En el archivo DeveloperController.js crear las funciones para buscar por *firstName* , modificar y eliminar un developer.

**7.** Crear las páginas para buscar por *firstName*, modificar y eliminar un developer.


