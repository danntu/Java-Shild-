public class Chocolate extends Cake {
    String typeofCake;

    public String getTypeofCake() {
        return typeofCake;
    }

    public void setTypeofCake(String typeofCake) {
        this.typeofCake = typeofCake;
    }

    public void print(){
        System.out.println(typeofCake+price+formCake+weigth+color);
    }
}
