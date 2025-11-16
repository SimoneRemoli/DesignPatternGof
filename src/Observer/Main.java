package Observer;

public class Main {
    public static void main(String[] args) {

        Notifier notifier = new Notifier();

        Observer email = new EmailNotification(notifier);
        Observer sms = new SmsNotification(notifier);

        notifier.attach(email);
        notifier.attach(sms);

        notifier.setStatoPagamento("Pagamento completato!");

        System.out.println(" ");

        notifier.setNumeroOrdini(42);
    }
}



/*
| Ruolo                      | Classe                                 | Responsabilità                                             |
| -------------------------- | -------------------------------------- | ---------------------------------------------------------- |
| **Subject (astratto)**     | `Subject`                              | Mantiene lista observer e notifica i cambiamenti           |
| **ConcreteSubject**        | `Notifier`                             | Rappresenta l’oggetto “osservato” e genera gli eventi      |
| **Observer (interfaccia)** | `Observer`                             | Definisce il metodo `update()` che reagisce alle notifiche |
| **ConcreteObserver**       | `EmailNotification`, `SmsNotification` | Reazioni specifiche ai cambiamenti                         |
| **Client**                 | `ObserverTest`                         | Crea i soggetti e gli osservatori e simula gli eventi      |

il Subject mantiene un proprio stato interno;
quando questo stato cambia, il Subject notifica automaticamente tutti gli Observer;
ciascun Observer può leggere lo stato aggiornato del Subject (pull model) oppure riceverlo come parametro (push model).

PULL model : Il Subject dice “è cambiato qualcosa!”

Gli Observer vanno a chiedere “cosa è cambiato?” → (getState()).

*/