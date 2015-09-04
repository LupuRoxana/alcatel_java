package SpyProgram;

public class AndDetector extends Detector {
	
	private Detector d1, d2;
	
	public AndDetector(Detector d1, Detector d2) {
		
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public Fragment[] filter(Fragment[] f){		
	
		Fragment[] z = new Fragment[0];
		int i, j, k = 0, n = f.length;
		
		for(i = 0; i < n; i++) {
			
			Fragment[] x = new Fragment[1];
			x[0] = f[i];
			
			if(d1.filter(x) == d2.filter(x)) {
				
				Fragment[] y = new Fragment[k+1];
				for(j = 0; j < n; j++)
					y[j] = z[j];
				    y[k] = f[i];
				    z = y;
				    k++;
			}
		}
		return z;
	}
}