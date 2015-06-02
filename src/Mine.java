import java.util.Comparator;


public  class Mine implements Comparable {
	
	int mQuality;
	int index;
	
	public Mine(int mQuality, int index) {
		this.mQuality = mQuality;
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public int getmQuality() {
		return mQuality;
	}

	public void setmQuality(int mQuality) {
		this.mQuality = mQuality;
	}
	
	public String toString() {
		return "mQuality:" + this.mQuality + " | index:" + this.index;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Mine m = (Mine) o;
		
		if(this.mQuality > m.mQuality) {
			return 1;
		} else if(this.mQuality == m.mQuality) {
			if(this.index < m.index) {
				return -1;
			} else {
				return 1;
			}
		} else {
			return -1;
		}
	}

}
