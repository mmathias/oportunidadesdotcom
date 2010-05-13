
<%-- 
    Document   : index
    Created on : Mar 27, 2010, 3:46:51 AM
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
            <title>Login</title>
        </head>
        <body>
            <h:form id="formLogin">

                <h1><h:outputText value="Tela de Login"/></h1>

                <h:panelGrid columns="2">
                    <h:outputLabel value="Usuário" />
                    <h:inputText value="#{LoginMB.usuario}"></h:inputText>
                    <h:outputLabel value="Senha" />
                    <h:inputText value="#{LoginMB.senha}" ></h:inputText>

                    <h:commandButton value = "Logar" action="#{LoginMB.validar}"></h:commandButton>
                    <h:commandButton value = "Cadastre-se" action="#{LoginMB.direcionaCadastro}"></h:commandButton>

                </h:panelGrid>
            </h:form>
        </body>
    </html>
</f:view>
