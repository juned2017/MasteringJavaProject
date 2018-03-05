package com.company;

interface PackagePrivateInterface { //example of PackagePrivate , accessible to com.company package and all of it's classes, but not to other packages

    int SOME_CONSTANT=100; ///all interface variable are automatically set to (public static final)***
    public void mehtodA(); //just public method

    void methodC(); //also autmaticlly (methods are also public in all interface)

    //although all the method and varialbes are public in an interface, the interface itself being Private does give make the methods and variable
    //private from other (packages) b/c they wont have access to it.

}

