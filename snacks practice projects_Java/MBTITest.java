import java.util.Scanner;

public class MBTITest {


    private static final String[] QUESTIONS = {
        "1. A: expend energy, enjoy groups\n   B: conserve energy, enjoy one-on-one",
        "2. A: interpret literally\n   B: look for meaning and possibilities",
        "3. A: logical, thinking, questioning\n   B: empathetic, feeling, accommodating",
        "4. A: organized, orderly\n   B: flexible, adaptable",
        "5. A: more outgoing, think out loud\n   B: more reserved, think to yourself",
        "6. A: practical, realistic, experiential\n   B: imaginative, innovative, theoretical",
        "7. A: candid, straight forward, frank\n   B: tactful, kind, encouraging",
        "8. A: plan, schedule\n   B: unplanned, spontaneous",
        "9. A: seek many tasks, public activities, interaction with others\n   B: seek private, solitary activities with quiet to concentrate",
        "10. A: standard, usual, conventional\n   B: different, novel, unique",
        "11. A: firm, tend to criticize, hold the line\n   B: gentle, tend to appreciate, conciliate",
        "12. A: regulated, structured\n   B: easygoing, 'live' and 'let live'",
        "13. A: external, communicative, express yourself\n   B: internal, reticent, keep to yourself",
        "14. A: focus on here-and-now\n   B: look to the future, global perspective, 'big picture'",
        "15. A: tough-minded, just\n   B: tender-hearted, merciful",
        "16. A: preparation, plan ahead\n   B: go with the flow, adapt as you go",
        "17. A: active, initiate\n   B: reflective, deliberate",
        "18. A: facts, things, 'what is'\n   B: ideas, dreams, 'what could be,' philosophical",
        "19. A: matter of fact, issue-oriented\n   B: sensitive, people-oriented, compassionate",
        "20. A: control, govern\n   B: latitude, freedom"
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[4]; // [E-I, S-N, T-F, J-P]

        for (String question : QUESTIONS) {
            System.out.println(question);
            String answer = input.nextLine().trim().toUpperCase();

            if (answer.equals("A") || answer.equals("B")) {
                switch (question.charAt(2)) {
                    case 'E':
                    case 'I':
                        scores[0] += answer.equals("A") ? 1 : -1;
                        break;
                    case 'S':
                    case 'N':
                        scores[1] += answer.equals("A") ? 1 : -1;
                        break;
                    case 'T':
                    case 'F':
                        scores[2] += answer.equals("A") ? 1 : -1;
                        break;
                    case 'J':
                    case 'P':
                        scores[3] += answer.equals("A") ? 1 : -1;
                        break;
                }
            } else {
                System.out.println("Invalid input, please enter A or B.");
            }
        }

        String personalityType = "";
        personalityType += scores[0] >= 0 ? "E" : "I";
        personalityType += scores[1] >= 0 ? "S" : "N";
        personalityType += scores[2] >= 0 ? "T" : "F";
        personalityType += scores[3] >= 0 ? "J" : "
