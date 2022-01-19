package com.sangamone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PincodeRead {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "J:\\Desktop\\Athena\\pincode.csv";
		String line= "";
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while(( line = br.readLine()) != null) {
				String[] values = line.split(",");
				//  System.out.println(line);
				//System.out.println(values[1]); // prints column data 1
				
				System.out.println("Pincode:" + values[4] + ", Location:" + values[5]);
				
			}
		}
		catch ( FileNotFoundException e) {
			e.printStackTrace();
		}
	
	catch ( IOException e) {
		e.printStackTrace();
	}
		}

}
