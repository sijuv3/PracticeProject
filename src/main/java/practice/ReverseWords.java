package practice;

public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.solution("hello world"));
    }

    private String solution(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuffer(word).reverse().toString() + " ");
        }
        return sb.toString().trim();
    }


}
