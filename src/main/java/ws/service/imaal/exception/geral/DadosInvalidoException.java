package ws.service.imaal.exception.geral;

import ws.service.imaal.erro.ErroDadosInvalidosBean;
import ws.service.imaal.exception.ImaalException;

public class DadosInvalidoException extends ImaalException{
    public DadosInvalidoException(String mensagem){
        super(new ErroDadosInvalidosBean(mensagem));
    }
}