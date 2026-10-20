import java.util.*;

class Item{
    String jobName;
    int deadLine;
// Represents a Job with an identifier, deadline, and profit
class JobItem {
    String id;
    int deadline;
    int profit;
    double ratio;

    public Item(String jobName, int deadLine, int profit){
        this.jobName = jobName;
        this.deadLine = deadLine;
    public JobItem(String id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
        this.ratio = (double) profit / deadLine;
    }
}

public class Job{
public class Job {

    public void solution(String[] jobs, int[] deadLines, int[] profits, int capacity){
    /**
     * Job Sequencing with Deadlines (Greedy Algorithm).
     * 
     * Key Differences from Fractional Knapsack:
     * 1. Every job takes exactly 1 unit of time (not 'deadline' units).
     * 2. Jobs cannot be divided into fractions.
     * 3. We sort by PROFIT descending (not profit/deadline ratio).
     * 4. Each job is scheduled in the latest available slot <= deadline.
     */
    public void solution(String[] jobs, int[] deadLines, int[] profits) {
        int n = jobs.length;
        Item[] items = new Item[n];
        JobItem[] items = new JobItem[n];

        for(int i=0 ; i<n ; i++){
            items[i] = new Item(jobs[i], deadLines[i], profits[i]);
        }        
        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            items[i] = new JobItem(jobs[i], deadLines[i], profits[i]);
            maxDeadline = Math.max(maxDeadline, deadLines[i]);
        }

        // manual Bubble Sort (O(n^2)):
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (items[j].ratio < items[j + 1].ratio) {
                    Item temp = items[j]; // Reference swap
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        // Step 1: Sort jobs in DESCENDING order of profit
        // (You can also use manual Bubble Sort comparing items[j].profit < items[j+1].profit)
        Arrays.sort(items, (a, b) -> Integer.compare(b.profit, a.profit));

        System.out.println("Jobs sorted by Profit (descending):");
        for (JobItem item : items) {
            System.out.println("  " + item.id + ": Deadline = " + item.deadline + ", Profit = " + item.profit);
        }

        // Standard Industry / Interview practice (O(n log n)):
        // Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        // Step 2: Time slots array from 1 to maxDeadline (0 is unused)
        // slot[t] stores the job scheduled at time t
        String[] schedule = new String[maxDeadline + 1];
        boolean[] isSlotOccupied = new boolean[maxDeadline + 1];

        int totalProfit = 0;
        int jobsDone = 0;

        for(int i=0 ; i<n ; i++){
            System.out.println(items[i].jobName + " "+ items[i].deadLine +" "+ items[i].profit +" "+ items[i].ratio);
        // Step 3: Greedily place each job in its latest possible free slot
        for (int i = 0; i < n; i++) {
            // Search backwards from the job's deadline to slot 1
            for (int slot = items[i].deadline; slot >= 1; slot--) {
                if (!isSlotOccupied[slot]) {
                    isSlotOccupied[slot] = true;
                    schedule[slot] = items[i].id;
                    totalProfit += items[i].profit;
                    jobsDone++;
                    break; // Job scheduled, move to next job
                }
            }
        }

        double maxProfit = 0.0;
        int remainingCapacity = capacity;

        for(int i=0 ; i<n ; i++){
            if(remainingCapacity == 0){
                break;
        // Step 4: Display results
        System.out.println("\n--- Schedule Result ---");
        System.out.println("Total Jobs Done: " + jobsDone);
        System.out.println("Max Total Profit: " + totalProfit);
        System.out.print("Job Sequence by Time Slot: ");
        for (int slot = 1; slot <= maxDeadline; slot++) {
            if (isSlotOccupied[slot]) {
                System.out.print("[Slot " + slot + ": " + schedule[slot] + "] ");
            }
            if(remainingCapacity >= items[i].deadLine){
                maxProfit += items[i].profit;
                remainingCapacity -= items[i].deadLine;
            }else{
                maxProfit += items[i].ratio * remainingCapacity;
                remainingCapacity = 0;
            }
        }
        System.out.println("\nMax Profit for capacity " + capacity + " -> " + maxProfit);
        System.out.println();
    }

    public static void main(String args[]){
        String[] jobs = {"J1","J2","J3","J4","J5","J6"};
        int[] deadLines = {5,3,3,2,4,2};
        int[] profits = {200,180,190,300,120,100};
    public static void main(String args[]) {
        String[] jobs = {"J1", "J2", "J3", "J4", "J5", "J6"};
        int[] deadLines = {5, 3, 3, 2, 4, 2};
        int[] profits = {200, 180, 190, 300, 120, 100};

        Job obj = new Job();
        obj.solution(jobs, deadLines, profits, 10);


        obj.solution(jobs, deadLines, profits);
    }
}