<template>
  <div id="app">
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
      </div>
    </div>
  </div>
</template>

<script>
import SideNav from "./components/SideNav.vue";
export default {
  name: "App",
  components: {
    SideNav,
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
