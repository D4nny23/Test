/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andres.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dev
 */
@Path("users")
public class UserServices {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("1", "Enrique Nogal", "Profesor", 1976));
        users.add(new User("2", "Elia Nogal", "Alumno", 2007));

        return users;
    }
}
