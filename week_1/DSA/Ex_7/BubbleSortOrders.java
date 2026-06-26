package week_1.DSA.Ex_7;

public class BubbleSortOrders {

    public static void bubbleSort(Order[] orders) {

        int n = orders.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (orders[j].totalPrice > orders[j + 1].totalPrice) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Order[] orders = { new Order(101, "Aman", 3500),
                new Order(102, "Riya", 1200),
                new Order(103, "Rahul", 5000),
                new Order(104, "Neha", 2000)
        };

        bubbleSort(orders);

        for (Order order : orders) {
            System.out.println(order.customerName +" "+ order.totalPrice);
        }
    }
}