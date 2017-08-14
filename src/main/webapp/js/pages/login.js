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
        axios.post('/rest/usuario/login', {
            user: this.username,
            password: this.password
          })
          .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          });
    }
  }
  
});