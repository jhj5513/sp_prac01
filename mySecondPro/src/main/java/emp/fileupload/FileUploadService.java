package emp.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

//MultipartFile�� �����ִ� ���ε�� ������ ����Ʈ �����͸� ���� ������ ���Ϸ� �����ϴ� �۾��� ����
@Service // Service or Component�� �۾� ����
public class FileUploadService {
	FileOutputStream fos;

	public void upload(MultipartFile file, String path, String fileName) {
		
		try {
			//DispatcherServlet�� ���� ��ȯ�� ����Ʈ ������ ������ �����ؼ� ���� ���Ϸ� ���� �۾�
			byte[] data = file.getBytes();
			fos = new FileOutputStream(path+File.separator+fileName);//seperator�� ��ȭ
			fos.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {

			}
		}
	}

}
