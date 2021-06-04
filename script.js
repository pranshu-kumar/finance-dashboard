var xValues = [50,60,70,80,90,100,110,120,130,140,150];
var yValues = [7,8,8,9,9,9,10,11,14,14,15];
var ctx = document.getElementById("myChart");
var myChart = document.getElementById("money-status-chart");

var graph = new Chart(ctx, {
    type: 'bar',
       data: {
          labels: ["2005", "2007" , "2009" , "2012", "2014"],
          datasets: [
             { label: 'HouseHold income',
             data: [5000,8000,10000,1200,15000],
             backgroundColor :['rgba(255, 129, 102, 0.5)',
             'rgba(234, 162, 235, 0.5)',
             'rgba(255, 206, 36, 0.5)',
             'rgba(75, 192, 192, 0.5)',
             'rgba(153, 102, 255, 0.5)',
          ],
          borderColor: [
            'rgba(255, 129, 102)',
            'rgba(234, 162, 235)',
            'rgba(255, 206, 36)',
            'rgba(75, 192, 192)',
            'rgba(153, 102, 255)',
          ],
          borderWidth:1
       }
    ]
 },
 options: {
    scales: {
       yAxes: [{
          ticks: {
             beginAtZero:true
          }
       }]
    }
 }
});

var x_pie = ["Money Left", "Money Spent"];
var y_pie = [8000, 2000];

var barColors = ["green", 'orange'];

new Chart(myChart, {
   type: "doughnut",
   data: {
     labels: x_pie,
     datasets: [{
       backgroundColor: barColors,
       data: y_pie,
       hoverOffset: 4
     }]
   },
   options: {
     title: {
       display: true,
       text: "Money Left"
     }
   }
 });

 var request = new XMLHttpRequest()

// Open a new connection, using the GET request on the URL endpoint
request.open('GET', 'localhost:8080/finances', true)

request.onload = function () {
  // Begin accessing JSON data here
  var data = JSON.parse(this.response);
  console.log(data);
}

// Send request
request.send()

