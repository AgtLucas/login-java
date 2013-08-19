<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>App Login</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <link href='http://fonts.googleapis.com/css?family=Nothing+You+Could+Do' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/style.css">
        <script src="js/vendor/modernizr-2.6.2.min.js"></script>
    </head>
    <body class="">
        <!--[if lt IE 8]>
            <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <section class="main pure-g-r">

            <header class="main-header pure-u-1">
                <h1 class="logo">
                    <a href="#" class="logo-link">Login App</a>
                </h1>
            </header>
            <div class="pure-u-1-3"></div>
            <div class="main-content pure-u-1-3 l-centered">
                <form method="post" class="login-form pure-form pure-form-stacked" data-pjax>
                    <label class="login-label" for="email">Email</label>
                    <input class="login-input" id="email" type="email" placeholder="Email">

                    <label class="login-label" for="password">Password</label>
                    <input class="login-input" id="password" type="password" placeholder="Password">

<!--                        <label for="remember" class="pure-checkbox">
                        <input id="remember" type="checkbox"> Remember me
                    </label>-->

                    <button type="submit" class="login-button pure-button pure-button-primary">Login</button>
                </form>
            </div><!-- end main-content -->
            <div class="pure-u-1-3"></div>
            
            <div class="main-content-shadow pure-u-1"></div>
            <footer class="main-footer pure-u-1">
                <section class="main-footer-content">
                    <p>&copy; 2013 - An App by Lucas Churchill</p>
                </section>
            </footer>

        </section>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.2.min.js"><\/script>')</script>
        <script src="js/plugins.js"></script>
        <script src="js/main.js"></script>

    </body>
</html>