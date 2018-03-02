package com.company;

public class BoxWeight extends Box {

   double weight;

   BoxWeight (){

   }

   BoxWeight (double w,double h, double d, double m){
       super(w,h,d);
       weight=m;
   }


    public BoxWeight(BoxWeight ob) {

    }

    public BoxWeight(double len, double m) {

    }
}

//   BoxWeight(double w, double h,double d, double m){
//       width=w;
//       height=h;
//       depth=d;
//       weight=m;
//
//   }




