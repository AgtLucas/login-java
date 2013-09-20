<header class="main-header pure-u-1">
    <h1 class="logo animated lightSpeedIn">
        <a href="#" class="logo-link">Login App</a>
    </h1>
    
    <% if ( session.getAttribute("username") != null ) {
    
        out.print("<a class='logout pure-button' href='logout.jsp'>Sair</a>");
        
    } %>
</header>
