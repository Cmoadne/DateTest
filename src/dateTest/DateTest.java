package dateTest;

import java.util.Date; //包
import java.util.Calendar; //包
import java.util.*;
import java.text.*; //文本包

public class DateTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// 初始化 Date 对象
		Date date = new Date();

		// 使用 toString() 函数显示日期时间
		System.out.println(date.toString() + "  " + date.getTime()); // 获得当前爱你如期和毫秒数
		// System.out.println(date.compareTo(new Date()));

		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: " + ft.format(dNow));

		// 使用printf()显示日期和时间
		String str = String.format("Current Date/Time : %tc \n", date);
		System.out.printf(str);
		System.out.printf("%1$s %2$tB %2$td, %2$tY\n", "Due date:", date);

		// 显示格式化时间
		System.out.printf("%s %tB %<te, %<tY\n", "Due date:", date);

		// 解析字符串时间
		ft = new SimpleDateFormat("yyyy-MM-dd");

		String input = args.length == 0 ? "1818-11-11" : args[0];
		System.out.print(input + " Parses as ");
		Date t;

		try {
			t = ft.parse(input);
			System.out.println(t);
		} catch (ParseException e) { // 如果格式不对
			System.out.println("Unparseable using " + ft);
		}

		// 休眠
		try {
			System.out.println(new Date() + "\n");
			Thread.sleep(1000 * 3); // 休眠3秒
			System.out.println(new Date() + "\n");
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}

		// 测量时间间隔
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");
			Thread.sleep(5 * 60 * 10);
			System.out.println(new Date() + "\n");
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference is : " + diff);
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}

		// calendar类
		// 创建一个代表2009年6月12日的Calendar对象
		Calendar c1 = Calendar.getInstance();
		c1.set(2009, 6 - 1, 12); // 设置年月日
		c1.set(Calendar.DATE, 10); // 只设置日期
		c1.set(Calendar.YEAR, 2008); // 只设置年份
		c1.add(Calendar.DATE, 10); // 日期加上10天
		c1.add(Calendar.DATE, -10); // 日期减去10天
		// int year = c1.get(Calendar.YEAR);   //注释掉懒得重新想变量了，因为和下面重复了
		// 获得月份
		int month = c1.get(Calendar.MONTH) + 1;
		// 获得日期
		int date1 = c1.get(Calendar.DATE);
		// 获得小时
		int hour = c1.get(Calendar.HOUR_OF_DAY);
		// 获得分钟
		int minute = c1.get(Calendar.MINUTE);
		// 获得秒
		int second = c1.get(Calendar.SECOND);
		// 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
		int day = c1.get(Calendar.DAY_OF_WEEK);

		// GregorianCalendar 类
		String[] months= { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		int year;
		// 初始化 Gregorian 日历
		// 使用当前时间和日期
		// 默认为本地时间和时区
		GregorianCalendar gcalendar = new GregorianCalendar();
		// 显示当前时间和日期的信息
		System.out.print("Date: ");
		System.out.print(months[gcalendar.get(Calendar.MONTH)]);
		System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
		System.out.println(year = gcalendar.get(Calendar.YEAR));
		System.out.print("Time: ");
		System.out.print(gcalendar.get(Calendar.HOUR) + ":");
		System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
		System.out.println(gcalendar.get(Calendar.SECOND));

		// 测试当前年份是否为闰年
		if (gcalendar.isLeapYear(year)) {
			System.out.println("当前年份是闰年");
		} else {
			System.out.println("当前年份不是闰年");
		}
	}

}
