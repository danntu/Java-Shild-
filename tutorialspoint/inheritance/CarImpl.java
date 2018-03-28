package inheritance;

public class CarImpl implements CarInterface {
    @Override
    public void openDoor() {
        System.out.println("You open door");

    }

    @Override
    public void closeDoor() {
        System.out.println("You close door");
    }

    public static void main(String[] args) {
        CarImpl c = new CarImpl();
        c.closeDoor();
        c.openDoor();
    }
}
