package ws.service.imaal.exception;

import ws.service.imaal.erro.ErroBean;

public class ImaalException extends Exception
{
	private static final long serialVersionUID = 1L;

	private ErroBean erroBean;
	public ImaalException() {
	}

	public ImaalException(Exception e) {
		super(e);
	}	

	public ImaalException(ErroBean erroBean) {
		this.erroBean = erroBean;
	}

	public ImaalException(Exception e, ErroBean erroBean) {
		super(e);
		this.erroBean = erroBean;
	}

	public ErroBean getErroBean() {
		return this.erroBean;
	}

	public void setErroBean(ErroBean erroBean) {
		this.erroBean = erroBean;
	}

	public ImaalException erroBean(ErroBean erroBean) {
		setErroBean(erroBean);
		return this;
	}

}
