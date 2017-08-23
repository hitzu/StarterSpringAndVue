/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var helloWorld = new Vue({
  el: '#vue-app',
  data: {
    user: "user",
    username : "",
    password : ""
  },
  methods: {
    enviar: function()
    {
        var url = 'rest/loginParametros?user=' + this.username + '&password=' + this.password;
        axios.post(url, {
          })
          .then(function (response) {
            console.log(response);
            console.log(response.data);
          })
          .catch(function (error) {
            console.log(error);
          });
    }
  }
  
});