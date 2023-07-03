
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <div>
        
        <jsp:include page="/WEB-INF/Productos/menu.jsp"/>
       
        </div>
        
        
            <c:forEach items="${listaProductos}" var="producto">
                
                <div class="card" style="border:1px solid blue; background-color: rgba(0,0,255,0.3); border-radius: 5px; box-shadow: 10px 10px 10px; margin:20px; width:20%; border-left: 50px solid blue; padding: 10px; text-align: center; float: left;">    
                    <h3>Codigo ${productos.id}</h3>
                    <h3>${productos.nombre}</h3>
                    <h3>Calificacion ${productos.rating} Estrellas</h3>
                    <h3>$${productos.precio}</h3>
                    <img src="imagen/${productos.foto}" alt="alt" style="width: 100px; height: 100px;"/><br>
                    <button >Agregar al Carrito</button>
                </div>                
            </c:forEach>
        
    </body>
</html>
