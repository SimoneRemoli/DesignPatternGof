package DecoratorLogic;

public class Main {
    public static void main(String[] args) {
        Component c =
                new Eyeglasses(
                        new Shoes(
                                new TShirt(
                                        new Man()
                                )
                        )
                );

        DressCode result = c.dress_code(); //cambia il result in base alle chiamate

        /*
        Si manipola l'oggetto DressCode in base alla logica di ogni decorator.
        Alla fine si ottiene un DressCode che riflette tutte le modifiche apportate.
         */
        System.out.println("Style: " + result.styleLevel);
        System.out.println("Formal: " + result.isFormal);

    }
}


/*

Ogni decorator introduce una logica vera, non solo una stampa.

È esattamente ciò che il Decorator dovrebbe fare in un software reale.

Per esempio:

Shoes valida che il dress_code sia compatibile.

TShirt cambia lo stile in base alla temperatura.

Underwear modifica un valore booleano interno.

Eyeglasses aggiunge un comportamento di analisi, protezione, calcolo, ecc.

 */
