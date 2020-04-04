package com.example.common.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	public static File tfile;
	
	public static void main(String[] args) {
		//modif();
		//File filename = new File("F:\\workspaces_own\\other\\picture\\bed\\微信图片_20200404133655.jpg");
		
		//filename.renameTo(new File("F:\\workspaces_own\\other\\picture\\bed\\bed_20200404133655.jpg"));
		List<String> list = getFile();
	}
	
	public static List<String> getFile(){
		List<String> list = new ArrayList<>();
		File file = new File("F:\\workspaces_own\\other\\picture");
		getFileName(file , list);
		
		return list;
		
	}
	
	public static void getFileName(File file ,List<String> list) {
		if (file.isDirectory()) {
			File[] fs = file.listFiles();
			for (File f : fs) {
				getFileName(f,list);
			}
		} else {
			String name = file.getName().split("_")[1];
			String name2 = file.getParentFile().getName();
			list.add(name2+"/"+name2+"_"+name);
		}

	}


	public static void modif() {
		File filename = new File("F:\\workspaces_own\\other\\picture");

		bianli(filename);
	}

	public static void bianli(File file) {
		if (file.isDirectory()) {
			File[] fs = file.listFiles();
			for (File f : fs) {
				bianli(f);
			}
		} else {
			
			String name = file.getName().split("_")[1];
			String parent = file.getParent();
			String name2 = file.getParentFile().getName();
			tfile = new File(parent+"\\"+name2+"_"+name);
			file.renameTo(tfile);
			//System.out.println(file.getPath());
		}

	}

}