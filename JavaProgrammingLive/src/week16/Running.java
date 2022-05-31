package week16;

public class Running extends Exercise {
    @Override
    public void perform() {
        System.out.println("Performing Running Exercise on the track");
    }


    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }

    @Override
    public int getCaloriesCount() {
        return 0;
    }

    //  public abstract void run(); you can not declare you class as abstract



}
