# JOBSHEET 8 – NESTED LOOPS (PERULANGAN 2)

## Identitas Mahasiswa:

* **Nama:** Cantika Putri Fauzan 
* **NIM:** 264107020237
* **Kelas / No. Presensi:** 1I / 05

## 1: TUJUAN PRAKTIKUM

The following are the objectives of this practical session:

1. Students can understand the concept of nested loops in algorithms.
2. Students can understand the flow of execution of nested loops.
3. Students can recognize the syntax of nested loops in Java.
4. Students can apply nested loops to solve simple case studies.

---

### 2.1 Experiment 1: Review of Loops 1 (FOR Loop)

#### 2.1.1 Description

This experiment reviews the FOR loop before learning nested loops. The program prints the `*` character `n` times horizontally, where `n` is a positive integer entered by the user.

#### 2.1.2 Java Program Code

```java
import java.util.Scanner;

public class Star05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
```

#### 2.1.3 Hasil Running / Screenshot Output

```
<img width="348" height="146" alt="Image" src="https://github.com/user-attachments/assets/9da08790-9706-4f96-ac7b-21b3d9521ee1" />
```

| Input (n) | Output | Number of `*` |
|-----------|-----------|---------------|
| 3 | `***` | 3 |
| 5 | `*****` | 5 |
| 7 | `*******` | 7 |

<img width="179" height="73" alt="Image" src="https://github.com/user-attachments/assets/62e20165-4dcf-4392-9183-f4f7abf991a9" />
<img width="184" height="114" alt="Image" src="https://github.com/user-attachments/assets/28d3cee2-a2e1-4a1a-bfc1-c748b824796c" />

#### 2.1.4 Questions & Answers

**1. If the initialization `i = 1` is changed to `i = 0` without changing the condition, how many `*` characters are printed when n = 5? Explain.**

**6 characters.** With `i = 0` and the condition `i <= n`, the loop runs for i = 0, 1, 2, 3, 4, 5. That is 6 iterations, one more than before, because the counter starts one step earlier while the end limit stays the same. Each iteration prints one `*`.

**2. If the condition `i <= n` is replaced with `i < n`, how many times does the loop run when n = 5? Why is the result different?**

**4 times** (i = 1, 2, 3, 4). With `i < n`, the loop stops as soon as `i` equals `n`, so the value `i = 5` is never executed. The operator `<=` includes the limit value, while `<` excludes it. This is why the result is one iteration fewer.

**3. Predict the output of the code below when n = 9, then prove it.**

<img width="402" height="281" alt="Image" src="https://github.com/user-attachments/assets/adaf98e2-5f9f-40fa-b8db-dac998efa1c4" />

**4. Explain why changing the increment `i++` to `i--` (with the condition still `i <= n`) makes the loop run endlessly for positive n.**

The loop continues as long as `i <= n`. Starting from `i = 1`, `i--` makes the value go 1, 0, -1, -2, ... It moves away from `n` instead of towards it, so the condition `i <= n` is always true and never becomes false. This is an infinite loop. (In Java, `int` would only wrap around after about 2³² iterations when it underflows past the minimum value, which is far too long to be a reasonable running time.) To stop such a program, press **Ctrl + C** in the terminal.

---

### 2.2 Experiment 2: Rectangle Star Pattern (Nested FOR)

#### 2.2.1 Description

A nested FOR loop is used to print a rectangle of stars. The **outer loop** controls the **rows** and the **inner loop** controls the **columns**.

#### 2.2.2 Java Program Code

```java
import java.util.Scanner;

public class Rectangle05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();

        
        for (int i = 1; i <= baris; i++) {
            
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close(); 
    }
}
```

#### 2.2.3 Hasil Running / Screenshot Output

```
Masukkan jumlah baris: 3
Masukkan jumlah kolom: 6
******
******
******
```

Other test inputs:

| (baris, kolom) | Output |
|----------------|--------|
| (4, 2) | `**` printed on 4 lines |
| (1, 5) | `*****` printed on 1 line |



#### 2.2.4 Questions & Answers

**1. Determine the function of variables `i` and `j`.**

