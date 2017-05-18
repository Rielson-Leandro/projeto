var passageiroModulo = angular.module('passageiroModulo',[]);

passageiroModulo.controller("passageirosController", function($scope, $http)  {
	
	urlPassageiro = 'http://localhost:8080/Caronas/rest/estado';
	 $http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";

	
    $http.get(urlPassageiro).
        then(function(response) {
            $scope.estado = response.data;
        });   
    
    $scope.addTask = function addTask() {
    	   $http.post(urlPassageiro, {'nome': $scope.nome, 'sigla': $scope.sigla})
    	   	.then(function(response){$scope.nome = response.nome; $scope.sigla = response.sigla;});
    	  }
  


});

//"use strict";
//var passageiroModulo = angular.module('passageiroModulo',[]);
// 
///*
//* Controller -- Recomendo salva cada controlador em um arquivo tipo no Java
//*/
//angular.module('passageiroModulo')
//    .controller("passageirosController", function($scope, $http, SERVICE) {
// 
//        // Get
//        $scope.funcGet = function(){
//            SERVICE.get(function(res) {
//                if (res.type == false) {
//                    alert("Nenhuma resposta");
//                }else if(res.status == 200){
//                    console.log(res.data);
//                }
//            }, function(){
//                alert("falha na conexão");
//            })
//        };
// 
//        // Get
//        $scope.funcSave = function(nomeUF, UF){
//            var form = {
//                nome: nomeUF,
//                sigla: UF}
//            
//            };
//            
//            // Chamando o serviço
//            SERVICE.save(funcSave, function(res) {
//                if (res.type == false) {
//                    alert("Nenhuma resposta");
//                }else if(res.status == 200 || res.status == 201){
//                    console.log(res.data);
//                }else{
//                    alert("Erro na requisição Cod:"+ res.status);
//                }
//            }, function(){
//                alert("falha na conexão");
//            })
//    })
///*
//* Factory -- Recomendo salva isso em um arquivo separado e chama primeiro que o controler que for usar
//*/
//angular.module('passageiroModulo')
//    .factory('SERVICE', ['$rootScope','$http', function($rootScope, $http){
//        // Configuração
//        var urlAPI = 'http://localhost:8080/Caronas/';
// 
//        // pegando o token para efetuar as solicitações pelo servidor
//        var config = {headers:  {
//            'Content-Type': 'application/json'
//            }
//        };
// 
//        // Serviços para consumo da API
//        return {
//            save: function(data, success, error) {
//                $http.post(urlAPI + 'rest/estado', data, config).then(success)
//            },
//            get: function(success, error) {
//                $http.get(urlAPI + 'rest/estado', config).success(success).error(error)
//            }
//        };
//    }]);