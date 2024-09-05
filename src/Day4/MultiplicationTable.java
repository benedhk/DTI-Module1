package Day4;

import java.util.Scanner;

public class MultiplicationTable {

    public static void generateTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired size of the table");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}



/*
## Visualizing Nested Loops with an Input of 2

**Understanding the Loops:**

* **Outer Loop:** This loop controls the rows of the multiplication table. In this case, it will run twice (1 and 2) since the input is 2.
* **Inner Loop:** This loop controls the columns of the multiplication table. For each iteration of the outer loop, the inner loop will also run twice.

**Visualization:**

Imagine a grid where each cell represents a multiplication result. The outer loop determines the row, and the inner loop determines the column.

### Iteration 1: Outer Loop (i = 1)
* **Inner Loop (j = 1):**
  * Calculate 1 * 1 = 1
  * Print 1
* **Inner Loop (j = 2):**
  * Calculate 1 * 2 = 2
  * Print 2
* **End of Outer Loop:**
  * Print a newline to start a new row

### Iteration 2: Outer Loop (i = 2)
* **Inner Loop (j = 1):**
  * Calculate 2 * 1 = 2
  * Print 2
* **Inner Loop (j = 2):**
  * Calculate 2 * 2 = 4
  * Print 4
* **End of Outer Loop:**
  * Print a newline to start a new row

**Result:**

```
1 2
2 4
```

As you can see, the nested loops work together to create the multiplication table. The outer loop iterates over the rows,
and the inner loop iterates over the columns within each row, calculating and printing the products.
 */
