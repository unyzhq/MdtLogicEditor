<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html>
	<link rel="stylesheet" href="css/style.css" />
	<!-- 在spring mvc中 一切路径的访问都要通过掌门人DispatcherServlet(在spring-mvc.xml中配置)-->
	<!-- 因此访问css之前，需要在spring-mvc.xml中将文件配置为静态资源，以通过DispatcherServlet -->
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>逻辑在线</title>
        <script type="text/javascript" src="/webjars/jquery/3.6.0/jquery.min.js">
        	function ov(e){
				console.log(e.innerHTML);
				console.log("hi");
				location.href("${pageContext.request.contextPath}/search?string=" + e.innerHTML);
			}
        </script>
    </head>
    <body>
    	<header id = "head">
			<ul>
				<li id = "logo">
					<img src="img/world-cell-blue.png"> 
				</li>
				<li id = "title">
					<span>Mindustry 逻辑编辑站</span>
				</li>
			</ul>
    	</header>
    	<!-- header使用了fixed不占空间，使用此空div作为填充物，以方便布局-->
    	<div style = "height: 48px;width: 100%;"></div>
    	<div id = "box">
    		<div id = "containBox">
    			<div id = "left">
    					<ul>
    						<li style = "font-size: 18px;color: #393f4c;">指令集</li>
    						<li class = "mouseover" onclick = "ov(this)">Read</li>
    						<li>Write</li>
    						<li>Draw</li>
    						<li>Draw Flush</li>
    						<li>Pack Color</li>
    						<li>Print</li>
    						<li>Print Flush</li>
    						<li>Get Link</li>
    						<li>Control</li>
    						<li>Radar</li>
    						<li>Sensor</li>
    						<li>Set</li>
    						<li>Option</li>
    						<li>Wait</li>
    						<li>Lookup</li>
    						<li>End</li>
    						<li>Jump</li>
    						<li>Unit Bind</li>
    						<li>Unit Control</li>
    						<li>Unit Radar</li>
    						<li>Unit Locate</li>
    					</ul>
    			</div>
    			<div id = "eq">
    					<div id = "lineCount">
    				   		<div class = "lineCount">
    				   			<span>1</span>
    				   		</div>
    				   	</div>
    				   	<div id = "line">
    				   		<div class = "line">
    				   			<span>sensor</span>
    				   		</div>
    				   	</div>
    			</div>
    			<div id = "right">
    				<div>c</div>
    				<div>d</div>
    				<div>e</div>
    			</div>
    			<textarea></textarea>
    		</div>
    	</div>
 	</body>
</html>