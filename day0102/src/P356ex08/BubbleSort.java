package P356ex08;

public class BubbleSort implements Sort{
	
	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort.ascending() 실행");
	}
	
	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort.descending() 실행");
	}
	
	@Override
	public void description() {
		System.out.println("BubbleSort.desciption 실행");
	}
}
