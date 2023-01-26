package fr.formation.inti.dao;

import org.hibernate.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.inti.model.Users;

@Service
@Transactional
public class UserDaoImpl extends GenericDaoImpl<Users, Integer> implements UserDao {

	@Override
	public Users findByEmail(String email) {
		String hql = "from " + Users.class.getName() + " where email = :email";
		Query query = getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter("email", email);
		Users user = (Users) query.uniqueResult();

		return user;

	}
}