`i` is the **row counter**, the control variable of the outer loop; it counts which row is currently being printed. `j` is the **column counter**, the control variable of the inner loop; it counts how many stars have been printed in the current row.

**2. How many times are the outer loop, the inner loop, and `print("*")` executed for baris = 4 and kolom = 7?**

- Outer loop: **4 times** (once per row).
- Inner loop: it is started 4 times and each time repeats 7 times, so its body is executed 4 × 7 = **28 times** in total.
- `print("*")`: **28 times**, because it sits in the inner loop body.

**3. What happens if the outer and inner loop limits are swapped (outer uses `kolom`, inner uses `baris`)? Use baris = 3 and kolom = 6.**

The outer loop would run 6 times and the inner loop 3 times per outer iteration. The output becomes 6 rows with 3 stars each:

```
***
***
***
***
***
***
```

The total number of stars is still 18 (3 × 6), but the shape is rotated: rows and columns are swapped, so the output no longer matches the requested 3 × 6 rectangle.

**4. Explain the effect of removing `System.out.println();` after the inner loop.**

No line break would be printed after each row, so all stars appear on a single line. For baris = 3 and kolom = 6, the output would be 18 stars in one line: `******************`. The rectangle shape is lost.

**5. Modify the program so the printed character is `#`.**

```java
for (int i = 1; i <= baris; i++) {
    for (int j = 1; j <= kolom; j++) {
        System.out.print("#");
    }
    System.out.println();
}
```

Output for baris = 3, kolom = 6:

```
######
######
######
```

---

### 2.3 Experiment 3: Debugging Triangle Star Pattern – Nested WHILE

#### 2.3.1 Description

The initial code deliberately does not produce the correct triangle. The task is to find the errors and fix them without changing the WHILE structure into FOR.

**Initial (faulty) code:**

```java
import java.util.Scanner;
      public class TriangleNoAbsen {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Masukkan nilai n = ");

   int n = sc.nextInt();
   int i = 0;
   while (i <= n) {
   int j = 0;
   while (j < i) {

   System.out.print("*");
     j++;
   }
     i++;
   }
       sc.close();
 }
}

```

**Actual output of the initial code:**
<img width="286" height="101" alt="Image" src="https://github.com/user-attachments/assets/5493e98a-2347-4aee-abda-a827bfb89788" />
<img width="336" height="116" alt="Image" src="https://github.com/user-attachments/assets/565f6cfa-6fbe-42d3-b0b6-c0ad9cf3c6de" />


**Observations from the debug step:**

- **a.** The outer loop runs **6 times** (i = 0, 1, 2, 3, 4, 5). This is **not** the same as the 5 rows we want.
- **b.** When `i = 0`, **0 stars** are printed, because the inner condition `j < i` is `0 < 0`, which is false.
- **c.** All characters appear on one line because there is no `System.out.println();` to move to a new line after each row.

#### 2.3.2 Java Program Code (Final, with Inverted Triangle)

```java
import java.util.Scanner;

public class Triangle05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Triangle
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // Inverted triangle
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        sc.close();
    }
}
```

#### 2.3.3 Hasil Running / Screenshot Output
<img width="311" height="154" alt="Image" src="https://github.com/user-attachments/assets/afa911bf-39b2-4db2-b5ae-17df0e29d877" />



#### 2.3.4 Questions & Answers

**1. State the mismatches of the initial output and at least two fixes needed to produce the stepped triangle pattern.**

*Mismatches:*
1. All stars are printed on one line, with no line breaks between rows.
2. The outer loop runs n + 1 times (it starts at `i = 0`), and the first iteration prints no stars, so there is an extra empty row.

*Fixes:*
1. Add `System.out.println();` after the inner loop (inside the outer loop, before `i++`).
2. Change the outer loop initialization from `int i = 0;` to `int i = 1;` so it runs exactly n times.

**2. Explain the role of variables `i` and `j`. Why must `j` be re-initialized to 0 in every outer loop iteration? What happens if `j` is not reset?**

`i` is the row counter (outer loop), and it also determines how many stars the current row must contain. `j` is the star counter within the current row (inner loop).

