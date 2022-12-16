<%@ page language="java" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file = "../common/commonlist.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>지원자 목록</title>
</head>
<body>

<%@ include file = "../common/header.jsp" %>

<main class="mt-2 pt-2">
    <div class="container-fluid px-4">
        <h1 class="mt-4">회원님의 지원 목록</h1>

        <div class="card mb-4">
            <div class="card-body">
                <table class="table table-hover table-striped">
                    <thead>
                    <tr>
                        <th>지원글</th>
                        <th>지원시간</th>
                        <th>지원취소</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach  var="applies" items="${applies}">
                        <tr>
                            <td style="width: 1000px">${applies.no}</td>
                            <td style="width: 150px">${applies.date}</td>
                            <td style="width: 200px"><button type="button" class="btn btn-danger"
                                                             onclick="cancelApply(${applies.no})">지원취소</button></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <script>

        function cancelApply(no) {
            var confirm = confirm("정말로 지원을 취소하시겠습니까?");
            if (confirm) {
                location.href="/apply/applies"+no;
            }


        }
    </script>
</main>
</body>
</html>