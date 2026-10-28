import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args){
   String firstname = JOptionPane.showInputDialog("Enter your first name:");
   String secondname = JOptionPane.showInputDialog("Enter your second name:");
   String fullname = firstname + secondname;
   String schoolname = JOptionPane.showInputDialog("school name:");
   String coursename = JOptionPane.showInputDialog("course name:");



    if (fullname != null && !fullname.trim().isEmpty()) { 
        JOptionPane.showMessageDialog( null, "Welcome, " + fullname + "!" );
        JOptionPane.showMessageDialog( null, "school:  " + schoolname + "" );
        JOptionPane.showMessageDialog( null, "course done: " + coursename + "" );


     }
         else { JOptionPane.showMessageDialog(null, "No name entered."); }
    }
}
