import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//create arraylist of marks of 6 student

public class StudentMarks{
    public static void main(String[] args) {
        
        List marks = new ArrayList();
        
        marks.add(10);
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
        marks.add(60);
        Iterator i = marks.iterator();
        for(int j=0;j<marks.size();j++){
            int data1 = (int) marks.get(j);
            System.out.println(data1);
        }
    }
}