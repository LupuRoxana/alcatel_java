package SpyProgram;

public class Paragraph extends Fragment{

	private String [] sir;
	
	public Paragraph(String[] sir) {
	
		sir = new String[0];
	}
	
	public boolean addWord(String s) {
		
		int n = sir.length;
		
		if(n < 1024) {
			
			int i;
			String[] frag = new String [n+1];
			for(i = 0; i < n; i++)
				
				frag[i] = sir[i];
				frag[n] = s;
				sir = frag;
				
			return true;	
			
		}
		return false;
		
	}
	
	public int countAppearances(String s) {
		
		int i, n = sir.length, nr = 0;
		
		for(i = 0; i < n; i++)
			if(sir[i].equals(s)) {
				
				nr++;
			}
		return nr;
	}
	
	public String toString() {
		
		int i, n = sir.length;		
		String s = "";
		
		for(i = 0; i < n; i++)
			s += sir[i].toString() + (i == (n-1)? "" : "\n");
		return s;
		
	}
	
}
