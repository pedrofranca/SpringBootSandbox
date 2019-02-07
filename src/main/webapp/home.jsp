<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="resources/css/main.css" type="text/css"/>
	<script src="resources/js/main.js" content="text/javascript"></script>	
</head>
<body>
	
	<header>
		<h1>Welcome, my lords!</h1>
	</header>
	
	<div>
		<jsp:include page="templates/mainMenu.jsp"/>
	</div>
	
	<main>
		<section>
			<article>
				<p>This is the Main test page for my Spring Boot application. </p>			
				<p>I believe it's quite nice. :)</p>
				<footer>
					<p>Since <time datetime="2018/16/10 20:50:00">October 16</time></p>
				</footer>
			</article>
		</section>
		<section>
			<article>
				<h4>AJAX BUTTON TEST</h4>
				<button id="btnAjaxCall" onclick="basicAjaxCall()">Click for Ajax Magick</button>
			</article>
		</section>
	</main>
	
	<footer>
		<hr>
		<h3>Spring Boot Web JSP Example</h3>
		<p>by Pedronidas</p>
	</footer>

</body>
</html>
