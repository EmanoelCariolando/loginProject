package br.appLogin.appLogin.repository;

import br.appLogin.appLogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<User, Long> {

}