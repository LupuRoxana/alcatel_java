package SpyProgram;

public class Main {

	public static void main(String[] args) {
		
		Detector d1 = new OftenContainsString("aa", 3);
		Detector d2 = new OftenContainsString("aba", 2);
		Detector d3 = new AndDetector(d1, d2);
		Detector d4 = new AndDetector(d2, d3);
		
		/*Fragment p = new Paragraph();
		((Paragraph)p).addWord("aa");
		((Paragraph)p).addWord("aba");
		
		Fragment s = new Section();
		((Section)s).addFragment(p);
		System.out.println(s);
		
		Fragment[] f = d1.filter(((Section)s).returneaza());
		String sir = "-\n";
		int i;
		for(i = 0; i < f.length; i++)
			sir += f[i].toString() + "\n";
		System.out.println(sir);
		
		*/
		
	}
}
