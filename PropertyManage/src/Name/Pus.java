package Name;

import java.sql.Date;

/**
 * @author gzc
 *
 */
public class Pus {
	
	private	int propertyid; //�ʲ�id
	private	int userid;  //�û�id
	private	Date date;  //����������
	private	String status; //��״̬
	
	
	
	
	/**
	 * 
	 */
	public Pus() {
		
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param propertyid
	 * @param userid
	 * @param date
	 * @param status
	 */
	public Pus(int propertyid, int userid, Date date, String status) {
		super();
		this.propertyid = propertyid;
		this.userid = userid;
		this.date = date;
		this.status = status;
	}

	/**
	 * @return the propertyid
	 */
	public int getPropertyid() {
		return propertyid;
	}
	/**
	 * @param propertyid the propertyid to set
	 */
	public void setPropertyid(int propertyid) {
		this.propertyid = propertyid;
	}
	/**
	 * @return the userid
	 */
	public int getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(int userid) {
		this.userid = userid;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
