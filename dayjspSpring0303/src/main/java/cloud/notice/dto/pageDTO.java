package cloud.notice.dto;

public class pageDTO {

	private int startPage;
	private int endPage;
	private boolean prev, next; 
    private int totalPages;   
    private int currentPage;
    
    public pageDTO(int currentPage, int totalPages, int blockSize) {
    	this.currentPage = currentPage;
        this.totalPages = totalPages;
        
        this.startPage = ((currentPage - 1) / blockSize) * blockSize + 1;
        
        this.endPage = this.startPage + blockSize - 1;
        if (this.endPage > totalPages) {
            this.endPage = totalPages;
        }
        
        this.prev = this.startPage > 1;
        this.next = this.endPage < totalPages;
    }
    
    public int getStartPage() { return startPage; }
    public int getEndPage() { return endPage; }
    public boolean isPrev() { return prev; } 
    public boolean isNext() { return next; } 
    public int getTotalPages() { return totalPages; }
    public int getCurrentPage() { return currentPage; }
}
