public class Test01 {
    /**
     * 回文数判断
     * @param args
     */
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        int y = 0;
        int n = 0;
        int num = x;
        if(x < 0){
            return false;
        }
        while(x > 0){
            y *= 10;
            n = x % 10;
            x = x / 10;
            y += n;
        }
        if(num == y){
            return true;
        }
        return false;
    }
}
