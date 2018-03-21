package Guide.DogCat;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by xdCao on 2018/1/12
 */

public class MyDogCatQueue {

    private Queue<Pet> allQueue=null;
    private Queue<Dog> dogQueue=null;
    private Queue<Cat> catQueue=null;

    public MyDogCatQueue() {
        allQueue=new LinkedList<>();
        dogQueue=new LinkedList<>();
        catQueue=new LinkedList<>();
    }

    public void add(Pet pet){
        allQueue.add(pet);
        if (pet instanceof Dog){
            dogQueue.add((Dog) pet);
        }else {
            catQueue.add((Cat) pet);
        }
    }

    public Pet pollAll(){
        Pet poll = allQueue.poll();
        if (poll instanceof Dog){
            if (poll.equals(dogQueue.peek())){
                dogQueue.poll();
            }else {
                return pollAll();
            }
        }else {
            if (poll.equals(catQueue.peek())){
                catQueue.poll();
            }else {
                return pollAll();
            }
        }
        return poll;
    }

    public Dog pollDog(){
        Dog dog = dogQueue.poll();
        if(allQueue.peek().equals(dog)){
            allQueue.poll();
        }
        return dog;
    }

    public Cat pollCat(){
        Cat cat=catQueue.poll();
        if (allQueue.peek().equals(cat)){
            allQueue.poll();
        }
        return cat;
    }

    public boolean isEmpty(){
        return pollAll() == null;
    }

    public boolean isDogEmpty(){
        return dogQueue.isEmpty();
    }

    public boolean isCatEmpty(){
        return catQueue.isEmpty();
    }

    public static void main(String[] args) {
        MyDogCatQueue dogCatQueue=new MyDogCatQueue();
        dogCatQueue.add(new Cat());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Cat());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Cat());
        dogCatQueue.add(new Cat());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Cat());

    }

}
