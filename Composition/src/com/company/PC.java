package com.company;

public class PC {

    //composition is basically creating object within object, instead of using inheritance we're using composition

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(123,45,"yellow");
//        getMonitor().drawPixelAt(123,50,"yellow");
    }

//    private Case getTheCase() {
//        return theCase;

    // just use the fild of thosde class to access the methods directly
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
