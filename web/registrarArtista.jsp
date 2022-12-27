

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar artistas</title>

        <link rel="stylesheet" href="style.css" type="text/css">

    </head>
    <body>

        <form action="registrar.do" method="post">

            <h1>Informacion del artista</h1>
            <input type="text" name="artist_name" placeholder="Nombre de artista " required >
            <br>
            <input type="text" name="most_popular_song" placeholder="Cancion mas popular" required >
            <br>
            <input type="text" name="setMost_popular_member" placeholder="Miembro mas popular" required >

            <input type="submit" value="Registrar">


        </form>



        <br>
        <a href="index.jsp">Volver</a>
    </body>
</html>
