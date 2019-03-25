import java.util.ArrayList;
import java.util.Scanner;
abstract class NHANVIEN
{
	String manv;
	String hoten;
	String trinhdo;
	float luongcb; 
	NHANVIEN()
	{
	}
	NHANVIEN(String ma, String ht, String td, float lcb)
	{
		manv=ma;
		hoten = ht; 
		trinhdo = td; 
		luongcb = lcb;
	}
	public void Input()
	{
		Scanner nhap = new Scanner(System.in);
		System.out.println ("\nNhap vao ma:");
		manv = nhap.nextLine();
		System.out.println ("\nNhap vao ten:");
		hoten = nhap.nextLine();
		System.out.println ("\nNhap vao trinh do:");
		trinhdo = nhap.nextLine();
		System.out.println ("\nNhap vao lcb:");
		luongcb = nhap.nextFloat();
	}
	public void Output()
	{
	
		System.out.println ("\nMa:" +manv);
		System.out.println ("\nTen:" + hoten);
		System.out.println ("\nTrinh do:" + trinhdo);
		System.out.println ("\nLcb:" + luongcb);
	
	}
	abstract float Tinhluong();
	
}
class NVQL extends NHANVIEN
{
	String chuyenmon;
	float pccv ; 
	NVQL()
	{
			
	}
	NVQL(String ma, String ht, String td, float lcb , String cm, float pc)
	{
		super(ma,ht,td,lcb);
		chuyenmon = cm ; 
		pccv = pc;
	}
	public void Input()
	{
		Scanner nhap = new Scanner(System.in);
		super.Input();
		System.out.println ("\nNhap vao Chuyen mon: " );
		chuyenmon = nhap.nextLine();
		System.out.println ("\nNhap vao Phu cap: " );
		pccv = nhap.nextFloat();
	}
	public void Output()
	{
		super.Output();
		System.out.println ("\nChuyen mon: " + chuyenmon );
		System.out.println ("\nPCCV: " + pccv );
		
	}
	float Tinhluong()
	{
		return luongcb + pccv;
	}
		
}
class NVPV extends NHANVIEN
{
	float Tinhluong()
	{
		return luongcb;
	}
}
class QUANLY
{
	ArrayList <NHANVIEN> dsnv = new ArrayList<NHANVIEN>();
	NHANVIEN nv;
	int Menu()
	{
		int n; 
		Scanner nhap = new Scanner(System.in);
		System.out.println ("\n1. Nhap vao NVQL \n 2. Nhap NVNC \n3. Nhap NVPV \n4.Xuat NV \n Moi ban nhap:" );
		n = nhap.nextInt();
		return n;
	}
	
	QUANLY()
	{
		while(true)
		{
			switch(Menu())
			{
				case 1: 
					nv = new NVQL();
					nv.Input();
					dsnv.add(nv);
					break;
				case 2:
					break;
				case 3:
					nv = new NVPV();
					nv.Input();
					dsnv.add(nv);
					break;
				case 4:
					for(NHANVIEN ds:dsnv)
					{
						ds.Output();
						System.out.println ("luong = " + ds.Tinhluong());
					}
					break ;
				default:
					System.out.println ("Thoat");
					System.exit(0);
			}
			
		}
	}
}

public class baitap {
   
    public static void main(String[] args) {
        // TODO code application logic here
        QUANLY ql = new QUANLY();
       
    }
}