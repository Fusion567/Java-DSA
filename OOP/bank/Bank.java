//package and access modifiers
package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    //getter & setters
    public String getPaasword(){
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
 
}
public class Bank {
    public static void main(String args[]) {
        Account a1 = new Account();
        a1.name = "John";
        a1.setPassword("abcd");
        a1.email = "hello@apnacollege.com";

        System.out.println(a1.getPaasword());
        System.out.println(a1.email);

    }
 
}
