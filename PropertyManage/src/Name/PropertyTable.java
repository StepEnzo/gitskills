/**
 * 
 */
package Name;


import java.sql.*;

/**
 * @author gzc
 *
 */
public class PropertyTable {
	private int pid;//��ҵ�ʲ�������Ʒ��id
	private int id;  //��ҵ�ʲ�����id
	private String propertyname;//��ҵ�ʲ�����
	private String brand;//Ʒ��
	private String modelnumber;//�ͺ�
	private String specification;//���
	private String status;//״̬����ʾ���ʲ���ǰ�Ƿ�ɱ�����
	private Date date; //�ɹ�����
	/**
	 * 
	 */
	public PropertyTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}
	/**
	 * @return the propertyname
	 */
	public String getPropertyname() {
		return propertyname;
	}
	/**
	 * @param propertyname the propertyname to set
	 */
	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the modelnumber
	 */
	public String getModelnumber() {
		return modelnumber;
	}
	/**
	 * @param modelnumber the modelnumber to set
	 */
	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}
	/**
	 * @return the specification
	 */
	public String getSpecification() {
		return specification;
	}
	/**
	 * @param specification the specification to set
	 */
	public void setSpecification(String specification) {
		this.specification = specification;
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
	
	
}
