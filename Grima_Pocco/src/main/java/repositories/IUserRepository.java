package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.UserModel;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {
	
	
}