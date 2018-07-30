<template>
<div>
  <li @click="findbyname">{{content}}</li>

</div>
</template>

<script>
import qs from 'qs';

export default {
  props:['content','index'],
  methods:{
    // handdelete(){
    //   this.$http.get('/ajaxurl/user/list')
    //   .then(function (response) {
    //     console.log(response);
    //   })
    //   .catch(function (error) {
    //     console.log(error);
    //   });
    // },
    
    findbyname(){
      var data = qs.stringify({
      name: "admin",
      });
      this.$http.post('/ajaxurl/user/findByName',data)
      .then(function(response){
        console.log(response)
        console.log("aaaa")
      })
    }
  }
}
</script>

<style scoped>

</style>
