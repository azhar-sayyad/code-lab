/*
 * ============================================================================
 * 📌 PROBLEM EXPLANATION: JOB SEQUENCING WITH DEADLINES (In Simple Words)
 * ============================================================================
 * 
 * Imagine you are a freelancer and you have a list of jobs you can do:
 * Think of time slots as DAYS on a calendar (Day 1, Day 2, Day 3, Day 4, Day 5):
 * 
 * 1. TIME RULE: 
 * 1. TIME RULE:
 *    - Every job takes EXACTLY 1 day (1 unit of time) to finish.
 *    - You can only do ONE job per day.
 *    - You can only do ONE job per day (no multitasking).
 * 
 * 2. DEADLINE RULE:
 *    - Each job has a deadline. 
 *    - Example: If Job A has "Deadline = 3", it means you MUST finish it on 
 *      Day 1, Day 2, or Day 3. 
 *    - If you do it on Day 4 or later, you get 0 profit.
 *    - "Deadline = D" means the job must be finished on or before Day D.
 *    - Example: If a job has Deadline = 3, you can do it on Day 1, Day 2, or Day 3.
 *      If done on Day 4 or later, you get 0 profit.
 * 
 * 3. PROFIT:
 *    - Each job gives you money (profit) if completed before or on its deadline.
 * 3. GREEDY STRATEGY:
 *    - Step A: Sort jobs by PROFIT in descending order (pick highest-paying first).
 *    - Step B: Always schedule a job on its LATEST possible free day (<= deadline).
 *              Why latest? Doing it as late as possible leaves the earlier days 
 *              open for other jobs that have tighter/earlier deadlines!
 *    - Step C: If all days up to its deadline are already booked, drop that job.
 * 
 * 4. YOUR GOAL:
 *    - You cannot do all jobs because time is limited.
 *    - Choose which jobs to do, and on what days, to earn the MAXIMUM MONEY!
 * ----------------------------------------------------------------------------
 * 🔍 STEP-BY-STEP TRACE OF THIS EXAMPLE:
 * ----------------------------------------------------------------------------
 * Jobs sorted by Profit:
 *   1. J4: Deadline = 2, Profit = 300
 *   2. J1: Deadline = 5, Profit = 200
 *   3. J3: Deadline = 3, Profit = 190
 *   4. J2: Deadline = 3, Profit = 180
 *   5. J5: Deadline = 4, Profit = 120
 *   6. J6: Deadline = 2, Profit = 100
 * 
 * Timeline starts completely empty:
 *   [Day 1: Empty] [Day 2: Empty] [Day 3: Empty] [Day 4: Empty] [Day 5: Empty]
 * 
 * • Step 1 (J4: profit 300, deadline 2):
 *   - Can do on Day 1 or Day 2. Pick latest -> Day 2!
 *   - Schedule: [Day 1: Empty] [Day 2: J4] [Day 3: Empty] [Day 4: Empty] [Day 5: Empty]
 *   - Profit = 300
 * 
 * • Step 2 (J1: profit 200, deadline 5):
 *   - Can do on Days 1 to 5. Pick latest -> Day 5!
 *   - Schedule: [Day 1: Empty] [Day 2: J4] [Day 3: Empty] [Day 4: Empty] [Day 5: J1]
 *   - Profit = 300 + 200 = 500
 * 
 * • Step 3 (J3: profit 190, deadline 3):
 *   - Can do on Days 1, 2, or 3. Day 3 is free! Pick Day 3.
 *   - Schedule: [Day 1: Empty] [Day 2: J4] [Day 3: J3] [Day 4: Empty] [Day 5: J1]
 *   - Profit = 500 + 190 = 690
 * 
 * • Step 4 (J2: profit 180, deadline 3) 👈 KEY STEP:
 *   - Can do on Days 1, 2, or 3.
 *   - Check Day 3: Already booked by J3!
 *   - Check Day 2: Already booked by J4!
 *   - Check Day 1: FREE! So place J2 on Day 1 (Day 1 <= Deadline 3).
 *   - Schedule: [Day 1: J2] [Day 2: J4] [Day 3: J3] [Day 4: Empty] [Day 5: J1]
 *   - Profit = 690 + 180 = 870
 * 
 * • Step 5 (J5: profit 120, deadline 4):
 *   - Can do on Days 1, 2, 3, or 4. Day 4 is free! Pick Day 4.
 *   - Schedule: [Day 1: J2] [Day 2: J4] [Day 3: J3] [Day 4: J5] [Day 5: J1]
 *   - Profit = 870 + 120 = 990
 * 
 * • Step 6 (J6: profit 100, deadline 2):
 *   - Can only be done on Day 1 or Day 2.
 *   - Day 2 is taken by J4, Day 1 is taken by J2.
 *   - No available slot <= 2 -> J6 is DROPPED!
 * 
 * ----------------------------------------------------------------------------
 * 💡 GREEDY STRATEGY (How to solve it):
 * ----------------------------------------------------------------------------
 * Step 1: Sort jobs by PROFIT (highest paying jobs first).
 * Step 2: For each job, schedule it on the LATEST possible free day (<= deadline).
 *         Why latest? Doing it on its deadline day keeps earlier days open 
 *         for other jobs that might have strict, earlier deadlines!
 * Step 3: If all days up to its deadline are already booked, skip that job.
 * 🏁 FINAL RESULT:
 *   - Slot 1: J2 (Profit = 180)
 *   - Slot 2: J4 (Profit = 300)
 *   - Slot 3: J3 (Profit = 190)
 *   - Slot 4: J5 (Profit = 120)
 *   - Slot 5: J1 (Profit = 200)
 *   - TOTAL PROFIT = 180 + 300 + 190 + 120 + 200 = 990
 * ============================================================================
 */

