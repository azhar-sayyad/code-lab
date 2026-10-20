import java.util.*;

class Item {
    int weight;
    int value;
    double ratio;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
        this.ratio = (double) value / weight;
    }
}

public class Knapsack {

    /**
     * Fractional Knapsack using Greedy Algorithm.
     * Strategy: Pick items with the highest value-to-weight ratio first.
     * Time Complexity: O(n log n) due to sorting.
     */
    public double fractionalKnapsack(int[] weight, int[] value, int capacity) {
        int n = weight.length;
        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(weight[i], value[i]);
        }

        // Sort items in DESCENDING order of ratio (highest ratio first)
        // Note: Double.compare(b.ratio, a.ratio) sorts descending (b before a)
        // Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));


        // manual Bubble Sort (O(n^2)):
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (items[j].ratio < items[j + 1].ratio) {
                    Item temp = items[j]; // Reference swap
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }

        // Standard Industry / Interview practice (O(n log n)):
        // Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double maxProfit = 0.0;
        int remainingCapacity = capacity;

        for (int i = 0; i < n; i++) {
            if (remainingCapacity == 0) {
                break; // Knapsack is completely full
            }

            if (remainingCapacity >= items[i].weight) {
                // Take the whole item
                maxProfit += items[i].value;
                remainingCapacity -= items[i].weight;
            } else {
                // Take a fraction of the remaining item to fill the knapsack
                maxProfit += items[i].ratio * remainingCapacity;
                remainingCapacity = 0; // Knapsack is now full!
                break;                 // IMPORTANT: Stop the loop here!
            }
        }

        System.out.println("\nMax Profit for capacity " + capacity + " -> " + maxProfit);
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] weight = {20, 30, 50, 10};
        int[] value = {200, 600, 150, 1000};
        int capacity = 50;

        Knapsack obj = new Knapsack();
        obj.fractionalKnapsack(weight, value, capacity);
    }
}
