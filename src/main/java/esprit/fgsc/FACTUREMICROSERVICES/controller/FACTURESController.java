package esprit.fgsc.FACTUREMICROSERVICES.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import esprit.fgsc.FACTUREMICROSERVICES.entities.FACTURE;
import esprit.fgsc.FACTUREMICROSERVICES.services.FACTURESService;


@CrossOrigin(origins = "*")
@RestController
public class FACTURESController {

	@Autowired
	private  FACTURESService FACTURESService;
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<FACTURE> createEmployee(@RequestBody FACTURE fACTURE) {
		return new ResponseEntity<>(FACTURESService.addDepartement(fACTURE), HttpStatus.OK);
	}
	
	
	@GetMapping("/factures")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<FACTURE> >getAllEmployees(){
		 return new ResponseEntity<>(FACTURESService.getAllDepartement(),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String deleteDepartements(@PathVariable String id) {
	    return FACTURESService.deleteDepartement(id);
	}

	@PutMapping(value="/update/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<FACTURE>deleteDepartement(@PathVariable("id") String id,@Valid @RequestBody FACTURE fACTURE) {
		return new ResponseEntity<>(FACTURESService.updateDepartement(id, fACTURE),HttpStatus.OK);
	}
	


}
