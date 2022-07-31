function register1(graphName, csvURL, title, yAxisTitle) {
	var divName = "#" + graphName;
	$(document).ready(function() {  
		$.get(csvURL, function(csv) {
			$(divName).highcharts({
			    chart: {
			        type: 'area'
			    },
			    data: {
			        csv: csv
			    },
			    title: {
					text: title
				},
				yAxis: {
   					title: {
						text: yAxisTitle
					}
				},
				xAxis: {
   					title: {
						text: "Build"
					}
				},
                plotOptions: {
                    series: {
                        stacking: 'normal'
                    }
                },
                series: [{
                    color: "#0000cc"
                }
                        ]
			});
		});
	});	
}



 /* register2
  *    For CSV files containing two series of data. Column A contains the
  *    Build numbers used as x values, columns B and C the y values.
  *
  *  @param graphName  The id of the div to hold this chart.
  *  @param csvURL     URL to the .csv file
  *  @param title      Title for this chart.
  *  @param yAxistitle Title for the Y axis. (Series title is taken from
  *                      row 1 of the CSV file).
  */

function register2(graphName, csvURL, title, yAxisTitle) {
	var divName = "#" + graphName;
	$(document).ready(function() {  
		$.get(csvURL, function(csv) {
			$(divName).highcharts({
			    chart: {
			        type: 'area'
			    },
			    data: {
			        csv: csv
			    },
			    title: {
					text: title
				},
				yAxis: {
   					title: {
						text: yAxisTitle
					}
				},
				xAxis: {
   					title: {
						text: "Build"
					}
				},
                plotOptions: {
                    series: {
                        stacking: 'normal'
                    }
                },
                series: [{
                    color: "#009933"
                }, {
                    color: "#cc0000"
                }
                        ]
			});
		});
	});	
}