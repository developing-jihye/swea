import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = Arrays.stream(str_list)
                .filter(s -> !s.contains(ex))
                .collect(Collectors.joining());

        return answer;
    }
}