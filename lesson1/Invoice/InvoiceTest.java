package lesson1.Invoice;

import lesson1.invoice.Invoice;
import lesson1.invoice.InvoiceItem;
import lesson1.salary.JapaneseSalary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvoiceTest {

    @Test
    public void InvoiceSumTest() {

        InvoiceItem[] inv = new InvoiceItem[]{new InvoiceItem("abc111", "birns", 12, 1.49)};
        Invoice invv = new Invoice(inv);
        assertEquals(17.88, invv.calculate(), 0.0001);

    }
}
