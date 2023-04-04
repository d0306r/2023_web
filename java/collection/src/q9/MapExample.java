package q9;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > maxScore) {
                maxScore = value;
                name = key;
            }
            totalScore += value;
        }
        System.out.println("평균점수 : " + totalScore / map.size());
        System.out.println("최고점수 : " + maxScore);
        System.out.println("최고점수를 받은 아이디: " + name);
    }
}
