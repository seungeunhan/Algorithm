import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> nums = new ArrayList<>();

        for(int i = 0; i < 9; i++){
            int n = Integer.parseInt(br.readLine());
            nums.add(n);
        }
        System.out.println(Collections.max(nums));
        //최대값의 자리수 +1
        System.out.println(nums.indexOf(Collections.max(nums))+1);
		
	}
	
}

