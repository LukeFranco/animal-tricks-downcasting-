
public class Main {

  public static void main(String[] args) {

    Animal anim = new Dog();
    anim.name = "Charlie";
    anim.doTrick(); //charlie sits on command
 
    
    Animal anim1 = new Cat();
    anim1.name = "Wanda";
    anim1.doTrick();
    makeAnimalSpeak(anim); //charlie the dog barks 
    makeAnimalSpeak(anim1);
  }
    public static void makeAnimalSpeak(Animal animal){

      if (animal instanceof Dog){ //if dog make it bark 
      Dog dog = (Dog) animal;
      dog.bark();
      
        
        
    } else if (animal instanceof Cat) { //if cat make it meow

        Cat cat = (Cat) animal;
        cat.meow();
      
      }
    }
  }

