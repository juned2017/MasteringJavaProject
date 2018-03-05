package com.company;

public class ScopeCheck {
    public int publicVar=0;
    private int privateVar=1; //class level scope , everyithing in this class can use this varialbe

    public ScopeCheck(){
        System.out.println("Scopecheck create, publicVar=" +publicVar + ": privateVar= "+privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
        int privateVar=4; //this privateVar variable is in scope within this method and not the one above, java checks the scope for that privateVar first
        // within { scope } and if it dosen't find it it will go out and find global one . so if we had commented the int prinvateVar variable
        //it would have used the top one which is privateVar=1;
        for(int i=0; i<=privateVar; i++){
            System.out.println(i+" times two is " + i *privateVar); //if we wanted to use the class level variable privateVar specificly in this scope
            // we just have to say this.privateVar
        }

    }
    public void useInnerClass(){
        System.out.println("I'm running from outer class using an inner class instance");
        InnerClass innerClass=new InnerClass();
        innerClass.timesTwo();
    }

    public class InnerClass { //inner class have acccess to all the methods of it's contained class (ScopeCheck) even the private variable and mentods
        //to get access to InnerClass varialbes and method from contained class, you need to create an instance of InnerClass and use that to access them
        //like the method above (useInnerClass)

        public int privateVar=3;

        public InnerClass(){
            System.out.println("InnerClass is create3, private is "+privateVar); //here , if line 28 was commented, and we wanted to use private privateVar
            //of ScopeCheck we would do (ScopeCheck.this.privateVar)
        }

        public void timesTwo(){
            //can also call timesTwo of ScopeCheck class

            //ScopeCheck.this.timesTwo();
            for (int i=0; i<+5; i++){
                System.out.println(i+ "times is "+ i*privateVar);
            }
        }

    }
}
