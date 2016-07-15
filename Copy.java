package FileTest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class Copy {
	public static void main(String args[]){
		if(args.length!=2){
			System.out.println("����Ĳ�����ʽ����");
			System.out.println("����java copy Դ�ļ� Ŀ���ļ�·��");
			System.exit(1);
		}
		File f1=new File(args[0]);
		File f2=new File(args[1]);
		if(!f1.exists()){
			System.out.println("Դ�ļ�������!");
			System.exit(1);
		}
		InputStream input=null;
		OutputStream out=null;
		try{
			input=new FileInputStream(f1);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		try{
			out=new FileOutputStream(f2);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
	    if(input !=null && out !=null){
	    	int temp=0;
	    	try{
	    		while((temp=input.read())!=-1){
	    			out.write(temp);
	    		}
	    		System.out.println("�������!");
	    	}catch(IOException e){
	    		e.printStackTrace();
	    		System.out.println("����ʧ��");;
	    	}
	    	try{
	    		input.close();
	    		out.close();
	    	}catch(IOException e){
	    		e.printStackTrace();
	    	}
	    }
	}

}
