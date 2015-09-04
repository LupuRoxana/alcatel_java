package SpyProgram;

public class OftenContainsString extends Detector {
	
	private String suspicious;
	private int limitValue;
	
	public OftenContainsString(String suspicious, int limitValue) {
		
		this.suspicious = suspicious;
		this.limitValue = limitValue;
	}
	
	public Fragment[] filter(Fragment[] f) {
		
		Fragment[] fr;
		
		if(f.length > 1) {
			
			fr = new Fragment[0]; 
		}
		else {
			fr = f;
		}
		
		int i, j, n = f.length, k = 0;
		
		for(i = 0; i < n; i++)
			if(f[i].countAppearances(suspicious) > limitValue) {
				Fragment[] fragment = new Fragment[k+1];
				for(j = 0; j < n; j++)
					fragment[j] = fr[j];
				    fragment[k] = f[j];
				    fr = fragment;
				    k++;
			}
			return fr;		
	}

}
