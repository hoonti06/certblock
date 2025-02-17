import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";

// store(Vuex)와 router를 활용하여 App.vue 페이지 생성, @/public/index.html파일 내에 있는 <div id="app">에 App.vue로 만들어진 페이지가 표시됨
createApp(App).use(store).use(router).mount("#app");
