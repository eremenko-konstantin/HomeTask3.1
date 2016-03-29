package org.sourceit;

public class Fraction {

    private int num;
    private int denom;

    Fraction(){
        this.num = 0;
        this.denom = 0;
    }

    public Fraction(int n, int d){
        this.num = n;
        this.denom = d;
    }

    public String toString(){
        return this.num + "/" + this.denom;
    }



    public static void main(String[] args) {
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(3, 4);
        System.out.println(b.toString());

    }

}