`j` must return to 0 at the start of each row so that the inner loop counts the stars of the new row from the beginning. If `j` were not reset (for example, declared outside the outer loop), then after the first row `j` would still hold the previous row's value. The condition `j < i` would then only allow **one** more star per row (row 1 prints 1 star and `j` becomes 1; row 2 checks `1 < 2`, prints 1 star, and so on), so the output would be a vertical line of single stars instead of a triangle.

**3. Explain the changes to the initialization, condition, and update of the outer loop needed to form the inverted triangle.**

| Part | Normal triangle | Inverted triangle |
|------|-----------------|-------------------|
| Initialization | `i = 1` | `i = n` |
| Condition | `i <= n` | `i >= 1` |
| Update | `i++` | `i--` |

The row counter starts at the largest value (n stars on the first row) and decreases by 1 on every row until it reaches 1 star.

---

### 2.4 Experiment 4: Case Study – Group Project Scores

#### 2.4.1 Description

The program reads the number of groups and the number of assessors (the same for each group), calculates the average score of each group, and determines the group with the highest average. It uses three loop levels: **WHILE** (outer, groups), **FOR** (middle, assessors), and **DO-WHILE** (inner, input validation).

#### 2.4.2 Java Program Code

```java
import java.util.Scanner;

public class NilaiKelompokNoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = sc.nextInt();
        System.out.print("Masukkan jumlah penilai  : ");
        int jumlahPenilai = sc.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai harus > 0.");
        } else {
            int nomorKelompok = 1;        // outer loop counter
            double rataTertinggi = -1;    // -1 so the first group is always recorded
            int kelompokTerbaik = 0;

            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("Kelompok " + nomorKelompok);
                double totalNilai = 0;    // reset for every group

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print("  Nilai dari Penilai " + j + ": ");
                        nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("  Nilai harus 0-100. Ulangi input!");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }

                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok
                        + ": nilai rata-rata = " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    rataTertinggi = rataNilai;
                    kelompokTerbaik = nomorKelompok;
                }

                nomorKelompok++;
            }

            System.out.println("==============================");
            System.out.println("Kelompok terbaik    : " + kelompokTerbaik);
            System.out.println("Rata-rata tertinggi : " + rataTertinggi);
        }
        sc.close();
    }
}
```

#### 2.4.3 Hasil Running / Screenshot Output

```
<img width="704" height="400" alt="Image" src="https://github.com/user-attachments/assets/647d6256-41c8-4ab0-b473-3ed7ac7abf4a" />
```

Invalid input test (jumlah kelompok = 0):

```
<img width="422" height="128" alt="Image" src="https://github.com/user-attachments/assets/961a2e34-16b1-42c7-9a48-f2cb701eea97" />
```
#### 2.4.4 Questions & Answers

**1. Why must `totalNilai` be reset inside the outer loop, but `rataTertinggi` must not be reset for each group?**

`totalNilai` holds the sum of scores for **one group only**. If it were not reset to 0 at the start of each group, it would keep accumulating the previous groups' scores and the averages would be wrong. `rataTertinggi` stores the highest average found **so far across all groups**. If it were reset in every iteration, the previous best value would be lost, and the comparison could never find the true best among all groups (the last group would always be chosen).

**2. For 3 groups and 2 assessors (no invalid input), how many times is the FOR loop body executed in total?**

3 groups × 2 assessors = **6 times**.

**3. What happens if `totalNilai` is declared as `int` and the average is calculated using integer division? Give an example.**

The fractional part is discarded (truncated) before the result is converted to `double`, so the average becomes inaccurate. Example: scores 80 and 85 give total = 165. With integers, `165 / 2 = 82` (printed as `82.0`), not the correct `82.5`. This can even produce a wrong best group: if Group 1 has scores 82 and 82 (average 82) and Group 2 has scores 80 and 85 (true average 82.5, but computed as 82), the condition `rataNilai > rataTertinggi` is false for Group 2, so Group 1 is wrongly chosen as the best.

**4. Why is `rataTertinggi` initialized to -1 and not 0? Give an example of input that gives a wrong result if the initial value is 0.**

