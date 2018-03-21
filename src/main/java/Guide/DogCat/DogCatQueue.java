package Guide.DogCat;

import java.util.LinkedList;
import java.util.Queue;

/**
 * created by xdCao on 2018/1/14
 * 好好感受这一题的思路
 */

public class DogCatQueue {

    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public DogCatQueue() {
        this.dogQ=new LinkedList<>();
        this.catQ=new LinkedList<>();
        this.count=0;
    }

    public void add(Pet pet){
        if (pet.getType().equals("dog")){
            this.dogQ.add(new PetEnterQueue(pet,this.count++));
        }else if (pet.getType().equals("cat")){
            this.catQ.add(new PetEnterQueue(pet,this.count++));
        }else {
            throw new RuntimeException("err, not dog or cat");
        }
    }

    public Pet pollAll(){
        if (!this.dogQ.isEmpty()&&!this.catQ.isEmpty()){
            if (this.dogQ.peek().getCount()<this.catQ.peek().getCount()){
                return this.dogQ.poll().getPet();
            }else {
                return this.catQ.poll().getPet();
            }
        }else if (!this.dogQ.isEmpty()){
            return this.dogQ.poll().getPet();
        }else if (!this.catQ.isEmpty()){
            return this.catQ.poll().getPet();
        }else {
            throw new RuntimeException("err, queue is empty");
        }
    }

    public Dog pollDog(){
        if (!this.isDogQueueEmpty()){
            return (Dog) this.dogQ.poll().getPet();
        }else {
            throw new RuntimeException("err, dog queue is empty");
        }
    }

    public Cat pollCat(){
        if (!this.isCatQueueEmpty()){
            return (Cat) this.catQ.poll().getPet();
        }else {
            throw new RuntimeException("err, cat queue is empty");
        }
    }


    public boolean isDogQueueEmpty() {
        return this.dogQ.isEmpty();
    }

    public boolean isCatQueueEmpty(){
        return this.catQ.isEmpty();
    }

    public boolean isEmpty(){
        return isDogQueueEmpty()&&isCatQueueEmpty();
    }

}