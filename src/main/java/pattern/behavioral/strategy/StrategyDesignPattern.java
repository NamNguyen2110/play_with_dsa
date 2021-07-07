package pattern.behavioral.strategy;

import java.util.Random;

public class StrategyDesignPattern {
    public static final int MAX = 2;
    public static final int MIN = 0;

    public static void main(String[] args) {
        var random = new Random();
        for (var i = 1; i < 5; i++) {
            var ticket = new Ticket();
            ticket.setName("Ticket " + i);
            ticket.setPrice(50d * i);
            generatePromotedStrategy(random, ticket);
            logTicketDetails(ticket);
            generatePromotedStrategy(random, ticket);
            logTicketDetails(ticket);
            System.out.println("\n");
        }
    }

    private static void logTicketDetails(Ticket ticket) {
        System.out.println("Promoted price of " + ticket.getName() + " is " + ticket.getPromotedPrice()
                + " and " + ticket.getPromoteStrategy().getClass().getName());
    }

    private static void generatePromotedStrategy(Random random, Ticket ticket) {
        var strategyIndex = random.nextInt(MAX - MIN + 1) + MIN;
        switch (strategyIndex) {
            case 0:
                ticket.setPromoteStrategy(new NoDiscountStrategy());
                break;
            case 1:
                ticket.setPromoteStrategy(new HalfDiscountStrategy());
                break;
            default:
                ticket.setPromoteStrategy(new QuarterDiscountStrategy());
                break;
        }
    }
}
