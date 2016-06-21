import java.util.Scanner;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class POSTaggerEx {
	String q,a,tagged;
	POSTaggerEx()
	{
		q=null;
		tagged=null;
	}
	
	public void Ask() throws NullPointerException, ClassNotFoundException 
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Q.");
		q =scanner.nextLine();
	}
	
	public void Generate_tokens() throws NullPointerException, ClassNotFoundException 
	{
		MaxentTagger tagger = new MaxentTagger("taggers/english-left3words-distsim.tagger");
		tagged =tagger.tagString(q);

	}
	public static void main(String args[]) throws NullPointerException, ClassNotFoundException 
	{
		POSTaggerEx obj = new POSTaggerEx();
		obj.Ask();
		obj.Generate_tokens();
		System.out.println("Tagged string is :"+obj.tagged);

				
		
	}
}
