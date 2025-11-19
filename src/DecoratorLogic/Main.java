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

        System.out.println(c.dress_code()); //stampa lo stato attuale, non torna una stringa fissa
        //pertanto, la stampa va assegnata a una variabile di tipo DressCode.

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
