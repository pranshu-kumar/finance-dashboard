<template>
  <div
    class="
      uk-width-1-3
      uk-background-muted
      uk-card
      uk-card-default
      uk-card-body
      uk-card-small
    "
  >
    <h3 class="uk-text-center">Money Status</h3>
    <canvas
      class="uk-padding-small"
      id="money-status-chart"
      style="width: 100%; max-height: 250px"
    ></canvas>
  </div>
</template>

<script>
export default {
  name: "MoneyStatus",
  props: {
    msg: String,
  },
};
</script>