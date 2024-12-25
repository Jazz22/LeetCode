import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int s=0;
        if(sc.hasNext()){
            s=sc.nextInt();

        }

        int[] arr = new int[s];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<s;i++){
            if(sc.hasNext())
                arr[i] = sc.nextInt();
        }
        System.out.println("Enter the vaule you want to remove");
        int k =0;
        if(sc.hasNext())
            k = sc.nextInt();

        RemoveElement re = new RemoveElement();
        int count =re.removeElement(arr,k);
        System.out.println(Arrays.toString(arr));
        Arrays.stream(arr).limit(count).forEach(value -> System.out.println(value+" "));
    }
}