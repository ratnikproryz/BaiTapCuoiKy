import java.util.ArrayList;
import java.util.Scanner;

public class DSThuoc {
	ArrayList<Thuoc> dsThuoc = new ArrayList<Thuoc>();

	public DSThuoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void nhapDS() {
		Scanner scanner =new Scanner(System.in);
		int length;
		System.out.println("Nhap so luong thuoc: ");
		length= Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < length; i++) {
			System.out.println("Loai thuoc; NK hay ND");
			String loaiThuoc= scanner.nextLine();
			if(loaiThuoc.equals("NK")) {
				ThuocNK thuoc = new ThuocNK();
				thuoc.nhap();
				dsThuoc.add(thuoc);
			}else {
				ThuocND thuocND= new ThuocND();
				thuocND.nhap();
				dsThuoc.add(thuocND);
			}
		}
	}
	
	public void inDanhSach() {
		int length = dsThuoc.size();
		System.out.println("Danh sach thuoc:");
		for (int i = 0; i < length; i++) {
			dsThuoc.get(i).xuat();
		}
	}
	
	
	public void timThuocNK() {
		int length = dsThuoc.size();
		System.out.println("Danh sach thuoc nhap kha co don gia >=100:");
		for (int i = 0; i < length; i++) {
			if(dsThuoc.get(i) instanceof ThuocNK) {
				ThuocNK thuocNK =(ThuocNK) dsThuoc.get(i);
				if(thuocNK.donGiaThuoc() >= 100) {
					thuocNK.xuat();
				}
			}
		}
	}
	
	public void timThuoc(String ma) {
		int length = dsThuoc.size();
		int check=0;
		System.out.println("Ket qua:");
		for (int i = 0; i < length; i++) {
			if(dsThuoc.get(i).getMa().equals(ma)) {
				dsThuoc.get(i).xuat();
				check=1;
			}
		}
		if(check==0) {
			System.out.println("Khong co");
		}
	}
}
