<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<style type="text/css">
        *{
       	 padding:0;
       	 margin:0;
       }
       #form{
         padding:5px;
         width:400px;
         height:300px;
       	 background-color: #FFFFCC;
       }
       #form select{
       	  display: inline-block;
       	  border:1px solid white;
       	  width:150px;
       	  height:30px;
       	  border-radius: 5px;
      	  margin:2px;
       }
       #search{
       	 width:50px;
       	 height:30px;
       	 border:1px solid white;
       	 border-radius: 5px;
       	 background-color: #FFCC99;
       }
	</style>
	</head>
	<body>
		<form action="" method=""  id="form">
			<select id="province">
		  		<option value="陕西省">陕西省</option>
		  		<option value="山西省">山西省</option>
		  		<option value="湖南省">湖南省</option>
			</select>
			<select id="city">
		  		<option value="西安市">西安市</option>
		  		<option value="渭南">渭南</option>
		  		<option value="咸阳">咸阳</option>
			</select>
			<button id="search">查询</button>
		</form>
	</body>
</html>
<script type="text/javascript">
	var province = document.getElementById("province");
	var city = document.getElementById("city");
    var button = document.getElementById("search");

    //获取其中的天气预报结果
    button.addEventListener("click",function(event){
    	event.preventDefault();
    	console.log(province.value);
    	console.log(city.value);
    });


    province.onblur=function(){
    	alert(province.value);
    	loadXMLDoc(province.value);
    }



//发送请求将其中的对应的市进行更换即可
    function loadXMLDoc(obj){
		var xmlhttp;
		if (window.XMLHttpRequest){
			xmlhttp=new XMLHttpRequest();
		}else{
			xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
		}
		xmlhttp.onreadystatechange=function(){
			if (xmlhttp.readyState==4 && xmlhttp.status==200){
				console.log(xmlhttp.responseText);
			}
		}
		xmlhttp.open("POST","/try/ajax/ajax_info.txt",true);
		xmlhttp.setRequestHeader("Content-type","application/json; charset=utf-8");
		xmlhttp.send(JSON.stringify({province:obj}));
	}
</script>