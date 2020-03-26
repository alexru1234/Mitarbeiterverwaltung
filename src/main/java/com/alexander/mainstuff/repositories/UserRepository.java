package com.alexander.mainstuff.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.alexander.mainstuff.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByDepartment(String department);
}
