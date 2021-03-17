package com.company;

public class SimpleIntrestCunstructorOverLoading {
    double principle ,rate ,time , si ;
    SimpleIntrestCunstructorOverLoading ( double p , double r , double t) {
        this.principle = p;
        this.rate =r;
        this.time=t;

        System.out.println("Simple intrest is " +  (principle*rate*time)/100);
    }
    SimpleIntrestCunstructorOverLoading(double si , double p ){
        this.principle = p;
        this.si = si;

        System.out.println("Amount is " +  (p+si));

    }

public static void  main(String[]  args){
        SimpleIntrestCunstructorOverLoading simpleInt= new SimpleIntrestCunstructorOverLoading(1500,6.5,2);
        SimpleIntrestCunstructorOverLoading simpleInt1= new SimpleIntrestCunstructorOverLoading(195.0, 1500);

}
}



