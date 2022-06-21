package ws.service.imaal.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import ws.service.imaal.exception.ImaalException;
import ws.service.imaal.exception.geral.ErroServicoRemotoException;
import ws.service.imaal.modelo.manifesto.ImaalCadastroMtrDTO;


@ApplicationScoped
public class ImaalService {

    @Inject
    @RestClient
    ImaalRestClientService service;

    public Integer cadastrarMtr(String token, ImaalCadastroMtrDTO cadastroMtrDTO) throws ImaalException {
        try {
            token = "Bearer " + token;
            String host = "sgors.ima.al.gov.br";
            String origin = "https://sgors.ima.al.gov.br";
            String referer = "https://sgors.ima.al.gov.br/mtr/cadastrar?";
            return service.cadastrarMtr(token, host, origin, referer, cadastroMtrDTO);
        } catch (ImaalException e) {
            e.printStackTrace();
            throw e;
        } catch (ProcessingException | WebApplicationException e) {
            e.printStackTrace();
            throw new ErroServicoRemotoException(e, service);
        }

    }

}