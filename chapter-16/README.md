# 16. 책임 사슬 패턴 - 2


## 구현
```java
// 디펜스 인터페이스 선언
public interface Defense {
    public void defense(Attack attack);
}

// 디펜스 인터페이스 구현체
public class Armor implements Defense {

    private Defense nextDefense;
    private int def;
    
    public Armor() {}
    public Armor(int def) {
        this.def = def;
    }
    
    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }
    
    @Override
    public void defense(Attack attack) {
       process(attack);
       if (nextDefense != null) {
           nextDefense.defense(attack);
       }
    }
    
    // 공객에 대한 처리
    private void process(Attack attack) {
        int amount = attack.getAmount();
        amount -= def;
        attack.setAmount(amount);
    }

    // 방어력 설정
    public void setDef(int def) {
        this.def = def;
    }
}

// 어택 클래스 
public class Attack {
    private int amount;
    
    public Attack(int amount) {
        this.amount = amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }
}

//메인
public class Chain_Of_Responsibility {

    public static void main(String[] args) {
       Attack attack = new Attack(100);
       Armor armor1 = new Armor(10);
       Armor armor2 = new Armor(15);
       
       armor1.setNextDefense(armor2);
       armor1.defense(attack);
       
       System.out.println(attack.getAmount());
       
       //추가 착용
       
       Defense defense = (atk) -> {
           int amount = atk.getAmount();
           atk.setAmount(amount -= 50);
       };
       
       armor2.setNextDefense(defense);
       attack.setAmount(100);
       
       armor1.defense(attack);
       System.out.println(attack.getAmount());
    }
}


```

## 결과
```console
75
25
```