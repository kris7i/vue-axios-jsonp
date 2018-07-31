import axios from 'axios'
import qs from 'qs'

//请求超时时间
axios.defaults.timeout=5000;
//请求头
axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=UTF-8';
//该地址不支持跨域请求，如要跨域要在后端配置拦截器才可支持跨域
//axios.defaults.baseURL = 'http://localhost:8081';
//该地址支持跨域请求，需先在config下的index.js的proxyTable属性配置才行
axios.defaults.baseURL = '/ajaxurl';

//POST传参序列化
axios.interceptors.request.use((config) => {
    if(config.method  === 'post'){
      config.data = qs.stringify(config.data);
    }
    return config;
  },(error) =>{
    return Promise.reject(error);
  });
  
  //回调,返回状态判断
  axios.interceptors.response.use((res) =>{
    if(!res.data.status==200){
      return Promise.reject(res);
    }
    return res;
  }, (error) => {
    //404等问题可以在这里处理
    return Promise.reject(error);
  });

  export function fetch(url, params) {
    return new Promise((resolve, reject) => {
      axios.post(url, params)
        .then(response => {
          resolve(response.data);
        }, err => {
          reject(err);
        })
        .catch((error) => {
          reject(error)
        })
    })
  }
  //封装请求，在组件中调用该方法即可  
  export default {
    ajax(url,data) {
      return fetch(url,data)
    }
  }