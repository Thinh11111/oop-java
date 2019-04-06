import java.util.*;
public interface HINH
{
	final double pi=3.141592;
	final double Pi=3.141592;
	public float dientich();
	public float chuvi();
	public void input();
	public void output();
}
public class HINHVUONG implements HINH
{
	float canh;
	public HINHVUONG(){
		
	}
	public HINHVUONG(float c){
		canh=c;
	}
	float SHV(){
		return canh*canh;
	}
	float PHV(){
		return canh*4;
	}
	public void input(){
		Scanner input=new Scanner(System.in);
		System.out.println("\nnhap canh a: ");
		canh=input.nextFloat();
	}
	public void output(){
		System.out.println("\ndien tich hinh vuong"+SHV());
		System.out.println("\nchu vi hinh vuong"+PHV());
		
	}
}
public class HINHCHUNHAT implements HINH
{
	float dai,rong;
	public HINHCHUNHAT(){
		
	}
	public HINHCHUNHAT(float d,float r){
		dai=d;
		rong=r;
	}
	float SHCN(){
		return dai*rong;
	}
	float PHCN(){
		return (dai+rong)*2;
	}
	public void input(){
		Scanner input=new Scanner(System.in);
		System.out.println("\nnhap dai: ");
		dai=input.nextFloat();
		System.out.println("\nnhap rong: ");
		rong=input.nextFloat();
	}
	public void output(){
		System.out.println("\ndien tich hinh chu nhat"+SHCN());
		System.out.println("\nchu vi hinh chu nhat"+PHCN());
		
	}
}
public class HINHTRON implements HINH
{
	float bankinh;
	public HINHTRON(){
		
	}
	public HINHTRON(float r){
		bankinh=r;
	}
	float SHT(){
		return bankinh*2*pi;
	}
	float PHT(){
		return pi*bankinh*bankinh;
	}
	public void input(){
		Scanner input=new Scanner(System.in);
		System.out.println("\nnhap ban kinh: ");
		bankinh=input.nextFloat();
	}
	public void output(){
		System.out.println("\ndien tich hinh tron"+SHT());
		System.out.println("\nchu vi hinh tron"+PHT());
		
	}
}
public class baitap2 {
	Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
     	HINH hcn=new HINHCHUNHAT();
     	hcn.input();
     	hcn.output();
    }
}
