var gridData = [];

const grid = new tui.Grid({
   el: document.getElementById('grid'),
   data: gridData,
   scrollX: false,
   scrollY: false,
   columns: [
        {
          header: 'Name',
          name: 'name'
        },
        {
          header: 'Artist',
          name: 'artist'
        },
        {
          header: 'Type',
          name: 'type'
        },
        {
          header: 'Release',
          name: 'release'
        },
        {
          header: 'Genre',
          name: 'genre'
        }
      ]
});
    
$("#btnClear").click(function(){
    grid.clear();
});
  
$("#btnSearch").click(function(){
    $.ajax({
	    url : '/async/data', 
	    method : 'get',
        data : null,
	    dataType : 'JSON',
	    error : function(){
	        alert('error');
	    },
	    success : function(data){
    		console.dir(data.dataList);
    		grid.resetData(eval(data.dataList));
		} 
    });
});    


  