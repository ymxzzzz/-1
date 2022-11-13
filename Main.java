public class Main {
    public static void main(String[] args) {
        String str="123";
        String str1="123";
        String str2=new String("123");
        System.out.println(str==str1);
        /**
         * ==号比较引用数据类型，比较的是地址，
         * str创建以后，再次创建str1时，会先看内存池中是否有”123“字符，如果有，指向str开辟的空间，如果没有，新开辟空间，存入字符
         * 因此str和str1内容相同，只想同一块空间，地址相同
         */
        System.out.println(str==str2);
        /**
         *用new创建字符，会直接开辟新空间
         * str和str2地址不同
         */
    }
}