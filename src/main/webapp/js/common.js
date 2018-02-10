var frame = function(){
	
};
frame.execute = function execute(classname, fun, callback){
	 $.ajax({ 
	      type : "get", 
	      url : classname + ".action?cmd=" + fun, 
	      success : function(msg) { 
	         obj = jQuery.parseJSON(msg); 
	        /* $(selector).each(function(index,element))*/
	         $("span").each(function(a, b) { 
	        	 /*$(selector).attr(attribute)  规定要获取其值的属性。*/
	            var bind = $(b).attr("bind"); 
	            if (bind != null) { 
//	            	这边是读取json数据并作赋值处理。
	               $(b).html(obj[bind]); 
	            } 
	         }); 
	         if (callback) 
	            callback(obj); 
	      } 
	   }); 
}

