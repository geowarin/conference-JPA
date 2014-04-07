package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp02-conference");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		List<ConferenceMember> members = entityManager.createQuery("select cf from ConferenceMember cf", ConferenceMember.class).getResultList();
		
		System.out.println(members);
	}

}
