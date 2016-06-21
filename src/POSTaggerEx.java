import java.util.Scanner;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class POSTaggerEx {
	public static void main(String args[]) throws NullPointerException, ClassNotFoundException
	{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Q.");
		String q =scanner.nextLine();
		String a="I want to talk to her";
		MaxentTagger tagger = new MaxentTagger("taggers/english-left3words-distsim.tagger");
		String tagged =tagger.tagString(q);
		System.out.println("Tagged string is :"+tagged);
		
	}
}
