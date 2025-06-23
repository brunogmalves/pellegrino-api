package br.com.api.pellegrino.repositories;

import java.util.UUID;
import br.com.api.pellegrino.models.User;

public interface UserRepository extends CrudRepository<User, UUID>{

}
