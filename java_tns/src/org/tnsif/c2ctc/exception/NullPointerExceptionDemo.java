package org.tnsif.c2ctc.exception;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		
				String words=null;
				try {
					System.out.println(words.length());
				}catch(NullPointerException e) {
					System.out.println(e);
				}finally {
					System.out.println("no matter what this block get executed");
				}
				
			}

		

	}


