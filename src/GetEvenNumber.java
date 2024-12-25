import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetEvenNumber {

    public static void main(String [] args){
        List<Integer> num = new ArrayList();
        num.add(13);
        num.add(10);
        num.add(9);
        num.add(1);
        num.add(11);
        num.add(12);
        num.add(18);


        System.out.println(num.stream().filter(a -> (a%2==0) && a>5).collect(Collectors.toList()));

    }
}
