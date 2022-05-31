package week16;

public abstract class Exercise {
    // You don't have to have abstract at all, and you can still declare you class as abstract

    public void start(){
        System.out.println("warming up and starting the exercise");
    }
/*
abstract methods: no body, no implementation, sub classes will ***override***#
less code
just have the signature part
 */
        public abstract void perform();

        public abstract int getCaloriesCount(int minutes);

    public abstract int getCaloriesCount();
}
