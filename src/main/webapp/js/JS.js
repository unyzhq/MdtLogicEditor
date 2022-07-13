function ov(e){
				console.log(e.innerHTML);
				console.log("hi");
				location.href("${pageContext.request.contextPath}/search?string=" + e.innerHTML);
}