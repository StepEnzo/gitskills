/**
 * 
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Name.Pus;
//import Name.PusTable;



/**
 * @author gzc
 *
 */
public class PusDAO {
	
	
	public static PusDAO getInstance() {
		return new PusDAO();
	}
	
	/*	�����ݿ�pus���в����µ�һ�С�
	 *  @param Pus��data
	 *  
	 */
	public boolean insert(Pus data) {
		Connection conn = null;
		boolean f = true;
		try {
			conn = Mysql.getCon();
			Statement stmt = conn.createStatement();
			int propertyid=data.getPropertyid();
			int userid=data.getUserid();
			Date date=data.getDate();
			String status=data.getStatus();
			String sql="INSERT INTO pus(propertyid,userid,date,status)values("+propertyid+ ","+userid+" ,'"+date+"' ,'"+status+"')"; 
			int i=stmt.executeUpdate(sql);
			if(i!=1) {
				f=false;
				System.out.println("����ʧ�ܣ�");
			}
			return f;
	}catch (SQLException s) {
		System.out.println(s);	
		return false;
	}
		finally {
			if (conn != null) {
				try {					
					conn.close();					
				} catch (SQLException ignore) {					
				}
			}
		}
	}
	
	/*
	 * ͨ��������û�id��pus���в�ѯ������ص����ݡ�
	 * @param �û�id��int
	 * @return Pus����б�
	 */
	public ArrayList<Pus> selectByUserid(int id) {
		Connection conn = null;
		ArrayList<Pus> puslist = new ArrayList<Pus>();
		try {
			
			conn = Mysql.getCon();
			Statement stmt = conn.createStatement();
			String sql="select propertyid,userid,date,status from pus where userid = "+id; 
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Pus pus = new Pus();
				pus.setPropertyid(rs.getInt("propertyid"));
				pus.setUserid(id);
				pus.setDate(rs.getDate("date"));
				pus.setStatus(rs.getString("status"));
				puslist.add(pus);
			}
			return puslist;
	}catch (SQLException s) {
		System.out.println(s);	
		return null;
	}
		finally {
			if (conn != null) {
				try {					
					conn.close();					
				} catch (SQLException ignore) {					
				}
			}
		}
	}
	
	
	/*
	 * ͨ��������ʲ�id��pus���в�ѯ������ص����ݡ�
	 * @param ��Ʒid��int
	 * @return Pus����б�
	 */
	public ArrayList<Pus> selectByPropertyid(int id) {
		Connection conn = null;
		
		ArrayList<Pus> puslist = new ArrayList<Pus>();
		try {
			
			conn = Mysql.getCon();
			Statement stmt = conn.createStatement();
			String sql="select propertyid,userid,date,status from pus where propertyid = "+id; 
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Pus pus = new Pus();
				pus.setPropertyid(id);
				pus.setUserid(rs.getInt("userid"));
				pus.setDate(rs.getDate("date"));
				pus.setStatus(rs.getString("status"));
				puslist.add(pus);
			}
			return puslist;
	}catch (SQLException s) {
		System.out.println(s);	
		return null;
	}
		finally {
			if (conn != null) {
				try {					
					conn.close();					
				} catch (SQLException ignore) {					
				}
			}
		}
	}
	
	/*
	 * ͨ�������״̬���ʹ�pus���в�ѯ������ص����ݡ�
	 * @param ��״̬ status
	 * @return Pus����б�
	 */
	public ArrayList<Pus> selectByStatus(String status) {
		Connection conn = null;
		ArrayList<Pus> puslist = new ArrayList<Pus>();
		try {
			
			conn = Mysql.getCon();
			Statement stmt = conn.createStatement();
			String sql="select propertyid,userid,date,status from pus where status = '"+status+"'"; 
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Pus pus = new Pus();
				pus.setPropertyid(rs.getInt("propertyid"));
				pus.setUserid(rs.getInt("userid"));
				pus.setDate(rs.getDate("date"));
				pus.setStatus(status);
				puslist.add(pus);
			}
			return puslist;
	}catch (SQLException s) {
		System.out.println(s);	
		return null;
	}
		finally {
			if (conn != null) {
				try {					
					conn.close();					
				} catch (SQLException ignore) {					
				}
			}
		}
	}
	
	/*
	 * ͨ�������userid,propertyid��status�ı�Pus���ж�Ӧ�е�status��dateΪ�����changedstatus,date
	 * @param userid �û�id
	 * @param propertyid �ʲ�id
	 * @param  status ��ǰ��״̬
	 * @param changedstatus ��Ҫ�ı��״̬
	 * @param date ִ�иò���������
	 * @return Booleanֵ���Ƿ���³ɹ���
	 */
	public boolean changeStatus(int userid,int propertyid,String status,String changedstatus,Date date) {
		Connection conn = null;
		boolean f;
		try {
			conn = Mysql.getCon();
			Statement stmt = conn.createStatement();
			String sql="update pus set date='"+date+"',status = '"+ changedstatus+"' where status = '"+status+"' and userid = "+userid+" and propertyid ="+propertyid; 
			int i=stmt.executeUpdate(sql);
			if(i!=1) f=false;
			else f=true;
			return f;
	}catch (SQLException s) {
		System.out.println(s);	
		return false;
	}
		finally {
			if (conn != null) {
				try {					
					conn.close();					
				} catch (SQLException ignore) {					
				}
			}
		}
	}
	
	/*
	 * ͨ���û�id�ͼ�¼��״̬ ����PusTable���б�
	 * @param user.id pus.status
	 * @return List<PusTable>
	 */
	public List<Pus> searchByUser_Status(int id,String status) {
		Connection conn = null;
		List<Pus> list = new ArrayList<Pus>();
		try {
			conn = Mysql.getCon();
			Statement stmt = conn.createStatement();
//			String sql="select propertyitem.id,propertyitem.date,pus.date"
//					+ "from user,pus,propertyitem where user.id=pus.userid and propertyitem.pid=pus.propertyid and user.id="+id+" and pus.status= '"+status+"'"; 
			String sql = "select propertyid,userid,date,status from pus where userid="+id+" and status= '"+status+"'";;
			ResultSet rs=stmt.executeQuery(sql);
			while (rs.next()) {
				Pus pus = new Pus();
				pus.setPropertyid(rs.getInt("propertyid"));
				pus.setUserid(id);
				pus.setDate(rs.getDate("date"));
				pus.setStatus(rs.getString("status"));
				list.add(pus);
			}
//			while (rs.next()) {
//				int nameid = rs.getInt("propertyitem.id");
//				String select="select propertyname,brand,modelnumber,specification from propertyname where id="+nameid+" and namecol = 1";
//				ResultSet rs1=stmt.executeQuery(select);
//				if (rs1.next()){
//					PusTable property = new PusTable();
//					property.setDate(rs.getDate("pus.date"));
//					property.setBuydate(rs.getDate("propertyitem.date"));
//					property.setStatus(status);
//					property.setPropertyname(rs1.getString("propertyname"));
//					property.setBrand(rs1.getString("brand"));
//					property.setModelnumber(rs1.getString("modelnumber"));
//					property.setSpecification(rs1.getString("specification"));
//					list.add(property);
//				}
//			}
			
			return list;
	}catch (SQLException s) {
		System.out.println(s);	
		return null;
	}
		finally {
		if (conn != null) {
			try {					
				conn.close();					
			} catch (SQLException ignore) {					
			}
		}
		}	
	}
}
