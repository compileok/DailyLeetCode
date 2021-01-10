package array;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("car","arc"));
        System.out.println(isAnagram("helloo","holleo"));
        System.out.println(isAnagram("helloo","hollee"));

    }


    /**
     * Runtime: 3 ms, faster than 72.97% of Java online submissions for Valid Anagram.
     * Memory Usage: 40.7 MB, less than 5.38% of Java online submissions for Valid Anagram.
     */
    public static boolean isAnagram(String s, String t) {
        if(s==null || t == null){
            return false;
        }

        if(s.length()!=t.length()){
            return false;
        }

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        int[] mark = new int[26];
        for (char c : sarr){
            mark[c-97]+=1;
        }
        for (char c:tarr){
            mark[c-97]-=1;
        }
        boolean res = true;
        for (int i=0;i<mark.length;i++){
            if(mark[i]>0){
                res=false;
                break;
            }
        }
        return res;
    }
}
