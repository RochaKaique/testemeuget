/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaique.mavenws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Kaique
 */
@Path("Teste")
public class TesteWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of TesteWS
     */
    public TesteWS() {
    }

    /**
     * Retrieves representation of an instance of com.kaique.mavenws.TesteWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    @Path("meuget")
    public String getHtml() {
        return "<p>Agora Foi Tomcat 85 </p>";
    }

    /**
     * PUT method for updating or creating an instance of TesteWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
