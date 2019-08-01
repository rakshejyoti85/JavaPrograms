 package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
import java.util.Scanner;
public class Display
{
    static Scanner scr = new Scanner(System.in);
    static Scanner scrInt = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("\fEnter no. of rows to display : ");
        int rows = scrInt.nextInt();
        System.out.print("Enter the alphabet to display : ");
        char ch = scr.next().charAt(0);
        ch = Character.toUpperCase(ch);
        System.out.print("\n\n");
        switch(ch)
        {
            case 'A':
                A obj = new A(rows);
            case 'B':
                B obj1 = new B(rows);
            case 'C':
                C obj2 = new C(rows);
            case 'D':
                D obj3 = new D(rows);
            case 'E':
                E obj4 = new E(rows);
            case 'F':
                F obj5 = new F(rows);
            case 'G':
                G obj6 = new G(rows);
            case 'H':
                H obj7 = new H(rows);
            case 'I':
                I obj8 = new I(rows);
            case 'J':
                J obj9 = new J(rows);
            case 'K':
                K obj10 = new K(rows);
            case 'L':
                L obj11 = new L(rows);
            case 'M':
                M obj12 = new M(rows);
            case 'N':
                N obj13 = new N(rows);
            case 'O':
                O obj14 = new O(rows);
            case 'P':
                P obj15 = new P(rows);
            case 'Q':
                Q obj16 = new Q(rows);
            case 'R':
                R obj17 = new R(rows);
            case 'S':
                S obj18 = new S(rows);
            case 'T':
                T obj19 = new T(rows);
            case 'U':
                U obj20 = new U(rows);
            case 'V':
                V obj21 = new V(rows);
            case 'W':
                W obj22 = new W(rows);
            case 'X':
                X obj23 = new X(rows);
            case 'Y':
                Y obj24 = new Y(rows);
            case 'Z':
                Z obj25 = new Z(rows);
        }
    }
}