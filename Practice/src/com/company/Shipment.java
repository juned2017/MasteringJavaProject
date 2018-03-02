package com.company;

public class Shipment extends BoxWeight {
    double cost;

    Shipment (Shipment ob){
        super(ob);
        cost=ob.cost;
    }
    Shipment (double len,double m, double c){
        super(len,m);
        cost=c;
    }

    public Shipment(double w, double h, double d, double m, double c) {
        super(w,h,d,m);
        cost=c;

    }
}
