package projectvm;

import java.util.Scanner;

public class Methods {
	
	public double select(Products product) {
		
		System.out.println(product.toString());
		
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("L�tfen almak istediginiz �r�n�n numarasini giriniz(1'den 10'a kadar)");
			product.setProductNum(scan.nextInt());
			if (product.getProductNum()<1 || product.getProductNum()>10) {
				System.out.println("L�tfen gecerli bir product numarasi giriniz(1'den 10'a kadar)");
			}
		} while (product.getProductNum()<1 || product.getProductNum()>10);
		return 0;
		
	}
	
}
