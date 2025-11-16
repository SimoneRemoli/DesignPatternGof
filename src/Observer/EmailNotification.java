package Observer;

public class EmailNotification implements Observer {

    private final Notifier notifier;

    public EmailNotification(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void update(EventType eventType) {

        switch (eventType) {

            case STATO_PAGAMENTO_CAMBIATO:
                System.out.println(" Email: nuovo stato pagamento : " +
                        notifier.getStatoPagamento());
                break;

            case NUMERO_ORDINI_CAMBIATO:
                System.out.println(" Email: nuovo numero ordini : " +
                        notifier.getNumeroOrdini());
                break;
        }
    }
}
