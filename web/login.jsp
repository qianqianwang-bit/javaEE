<%--
  Created by IntelliJ IDEA.
  User: 20793
  Date: 2019-09-10
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Home</title>
    <!-- Meta tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content=""
    />
    <script>
        addEventListener("load", function () { setTimeout(hideURLbar, 0); }, false); function hideURLbar() { window.scrollTo(0, 1); }
    </script>
    <!-- Meta tags -->
    <!--stylesheets-->
    <link href="css/style.css" rel='stylesheet' type='text/css' media="all">
    <!--//style sheet end here-->
    <link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600,700" rel="stylesheet">
</head>
<body>
<div class="mid-class">
    <div class="art-right-w3ls">
        <h2>注册和登陆</h2>
        <form action="UserServlet" method="post">
            <input type="hidden" name="oper" value="login">
            <div class="main">
                <div class="form-left-to-w3l">
                    <input type="text" name="uname" placeholder="用户名" required="">
                </div>
                <div class="form-left-to-w3l ">
                    <input type="password" name="pwd" placeholder="密码" required="">
                    <div class="clear"></div>
                </div>
            </div>
            <div class="left-side-forget">
                <input type="checkbox"  class="checked">
                <span class="remenber-me">记住密码 </span>
            </div>
            <div class="right-side-forget">
                <a href="#" class="for">忘记密码...?</a>
            </div>
            <div class="clear"></div>
            <div class="btnn">
                <button type="submit" >登陆</button>
            </div>
        </form>
        <div class="w3layouts_more-buttn">
            <h3>没有账号..?
                <a href="#content1">点击注册
                </a>
            </h3>
        </div>
        <!-- popup-->
        <div id="content1" class="popup-effect">
            <div class="popup">
                <!--login form-->
                <div class="letter-w3ls">
                    <form action="UserServlet" method="post">
                        <input type="hidden" name="oper" value="reg">
                        <div class="form-left-to-w3l">
                            <input type="text" name="uname" placeholder="用户名" required="">
                        </div>
                        <div class="form-left-to-w3l">
                            <input type="text" name="phoneNUmber" placeholder="电话" required="">
                        </div>
                        <div class="form-left-to-w3l">
                            <input type="email" name="email" placeholder="邮箱" required="">
                        </div>
                        <div class="form-left-to-w3l">
                            <input type="password" name="pwd" placeholder="密码" required="">
                        </div>
                        <div class="form-left-to-w3l margin-zero">
                            <input type="password" name="pwd" placeholder="确认密码" required="">
                        </div>
                        <div class="btnn">
                            <button type="submit"> 注册</button>
                            <br>
                        </div>
                    </form>
                    <div class="clear"></div>
                </div>
                <!--//login form-->
                <a class="close" href="#">&times;</a>
            </div>
        </div>
        <!-- //popup -->
    </div>
    <div class="art-left-w3ls">
        <h1 class="header-w3ls">
            Gaze sign up & login Form
        </h1>
    </div>
</div>
<footer class="bottem-wthree-footer">
    <p>Copyright &copy; 2019.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
</footer>
</body>
</html>
