
public abstract class Case {
	
	/**
	 * 
	 */
	private int x,y;
	private boolean etat;
	
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param etat
	 */
	public Case(int x, int y, boolean etat) {
		super();
		this.x = x;
		this.y = y;
		this.etat = etat;
	}
	
	/**
	 * 
	 * @param _etat
	 */
	public Case(boolean _etat) {
		super();
		etat=_etat;
	}

	/**
	 * 
	 * @return
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
}
