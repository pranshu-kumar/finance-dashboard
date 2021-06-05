<template>
    <div class="uk-card-default uk-margin-medium">
        <graph-views/>
        <graph-canvas/>
    </div>
</template>

<script>
import GraphViews from "./GraphViews.vue"
import GraphCanvas from "./GraphCanvas.vue"
export default {
  name: "Graph",
  components: {
    GraphViews,
    GraphCanvas
  },
};
</script>