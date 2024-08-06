package in.chittimella.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTACTS_MASTER")
public class ContactsMasterEntity {
	@Id
	@Column(name = "CONTACT_ID")
	private Integer contactId;

	@Column(name = "CONTACT_NAME")
	private String contactName;

	@Column(name = "CONTACT_NUMBER")
	private Long contactNumber;

	public void setContactId(int contactId) {
		this.contactId = contactId;
		
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
		
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
}
