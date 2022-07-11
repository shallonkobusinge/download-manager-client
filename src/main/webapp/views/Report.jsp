<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>View Report</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,400;1,100&display=swap"
          rel="stylesheet">
    <style>
        * {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }

        .view-employees-container {
            display: flex;
            flex-direction: column;
            margin-top: 50px;

        }

        .view-employees-container h2 {
            text-align: center;
            margin-top: 10px;
        }

        .view-employees-container-sub {
            width: 100%;
            height: auto;
        }

        .view-employees-container-sub table {
            width: 95%;
            height: auto;
            margin-left: 30px;
            margin-top: 10px;

        }

        .table-header {
            height: 2.8rem;
            background: #EEF2FF;
        }

        .table-body tr td {
            text-align: left;

        }

        .modification-buttons {
            width: 26rem;
            height: 2rem;
            background: rgb(19, 17, 17);
            color: black;
            border: none;
            outline: 0;
            margin-top: 10px;
            font-size: 16px;
        }

        .modification-buttons:hover {
            background: #212121;
            color: white;
            cursor: pointer;
        }
    </style>
</head>
<body>
<jsp:include page="../components/Navbar.jsp"></jsp:include>
<div class="view-employees-container">
    <input type="button" value="Download New Website" class="modification-buttons ml-"
           onclick="window.location.href='/form'"/>

    <h2>Report</h2>
    <div class="view-employees-container-sub">
        <table>
            <thead class="table-header">
            <th>Website Name</th>
            <th>Website Download Start Data</th>
            <th>Link Name</th>
            <th>Website Download End Date</th>
            <th>Number of Kilobytes</th>
            <th>Elapsed Time</th>

            </thead>
            <tbody class="table-body">
            <c:forEach items="${links}" var="link">
                <tr>
                    <td class="text-left pr-2">${link.website.name}</td>
                    <td>${link.website.startDate}</td>
                    <td> ${link.linkName.split("/")[2]}</td>
                    <td>${link.website.endDate}</td>

                    <td>${link.website.numberOfKilobytesDownloaded}</td>
                    <td>${link.totalElapsedTime}</td>


                </tr>

            </c:forEach>

            </tbody>
        </table>
    </div>

</div>

</body>
<script src="https://cdn.tailwindcss.com"></script>
</html>