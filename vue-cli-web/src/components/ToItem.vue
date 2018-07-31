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
    findbyname(){
      var data={
        name:'admin'
      }
      this.$http.ajax('/user/findByName',data).then(function (res) {
        //成功之后处理逻辑
        console.log(res)
      },function (res) {
        //失败之后处理逻辑
        console.log("error:"+res)
      })
    }
  }
}
</script>

<style scoped>

</style>
