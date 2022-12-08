package com.imt.training.java.interfaces;
public class InvoiceApp {
    public static void main(String[] args) {
        CalculateTax exportInvoice = new ExportInvoice();
        System.out.println(exportInvoice.defaultTax);
        exportInvoice.calculateTax();

        CalculateTax importInvoice =new ImportInvoice();
        System.out.println(importInvoice.defaultTax);
        importInvoice.calculateTax();

        System.out.println(CalculateTax.getDefaultTax());
        System.out.println(importInvoice.getBaseTax());
    }
}
