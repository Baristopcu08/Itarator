import java.util.Iterator;

public class Showroom implements Iterable<Car>{
    private Car [] cars;
    private Car[] tmp;
    private int caunt;
    private final int defultCapacity=10;


    public Showroom(int capacity) {
        cars=new Car[capacity];
    }

    public Showroom() {
        cars=new Car[defultCapacity];
    }

    public void add(Car cars){
        this.cars[caunt++]=cars;
        if(size()>capacity()/2){
           plusCapacity();
        }
    }

    public boolean remove(int index) {
        boolean result= false;
        //cars[index]=null;
        if (index >= 0 && index < size()) {
            for (int i = index + 1; i < size(); i++) {
                cars[i - 1] = cars[i];
            }
            cars[--caunt] = null;
            result=true;
        }
        return result;
    }
    public boolean remove(Car car){
        int index=-1;
        for (int i = 0; i < size(); i++) {
            if (car.equals(cars[i])){
                index=i;
                break;
            }
        }
        return remove(index);
    }

    private void plusCapacity() {
        copyList();
        plusCapacityMethot();
    }

    private void plusCapacityMethot() {
        cars=new Car[capacity()*2];
        for (int i = 0; i < size(); i++) {
            cars[i]=tmp[i];
        }
    }

    private void copyList() {
        tmp=new Car[size()];
        for (int i = 0; i < size(); i++) {
            tmp[i]=cars[i];
        }
    }

    public int size(){
        return caunt;
    }
    public int capacity(){
        return cars.length;
    }

    @Override
    public Iterator<Car> iterator() {
        return new CarItarator();
    }

    private class CarItarator implements Iterator<Car> {
        private int index;

        @Override
        public boolean hasNext() {
          return index<caunt;
        }

        @Override
        public Car next() {
            return cars[index++];
        }
    }
}
