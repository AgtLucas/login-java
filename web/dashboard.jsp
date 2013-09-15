<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
   // if(session.getAttribute("sessionId") == null) {
   //     response.sendRedirect("index.jsp");
   // }
%>

<jsp:include page="includes/head.jsp" />

    <body>

        <section class="main pure-g-r">

            <jsp:include page="includes/header.jsp" />
            
            <div class="pure-u-1-3"></div>
            <div class="main-content pure-u-1-3 l-centered">
                <section class=" main-dashboard">
                    <h2>Welcome, <%= session.getAttribute("sessionId") %>!</h2>
                </section>
            </div><!-- end main-content -->
            <div class="pure-u-1-3"></div>

        </section>

        <jsp:include page="includes/scripts.jsp" />

    </body>
</html>
