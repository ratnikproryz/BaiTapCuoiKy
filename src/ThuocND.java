import java.util.Scanner;

public class ThuocND extends Thuoc{
	private double giaBaoQuan;
	private double giaVanChuyen;
	
	public ThuocND() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ThuocND(double giaBaoQuan, double giaVanChuyen) {
		super();
		this.giaBaoQuan = giaBaoQuan;
		this.giaVanChuyen = giaVanChuyen;
	}
		
	@Override
	public double donGiaThuoc() {
		// TODO Auto-generated method stub
		return giaBaoQuan +giaVanChuyen +super.getDonGiaCB();
	}
	
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap gia bao quan:");
		this.giaBaoQuan=Double.parseDouble(scanner.nextLine());
		System.out.println(" Nhap gia van chuyen: ");
		this.giaVanChuyen=Double.parseDouble(scanner.nextLine());
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Gia bao quan: "+ giaBaoQuan
				+", gia van chuyen: "+ giaVanChuyen
				+", don gia thuoc: "+ donGiaThuoc());
	}

	public double getGiaBaoQuan() {
		return giaBaoQuan;
	}

	public void setGiaBaoQuan(double giaBaoQuan) {
		this.giaBaoQuan = giaBaoQuan;
	}

	public double getGiaVanChuyen() {
		return giaVanChuyen;
	}

	public void setGiaVanChuyen(double giaVanChuyen) {
		this.giaVanChuyen = giaVanChuyen;
	}
	
	
}
