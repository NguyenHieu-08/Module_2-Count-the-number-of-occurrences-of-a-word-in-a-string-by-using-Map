import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int count = 1;
        System.out.print("Nhập từ bạn muốn: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase().trim();
        String[] arrText = text.split(" ");

        System.out.println(Arrays.toString(arrText));

        Map<String, Integer> mapArr = new HashMap<>();
        for(int i = 0; i < arrText.length; i++) {
            if(mapArr.containsKey(arrText[i])){
                mapArr.put(arrText[i], mapArr.get(arrText[i])+1);
            } else {
                mapArr.put(arrText[i], count);
            }
        }

        for (String key : mapArr.keySet()) {
            int value = mapArr.get(key);
            System.out.println(key + " = " + value + " ");
        }
    }
}