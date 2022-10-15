public class Q4 {
    public static void main(String[] args) {
        int marks = 90;
        System.out.println("Marks: "+marks);
        if (marks >= 90 && marks <= 100) {
            System.out.println("A grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("B grade");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("C grade");
        } else if (marks >= 45 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 35 && marks < 45) {
            System.out.println("E grade");
        } else if (marks < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks");
        }
    }
}
