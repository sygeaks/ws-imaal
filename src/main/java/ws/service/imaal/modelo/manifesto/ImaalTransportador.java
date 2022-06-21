package ws.service.imaal.modelo.manifesto;

import ws.service.imaal.modelo.endereco.ImaalAddress;

public class ImaalTransportador {

	private String cellphone;// Celular
	private String cpf_cnpj;
	private Integer id;
	private String name;
	private String phone;// Telefone
	private String status;// Se o cadastro da transportadora ta aprovado ou nao.
	private ImaalAddress address;

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ImaalAddress getAddress() {
		return address;
	}

	public void setAddress(ImaalAddress address) {
		this.address = address;
	}



}
