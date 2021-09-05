package customermailapplication;

public class CustomerFactory {
    public static String createCustomer(String type) {
        Customer customer;
        String ans = " ";
        switch (type) {
            case "Regular":
                customer = new RegularCustomer();
                ans = customer.createMail();
                break;
            case "Mountain":
                customer = new MountainCustomer();
                ans = customer.createMail();
                break;
            case "Delinquent":
                customer = new DelinquentCustomer();
                ans = customer.createMail();
                break;
        }

        return ans;

    }
}