public class Velvet extends Cake {
    String taste;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void print(){
        System.out.println(taste+price+formCake+weigth+color);
    }
}
