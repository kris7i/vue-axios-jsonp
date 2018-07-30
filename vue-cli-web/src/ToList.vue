<template>
  <div>
    <input v-model="inputValue"/>
    <button @click="handClick">提交</button>
    <ul>
      <todo-item 
      v-for="(item,index) of list" :key="index"
      :content="item"
      :index="index"
      @delete="handdelete"
      ></todo-item>
    </ul>
  </div>
</template>

<script>
import ToItem from './components/ToItem'
export default {
  components:{
    'todo-item':ToItem
  },
  data (){
    return {
      inputValue:'',
      list:[]
    }
  },
  methods:{
    handClick(){
      this.list.push(this.inputValue)
      this.inputValue=''
    },
    handdelete(index){
      this.list.splice(index,1)
    }
  }
}
</script>

<style>

</style>