import java.util.*;

// Represents a Job with an identifier, deadline, and profit
class JobItem {
    String id;
    int deadline;
    int profit;

    public JobItem(String id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class Job2 {

    /**
     * Job Sequencing with Deadlines (Greedy Algorithm).
     */
    public void solution(String[] jobs, int[] deadLines, int[] profits) {
        int n = jobs.length;
        JobItem[] items = new JobItem[n];

        int maxDeadline = 0;
        for (int i = 0; i < n; i++) {
            items[i] = new JobItem(jobs[i], deadLines[i], profits[i]);
            maxDeadline = Math.max(maxDeadline, deadLines[i]);
        }

        // Step 1: Sort jobs in DESCENDING order of profit
        Arrays.sort(items, (a, b) -> Integer.compare(b.profit, a.profit));

        System.out.println("Jobs sorted by Profit (descending):");
        for (JobItem item : items) {
            System.out.println("  " + item.id + ": Deadline = " + item.deadline + ", Profit = " + item.profit);
        }

        // Step 2: Time slots array from 1 to maxDeadline
        String[] schedule = new String[maxDeadline + 1];
        boolean[] isSlotOccupied = new boolean[maxDeadline + 1];

        int totalProfit = 0;
        int jobsDone = 0;

        // Step 3: Greedily place each job in its latest possible free slot <= deadline
        for (int i = 0; i < n; i++) {
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

        // Step 4: Display results
        System.out.println("\n--- Schedule Result ---");
        System.out.println("Total Jobs Done: " + jobsDone);
        System.out.println("Max Total Profit: " + totalProfit);
        System.out.print("Job Sequence by Time Slot: ");
        for (int slot = 1; slot <= maxDeadline; slot++) {
            if (isSlotOccupied[slot]) {
                System.out.print("[Slot " + slot + ": " + schedule[slot] + "] ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String[] jobs = {"J1", "J2", "J3", "J4", "J5", "J6"};
        int[] deadLines = {5, 3, 3, 2, 4, 2};
        int[] profits = {200, 180, 190, 300, 120, 100};

        Job2 obj = new Job2();
        obj.solution(jobs, deadLines, profits);
    }
}