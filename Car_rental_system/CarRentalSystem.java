package Car_rental_system;

import java.util.Scanner;

public class CarRentalSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AutomobileBusiness motoMgr = new AutomobileBusiness();
		motoMgr.init();// 加载初始化车辆
		int fanhui = -1;
		do {
			System.out.println("**********欢迎光临Sakula汽车租赁公司**********");
			String trademark = "";// 品牌
			int seating = 0;// 座位数
			String type = "";// 型号
			int tonne = 0;// 吨位
			System.out.println("请输入您需要租赁的汽车类型：1.轿车\t2.客车\t3.卡车");
				int selective = scan.nextInt();
				if (selective == 1) {// 租赁轿车
					System.out.println("请选择您需要租赁的轿车品牌：1.宝马，2.别克");
					int selectiveTK = scan.nextInt();
					if (selectiveTK == 1) {
						trademark = "宝马";
						System.out.println("请选择您需要租赁的宝马型号：1.X6，2.550i");
						int selectiveTP = scan.nextInt();
						if (selectiveTP == 1) {
							type = "X6";
						} else if (selectiveTP == 2) {
							type = "550i";
						}
					} else if (selectiveTK == 2) {
						trademark = "别克";
						System.out.println("请选择您需要租赁的别克型号：1.GL8，2.林荫大道");
						int selectiveTP = scan.nextInt();
						if (selectiveTP == 1) {
							type = "GL8";
						} else if (selectiveTP == 2) {
							type = "林荫大道";
						}
					}
				} else if (selective == 2) {// 租赁客车
					System.out.println("请选择您需要租赁的客车品牌：1.金杯，2.金龙");
					int selectiveTK = scan.nextInt();
					if (selectiveTK == 1) {
						trademark = "金杯";
						System.out.println("请选择您需要租赁的金杯座位数：1.16，2.34");
						int selectiveSG = scan.nextInt();
						if (selectiveSG == 1) {
							seating = 16;
						} else if (selectiveSG == 2) {
							seating = 34;
						}
					} else if (selectiveTK == 2) {
						trademark = "金龙";
						System.out.println("请选择您需要租赁的金龙座位数：1.16，2.34");
						int selectiveSG = scan.nextInt();
						if (selectiveSG == 1) {
							seating = 16;
						} else if (selectiveSG == 2) {
							seating = 34;
						}
					}
				} else if (selective == 3) {// 租赁卡车
					System.out.println("请选择您需要租赁的卡车品牌：1.一汽解放，2.重庆红岩");
					int selectiveTK = scan.nextInt();
					if (selectiveTK == 1) {
						trademark = "一汽解放";
						System.out.println("请选择您需要租赁的一汽解放吨位数：1.1吨，2.2吨");
						int selectiveTE = scan.nextInt();
						if (selectiveTE == 1) {
							tonne = 1;
						} else if (selectiveTE == 2) {
							tonne = 2;
						}
					} else if (selectiveTK == 2) {
						trademark = "重庆红岩";
						System.out.println("请选择您需要租赁的重庆红岩吨位数：1.1吨，2.2吨");
						int selectiveTE = scan.nextInt();
						if (selectiveTE == 1) {
							tonne = 1;
						} else if (selectiveTE == 2) {
							tonne = 2;
						}
					}
				} 
			Car moto = motoMgr.motosLeaseOut(trademark, type, seating, tonne);// 查找车辆
			if (moto != null) {
				System.out.println("请输入需要租赁的天数：");
				int days = scan.nextInt();
				System.out.println("租车成功！请按照如下车牌号提车：" + moto.getCarNumber());
				System.out.println("您需要支付" + moto.calRent(days) + "元");
				System.out.println("是否继续租赁？按0返回系统进行租赁，任意键结束系统。");
				fanhui = scan.nextInt();
			} else {
				System.err.println("输入错误，按0返回系统进行租赁，任意键结束系统。");
				fanhui = scan.nextInt();
			}
		} while (fanhui == 0);

	}
}
