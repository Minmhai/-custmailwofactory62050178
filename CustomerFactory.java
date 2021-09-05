package customermailapplication;

public class CustomerFactory {
    public static String createCustomer(String type) {
        Customer customer;
        String answer = " ";
        switch (type) {
            case "Regular":
                customer = new RegularCustomer();
                answer = customer.createMail();
                break;
            case "Mountain":
                customer = new MountainCustomer();
                answer = customer.createMail();
                break;
            case "Delinquent":
                customer = new DelinquentCustomer();
                answer = customer.createMail();
                break;
        }

        return answer;

    }
}