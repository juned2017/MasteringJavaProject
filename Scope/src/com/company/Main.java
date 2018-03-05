package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String privateVar="this is private to main()";
        ScopeCheck scopeCheck=new ScopeCheck();
        System.out.println("scopeInstance privateVar is "+scopeCheck.getPrivateVar());

        scopeCheck.useInnerClass();

        System.out.println(privateVar);
        scopeCheck.timesTwo();

        System.out.println("\n ************************************************");
        ScopeCheck.InnerClass innerClassObject=scopeCheck.new InnerClass();
        innerClassObject.timesTwo();



    }

}
