package io.swagger.api.factories;

import io.swagger.api.ClientesApiService;
import io.swagger.api.impl.ClientesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-16T17:35:59.859Z")
public class ClientesApiServiceFactory {
    private final static ClientesApiService service = new ClientesApiServiceImpl();

    public static ClientesApiService getClientesApi() {
        return service;
    }
}
