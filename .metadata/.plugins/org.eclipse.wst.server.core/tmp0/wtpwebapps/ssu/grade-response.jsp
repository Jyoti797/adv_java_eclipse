<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>grade response</title>
</head>
<body>
<%
int eng =Integer.parseInt(request.getParameter("eng"));
int odia =Integer.parseInt(request.getParameter("odia"));
int phy =Integer.parseInt(request.getParameter("phy"));
int chem =Integer.parseInt(request.getParameter("chem"));
int math =Integer.parseInt(request.getParameter("math"));
int bio =Integer.parseInt(request.getParameter("bio"));

int total = eng + odia + phy + chem + math + bio;
int percentage = (int) total / 6;

char grade = 'X';

if (percentage >= 90 && percentage <= 100) {
    grade = 'O';
} else if (percentage >= 80 && percentage <= 89) {
    grade = 'A';
} else if (percentage >= 70 && percentage <= 79) {
    grade = 'B';
} else if (percentage >= 60 && percentage <= 69) {
    grade = 'C';
} else if (percentage >= 50 && percentage <= 59) {
    grade = 'D';
} else if (percentage >= 40 && percentage <= 49) {
    grade = 'E';
} else if (percentage <= 30) {
    grade = 'F';
}

%>

Total marks secured by student is <%=total %><br/><br/>
student has secured <%= percentage %> percentage<br/><br/>
student has secured <%= grade %> Grade<br/><br/>


</body>
</html>