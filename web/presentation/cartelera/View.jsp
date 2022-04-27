<%@page import="cine.presentation.cartelera.Model"%>
<%@page import="cine.logic.Tanda"%>
<%@page import="java.util.List"%>
<%@page import="java.time.*"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/Examen/css/menu.css" rel="stylesheet" type="text/css" />
        <link href="/Examen/css/style.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <%@ include file="/presentation/header.jsp" %>
        <% Model model = (Model) request.getAttribute("model"); %>
        <% List<Tanda> tandasCompleta = model.getListTandasCompleta(); %>
        <% List<Tanda> tandasFiltrada = model.getListTandasFiltrada(); %>
        <% List<LocalDate> fechas = model.getListFechas(); %>
        <div style="width: 80%; justify-content: space-around; margin: auto">
            <div style="align-items: center">
                <h1 style="text-align: center"> Escoge la fecha </h1>
                <div style = "background-color: rgb(150,50,160);">
                    <ul>
                        <div style="display: flex; align-items: center; justify-content: center">
                            <%for(LocalDate f: fechas){%>        
                                
                                <a href="/Examen/presentation/cartelera/show?fecha=<%=f.toString()%>">
                                    <%if(model.getSelectedDate().equals(f.toString())){%>    
                                    <button class="button" style="background-color: #00acb7; color: white; height: 60px; margin: auto"><%=f.toString()%></button>
                                <%} else{%>   
                                    <button class="button" style="height: 60px; margin: auto"><%=f.toString()%></button>
                                <%}%>
                                </a> 
                            <%}%>
                        </div>
                    </ul>
                </div>
            </div>
            <div>
                <%for(Tanda t: tandasFiltrada){%>
                    <div style="display: flex">
                        <div style="width: 20%">
                            <div>
                                <img src="<%=t.getPelicula().getFoto()%>" width="100%">
                            </div>
                            <div>
                                <button class="button" style="width: 100%; background-color: red; color: white; height: 60px; margin: auto">Trailer</button>
                            </div>
                        </div>
                        <div style="width: 85%; display: flex ">
                            <div style="width: 50%; ">
                                <div style="width: 95%; margin-left: auto; left: auto; right:auto ;">
                                    <h5><%=t.getPelicula().getNombre()%></h5>
                                </div>
                            </div>
                            <div style="width: 50%; display: flex">
                                <div style="width: 25%; ">
                                    <button class="button" style="background-color: gray; color: white; height: 30px; margin: auto"><%=t.getPelicula().getDuracion()%></button>
                                </div>
                                <div style="width: 25%; ">
                                    <button class="button" style="background-color: red; color: white; height: 30px; margin: auto"><%=t.getPelicula().getGenero()%></button>
                                </div>
                                <div style="width: 25%; ">
                                    <button class="button" style="background-color: black; color: white; height: 30px; margin: auto"><%=t.getPelicula().getCensura()%></button>
                                </div>
                            </div>
                        </div>
                        
                    </div>
                    <div style="width: 85%">
                        <div style="width: 50%; ">
                            <div style="width: 95%; margin-left: auto; left: auto; right:auto ;">
                                <h5><%=t.getPelicula().getFormato()%></h5>
                            </div>
                        </div>
                    </div>
                <%}%>
            </div>
        </div>
        <div>
            
        </div>
    </body>
</html>
