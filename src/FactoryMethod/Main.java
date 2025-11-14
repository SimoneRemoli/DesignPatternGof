package FactoryMethod;

/**
 * --------------------------------------------------------------------
 *  DESIGN PATTERNS – Factory Method
 * --------------------------------------------------------------------
 *  @Author: Simone Remoli
 *  The code samples include "stub functions", which are intentionally
 *  simplified methods used during the early stages of software design.
 *  As emphasized by Professor Falessi, using stubs during the
 *  design and prototyping phase is a recommended practice.
 *  For these reasons, the examples contained in this document adopt
 *  stubs such as `sleeping()`, `drinking()`, and similar placeholder
 *  methods, each providing a simple printed message to simulate behavior.
 *  This approach keeps the document readable, didactic, and perfectly
 *  aligned with academic best practices.
 * --------------------------------------------------------------------
 */

public class Main
{
    public static void main(String[] args)
    {
        Factory f = new Factory();
        try {
            ProductBase A = f.getInstance(1);
            ProductBase B = f.getInstance(2);
            ProductBase C = f.getInstance(3);
            ProductBase A1 = f.getInstance(4);

            A.eating();    B.eating();    C.eating();
            A.drinking();  B.drinking();  C.drinking();
            A.sleeping();  B.sleeping();  C.sleeping();

            System.out.println("\t A1 in stdout: \n");

            A1.eating(); A1.drinking(); A1.sleeping();

            //-----------------------------------------------------
            ProductBase Error = f.getInstance(99);
            /*
            Exception in thread "main" java.lang.RuntimeException
             */
            //------------------------------------------------------
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}