package commonTasks;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShellCommandExec {
    public static void main(String[] args) {
        String gnomeOpenCommand = "gnome-open C:\\Users\\l.samko\\Downloads\\samko.pdf";

        try {
            Runtime rt = Runtime.getRuntime();
            Process processObj = rt.exec(gnomeOpenCommand);

            InputStream stdin = processObj.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stdin);
            BufferedReader br = new BufferedReader(isr);

            String myOutput = " ";

            while ((myOutput=br.readLine()) != null) {
                myOutput = myOutput + "\n";
            }
                System.out.println(myOutput);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
