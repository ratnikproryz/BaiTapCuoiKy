import java.util.Scanner;

public class MainRun {
	DSThuoc DSThuoc = new DSThuoc();

	public MainRun() {
	
	}

	public void menu() {
		System.out.println("------MENU------");
		System.out.println("1. Nhap sanh sach thuoc");
		System.out.println("2. In dansh sach thuoc");
		System.out.println("3. In danh sach thuoc nhap khau co don gia thuoc >=100");
		System.out.println("4. Tim thuoc theo ma thuoc");
		System.out.println("0. Ket thuc chuong trinh");
		System.out.println("Nhap lua chon!");
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		MainRun mainRun = new MainRun();
		int luaChon;
		String ma;
		while(true) {
			mainRun.menu();
			luaChon= Integer.parseInt(scanner.nextLine());
			switch (luaChon) {
			case 1:
				mainRun.DSThuoc.nhapDS();
				break;
			case 2:
				mainRun.DSThuoc.inDanhSach();
				break;
			case 3:
				mainRun.DSThuoc.timThuocNK();
				break;
			case 4:
				ma= scanner.nextLine();
				mainRun.DSThuoc.timThuoc(ma);
				break;
			case 0:
				System.exit(0);
			default:
				break;
			}
		}
		
		
	}
}
