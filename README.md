# ADS Lab (Semester 3)

Java solutions for the weekly Algorithms and Data Structures lab, B.Tech CSE at Manipal Institute of Technology. The questions for each week are in that week's lab manual PDF.

| Week | Topic |
| ---- | ----- |
| 1 | Arrays |
| 2 | Recursion |
| 3 | Stacks |
| 4 | Queues |
| 5 | Singly linked lists |
| 6 | Doubly linked lists |
| 7 | Binary trees: counting nodes and height |
| 8 | Graphs |
| 9 | Searching: linear search and brute-force string matching |
| 10 | Divide and conquer: merge sort, quick sort, tree height, min and max |

## Layout

```text
Week1/ ... Week10/
├── Question1.java, Question2.java, ...   my solutions
└── lab manual PDF
```

## Run a solution

Each file starts with a `package` line, so compile from the repo root into an output folder and run it by its full name:

```bash
javac -d out Week10/Question1.java
java -cp out Week10.Question1
```

Check the `package` line at the top of a file for the exact name (Week 1 uses `com.mycompany.advaitsaxena`).