Valid averages are always ≥ 0, so -1 is guaranteed to be smaller than any real average. This ensures the first group is always recorded as the initial best. If the initial value were 0, a group whose average is exactly 0 would never satisfy `rataNilai > rataTertinggi`. Example: 2 groups with 2 assessors, where all scores are 0. Both averages are 0.0, the condition is never true, and the program prints `Kelompok terbaik : 0` (a group that does not exist) instead of Group 1.

**5. This program has three loop levels. State each type of loop and its role.**

| Level | Loop type | Role |
|-------|-----------|------|
| Outer | `while` | Processes the groups one by one (`nomorKelompok` from 1 to `jumlahKelompok`); also resets the total and updates the best group. |
| Middle | `for` | Repeats once for each assessor of the current group (`j` from 1 to `jumlahPenilai`) to input and sum the scores. |
| Inner | `do-while` | Validates the input: it asks for the score at least once and repeats while the score is outside the range 0–100. |

---

## 3. TUGAS (ASSIGNMENTS)

### Task 1: Stepped Number Pattern (`Tugas105.java`)

```java
import java.util.Scanner;

public class Tugas105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n minimal 1.");
        } else {
            int total = 0;
            for (int i = 1; i <= n; i++) {          
                for (int j = 1; j <= i; j++) {      
                    if (j > 1) {
                        System.out.print(" ");
                    }
                    System.out.print(j);
                    total++;
                }
                System.out.println();
            }
            System.out.println("Total angka tercetak: " + total);
        }
        sc.close();
    }
}
```

#### 2.4.3 Hasil Running / Screenshot Output

<img width="533" height="276" alt="Image" src="https://github.com/user-attachments/assets/8e4588ca-4031-4e45-b75c-86ce381a2967" />

### Task 2: Multiplication Table (`Tugas205.java`)

```java
import java.util.Scanner;

public class Tugas205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("n minimal 3.");
        } else {
            int jumlah = 0;
            for (int i = 1; i <= n; i++) {        
                for (int j = 1; j <= n; j++) {     
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);
                    jumlah += hasil;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angka: " + jumlah);
        }
        sc.close();
    }
}
```
#### 2.4.3 Hasil Running / Screenshot Output
<img width="513" height="286" alt="Image" src="https://github.com/user-attachments/assets/33662ae2-90b2-42b7-8459-880fb9b21a98" />


### Task 3: Sales Recap of Several Stores (`Tugas305.java`)

```java
import java.util.Scanner;

public class Tugas305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemuaBarang = 0;
            int tokoTerbanyak = 0;
            int barangTerbanyak = -1;   // -1 so the first store is always recorded

            for (int toko = 1; toko <= jumlahToko; toko++) {
                int jumlahPelanggan;
                do {
                    System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);
                totalSemuaBarang += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {   // ">" keeps the smallest store number on ties
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }

            System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}
```

#### 2.4.3 Hasil Running / Screenshot Output

<img width="524" height="245" alt="Image" src="https://github.com/user-attachments/assets/410beeb4-5ca9-48fd-8790-0334f42314ad" />

## Conclusion

In this practical session, I learned that a nested loop is a loop placed inside another loop, where the inner loop completes all of its iterations for every single iteration of the outer loop. In the rectangle program, the outer loop controls the rows and the inner loop controls the columns, so the total number of executions is rows × columns, and swapping the two limits rotates the shape. Through the triangle debugging experiment, I learned that the initialization, condition, and update of the outer loop determine the number of rows, that the inner counter (`j`) must be reset for every row, and that a missing `println()` puts all output on one line. Changing the initialization, condition, and update to `i = n`, `i >= 1`, and `i--` produces an inverted triangle. In the group score case study, I learned to combine WHILE, FOR, and DO-WHILE in three levels, to reset per-group variables (`totalNilai`) while keeping variables that must persist across groups (`rataTertinggi`), to use a sentinel initial value such as -1, and to avoid integer division when calculating averages. The assignments (number pattern, multiplication table, and store sales recap) showed that nested loops, combined with accumulator variables and selection statements, can solve problems in a compact, correct, and easy-to-explain way.
