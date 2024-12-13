package org.example;

public class SalesRepresentative implements Comparable{

    private int amountOfRevenue;
    private int numberOfSales;
    private int quota;

    public SalesRepresentative(int numberOfSales, int quota) {
        this.numberOfSales = numberOfSales;
        this.quota = quota;
    }

    @Override
    public int compareTo(Object o) {
        amountOfRevenue = numberOfSales * quota;
        SalesRepresentative salesRepresentative2 = (SalesRepresentative) o;
        salesRepresentative2.amountOfRevenue = salesRepresentative2.numberOfSales * salesRepresentative2.quota;
        return (amountOfRevenue - salesRepresentative2.amountOfRevenue) * (-1);
    }

    @Override
    public String toString() {
        return "SalesRepresentative{" +
                "amountOfRevenue=" + amountOfRevenue +
                ", numberOfSales=" + numberOfSales +
                ", quota=" + quota +
                '}' + "\n";
    }
}
