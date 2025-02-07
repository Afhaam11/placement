public class prgrm4 {
    public static void main(String[] args) {
        // Sample array representing sales numbers for each day (Day 1 to Day 7)
        int[] sales = {120, 340, 560, 230, 890, 760, 490};

        // Variables to store the highest sales and corresponding day
        int maxSales = sales[0];  // Assume first day's sales as max initially
        int bestDay = 1; // First day is considered as the highest initially
        int size = sales.length; //storing the sales total length in variable size

        // Loop through the sales array to find the highest sales day
        for (int i = 1; i < size ; i++) {
            if (sales[i] > maxSales) {  // If current day's sales are higher
                maxSales = sales[i];  // Update max sales
                bestDay = i + 1;  // Update the day (adding 1 to match human-readable days)
            }
        }

        // Display the day with the highest sales that has occured
        System.out.println("The highest sales occurred on Day " + bestDay + " with sales of " + maxSales);
    }
}
