<template>
  <div class="uk-width-2-3 uk-padding-small">
    <!-- Filter -->
    <button class="uk-button uk-button-default" type="button">
      Filter <span uk-icon="icon: chevron-down"></span>
    </button>
    <div uk-dropdown="pos: bottom-justify">
      <ul class="uk-nav uk-dropdown-nav">
        <li class="uk-active"><a href="#">Active</a></li>
        <li><a href="#">Item</a></li>
        <li class="uk-nav-header">Header</li>
        <li><a href="#">Item</a></li>
        <li><a href="#">Item</a></li>
        <li class="uk-nav-divider"></li>
        <li><a href="#">Item</a></li>
      </ul>
    </div>

    <table class="uk-table uk-table-striped uk-text-left">
      <thead>
        <tr>
          <th>Date Added</th>
          <th>Amount</th>
          <th>Category</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="finance in finances" :key="finance.id">
          <td>{{finance.addDate}}</td>
          <td>{{finance.amount}}</td>
          <td>{{finance.category}}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  name: "MoneyTable",

  mounted:function(){
      this.getFinances()
  },

  data: function () {
    return {
        finances: []
    }
  },
  methods: {
      getFinances : function(){
          console.log("Called!")
          var self = this
          const url = 'http://localhost:8080/finances'
          axios.get(url, {
                dataType: 'json',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                },
                mode: 'no-cors',
                credentials: 'include'
          }).then(function(response){
            //   console.log(JSON.stringify(response.data));
              self.finances = response.data;
              console.log(self.finances);
          }).catch(function (error) {
          console.log(error)
        })
      },
  }
};
</script>
