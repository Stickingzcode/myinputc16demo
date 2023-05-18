package classPackage;

import java.math.BigDecimal;

public class MainPassByV {
    private String name;
    private BigDecimal balance;
    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }
    public BigDecimal getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
    return "classPackage.MainPassByV{\n"+"name "+name+"\nbalance:"+balance+"\n}";
    }
}
