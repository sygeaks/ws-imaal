package ws.service.imaal.resource;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.reactive.RestHeader;

import ws.service.imaal.exception.ImaalException;
import ws.service.imaal.modelo.manifesto.ImaalCadastroMtrDTO;
import ws.service.imaal.service.ImaalService;

@Path("/imaal/api/v1/resource")
@RolesAllowed("IMAALSERVICEROLE")
public class ImaalResource {

    @Inject
    ImaalService service;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/mtr/emitir")
    public Integer cadastrarMtr(@RestHeader("token") String token, ImaalCadastroMtrDTO cadastroMtrDTO) throws ImaalException {
        return service.cadastrarMtr(token, cadastroMtrDTO);
    }
}