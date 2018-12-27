package phantom.test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class DogWrapper extends PhantomReference<Dog> {
  
  public DogWrapper(Dog dog, ReferenceQueue<Dog> dogQueue) {
    super(dog, dogQueue);
  }

  public void finalizeResources() {
    // free resources
    System.out.println("Dog clearing ...");
  }
}
