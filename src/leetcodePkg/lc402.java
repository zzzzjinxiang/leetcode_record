package leetcodePkg;

import java.util.LinkedList;

public class lc402 {
//    String拼接效率远低于StringBuilder
    public static void main(String[] args) {
        String tmp = "10200";
        int k = 1;
        System.out.println(f(tmp, k));
    }

    public static String f(String num, int k) {
        LinkedList<Character> stack = new LinkedList<>();
        int len = num.length() - k;
        if(len<=0)
            return "0";
        if (num.length() <= 1 && k != 0)
            return "0";
        for (char s : num.toCharArray()) {
            while (stack.size() != 0 && k != 0 && s < stack.getLast()) {
                stack.removeLast();
                k--;
            }
            stack.add(s);
        }
        while (k!=0) {
            stack.removeLast();
            k--;
        }
//        for (char s : num.toCharArray()) {
//            if (stack.isEmpty())
//                stack.add(s);
//            else if (s > stack.getLast() && k != 0) {
//                k--;
//            } else if (s < stack.getLast() && k != 0) {
//                stack.removeLast();
//                stack.add(s);
//                k--;
//            } else if (k == 0)
//                stack.add(s);
//        }
        while (stack.getFirst() == '0' && stack.size() > 1) {
            if (stack.getFirst() != '0')
                break;
            else {
                stack.removeFirst();
            }
        }
        StringBuilder res = new StringBuilder();
        while(len!=0 && !stack.isEmpty()){
            res.append(stack.poll());
            len--;
        }
        return res.toString();
    }
}
