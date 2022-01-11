package laundryBin_wait_notify;

public class Demo { /*There is one Laundry bin where 3 children put clothes and mother get clothes out
                    The capacity of this Laundry Bin is 40 clothes*/

    public static void main(String[] args) {
        LaundryBin bin = new LaundryBin();
        Mother mother = new Mother(bin);
        Child child1 = new Child(bin);
        Child child2 = new Child(bin);
        Child child3 = new Child(bin);

        mother.start();
        child1.start();
        child2.start();
        child3.start();
    }
}
