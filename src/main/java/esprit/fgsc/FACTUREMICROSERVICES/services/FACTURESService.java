package esprit.fgsc.FACTUREMICROSERVICES.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esprit.fgsc.FACTUREMICROSERVICES.entities.FACTURE;
import esprit.fgsc.FACTUREMICROSERVICES.repository.FACTURESRepository;

@Service
public class FACTURESService {
	@Autowired
	public FACTURESRepository FACTURESRepository;

public List<FACTURE>getAllDepartement(){
		 return FACTURESRepository.findAll();
	}
	
	public String deleteDepartement(String id) {   
		FACTURESRepository.deleteById(id);
    	return "facture deleted";
	}
	
	public FACTURE  addDepartement(FACTURE FACTURE) {
		
			
			return FACTURESRepository.save(FACTURE);
			
		}

	
	
           
public FACTURE updateDepartement(String id,FACTURE newDepartement) {
	if(FACTURESRepository.findById(id).isPresent()) {
		FACTURE existingDepartement = FACTURESRepository.findById(id).get();
		existingDepartement.setName(newDepartement.getName());
		existingDepartement.setEmploye(newDepartement.getEmploye());
		existingDepartement.setNumber(newDepartement.getNumber());
		existingDepartement.setDescription(newDepartement.getDescription());

		
	    
		return FACTURESRepository.save(existingDepartement);
		
	}else {
		return null;
	}
}

public FACTURE getDepartementById(String id) {
	return FACTURESRepository.findById(id).get();
	
}
}
