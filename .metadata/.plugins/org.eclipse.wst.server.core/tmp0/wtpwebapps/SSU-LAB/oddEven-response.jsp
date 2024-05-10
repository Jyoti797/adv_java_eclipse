<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
int range = Integer.parseInt(request.getParameter("range"));
  static boolean isEven(int num){
	if(num%2==0){
		return true;
	}
	else{
		return false;
	}
}

 static boolean isOdd(int num){
	 if(num%2==1){
		 return true;
	 }
	 else{
		 return false;
	 }
 }
%>
<%


for(int i = 2; i<=range; i++){
	if(isEven(i)){
		out.print(i + " ");
	}
}

for(int i = 2; i<=range; i++){
	if(isOdd(i)){
		out.print(i + " ");
	}
}



%>

</body>
</html>