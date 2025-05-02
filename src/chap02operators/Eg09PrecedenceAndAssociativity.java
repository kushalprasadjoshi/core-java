package chap02operators;

public class Eg09PrecedenceAndAssociativity {
    public static void main(String[] args) {
        int a = 6*5-34/2;
           /*
           = 6*5-34/2
           = 30-34/2
           = 30-17
           13
            */
        int b = 60/5-34*2;
           /*
           = 60/5-34*2
           = 12-34*2
           = 12-68
           = -56
            */
        //Highest Precedence goes to * and /.
        // They are then evaluated on the basis of left to right associativity.

        System.out.println(a);
        System.out.println(b);
    }
}
