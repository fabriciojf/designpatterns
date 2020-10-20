package com.fabriciojf.prototype;

/**
 * Prototype Sample Code Usage
 * 
 * @author Fabricio S Costa fabriciojf@gmail.com
 * @class PrototypeUsage 
 * @version 1.0
 * @since 19 de out de 2020
 */
public class PrototypeUsage {

	public static void main(String[] args) {
		
		DocPrototype pdf = new Pdf();
		pdf.setName("FilePDF.pdf");
		
		DocPrototype text = new Text();
		text.setName("FileText.txt");
		
		DocPrototype pdfClone = pdf.clone();
		DocPrototype txtClone = text.clone();
		
		System.out.println(pdfClone);
		
		System.out.println(txtClone);
	}	
}
