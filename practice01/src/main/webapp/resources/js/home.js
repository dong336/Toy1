window.onload = function() {
    
	$("#frame").load("/mainHome");
	
	var panel__0 = true;
	var panel__1 = true;
    var panel__2 = true;
    var panel__3 = true;
    var panel__4 = true;
    
    function def(){
    	$("#panel__0").css({
        	"background-color" : "black",
        	"color" : "white"
		});

		$("#panel__1").css({
        	"background-color" : "black",
        	"color" : "white"
		});

		$("#panel__2").css({
        	"background-color" : "black",
        	"color" : "white"
		});

		$("#panel__3").css({
        	"background-color" : "black",
        	"color" : "white"
		});

		$("#panel__4").css({
        	"background-color" : "black",
        	"color" : "white"
		});
    }
    
	$("#panel__0").on("click", function(){
        if(panel__0){
			panel__0 = false;
        	panel__1 = true;
        	panel__2 = true;
        	panel__3 = true;
        	panel__4 = true;

        	console.log(panel__0);
        	
			$("#frame").empty();
        	$("#frame").load("/mainHome");
        	
			def();
			$("#panel__0").css({
        		"background-color" : "wheat",
        		"color" : "black"
			});
        }
    });

    $("#panel__1").on("click", function(){
        if(panel__1){
			panel__0 = true;
        	panel__1 = false;
        	panel__2 = true;
        	panel__3 = true;
        	panel__4 = true;

        	console.log(panel__1);
        	
			$("#frame").empty();
        	$("#frame").load("/loginForm");
        	
			def();
			$("#panel__1").css({
        		"background-color" : "wheat",
        		"color" : "black"
			});
        }
    });
    
	$("#panel__2").on("click", function(){
        if(panel__2){
			panel__0 = true;
        	panel__1 = true;
        	panel__2 = false;
        	panel__3 = true;
        	panel__4 = true;

			$("#frame").empty();
        	console.log(panel__2);
        	
        	$("#frame").load("/mainBoard");
        	
			def();
			$("#panel__2").css({
        		"background-color" : "wheat",
        		"color" : "black"
			});
        }
    });

    $("#panel__3").on("click", function(){
        if(panel__3){
			panel__0 = true;
        	panel__1 = true;
        	panel__2 = true;
        	panel__3 = false;
        	panel__4 = true;

			$("#frame").empty();
			console.log(panel__3);
        	
        	$("#frame").load("/grid");
        	
			def();
			$("#panel__3").css({
        		"background-color" : "wheat",
        		"color" : "black"
			});
        }
    });

	$("#panel__4").on("click", function(){
        if(panel__4){
			panel__0 = true;
        	panel__1 = true;
        	panel__2 = true;
        	panel__3 = true;
        	panel__4 = false;

			$("#frame").empty();
        	console.log(panel__4);
        	
        	$("#frame").load("/signUp");
        	
			def();
			$("#panel__4").css({
        		"background-color" : "wheat",
        		"color" : "black"
			});
        }
    });
};
  