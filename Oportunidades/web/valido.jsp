<%-- 
    Document   : valido
    Created on : Mar 28, 2010, 6:00:11 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Home Page</title>
        </head>
        <body>
            <h1><h:outputText value="Welcome!"/></h1>
            <h:dataTable id="tabelaPessoas" value="#{LoginMB.pessoas}" var="pessoa"
                         columnClasses="list-column-center,
                         list-column-right, list-column-center,
                         list-column-right" headerClass="list-header"
                         rowClasses="list-row" styleClass="list-
                         background">
                <h:column>
                    <f:facet name="header">
                        <h:outputText  value="Usuario"/>
                    </f:facet>
                    <h:outputText value="#{pessoa.usuario}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText  value="Nome"/>
                    </f:facet>
                    <h:outputText value="#{pessoa.nome}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText  value="Email"/>
                    </f:facet>
                    <h:outputText value="#{pessoa.email}"/>
                </h:column>
            </h:dataTable>
        </body>
    </html>
</f:view>
