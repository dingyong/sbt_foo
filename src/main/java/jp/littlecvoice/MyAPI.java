package jp.littlevoice;

import javax.ws.rs.*;

@Path("/api")
public class MyAPI {
    @GET public String doGet() {
        return "Hello";
    }
}
