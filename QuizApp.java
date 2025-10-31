import java.util.*;

class Question {
    String que;
    String[] opt;
    char ans;

    Question(String que, String[] opt, char ans) {
        this.que = que;
        this.opt = opt;
        this.ans = ans;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Question> qlist = new ArrayList<>();

        qlist.add(new Question("1. What is the capital of India?",
                new String[]{"a) Delhi", "b) Mumbai", "c) Kolkata", "d) Chennai"}, 'a'));

        qlist.add(new Question("2. Which language is used for Android app development?",
                new String[]{"a) Java", "b) C#", "c) Python", "d) PHP"}, 'a'));

        qlist.add(new Question("3. Who is known as the father of Java?",
                new String[]{"a) James Gosling", "b) Dennis Ritchie", "c) Bjarne Stroustrup", "d) Guido van Rossum"}, 'a'));

        qlist.add(new Question("4. Which of these is not a Java keyword?",
                new String[]{"a) static", "b) Boolean", "c) void", "d) private"}, 'b'));

        qlist.add(new Question("5. Which symbol is used to end a statement in Java?",
                new String[]{"a) ,", "b) .", "c) ;", "d) :"}, 'c'));

        int score = 0;

        System.out.println("\n----- Welcome to the Online Quiz -----\n");

        for (Question q : qlist) {
            System.out.println(q.que);
            for (String o : q.opt) {
                System.out.println(o);
            }
            System.out.print("Enter answer (a/b/c/d): ");
            char userAns = sc.next().toLowerCase().charAt(0);

            if (userAns == q.ans) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.ans + "\n");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " out of " + qlist.size());
        sc.close();
    }
}
