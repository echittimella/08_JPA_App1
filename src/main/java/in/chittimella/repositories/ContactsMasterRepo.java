package in.chittimella.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.chittimella.entities.ContactsMasterEntity;

public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Serializable> {

}
