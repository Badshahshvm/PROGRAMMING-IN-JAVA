import java.util.HashMap;
import java.util.Map;

public class Hashmap {


    public static void hasMapMethod()
    {
        Map<String,Integer> m=new HashMap<>();
        m.put("Shivam",23);
        m.put("Vikash",25);
        m.put("gaurav",30);
        System.out.println(m.get("Shivam"));
    }
    public static void main(String[] args)
    {
        hasMapMethod();
    }
}
