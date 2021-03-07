package com.company;

public class BankManagement {
    private static String id;
    private String name;
    private String type;
    private float balance;
}
    public  BankManagement(String id, String name, String type, String balance)
    {
        this.id += "ABC_00"+ id;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        BankManagement.id = id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public float getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void withdrawAmount(float amount)
    {
        if(this.balance > 500 && return amount > 500)
        {
            setBalance(this.balance - amount);
        }
        else
        {
            System.out.println("You do not have sufficient balance");
        }
        return 0;


    }
    float depositAmount(float amount)
    {
        if(depositAmount(amount) < 10000 && depositAmount(amount) > 100)
        {
            setBalance(this.balance + amount);
        }

    }