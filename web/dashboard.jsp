<% if(session.getAttribute("sessionId") == null) {
        response.sendRedirect("index.jsp");
    }
%>

<jsp:include page="includes/head.jsp" />

    <body>
        <!--[if lt IE 8]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <section class="main pure-g-r">

            <jsp:include page="includes/header.jsp" />
            
            <div class="pure-u-1-3"></div>
            <div class="main-content pure-u-1-3 l-centered">

            </div><!-- end main-content -->
            <div class="pure-u-1-3"></div>

        </section>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.2.min.js"><\/script>')</script>
        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>