package java8;

class GenericClass<X> {
    X name;

    public X getName() {
        return name;
    }

    public void setName(X name) {
        this.name = name;
    }

    public String genericMethod(GenericClass<String> x) {
        x.setName("Danik with Generic argument");
        return x.name;
    }
}

public class TypeInferenceExample {
    public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.setName("Myrzakanov");
        System.out.println(genericClass.getName());

        GenericClass<String> genericClass2 = new GenericClass<>();
        genericClass2.setName("Danik");
        System.out.println(genericClass2.getName());

        System.out.println(genericClass2.genericMethod(new GenericClass<>()));
    }
}
