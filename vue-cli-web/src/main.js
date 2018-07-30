
import Vue from 'vue'
import ToList from './ToList'
import router from './router'
import axios from 'axios';


Vue.prototype.$http = axios
Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { ToList },
  template: '<ToList/>'
})
