package hiber.demo;

import java.util.ArrayList;
import java.util.List;

public class HeroMain {

  public static void main(String[] args) {
    
    HeroService service = new HeroService();
    
    /*
    Hero hero = new Hero();
    hero.setLevel(10);
    hero.setName("Pudge");
    List<Item> list=new ArrayList<>();
    Item item1=new Item("Aghanim");
    Item item2=new Item("Boots");
    list.add(item1);
    list.add(item2);
    hero.setItems(list);  
    */
    
    Hero hero=service.get(15);
  /*
    List<Item> list=new ArrayList<>();
    Item item1=new Item("Aghanim2");
    item1.setHeroId(hero.getId());
    Item item2=new Item("Boots2");
    item2.setHeroId(hero.getId());
    list.add(item1);
    list.add(item2);
  
    hero.setItems(list);  
    */
   // hero.setName("New Pudge");
    System.out.println(hero);
    //System.out.println(service.add(hero));
    
  }

}
