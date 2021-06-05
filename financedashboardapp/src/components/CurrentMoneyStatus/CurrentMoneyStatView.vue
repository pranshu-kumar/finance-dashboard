<template>
    <div class="uk-flex uk-margin-large uk-flex-wrap uk-flex-wrap-around uk-background-muted uk-height-medium">
        <money-status/>
        <finance-table/>
    </div>
</template>

<script>
import MoneyStatus from "./MoneyStatus/MoneyStatus.vue"
import FinanceTable from "./FinanceTable/FinanceTable.vue"
export default {
  name: "CurrentMoneyStatView",
  components: {
    MoneyStatus,
    FinanceTable
  },
};
</script>
