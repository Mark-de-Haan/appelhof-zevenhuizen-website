package org.mdehaan.repository;

import org.mdehaan.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String>
{
}
