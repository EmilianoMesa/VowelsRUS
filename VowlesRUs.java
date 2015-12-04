import java.io.*;


public class stringCode {
						//VowelsRUs by Emilaino Mesa

	public static void main(String[] args) throws IOException {
		/**Codigo por Emiliano Mesa**/
		
			/**Import**/
		String fileName = "/Users/EmilianoMesa/Downloads/vowels.txt";
		String line = null;
	try{
		FileReader fileReader = new FileReader (fileName);
		BufferedReader bufferedReader = new BufferedReader (fileReader);
		while((line = bufferedReader.readLine()) != null){
			//Code starts here
			/**Checking to see if any error appears at import**/
			
			String[] space = line.split(" ");
			String firstWord = space[0];
			String secondWord = space[1]; //Also known as "SUFFIX"
			final String vowel1 = "A";
			final String vowel2 = "S";
			final String vowel3 = "C";
			final String vowel4 = "L";
			char secondLast = firstWord.charAt(firstWord.length()-2);
			char lastLetter = firstWord.charAt(firstWord.length()-1);
			char secondLastOther = secondWord.charAt(1);
			String last = firstWord.valueOf(lastLetter);
			String otherLetter = secondWord.valueOf(secondLastOther);
			String secondLastLetter = firstWord.valueOf(secondLast);
			
			if(firstWord.endsWith(vowel1) || firstWord.endsWith(vowel2) || firstWord.endsWith(vowel3) || firstWord.endsWith(vowel4)){
				if(secondLastLetter.equals(vowel1) || secondLastLetter.equals(vowel2)|| secondLastLetter.equals(vowel3)|| secondLastLetter.equals(vowel4)){
					//System.out.println("Ends in two or more vowels");
					//Plural Word
					/**Plural**/System.out.println("Plural: "+firstWord+last+"H");
						
					//Checking the suffix
						if(!secondWord.startsWith(vowel1) && !secondWord.startsWith(vowel2) && !secondWord.startsWith(vowel3) && !secondWord.startsWith(vowel4) ){
							System.out.println("Suffix: "+firstWord.substring(0,firstWord.length()-2)+last+ secondWord );
						}
						else if(secondWord.startsWith(vowel1) || secondWord.startsWith(vowel2)|| secondWord.startsWith(vowel3)|| secondWord.startsWith(vowel4) ){
							System.out.println("Suffix: "+ firstWord + secondWord);
						}
					
				}
			else{
					//System.out.println("Ends in one vowel");
					/**Plural**/System.out.println("Plural: "+firstWord.substring(0, firstWord.length()-1) + "G");
					if(!secondWord.startsWith(vowel1) && !secondWord.startsWith(vowel2) && !secondWord.startsWith(vowel3) && !secondWord.startsWith(vowel4) ){
						System.out.println("Suffix:"+firstWord.substring(0,firstWord.length()-2)+ secondWord );
					}
					else if(secondWord.startsWith(vowel1) || secondWord.startsWith(vowel2)|| secondWord.startsWith(vowel3)|| secondWord.startsWith(vowel4) ){
						System.out.println("Suffix: "+ firstWord + secondWord.substring(1,secondWord.length()));
					}
				}
				//What to do if the word ends in a vowel?
				
			}
			else if (!firstWord.endsWith(vowel1) || !firstWord.endsWith(vowel2) || !firstWord.endsWith(vowel3) || !firstWord.endsWith(vowel4)){
				 
						if(!secondLastLetter.equals(vowel1) && !secondLastLetter.equals(vowel2) && !secondLastLetter.equals( vowel3) && !secondLastLetter.equals(vowel4) ){
							//Checking for consonants
							//System.out.println("Ends in two consonants");
							/**Plural**/System.out.println("Plural: "+firstWord+secondLast+"H");
								
						}
						else{
						//	System.out.println("Ends in a consonant");
							/**Plural**/System.out.println("Plural: "+firstWord + "GH");
							System.out.println("Suffix: " + firstWord + secondWord);
						}
			}
			
			//Code ends here
		}
		bufferedReader.close();
	}
	catch(FileNotFoundException ex){
		System.out.println("File isnt reachable");
	}	
	}
}
