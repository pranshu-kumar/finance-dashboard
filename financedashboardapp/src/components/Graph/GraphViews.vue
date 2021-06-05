<template>
  <nav class="uk-navbar-container uk-background-default" uk-navbar>
    <div class="uk-navbar-center">
      <ul class="uk-navbar-nav">
        <li class="uk"><a href="#">Daily</a></li>
        <li class="uk"><a href="#">Monthly</a></li>
        <li><a href="#">Yearly</a></li>
      </ul>
    </div>
  </nav>
</template>

<script>
export default {
  name: "GraphViews",
  props: {
    msg: String,
  },
};
</script>