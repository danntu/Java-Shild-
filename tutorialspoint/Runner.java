public class Runner {
    public static void main(String[] args) {
        Velvet v =  new Velvet();
        v.setTaste("Cacao");
        v.setColor("Red");
        v.setFormCake("Oval");
        v.setPrice(4000);
        v.setWeigth(2.5);
        v.print();

        Chocolate c =  new Chocolate();
        c.setTypeofCake("White");
        c.setColor("Red");
        c.setFormCake("Square");
        c.setPrice(3000);
        c.setWeigth(3.5);
        c.print();

    }
}
