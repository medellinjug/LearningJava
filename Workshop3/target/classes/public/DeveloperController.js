var app = angular.module('Developer', [])

    .controller('Developer', function ($scope, $http) {

        $scope.goHome = function () {
            window.location = "index.html";
        }

        $scope.urlDeveloper = " http://192.168.56.1:8081/developers";
        //$scope.urlDeveloperAdd = " http://192.168.56.1:8081/Developer/developerAdd";


        //Search
        $scope.searchAllDeveloper = function () {

            $scope.developerList = null;

            $http.get($scope.urlDeveloper).then(function (response) {
                $scope.developerList = response.data;
            });


        }

        //Create a new developer
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


    });





