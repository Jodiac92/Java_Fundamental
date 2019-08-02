package bonus;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utility {
	//pattern => "yyyy-MM월-dd일 a hh:mm E요일"
	//yyyy : 년도, MM : 월, dd : 일, a : 오전 오후, hh : 시, mm : 분, ss : 초, E : 요일
	public static String getPatternDate(Calendar c, String pattern) {
		return new SimpleDateFormat(pattern).format(c.getTime());
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM월-dd일 a hh:mm E");
		//String date = sdf.format(c.getTime());
		//return date;
	}
	//Utility.getXXX("xxxx", c);
	
	
	public static boolean mkdirs(String path) {
		boolean isSuccess = false;
		File f1 = new File(path);
		boolean isExisted = f1.isDirectory();
		if (!isExisted) {
			isSuccess = f1.mkdirs();
		}
		return isSuccess;
	}

public String getComma(long name) {
	return String.format("%,d", name);
}

public String getComma(double name, int precision) {
	return String.format("%,." + precision + "f", name);
}
public boolean changeFile(String path) {
	boolean isSuccess = false;
	File oldfile = new File(path);
	String fileName = oldfile.getName();
	String name = fileName.substring(0,fileName.lastIndexOf("."));
	String extensionWithDot = fileName.substring(fileName.lastIndexOf("."));
	//마음에 안들면 아래 부분을 수정하세요
	name = String.valueOf(System.currentTimeMillis());
	
	fileName = name+extensionWithDot;
	
	String parent = oldfile.getParent();
	File newFile = new File(parent, fileName);
	isSuccess = oldfile.renameTo(newFile);
	return isSuccess;
	}
}


