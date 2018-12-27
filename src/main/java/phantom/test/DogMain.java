package phantom.test;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

public class DogMain {

  public static void main(String[] args) {
    ReferenceQueue<Dog> referenceQueue = new ReferenceQueue<>();
    List<DogWrapper> references = new ArrayList<>();
    List<Dog> dogs = new ArrayList<>();
     
    for (int i = 0; i < 10; ++i) {
        Dog dog = new Dog();
        dogs.add(dog);
        references.add(new DogWrapper(dog, referenceQueue));
    }
     
    dogs = null;
    System.gc();
     
    Reference<?> referenceFromQueue;
    for (PhantomReference<Dog> reference : references) {
        System.out.println(reference.isEnqueued());
    }
     
    while ((referenceFromQueue = referenceQueue.poll()) != null) {
      DogWrapper dw=(DogWrapper)referenceFromQueue;
      System.out.println("Dog: "+dw.get());
        ((DogWrapper)referenceFromQueue).finalizeResources();
        referenceFromQueue.clear();
    }

  }

}
