<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons"
          rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="css/materialize.min.css"
          media="screen,projection"/>
    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>CometWatch</title>
</head>
<body class="row">

    <nav>
        <div class="nav-wrapper teal darken-2">
            <a href="#" class="brand-logo center">CometWatch</a>
        </div>
    </nav>

    <div class="col s6 offset-s3 card-panel teal lighten-2">
        <p> ${comet} </p>
    </div>

    <script type="text/javascript"
            src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="js/materialize.min.js"></script>

    <script type="text/javascript"> // Enough JS to activate Materialize
    $(document).ready(function () {
        $('select').material_select();
    });
    </script>
</body>
</html>
