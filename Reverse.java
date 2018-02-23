public class Reverse {
    public static void main(String[] args) {
            spinWords("Welcome");
    }

    public static String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        String res="";
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length() >= 5) {
                char rev[] = arr[i].toCharArray();
                char newChar[] = new char[arr[i].length()];
                for (int j =rev.length-1;j>=0;j--){
                    int k=0;
                    newChar[k]=rev[j];
                }
                res +=String.valueOf(newChar);
            } else{
                res +=arr[i];
            }

        }

        return res;
    }
}
