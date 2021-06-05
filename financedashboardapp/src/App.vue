<template>
  <div id="app">
    <app-header/>
    <div
      class="
        uk-flex
        uk-padding-medium
        uk-flex-wrap
        uk-flex-wrap-around
        uk-background-secondary
        uk-height-1-1
      "
    >
      <side-nav />
      <div class="uk-width-4-5 uk-background-muted uk-padding-left uk-card uk-card-default uk-card-body">
      <graph/>
      <current-money-stat-view/>
      </div>
    </div>
  </div>
</template>

<script>
import AppHeader from "./components/Header.vue"
import SideNav from "./components/SideNav.vue";
import Graph from "./components/Graph/Graph.vue"
import CurrentMoneyStatView from "./components/CurrentMoneyStatus/CurrentMoneyStatView.vue"
export default {
  name: "App",
  components: {
    AppHeader,
    SideNav,
    Graph,
    CurrentMoneyStatView
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
