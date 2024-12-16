package src;
public class Main {
    public static void main(String[] args) {
        
        // 變數
        String language = "java";

        // 印東西出來看
        System.out.println("hello "+language);
        
        // 判斷式
        if("java".equals(language)){
            language += " so cool";
        }else{
            language += " also great";
        }

        // 迴圈
        System.out.println("*");
        int max = 10;
        for(int i=0; i<max; i++){
            System.out.println(language+" "+i);
        }

        //物件導向
        String id="1";
        String name="yale";
        String email="yale@gmail.com";
        String password="12345";
        System.out.println("*");
        System.out.println(id+" "+name+" "+email+" "+password);
    }
}
