package boardgame;

public class Position {
	private int row;
	private int columm;
	
	
	
	public Position(int row, int columm) {
		super();
		this.row = row;
		this.columm = columm;
	}



	public int getRow() {
		return row;
	}



	public void setRow(int row) {
		this.row = row;
	}



	public int getColumm() {
		return columm;
	}



	public void setColumm(int columm) {
		this.columm = columm;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.columm = column;
	}
	
	
	@Override
	public String toString() {
		
		return row  + " ," + columm;
	}
	

}
