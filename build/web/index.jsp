<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Authentication.Authentication"%>
<%
    String pageTitle = "App Login!";
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    
    Authentication service = new Authentication();
    boolean user = service.Authenticate(name, password);
    if (user == true) {
        session.setAttribute("sessionId", name);
        response.sendRedirect("dashboard.jsp");
    }

%>

<jsp:include page="includes/head.jsp" />

    <body class="">
        <!--[if lt IE 8]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <section class="main pure-g-r">

            <jsp:include page="includes/header.jsp" />
            
            <div class="pure-u-1-3"></div>
            <div class="main-content pure-u-1-3 l-centered">
                <form method="post" class="login-form pure-form pure-form-stacked" data-pjax>
                    <label class="login-label" for="name">Login</label>
                    <input class="login-input" name="name" id="name" type="text" placeholder="Username">

                    <label class="login-label" for="password">Password</label>
                    <input class="login-input" name="password" id="password" type="password" placeholder="Password">

                    <button type="submit" class="login-button pure-button pure-button-primary">Login</button>
                </form>
            </div><!-- end main-content -->
            <div class="pure-u-1-3"></div>
            
            <!--<div class="main-content-shadow pure-u-1"></div>-->
            <footer class="main-footer pure-u-1">
                <section class="main-footer-content">
                    <p>&copy; 2013 - by Lucas</p>
                </section>
            </footer>

        </section>

        <jsp:include page="includes/scripts.jsp" />

    </body>
</html>