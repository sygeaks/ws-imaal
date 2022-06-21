package ws.service.imaal.modelo.manifesto;

public class ImaalItemResiduo {

	private String disposalTechnology;// Discate Tecnologico
	private String measureUnity;// Unidade de Medida
	private String packaging;// Embalagem
	private String physicalState;// Estado Fisico
	private String quantity; // quantidade
	private Integer residue;// codigo do residue
	private String residueClass;// Classe do residue.

	public String getDisposalTechnology() {
		return disposalTechnology;
	}

	public void setDisposalTechnology(String disposalTechnology) {
		this.disposalTechnology = disposalTechnology;
	}

	public String getMeasureUnity() {
		return measureUnity;
	}

	public void setMeasureUnity(String measureUnity) {
		this.measureUnity = measureUnity;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getPhysicalState() {
		return physicalState;
	}

	public void setPhysicalState(String physicalState) {
		this.physicalState = physicalState;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Integer getResidue() {
		return residue;
	}

	public void setResidue(Integer residue) {
		this.residue = residue;
	}

	public String getResidueClass() {
		return residueClass;
	}

	public void setResidueClass(String residueClass) {
		this.residueClass = residueClass;
	}

}
