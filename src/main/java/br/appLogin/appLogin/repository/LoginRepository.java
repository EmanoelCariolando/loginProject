package br.appLogin.appLogin.repository;

import br.appLogin.appLogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<User, Long> {

}