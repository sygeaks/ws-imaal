package ws.service.imaal.modelo.manifesto;

import java.util.List;

public class ImaalCadastroMtrDTO {

	private String comments;
	private ImaalGerador generator;
	private Integer generatorId;
	private boolean hasTempStorager;
	private ImaalDestinador receiver;
	private Integer receiverId;
	private String responsibleName;
	private String responsibleRole;
	private Integer transporterId; 
	private ImaalTransportador transporter;
	private List<ImaalItemResiduo> residues;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	

	public Integer getGeneratorId() {
		return generatorId;
	}

	public void setGeneratorId(Integer generatorId) {
		this.generatorId = generatorId;
	}

	public boolean isHasTempStorager() {
		return hasTempStorager;
	}

	public void setHasTempStorager(boolean hasTempStorager) {
		this.hasTempStorager = hasTempStorager;
	}

	

	public Integer getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	public String getResponsibleName() {
		return responsibleName;
	}

	public void setResponsibleName(String responsibleName) {
		this.responsibleName = responsibleName;
	}

	public String getResponsibleRole() {
		return responsibleRole;
	}

	public void setResponsibleRole(String responsibleRole) {
		this.responsibleRole = responsibleRole;
	}

	public Integer getTransporterId() {
		return transporterId;
	}

	public void setTransporterId(Integer transporterId) {
		this.transporterId = transporterId;
	}

	

	public List<ImaalItemResiduo> getResidues() {
		return residues;
	}

	public void setResidues(List<ImaalItemResiduo> residues) {
		this.residues = residues;
	}

	public ImaalGerador getGenerator() {
		return generator;
	}

	public void setGenerator(ImaalGerador generator) {
		this.generator = generator;
	}

	public ImaalDestinador getReceiver() {
		return receiver;
	}

	public void setReceiver(ImaalDestinador receiver) {
		this.receiver = receiver;
	}

	public ImaalTransportador getTransporter() {
		return transporter;
	}

	public void setTransporter(ImaalTransportador transporter) {
		this.transporter = transporter;
	}
	
	

}
