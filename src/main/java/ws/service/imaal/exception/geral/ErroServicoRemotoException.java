package ws.service.imaal.exception.geral;

import ws.service.imaal.erro.ErroServiceRemotoBean;
import ws.service.imaal.exception.ImaalException;

public class ErroServicoRemotoException extends ImaalException{
    public ErroServicoRemotoException(Exception e, Object service, String descErro){
        super(e, new ErroServiceRemotoBean(service.getClass().getSimpleName(), descErro));
    }

    public ErroServicoRemotoException(Exception e, Object service, Integer status, String descErro){
        super(e, new ErroServiceRemotoBean(status, service.getClass().getSimpleName(), descErro));
    }

    public ErroServicoRemotoException(Exception e, Object service){
        super(e, new ErroServiceRemotoBean(service.getClass().getSimpleName()));
    }
}
