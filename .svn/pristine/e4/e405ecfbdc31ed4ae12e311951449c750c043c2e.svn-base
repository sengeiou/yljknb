package com.wondersgroup.local.k5.f10506001.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;

import com.wondersgroup.framework.core.web.struts2.action.BaseAjaxAction;
import com.wondersgroup.framework.core.web.vo.VOUtils;
import com.wondersgroup.framework.core5.model.vo.ValueObject;
import com.wondersgroup.local.k5.f10506001.vo.DxzbUploadVO;
import com.wondersgroup.local.k5.f10506001.vs.F10506001VS;

public class UploadFileAction extends BaseAjaxAction{
	private static final long serialVersionUID = 1L;
	
	private static final String prefix = "{\"success\":true,\"result\":[";

	private static final String suffex = "]}";
	
	private F10506001VS f10506001VS;
	
	private DxzbUploadVO dxzbUploadVO = new DxzbUploadVO();
	
	public DxzbUploadVO getDxzbUploadVO() {
		return dxzbUploadVO;
	}

	public void setDxzbUploadVO(DxzbUploadVO dxzbUploadVO) {
		this.dxzbUploadVO = dxzbUploadVO;
	}

	@Override
	public ValueObject getValueObject() {
		return this.getDxzbUploadVO();
	}

	/**
	 * 
	 * @Description:保存上传附件       
	 * @author  张磊
	 * @date 2015-1-8 下午01:04:31
	 */
	@Override
	protected String operate() {
		File file = dxzbUploadVO.getFiledata();
		String filename = dxzbUploadVO.getFiledataFileName();
		InputStream is = null;
    	OutputStream os = null;
    	File deskFile = null;
    	String filePath = "";
        try {
            if(null != file){
                is = new FileInputStream(file);
                String path = "D:/upload";
                if(!new File(path).exists()){
                    new File(path).mkdirs();
                }
                deskFile = new File(path+"/"+file.getName());
                File savefileTemp = new File(filename);
                File savefile = new File(path+"/"+savefileTemp.getName());
                os = new FileOutputStream(deskFile);
                byte[] bytefer = new byte[1024];
                int length = 0;
                while ((length = is.read(bytefer)) != -1) {
                    os.write(bytefer, 0, length);
                }
                FileUtils.copyFile(deskFile, savefile); 
                filePath = path+"/"+filename;
            }
        } catch (FileNotFoundException e) {
        	throw new RuntimeException(e);
        } catch (IOException e) {
        	throw new RuntimeException(e);
        }finally{
        	try{
        		os.close();
        		is.close();
        		deskFile.delete();
        	}catch(Exception ex){
        		
        	}
        }
        dxzbUploadVO.setBsz005_succ(filePath);
        String result = prefix + VOUtils.getJsonData(dxzbUploadVO) + suffex;
		return result;
	}

	/**
	 * 
	 * @methodName: updateKc62
	 * @Description:修改流程状态至复议待审核   
	 * @return  String 
	 * @author  张磊
	 * @date 2015-1-8 下午01:04:53
	 */
//	public String updateKc62(){
//		String filePath = this.getServletRequest().getParameter("filePath");
//		String fileName = this.getServletRequest().getParameter("fileName");
//		String kc62Ids = this.getServletRequest().getParameter("kc62Ids");
//		dxzbUploadVO.setKc62Ids(kc62Ids);
//		dxzbUploadVO.setLoginName(String.valueOf(getSession().get(LoginInterceptor.SECURITY_LOGIN_NAME)));
//		if(StringTools.hasText(filePath)){
//			this.getF10506001VS().saveKe02Info(kc62Ids,filePath,fileName,String.valueOf(getSession().get(LoginInterceptor.SECURITY_LOGIN_NAME)));
//		}
//		this.getF10506001VS().updateKc62(dxzbUploadVO);
//		String result = prefix  + suffex;
//    	createJSonData(result);
//		return AJAX;
//	}
	
	public F10506001VS getF10506001VS() {
		return f10506001VS;
	}

	public void setF10506001VS(F10506001VS f10506001vs) {
		f10506001VS = f10506001vs;
	}

	public static String getPrefix() {
		return prefix;
	}

	public static String getSuffex() {
		return suffex;
	}
}
