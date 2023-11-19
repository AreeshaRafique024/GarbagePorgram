import java.io.*;

public class ProgramDocumentation {
    public  void writeToFile(String filename,String fileContent)throws Exception{
        File file=new File(filename);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fileWriter);
        bw.write(fileContent);
        bw.newLine();
        bw.close();
        fileWriter.close();
    }

    public  void readToFile(String filename)throws Exception{
        File file=new File(filename);
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.append(br.readLine()));

        br.close();
        fr.close();
    }

}
