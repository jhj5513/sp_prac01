package emp.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

//MultipartFile이 갖고있는 업로드된 파일의 바이트 데이터를 실제 서버에 파일로 생성하는 작업을 수행
@Service // Service or Component로 작업 가능
public class FileUploadService {
	FileOutputStream fos;

	public void upload(MultipartFile file, String path, String fileName) {
		
		try {
			//DispatcherServlet에 의해 변환된 바이트 파일의 내용을 추출해서 실제 파일로 쓰는 작업
			byte[] data = file.getBytes();
			fos = new FileOutputStream(path+File.separator+fileName);//seperator는 원화
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
