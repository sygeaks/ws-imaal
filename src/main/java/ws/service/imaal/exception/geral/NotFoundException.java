package ws.service.imaal.exception.geral;

import ws.service.imaal.erro.ErroNotFoundBean;
import ws.service.imaal.exception.ImaalException;

public class NotFoundException extends ImaalException{
    public NotFoundException(String mensagem){
        super(new ErroNotFoundBean(mensagem));
    }
}