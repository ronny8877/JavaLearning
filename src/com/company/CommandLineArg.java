package com.company;

public class CommandLineArg {

    public static void main(String[] args){
        if(args[0].equals("all") & args[1].equals("best")){
            System.out.println(args[0] + " the " + args[1] );
        }

        else if(args[0].equals("thar") & args[1].equals("mahindra"))
        {
            System.out.println(args[0]  + " " + args[1] + " Suv " );
        }

        else {
            System.out.println("No Programmed Output");
        }

    }


}
