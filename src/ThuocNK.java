import java.util.Scanner;

public class ThuocNK extends Thuoc{
	private double phiNhapKhau;
	private int soLanNhapKhau;
	
	@Override
	public double donGiaThuoc() {
		// TODO Auto-generated method stub
		double phuPhi= (soLanNhapKhau<5) ? 10: 50;
		return phiNhapKhau*soLanNhapKhau + super.getDonGiaCB() + phuPhi;
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap phi nhap khau:");
		this.phiNhapKhau= Double.parseDouble(scanner.nextLine());
		System.out.println("Nhap so lan nhap khau");
		this.soLanNhapKhau= Integer.parseInt(scanner.nextLine());
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Phi nhap khau: "+ phiNhapKhau
				+", so lan nhap khau:"+ soLanNhapKhau
				+", don gai thuoc: "+ donGiaThuoc());
	}
	
	
	public double getPhiNhapKhau() {
		return phiNhapKhau;
	}

	public void setPhiNhapKhau(double phiNhapKhau) {
		this.phiNhapKhau = phiNhapKhau;
	}

	public int getSoLanNhapKhau() {
		return soLanNhapKhau;
	}

	public void setSoLanNhapKhau(int soLanNhapKhau) {
		this.soLanNhapKhau = soLanNhapKhau;
	}
	
	
}
