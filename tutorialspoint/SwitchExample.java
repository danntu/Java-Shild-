public class SwitchExample {
    public static void main(String[] args) {
        char grade = args[0].charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                case 'C':
                    System.out.println("Well done");
                    break;
            case 'D':
                System.out.println("You passed");
                break;
                default:
                    System.out.println("Invalid grade");
        }
        System.out.println("Your gradle is "+grade);
    }
}
