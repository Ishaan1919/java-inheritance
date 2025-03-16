class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OnlineOrderManagement {
    public static void main(String[] args) {
        Order order1 = new Order(101, "10-03-25");
        ShippedOrder order2 = new ShippedOrder(102, "12-03-25", "123");
        DeliveredOrder order3 = new DeliveredOrder(103, "14-03-25", "456", "2025-03-16");

        order1.displayOrderDetails();
        order2.displayOrderDetails();
        order3.displayOrderDetails();

//        Order ID: 101
//        Order Date: 10-03-25
//        Status: Order placed on 10-03-25
//        Order ID: 102
//        Order Date: 12-03-25
//        Status: Order shipped. Tracking Number: 123
//        Tracking Number: 123
//        Order ID: 103
//        Order Date: 14-03-25
//        Status: Order delivered on 2025-03-16
//        Tracking Number: 456
//        Delivery Date: 2025-03-16

    }
}
