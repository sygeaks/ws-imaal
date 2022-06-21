package ws.service.imaal.modelo.endereco;

import java.util.List;

public class ImaalEndereco {

	private Integer complement;
	private Integer id;
	private String neighborhood;// Bairro
	private Integer number;
	private String street;// Rua
	private String zip_code;
	private List<ImaalCidade> city;
	private List<ImaalFederacao> federal_unit;// Unidade Federativa

	public Integer getComplement() {
		return complement;
	}

	public void setComplement(Integer complement) {
		this.complement = complement;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public List<ImaalCidade> getCity() {
		return city;
	}

	public void setCity(List<ImaalCidade> city) {
		this.city = city;
	}

	public List<ImaalFederacao> getFederal_unit() {
		return federal_unit;
	}

	public void setFederal_unit(List<ImaalFederacao> federal_unit) {
		this.federal_unit = federal_unit;
	}

}
