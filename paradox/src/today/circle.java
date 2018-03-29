package today;

public class circle {
	private int centerx;
	private int centery;
	private double radius;
	
	public int getCenterx() {
		return centerx;
	}

	public void setCenterx(int centerx) {
		this.centerx = centerx;
	}

	public int getCentery() {
		return centery;
	}

	public void setCentery(int centery) {
		this.centery = centery;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public circle() {
		this.setCenter(0,0);
		this.setRadius(5.0);
		
		
	}
	public circle(int x, int y, double r) {
		this.setCenter(x, y);
		this.setRadius(10.0);
	}	
	public circle(circle c) {
		this.setCenter(c.centerx, c.centery);
		this.setRadius(c.radius);
		
	}
	public void setCenter(int x, int y) {
		this.setCenterx(x);
		this.setCentery(y);
	}
	public void printCircle() {
		System.out.println("원의 정보");
		System.out.println("중심좌표:"+centerx+","+centery);
		System.out.println("반지름:"+radius);
		
		
	}
	public void moveCenter(int x, int y) {
		this.setCenter(x, y);
		
	}
	public void resize(double r) {
		this.setRadius(r);
	}

}


