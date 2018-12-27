package hiber.demo;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class HeroService {
  public EntityManager em = Persistence.createEntityManagerFactory("Dota2").createEntityManager();

  public Hero add(Hero pudge) {
    em.getTransaction().begin();
    Hero p = em.merge(pudge);
    em.getTransaction().commit();
    return p;
  }

  public Hero get(int id) {
    return em.find(Hero.class, id);
  }

}
