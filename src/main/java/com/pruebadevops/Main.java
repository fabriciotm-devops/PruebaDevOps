/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebadevops;

import com.pruebadevops.dao.DAO;
import com.pruebadevops.modelo.ModelData;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author Fabricyber
 */
@Path("DevOps")
public class Main {
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response GetData(@HeaderParam("X-Parse-REST-API-Key") String token,
                            @RequestParam(value = "to") String mensaje)
    {
        boolean status = DAO.validar("X-Parse-REST-API-Key", token);
        
        if (status)
        {
            String KEY = "mi_clave";
            String jwt = Jwts.builder()
                    .signWith(SignatureAlgorithm.HS256, KEY)
                    .setSubject(token)
                    .claim("mail", "fabriciotm@hotmail.com")
                    .compact();
            JsonObject json = Json.createObjectBuilder()
                    .add("JWT", jwt)
                    .build();
            
            return Response.ok("message: Hello your message will be send").build();
        }
        return Response.serverError().build();
    }
}
