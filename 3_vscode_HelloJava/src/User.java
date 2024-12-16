package src;
public class User {
    
    /* 
     * 物件導向組成：1.變數成員 2.建構子 3.函式成員
    */

    // 變數成員
    private String id;
    private String username;
    private String email;
    private String password;

    // 建構子
    public User(String id, String username, String email, String password){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // 函式成員 (method)
    public String getId(){
        return this.id;
    }
    public String getUsername(){
        return this.username;
    }
    public String getEmail(){
        return this.email;
    }
    
    public String getPassword(){
        return this.password;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
