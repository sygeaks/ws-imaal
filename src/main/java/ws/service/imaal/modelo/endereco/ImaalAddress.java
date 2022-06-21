package ws.service.imaal.modelo.endereco;

public class ImaalAddress {

	private Integer id;
	private String street;
	private String number;
	private String complement;
	private String neighborhood;
	private String zip_code;
	private ImaalCidade city;
	private ImaalFederacao federal_unit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public ImaalCidade getCity() {
		return city;
	}

	public void setCity(ImaalCidade city) {
		this.city = city;
	}

	public ImaalFederacao getFederal_unit() {
		return federal_unit;
	}

	public void setFederal_unit(ImaalFederacao federal_unit) {
		this.federal_unit = federal_unit;
	}

}
