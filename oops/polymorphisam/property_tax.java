class property {
     double calculatetax(double areainsqure) {
        return areainsqure * 10;

    }

     double calculatetax(int propertytax) {
        return propertytax * 0.02;
    }

     double calculatetax(double areainsqure, double ratepersqft) {
        return areainsqure * ratepersqft;
    }

     double calculatetax(double propertytax, int servicecharge) {

        return (propertytax * 0.015) + servicecharge;
    }
}

class property_tax {
    public static void main(String[] args) {
        property obj = new property();
        System.out.println( obj.calculatetax(10.0));
        System.out.println( obj.calculatetax(5000));
        System.out.println( obj.calculatetax(100.0, 50.0));
        System.out.println( obj.calculatetax(20000.0, 500));

    }
}
