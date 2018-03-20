package ADT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileinputAndOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String inputFileName = "input.txt";
		File f = new File(inputFileName);//creating file object does not mean creating physical file
		if(f.exists()){
			FileInputStream fis = new FileInputStream(f); //Reading file
			int read = -1;
			while((read = fis.read()) != -1){
				System.out.print((char)read);  
			}
            fis.close();
		}else{	
			f.createNewFile();
			PrintWriter out = new PrintWriter(f);
			out.println("hello");//writing content to file
			out.println("world");//writing content to file
			out.close();
		}
		String outputFileName = "output.txt";
		File outPutFile = new File(outputFileName);
		if(!f.exists()){
			f.createNewFile();
		}
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fop = new FileOutputStream(outPutFile);
		int c;
		while((c = fis.read()) != -1){
			fop.write(c);
			
		}
		fop.close();
		fis.close();
	}

}
