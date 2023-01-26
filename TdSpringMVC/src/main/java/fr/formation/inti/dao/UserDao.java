package fr.formation.inti.dao;

import fr.formation.inti.model.Users;

public interface UserDao extends GenericDao<Users, Integer>{

	Users findByEmail(String email);


}
