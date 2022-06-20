package ws.service.imaal.erro;

import javax.ws.rs.core.Response.Status;

import ws.service.imaal.util.Constante;

public class ErroInternoBean extends ErroBean{
    public static final int codigo = Status.INTERNAL_SERVER_ERROR.getStatusCode();
	public static final String erro = Constante.INTERNAL_SERVER_ERROR_MESSAGE;

    public ErroInternoBean(){
        super(codigo, erro);
    }

    public ErroInternoBean(String mensagem){
        super(codigo, mensagem);
    }

}
