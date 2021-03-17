package com.company;

public class BillCalculator{
public static void main(String[] args ){
    Electricity electricity = new Electricity(90);
    electricity.calculate();
    Electricity electricity1 = new Electricity(190);
    electricity1.calculate();
    Electricity electricity2 = new Electricity(290);
    electricity2.calculate();

}
}

class Electricity {
    double bill=0, unit;
    Electricity(int unit){
        this.unit = unit;
    }

   void calculate(){
if(unit<=100){
    bill = unit*1.20;
    System.out.println(bill);
}
else if (unit <= 200)
{
    bill = (100*1.20)+ (unit-100*2);
    System.out.println(bill);
}
else if (unit <= 300)
{
    bill = (100*1.20)+(100*1.2)+ (unit-200+3);
    System.out.println(bill);
}
else{
    System.out.println("Value Out of Bound");
}


   }


}