package ws.service.imaal.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestHeader;

import ws.service.imaal.exception.ImaalException;
import ws.service.imaal.modelo.manifesto.ImaalCadastroMtrDTO;

@RegisterRestClient
public interface ImaalRestClientService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/mtr")
    public Integer cadastrarMtr(@RestHeader("Authorization") String token, 
                                @RestHeader("Host") String host,
                                @RestHeader("Origin") String origin,
                                @RestHeader("Referer") String referer,
                                ImaalCadastroMtrDTO cadastroMtrDTO) throws ImaalException;


}
