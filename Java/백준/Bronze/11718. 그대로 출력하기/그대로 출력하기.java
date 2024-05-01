import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s="";
		while ((s=br.readLine()) != null) {
			if(s == null || s.equals("")) break;
		    bw.write(s + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}// --main

}// --class
