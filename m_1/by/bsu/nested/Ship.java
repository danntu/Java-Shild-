package m_1.by.bsu.nested;

public class Ship {
    public int id;

    public static class LifeBoat{
        private int boatId;

        public static void down(){
            System.out.println("шлюпки на воду!");
        }
        public void swim(){

            System.out.println("отплытие шлюпки");
        }
    }
}
