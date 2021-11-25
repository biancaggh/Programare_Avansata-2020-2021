package lab12_compulsory;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
import java.lang.reflect.Method;

public class TestFrame extends Component {
    private File chooseFile(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("d:\\classes"));
        fileChooser.setFileFilter(new FileNameExtensionFilter("Choose class files","class"));
        int result = fileChooser.showOpenDialog(this);
        return fileChooser.getSelectedFile();
    }
    public static void main(String[] args) throws Exception {
        TestFrame testIt = new TestFrame();
        File file = testIt.chooseFile();
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);
        int pathSeparator=0;
        StringBuilder stringBuilderFullPath = new StringBuilder(absolutePath);
        for(int i=0;i<stringBuilderFullPath.length();++i)
        {
            if(stringBuilderFullPath.charAt(i)=='\\')
            {
                stringBuilderFullPath.setCharAt(i,'.');
                pathSeparator++;
            }
        }
        int urlSeparator=0;
        int dotsClassName=0;
        StringBuilder pathURL;
        StringBuilder pathClass;
        String[] vector = stringBuilderFullPath.toString().split(".");
        System.out.println("lab12");
        System.out.println(vector[0]);
        while(urlSeparator<pathSeparator)
        {
            pathURL = new StringBuilder();

        }
        int good = 0, bad = 0;
        for (Method m : Class.forName(args[0]).getMethods()) {
            if (m.isAnnotationPresent(Test.class)) {
                try {
                    m.invoke(null);
                    good++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s is a complete failure: %s %n",
                            m, ex.getCause());
                    bad++;
                }
            }
        }
        System.out.printf("Success: %d, Failure %d%n", good, bad);
    }
}
