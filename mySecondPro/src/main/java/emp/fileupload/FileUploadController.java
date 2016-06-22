package emp.fileupload;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

@Controller
public class FileUploadController {
	@Autowired
	FileUploadService service;
	
	//get방식으로 요청될 때 실행될 메소드 >  insert page를 response
	@RequestMapping(value="/upload.do", method = RequestMethod.GET)
	public String showPage(){
		return "upload/form";
	}
	
	//post방식으로 요청될 떄 실행할 메소드 > 실제 db에 insert를 하기 위한 기능을 수행
	@RequestMapping(value="/upload.do", method = RequestMethod.POST)
	public ModelAndView runFileUpload(HttpServletRequest req, FileUploadDTO fileInfo) throws Exception{
		System.out.println(fileInfo);
		MultipartFile file = fileInfo.getUpFile();	
		String path = WebUtils.getRealPath(req.getSession().getServletContext(), "/upload");	//path는 서블릿에서 접근하지 컨트롤러에서 접근하지 말아야. > WebUtils이용
		System.out.println("업로드될 파일의 경로 : " +path);
		String fileName = file.getOriginalFilename();
		service.upload(file, path, fileName);
		return new ModelAndView("index");
	
	}
}
