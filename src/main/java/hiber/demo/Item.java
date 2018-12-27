package hiber.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  String name;

  @Column(name="hero_id")
  int heroId;

  public Item() {}

  public Item(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHeroId() {
    return heroId;
  }

  public void setHeroId(int heroId) {
    this.heroId = heroId;
  }

  @Override
  public String toString() {
    return "Item [id=" + id + ", name=" + name + ", heroId=" + heroId + "]";
  }

  

}
