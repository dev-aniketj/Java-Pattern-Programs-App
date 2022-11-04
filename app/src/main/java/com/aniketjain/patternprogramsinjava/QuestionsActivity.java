package com.aniketjain.patternprogramsinjava;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class QuestionsActivity extends AppCompatActivity {

    private final ArrayList<QuestionModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions_activity);

        //FindViews
        RecyclerView ques_recyclerView = findViewById(R.id.ques_recycler_view);
        TextView heading_textView = findViewById(R.id.heading_textView);

        heading_textView.setText(getIntent().getStringExtra("heading"));

        int value = getIntent().getIntExtra("value", 0);
        switch (value) {
            case 1:
                star_patterns_array_elements();
                break;
            case 2:
                number_patterns_array_elements();
                break;
            case 3:
                alphabet_patterns_array_elements();
                break;
        }

        QuestionAdapter adapter = new QuestionAdapter(this, arrayList);
        ques_recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        ques_recyclerView.setAdapter(adapter);


    }

    public void star_patterns_array_elements() {
        //1
        arrayList.add(new QuestionModel(
                "1",
                "5",
                R.drawable.star_pattern_01,
                R.drawable.star_pattern_01_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern1 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= i; j++) {\n" +
                        "                System.out.print(\"*\");\n" +
                        "            }\n" +
                        "            System.out.print(\"\\n\");\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //2
        arrayList.add(new QuestionModel(
                "2",
                "5",
                R.drawable.star_pattern_02,
                R.drawable.star_pattern_02_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern2 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = n; i >= 1; i--) {\n" +
                        "            for (int j = i; j >= 1; j--) {\n" +
                        "                System.out.print(\"*\");\n" +
                        "            }\n" +
                        "            System.out.print(\"\\n\");\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //3
        arrayList.add(new QuestionModel(
                "3",
                "5",
                R.drawable.star_pattern_03,
                R.drawable.star_pattern_03_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern3 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i + j > n)\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.printf(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //4
        arrayList.add(new QuestionModel(
                "4",
                "5",
                R.drawable.star_pattern_04,
                R.drawable.star_pattern_04_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern4 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (j - i >= 0)\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //5
        arrayList.add(new QuestionModel(
                "5",
                "5",
                R.drawable.star_pattern_05,
                R.drawable.star_pattern_05_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern5 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((i + j > n) && (j - i <= n)) {\n" +
                        "                    if ((i + j) % 2 == 0)\n" +
                        "                        System.out.print(\"*\");\n" +
                        "                    else\n" +
                        "                        System.out.print(\" \");\n" +
                        "                } else {\n" +
                        "                    System.out.print(\" \");\n" +
                        "                }\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //6
        arrayList.add(new QuestionModel(
                "6",
                "5",
                R.drawable.star_pattern_06,
                R.drawable.star_pattern_06_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern6 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((j - i >= 0) && (i + j <= n_double + 1)) {\n" +
                        "                    if ((i + j) % 2 == 0)\n" +
                        "                        System.out.print(\"*\");\n" +
                        "                    else\n" +
                        "                        System.out.print(\" \");\n" +
                        "                } else {\n" +
                        "                    System.out.print(\" \");\n" +
                        "                }\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //7
        arrayList.add(new QuestionModel(
                "7",
                "5",
                R.drawable.star_pattern_07,
                R.drawable.star_pattern_07_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern7 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                System.out.print(\"*\");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"
        ));

        //8
        arrayList.add(new QuestionModel(
                "8",
                "5",
                R.drawable.star_pattern_08,
                R.drawable.star_pattern_08_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern8 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if ((j - i <= 0) && (i + j <= n_double))\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //9
        arrayList.add(new QuestionModel(
                "9",
                "5",
                R.drawable.star_pattern_09,
                R.drawable.star_pattern_09_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern9 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((i + j > n) && (j - i < n) && (i - j <= n - 1) && (i + j < n + n_double)) {\n" +
                        "                    if ((i + j) % 2 != 0)\n" +
                        "                        System.out.print(\"*\");\n" +
                        "                    else\n" +
                        "                        System.out.print(\" \");\n" +
                        "                } else {\n" +
                        "                    System.out.print(\" \");\n" +
                        "                }\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //10
        arrayList.add(new QuestionModel(
                "10",
                "5",
                R.drawable.star_pattern_10,
                R.drawable.star_pattern_10_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern10 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((i + j == n + 1) || (j - i == n - 1))\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //11
        arrayList.add(new QuestionModel(
                "11",
                "5",
                R.drawable.star_pattern_11,
                R.drawable.star_pattern_11_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern11 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i + j > n && j - i < n)\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //12
        arrayList.add(new QuestionModel(
                "12",
                "5",
                R.drawable.star_pattern_12,
                R.drawable.star_pattern_12_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern12 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (j - i >= 0 && i + j <= n_double)\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}"));

        //13
        arrayList.add(new QuestionModel(
                "13",
                "5",
                R.drawable.star_pattern_13,
                R.drawable.star_pattern_13_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern13 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i + j > n && i - j < n)\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //14
        arrayList.add(new QuestionModel(
                "14",
                "5",
                R.drawable.star_pattern_14,
                R.drawable.star_pattern_14_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern14 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i - j == 0 || i + j == n_double)\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //15
        arrayList.add(new QuestionModel(
                "15",
                "5",
                R.drawable.star_pattern_15,
                R.drawable.star_pattern_15_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern15 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((i + j == n + 1) || (j - i == n - 1) || (i - j == n - 1) || (i + j == n + n_double - 1))\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //16
        arrayList.add(new QuestionModel(
                "16",
                "5",
                R.drawable.star_pattern_16,
                R.drawable.star_pattern_16_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern16 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((i + j <= n + 1) || (j - i >= n - 1))\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //17
        arrayList.add(new QuestionModel(
                "17",
                "5",
                R.drawable.star_pattern_17,
                R.drawable.star_pattern_17_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern17 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i - j >= 0 || i + j >= n_double)\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //18
        arrayList.add(new QuestionModel(
                "18",
                "5",
                R.drawable.star_pattern_18,
                R.drawable.star_pattern_18_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern18 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if ((i + j <= n + 1) || (i - j >= n - 1))\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //19
        arrayList.add(new QuestionModel(
                "19",
                "5",
                R.drawable.star_pattern_19,
                R.drawable.star_pattern_19_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern19 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if ((i == j) || (i + j == n + 1))\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //20
        arrayList.add(new QuestionModel(
                "20",
                "5",
                R.drawable.star_pattern_20,
                R.drawable.star_pattern_20_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern20 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if ((i == j) || (j == 1) || (i == n))\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //21
        arrayList.add(new QuestionModel(
                "21",
                "5",
                R.drawable.star_pattern_21,
                R.drawable.star_pattern_21_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern21 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the numnber : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i == 1 || j == n || i == n || j == 1)\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //22
        arrayList.add(new QuestionModel(
                "22",
                "4",
                R.drawable.star_pattern_22,
                R.drawable.star_pattern_22_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern22 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((i - j >= 0 && i + j <= n_double) || (i + j >= n_double && j - i >= 0))\n" +
                        "                    System.out.print(\"*\");\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));
    }

    public void number_patterns_array_elements() {
        //1
        arrayList.add(new QuestionModel(
                "1",
                "5",
                R.drawable.number_pattern_01,
                R.drawable.number_pattern_01_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern1 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                System.out.print(i);\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //2
        arrayList.add(new QuestionModel(
                "2",
                "5",
                R.drawable.number_pattern_02,
                R.drawable.number_pattern_02_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern2 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                System.out.print(j);\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //3
        arrayList.add(new QuestionModel(
                "3",
                "5",
                R.drawable.number_pattern_03,
                R.drawable.number_pattern_03_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern3 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = n; i >= 1; i--) {\n" +
                        "            for (int j = n; j >= 1; j--) {\n" +
                        "                System.out.print(i);\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //4
        arrayList.add(new QuestionModel(
                "4",
                "5",
                R.drawable.number_pattern_04,
                R.drawable.number_pattern_04_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern4 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = n; i >= 1; i--) {\n" +
                        "            for (int j = n; j >= 1; j--) {\n" +
                        "                System.out.print(j);\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //5
        arrayList.add(new QuestionModel(
                "5",
                "5",
                R.drawable.number_pattern_05,
                R.drawable.number_pattern_05_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern5 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= i; j++) {\n" +
                        "                System.out.print(i);\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //6
        arrayList.add(new QuestionModel(
                "6",
                "5",
                R.drawable.number_pattern_06,
                R.drawable.number_pattern_06_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern6 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= i; j++) {\n" +
                        "                System.out.print(j);\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //7
        arrayList.add(new QuestionModel(
                "7",
                "5",
                R.drawable.number_pattern_07,
                R.drawable.number_pattern_07_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern7 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = i; j <= n; j++) {\n" +
                        "                System.out.print(i);\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //8
        arrayList.add(new QuestionModel(
                "8",
                "5",
                R.drawable.number_pattern_08,
                R.drawable.number_pattern_08_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern8 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (j - i >= 0)\n" +
                        "                    System.out.print(j - i + 1);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //9
        arrayList.add(new QuestionModel(
                "9",
                "5",
                R.drawable.number_pattern_09,
                R.drawable.number_pattern_09_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern9 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i + j > n && j - i <= n - 1)\n" +
                        "                    System.out.print(i);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //10
        arrayList.add(new QuestionModel(
                "10",
                "5",
                R.drawable.number_pattern_10,
                R.drawable.number_pattern_10_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern10 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            int temp = 0;\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i + j > n && j - i <= n - 1)\n" +
                        "                    temp++;\n" +
                        "            }\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i + j > n && j - i <= n - 1)\n" +
                        "                    System.out.print(temp);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //11
        arrayList.add(new QuestionModel(
                "11",
                "5",
                R.drawable.number_pattern_11,
                R.drawable.number_pattern_11_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern11 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            int temp = 0;\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i + j > n && j - i <= n - 1)\n" +
                        "                    System.out.print(++temp);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //12
        arrayList.add(new QuestionModel(
                "12",
                "5",
                R.drawable.number_pattern_12,
                R.drawable.number_pattern_12_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern12 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            int temp = i * 2;\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i + j > n && j - i <= n - 1)\n" +
                        "                    System.out.print(--temp);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "\n" +
                        "    }\n" +
                        "}\n"));

        //13
        arrayList.add(new QuestionModel(
                "13",
                "5",
                R.drawable.number_pattern_13,
                R.drawable.number_pattern_13_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern13 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i + j > n && j - i <= n - 1) {\n" +
                        "                    if ((i + j) % 2 == 0)\n" +
                        "                        System.out.print(i);\n" +
                        "                    else\n" +
                        "                        System.out.print(\" \");\n" +
                        "                } else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //14
        arrayList.add(new QuestionModel(
                "14",
                "5",
                R.drawable.number_pattern_14,
                R.drawable.number_pattern_14_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern14 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            int temp = n - i + 1;\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (j - i >= 0 && i + j <= n_double) {\n" +
                        "                    if ((i + j) % 2 == 0)\n" +
                        "                        System.out.print(temp);\n" +
                        "                    else\n" +
                        "                        System.out.print(\" \");\n" +
                        "                } else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "\n" +
                        "    }\n" +
                        "}\n"));

        //15
        arrayList.add(new QuestionModel(
                "15",
                "5",
                R.drawable.number_pattern_15,
                R.drawable.number_pattern_15_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern15 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((i + j > n) && (j - i <= n - 1) && (i - j <= n - 1) && (i + j <= n_double + n)) {\n" +
                        "                    if ((i + j) % 2 == 0) {\n" +
                        "                        if (i <= n)\n" +
                        "                            System.out.print(i);\n" +
                        "                        else\n" +
                        "                            System.out.print(n_double - i);\n" +
                        "                    } else\n" +
                        "                        System.out.print(\" \");\n" +
                        "                } else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //16
        arrayList.add(new QuestionModel(
                "16",
                "5",
                R.drawable.number_pattern_16,
                R.drawable.number_pattern_16_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern16 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((i + j == n + 1) || (j - i == n - 1))\n" +
                        "                    System.out.print(i);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //17
        arrayList.add(new QuestionModel(
                "17",
                "5",
                R.drawable.number_pattern_17,
                R.drawable.number_pattern_17_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern17 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        int temp = n;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((i == j) || (i + j == n_double))\n" +
                        "                    System.out.print(temp);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            temp--;\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //18
        arrayList.add(new QuestionModel(
                "18",
                "5",
                R.drawable.number_pattern_18,
                R.drawable.number_pattern_18_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern18 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n_double + 1; i++) {\n" +
                        "            int temp = n;\n" +
                        "            for (int j = 1; j <= n + 1; j++) {\n" +
                        "                if ((j - i <= 0) && (i + j <= n_double + 2))\n" +
                        "                    System.out.print(temp--);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //19
        arrayList.add(new QuestionModel(
                "19",
                "5",
                R.drawable.number_pattern_19,
                R.drawable.number_pattern_19_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern19 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n_double + 1; i++) {\n" +
                        "            for (int j = 0; j <= n; j++) {\n" +
                        "                if ((i + j >= n + 1) && (i - j <= n + 1))\n" +
                        "                    System.out.print(j);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //20
        arrayList.add(new QuestionModel(
                "20",
                "5",
                R.drawable.number_pattern_20,
                R.drawable.number_pattern_20_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern20 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((i + j == n + 1) || (j - i == n - 1) || (i + j == n + n_double - 1) || (i - j == n - 1))\n" +
                        "                    if (i <= n)\n" +
                        "                        System.out.print(i);\n" +
                        "                    else\n" +
                        "                        System.out.print(n_double - i);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //21
        arrayList.add(new QuestionModel(
                "21",
                "5",
                R.drawable.number_pattern_21,
                R.drawable.number_pattern_21_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern21 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i == j || i + j == n + 1)\n" +
                        "                    System.out.print(i);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //22
        arrayList.add(new QuestionModel(
                "22",
                "5",
                R.drawable.number_pattern_22,
                R.drawable.number_pattern_22_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern22 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        int a = 0, b = 1, sum;\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= i; j++) {\n" +
                        "                System.out.print(b + \" \");\n" +
                        "                sum = a + b;\n" +
                        "                a = b;\n" +
                        "                b = sum;\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //23
        arrayList.add(new QuestionModel(
                "23",
                "4",
                R.drawable.number_pattern_23,
                R.drawable.number_pattern_23_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern23 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if ((j - i <= 0 && i + j <= n_double) || (i + j >= n_double && i - j <= 0))\n" +
                        "                    System.out.print(j);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //24
        arrayList.add(new QuestionModel(
                "24",
                "5",
                R.drawable.number_pattern_24,
                R.drawable.number_pattern_24_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern24 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i == j || i == n || j == 1)\n" +
                        "                    System.out.print(i);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //25
        arrayList.add(new QuestionModel(
                "25",
                "5",
                R.drawable.number_pattern_25,
                R.drawable.number_pattern_25_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern25 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int temp = 0;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= i; j++) {\n" +
                        "                System.out.print(++temp + \" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

    }

    public void alphabet_patterns_array_elements() {
        //1
        arrayList.add(new QuestionModel(
                "1",
                "5",
                R.drawable.alphabet_pattern_01,
                R.drawable.alphabet_pattern_01_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern1 {\n" +
                        "    public static void main(String args[]) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        char ch = 'A';\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                System.out.print(ch);\n" +
                        "            }\n" +
                        "            ch++;\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //2
        arrayList.add(new QuestionModel(
                "2",
                "5",
                R.drawable.alphabet_pattern_02,
                R.drawable.alphabet_pattern_02_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern2 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            char ch = 'A';\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                System.out.print(ch++ + \" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //3
        arrayList.add(new QuestionModel(
                "3",
                "5",
                R.drawable.alphabet_pattern_03,
                R.drawable.alphabet_pattern_03_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern3 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        char ch = (char) ('A' + n - 1);\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                System.out.print(ch + \" \");\n" +
                        "            }\n" +
                        "            ch--;\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //4
        arrayList.add(new QuestionModel(
                "4",
                "5",
                R.drawable.alphabet_pattern_04,
                R.drawable.alphabet_pattern_04_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern4 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            char ch = (char) ('A' + n - 1);\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                System.out.print(ch-- + \" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //5
        arrayList.add(new QuestionModel(
                "5",
                "5",
                R.drawable.alphabet_pattern_05,
                R.drawable.alphabet_pattern_05_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern5 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        char ch = 'A';\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= i; j++) {\n" +
                        "                System.out.print(ch + \" \");\n" +
                        "            }\n" +
                        "            ch++;\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //6
        arrayList.add(new QuestionModel(
                "6",
                "5",
                R.drawable.alphabet_pattern_06,
                R.drawable.alphabet_pattern_06_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern6 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            char ch = 'A';\n" +
                        "            for (int j = 1; j <= i; j++) {\n" +
                        "                System.out.print(ch++ + \" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //7
        arrayList.add(new QuestionModel(
                "7",
                "5",
                R.drawable.alphabet_pattern_07,
                R.drawable.alphabet_pattern_07_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern7 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        char ch = (char) ('A' + n - 1);\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i + j <= n + 1)\n" +
                        "                    System.out.print(ch + \" \");\n" +
                        "            }\n" +
                        "            ch--;\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //8
        arrayList.add(new QuestionModel(
                "8",
                "5",
                R.drawable.alphabet_pattern_08,
                R.drawable.alphabet_pattern_08_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern8 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            char ch = 'A';\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i + j <= n + 1)\n" +
                        "                    System.out.print(ch++ + \" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //9
        arrayList.add(new QuestionModel(
                "9",
                "5",
                R.drawable.alphabet_pattern_09,
                R.drawable.alphabet_pattern_09_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern9 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        char ch = 'A';\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i + j <= n + 1)\n" +
                        "                    System.out.print(ch + \" \");\n" +
                        "            }\n" +
                        "            ch++;\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //10
        arrayList.add(new QuestionModel(
                "10",
                "5",
                R.drawable.alphabet_pattern_10,
                R.drawable.alphabet_pattern_10_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern10 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            char ch = (char) ('A' + n);\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i + j <= n + 1)\n" +
                        "                    System.out.print(--ch + \" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //11
        arrayList.add(new QuestionModel(
                "11",
                "5",
                R.drawable.alphabet_pattern_11,
                R.drawable.alphabet_pattern_11_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern11 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        char ch = 'A';\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i + j >= n + 1)\n" +
                        "                    System.out.print(ch);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            ch++;\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //12
        arrayList.add(new QuestionModel(
                "12",
                "5",
                R.drawable.alphabet_pattern_12,
                R.drawable.alphabet_pattern_12_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern12 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            char ch = 'A';\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i + j >= n + 1)\n" +
                        "                    System.out.print(ch++);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            ch++;\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //13
        arrayList.add(new QuestionModel(
                "13",
                "5",
                R.drawable.alphabet_pattern_13,
                R.drawable.alphabet_pattern_13_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern13 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            char ch = 'A';\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (j - i >= 0)\n" +
                        "                    System.out.print(ch++);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //14
        arrayList.add(new QuestionModel(
                "14",
                "5",
                R.drawable.alphabet_pattern_14,
                R.drawable.alphabet_pattern_14_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern14 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        char ch = (char) ('A' + n);\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            --ch;\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (j - i >= 0)\n" +
                        "                    System.out.print(ch);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //15
        arrayList.add(new QuestionModel(
                "15",
                "5",
                R.drawable.alphabet_pattern_15,
                R.drawable.alphabet_pattern_15_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern15 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        char ch = 'A';\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i + j >= n + 1 && j - i <= n - 1)\n" +
                        "                    System.out.print(ch);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            ch++;\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //16
        arrayList.add(new QuestionModel(
                "16",
                "5",
                R.drawable.alphabet_pattern_16,
                R.drawable.alphabet_pattern_16_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern16 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        char ch = (char) ('A' + n);\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            --ch;\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (j - i >= 0 && i + j <= n_double)\n" +
                        "                    System.out.print(ch);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //17
        arrayList.add(new QuestionModel(
                "17",
                "6",
                R.drawable.alphabet_pattern_17,
                R.drawable.alphabet_pattern_17_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern17 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            char ch = (char) ('A' + n);\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (j - i <= 0 && i + j <= n_double)\n" +
                        "                    System.out.print(--ch);\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //18
        arrayList.add(new QuestionModel(
                "18",
                "6",
                R.drawable.alphabet_pattern_18,
                R.drawable.alphabet_pattern_18_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern18 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            char ch = 'A';\n" +
                        "            for (int j = 1; j <= n; j++) {\n" +
                        "                if (i + j >= n + 1 && i - j <= n - 1)\n" +
                        "                    System.out.print(ch);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "                ch++;\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //19
        arrayList.add(new QuestionModel(
                "19",
                "6",
                R.drawable.alphabet_pattern_19,
                R.drawable.alphabet_pattern_19_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern19 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        char ch = 'A';\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i < n_double; i++) {\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i + j >= n + 1 && j - i <= n - 1 && i - j <= n - 1 && i + j < n + n_double) {\n" +
                        "                    if ((i + j) % 2 != 0)\n" +
                        "                        System.out.print(ch);\n" +
                        "                    else\n" +
                        "                        System.out.print(\" \");\n" +
                        "                } else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "            if (i < n)\n" +
                        "                ch++;\n" +
                        "            else\n" +
                        "                ch--;\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));

        //20
        arrayList.add(new QuestionModel(
                "20",
                "5",
                R.drawable.alphabet_pattern_20,
                R.drawable.alphabet_pattern_20_ans,
                "import java.util.Scanner;\n" +
                        "\n" +
                        "public class Pattern20 {\n" +
                        "    public static void main(String[] args) {\n" +
                        "        Scanner scanner = new Scanner(System.in);\n" +
                        "        System.out.print(\"Enter the number : \");\n" +
                        "        int n = scanner.nextInt();\n" +
                        "        int n_double = n * 2;\n" +
                        "        char ch = (char) ('A' + n);\n" +
                        "        // i is for Rows\n" +
                        "        // j is for Columns\n" +
                        "        for (int i = 1; i <= n; i++) {\n" +
                        "            --ch;\n" +
                        "            for (int j = 1; j < n_double; j++) {\n" +
                        "                if (i == j || i + j == n_double)\n" +
                        "                    System.out.print(ch);\n" +
                        "                else\n" +
                        "                    System.out.print(\" \");\n" +
                        "            }\n" +
                        "            System.out.println();\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n"));
    }

}