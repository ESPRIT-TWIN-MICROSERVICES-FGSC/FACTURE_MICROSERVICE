package esprit.fgsc.FACTUREMICROSERVICES.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import esprit.fgsc.FACTUREMICROSERVICES.services.FACTURESService;

@Document
public class FACTURE {
@Id
private String id;
private String Name;
private String employe;
private String number;
private String description;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmploye() {
	return employe;
}
public void setEmploye(String employe) {
	this.employe = employe;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}





}
