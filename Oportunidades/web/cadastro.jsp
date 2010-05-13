<%-- 
    Document   : cadastro
    Created on : Mar 29, 2010, 11:38:24 PM
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
            <title>Cadastro</title>
        </head>
        <body>
            <h1><h:outputText value="Cadastro Pessoal!"/></h1>

            <h:form>
                <h:panelGrid columns="2">
                    <h:outputLabel value="Usuario"/>
                    <h:inputText   value="#{LoginMB.pessoa.usuario}"/>
                    <h:outputLabel value="Senha"/>
                    <h:inputText   value="#{LoginMB.pessoa.senha}"/>
                    <h:outputLabel value="Nome"/>
                    <h:inputText   value="#{LoginMB.pessoa.nome}"/>
                    <h:outputLabel value="E-mail"/>
                    <h:inputText   value="#{LoginMB.pessoa.email}"/>
                    <h:outputLabel value="Telefone"/>
                    <h:inputText   value="#{LoginMB.pessoa.telefone}"/>
                </h:panelGrid>

                <h:commandButton value="Cadastrar" action ="#{LoginMB.cadastrar}" />
            </h:form>
        </body>
    </html>
</f:view>
