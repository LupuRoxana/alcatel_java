package SpyProgram;

public class Section extends Fragment{

	//private ArrayList<Fragment> frag = new ArrayList<Fragment>();
	
	private Fragment[] f;
	
	public Section(Fragment[] f) {
				
		f = new Fragment[0];
	}
	
	public void addFragment(Fragment frag) {
		
		int i, n = f.length;		
		Fragment[] fr = new Fragment[n+1];
		
		for(i = 0; i < n; i++)
			fr[i] = f[i];
			fr[n] = frag;
			f = fr;
	}
	
	public int countAppearances(String s) {
		
		int i, n = f.length, nr = 0;
		
		for(i = 0; i < n; i++)
			nr += f[i].countAppearances(s);
		return nr;
	}
	
	public String toString() {
		
		int i, n = f.length;
		String s = "";
		
		for(i = 0; i < n; i++)
			s += f[i].toString() + (i == (n-1)? "" : "\n");
		return s;
	}
	
	public Fragment[] returneaza() {
		
		return f;
	}
}
