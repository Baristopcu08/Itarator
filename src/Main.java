import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Showroom showroom=new Showroom();

        showroom.add(new Car(1,"car 1"));
        showroom.add(new Car(2,"car 2"));
        showroom.add(new Car(3,"car 3"));
        showroom.add(new Car(4,"car 4"));
        showroom.add(new Car(5,"car 5"));
        showroom.add(new Car(6,"car 6"));
        showroom.add(new Car(7,"car 7"));
        showroom.add(new Car(8,"car 8"));
        showroom.add(new Car(9,"car 9"));
        showroom.add(new Car(10,"car 10"));
        showroom.add(new Car(11,"car 11"));
        showroom.add(new Car(12,"car 12"));
        showroom.add(new Car(13,"car 13"));
        showroom.add(new Car(14,"car 14"));
        showroom.add(new Car(15,"car 15"));

        boolean removeCars=showroom.remove(3);
        boolean removeCars2=showroom.remove(new Car(10,"car 10"));


        for (var item:showroom) {
            System.out.println(item);
        }

        String s = removeCars == true ? "nesne silinebildi" : "nesne silinemedi";
        String s1 =removeCars2 == true ? "nesne silinebildi" : "nesne silinemedi";

        System.out.println("***************************");
        System.out.println(s);
        System.out.println(s1);



        

    }
}
