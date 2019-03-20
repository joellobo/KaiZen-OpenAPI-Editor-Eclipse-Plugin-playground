package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ClientesApiService;
import io.swagger.api.factories.ClientesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Cliente_;
import io.swagger.model.InlineResponse201;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/clientes")


@io.swagger.annotations.Api(description = "the clientes API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-16T17:35:59.859Z")
public class ClientesApi  {
   private final ClientesApiService delegate;

   public ClientesApi(@Context ServletConfig servletContext) {
      ClientesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ClientesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ClientesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ClientesApiServiceFactory.getClientesApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Cadastra cliente", notes = "Cadastra um novo cliente", response = InlineResponse201.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "OK", response = InlineResponse201.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Requisicao invatida", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Erro no servidor", response = Void.class) })
    public Response cadastraCliente(@ApiParam(value = "" ) Cliente_ cliente_
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cadastraCliente(cliente_,securityContext);
    }
}
