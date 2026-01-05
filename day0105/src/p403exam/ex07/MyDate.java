package p403exam.ex07;

import java.util.Objects;

public class MyDate {
	
	int day;
	int month;
	int year;
	
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate date = (MyDate) obj;
//			return this.day == md.day;
			return (this.day == date.day && this.month == date.month && this.year == date.year);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() { // 저장한 위치값 반환
		return day*10 + month * 10 + year * 10;
	}
}
