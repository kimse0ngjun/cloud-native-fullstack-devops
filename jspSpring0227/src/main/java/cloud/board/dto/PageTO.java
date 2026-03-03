package cloud.board.dto;

import java.util.ArrayList;

public class PageTO {
	
	ArrayList<BoardDto> list;
	private int curPage;
	private int perPage = 10;
	private int totalCount;
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public ArrayList<BoardDto> getList() {
		return list;
	}
	public void setList(ArrayList<BoardDto> list) {
		this.list = list;
	}
}
