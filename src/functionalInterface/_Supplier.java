package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDBConnectionUrlSupplierList.get());


    }

    static String getDBConnectionUrl() {
        return "abc://localhost:5000/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () ->
            "abc://localhost:5000/users";

    static Supplier<List<String>> getDBConnectionUrlSupplierList = () ->
            List.of("" +
                    "abc://localhost:5000/users",
                    "abc://localhost:5000/customers");


}
