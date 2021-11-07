import java.util.Scanner;

public class Thuoc implements IThuoc{
	protected String ma;
	protected String tenThuoc;
	protected double donGiaCB;
	
	public Thuoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Thuoc(String ma, String tenThuoc, double donGiaCB) {
		super();
		this.ma = ma;
		this.tenThuoc = tenThuoc;
		this.donGiaCB = donGiaCB;
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ma thuoc");
		this.ma= scanner.nextLine();
		System.out.println("Ten thuoc:");
		this.tenThuoc = scanner.nextLine();
		System.out.println("Don gia CB:");
		this.donGiaCB =Double.parseDouble(scanner.nextLine());
	}
	
	public void xuat() {
		System.out.println("Ma: "+ma+", Ten thuoc: "+ tenThuoc+", Don gia Cb: "+donGiaCB);
	}

	@Override
	public double donGiaThuoc() {
		// TODO Auto-generated method stub
		return donGiaCB;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTenThuoc() {
		return tenThuoc;
	}

	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}

	public double getDonGiaCB() {
		return donGiaCB;
	}

	public void setDonGiaCB(double donGiaCB) {
		this.donGiaCB = donGiaCB;
	}
	
	
}
