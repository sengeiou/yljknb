package com.wondersgroup.bc.auditadministrativedisposal.admindis.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BaseAa10Keys implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String aaa100;
	
    private String aaa102;
    
    public BaseAa10Keys(){
    	
    }
    
    public BaseAa10Keys(String aaa100 , String aaa102){
    	this.aaa100 = aaa100;
    	this.aaa102 = aaa102;
    }

	public String getAaa100() {
		return aaa100;
	}

	public void setAaa100(String aaa100) {
		this.aaa100 = aaa100;
	}

	public String getAaa102() {
		return aaa102;
	}

	public void setAaa102(String aaa102) {
		this.aaa102 = aaa102;
	}
    
	@Override  
	public boolean equals(Object obj){
		
		if(obj instanceof BaseAa10Keys){
			
			BaseAa10Keys keys = (BaseAa10Keys)obj;
			
			if(this.aaa100.equals(keys.aaa100) && this.aaa102.equals(keys.aaa102)){
				return true;
			}
		}
		
		return false;
	}
	
	 @Override  
	 public int hashCode(){
		 
		 final int PRIME = 31;
		 
         int result = 1;
         
         result = PRIME * result + ((aaa100 == null) ? 0 : aaa100.hashCode());

         result = PRIME * result + ((aaa102 == null) ? 0 : aaa102.hashCode());
         
         return result;
	 }

}
