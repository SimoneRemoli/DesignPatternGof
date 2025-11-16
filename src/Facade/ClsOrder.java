package Facade;

public class ClsOrder /*facade*/ {

    public void placeOrderFacadeMethod() {
        ClsProduct product = new ClsProduct();
        ClsPayment payment = new ClsPayment();
        ClsInvoice invoice = new ClsInvoice();

        product.getDetails();
        payment.payOnline();
        invoice.printInvoice();
    }
}