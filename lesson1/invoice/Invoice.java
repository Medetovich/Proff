package lesson1.invoice;

import java.util.Arrays;

public class Invoice {
    private InvoiceItem [] items;
    public Invoice(InvoiceItem[] items) {
        this.items = items;
    }

    @Override
    public String toString() {
      /*  String res = "";
        for (int i = 0; i < items.length; i++) {
            res += items[i] + "\n";
        }

        return res;*/
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            builder.append(items[i]);
            builder.append("\n");
        }
        return builder.toString();
    }
    public double calculate(){
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            sum += items[i].getCount() * items[i].getUnitPrice();
        }
        return sum;
    }
    public static void main(String[] args) {
        InvoiceItem [] i = new InvoiceItem[]{
                new InvoiceItem("abc111", "birns",12,1.49),
                new InvoiceItem("cdd121", "apples",5,1.19),
                new InvoiceItem("aee311", "bananna",2,0.89),
        };
        Invoice invoice = new Invoice(i);
        System.out.println(invoice);
        System.out.println(invoice.calculate());
    }

}
