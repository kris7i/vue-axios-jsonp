import Vue from 'vue'
import Router from 'vue-router'
import ToItem from '@/components/ToItem'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'ToItem',
      component: ToItem
    }
  ]
})
