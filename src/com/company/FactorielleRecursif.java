package com.company;

public class FactorielleRecursif {

    private static int fact(int n){
        if(n==0) return(1);
        else return (n*fact(n-1));
    }

    public static void main(String[] args){
        System.out.println(fact(6));
        System.out.println("\n");
    }

}
