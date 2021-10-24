package esprit.fgsc.FACTUREMICROSERVICES.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import esprit.fgsc.FACTUREMICROSERVICES.entities.FACTURE;

@Repository
public interface FACTURESRepository extends MongoRepository<FACTURE, String>{

}
