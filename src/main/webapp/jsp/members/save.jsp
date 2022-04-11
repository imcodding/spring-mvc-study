<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%  // 자바코드 입력
    //request, response 사용 가능. jsp 도 결국 Servlet 으로 자동 변환돼서 사용됨.
    MemberRepository memberRepository = MemberRepository.getInstance();

    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    System.out.println("member = " + member);
    memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul><!-- 자바코드 출력 -->
    <li>id=<%=member.getId()%></li>
    <li>id=<%=member.getUsername()%></li>
    <li>id=<%=member.getAge()%></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>

<!--
* jsp 의 한계
- java 코드, 데이터를 조회하는 repository 등 다양한 코드가 모두 노출됨.
- jsp 가 너무 많은 역할을 하게돼서, 코드기 길어지고 유지보수가 어렵다.
- 화면을 렌더링 하는데 최적화 되어있기 때문에 이 부분만 담당하는 것이 좋음.
===> MVC 패턴 등장
-->
