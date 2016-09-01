package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Discussionfeed {
	public Map fed(String strig ){
		List sq = new ArrayList(); //for id
		List kk = new ArrayList(); // for comment
		List rpy = new ArrayList(); //for rpy
		List qq=null;

				Connect input = new Connect();
		 Connection data = input.getConnect();
		 try{
			   Statement rep = data.createStatement(); // to get id
			   Statement ep = data.createStatement(); // to get comments
			   //to get comm and id
			   ResultSet mn = rep.executeQuery("select ID,content from discussionfeed where discussion ='"+strig+"' AND parentFeedID="+0+" order BY time DESC");
			   Statement sep = data.createStatement();
		 
		 while(mn.next()){
			 sq.add(mn.getInt("ID"));
			 kk.add(mn.getString("content"));
		 }
		 Iterator mck = sq.iterator();
		 while(mck.hasNext()){ //reply of specific comm
			 int s = (int) mck.next();
			   ResultSet mnl = ep.executeQuery("select ID,content from discussionfeed  where discussion ='"+strig+"'and parentFeedID="+s+" order BY time DESC");
			   qq = new ArrayList();
      while(mnl.next()){
    	  //replies -- reply
    	  qq.add(mnl.getString("content"));	  
      }
      
       
          rpy.add(qq);
		 }
		 
		 
	}catch(Exception e){
		
	} 
  Map newmap = new HashMap();

  newmap.put("ID",sq);
  newmap.put("content",kk);
  newmap.put("reply",rpy);
return newmap;

}

public void has(String lm, String fq,int qw) {
	try{
		 Connect input = new Connect();
		 Connection data = input.getConnect();
		 String query = "insert into discussionfeed  values(?,?,?,?,?)";
		 PreparedStatement ps = data.prepareStatement(query);
		 ps.setString(1,null);
		 Date time = new Date();
		 DateFormat change = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String ttime = change.format(time);
		 ps.setString(2,ttime);
		 ps.setInt(3,qw);
		 ps.setString(4,lm);
		 ps.setString(5,fq);
		 int v = ps.executeUpdate();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}


public ArrayList<String[]> list() {
	
		

				Connect input = new Connect();
		 Connection data = input.getConnect();
			ArrayList<String[]> nm = new ArrayList<String[]>();
		 try{
			   Statement rep = data.createStatement(); // to get id
			   Statement ep = data.createStatement(); // to get comments
			   //to get comm and id
			   ResultSet mn = rep.executeQuery("select Name from discussion");
			 
		 
			   while(mn.next()){
					String[] n = new String[1];
					n[0] = mn.getString("Name");
					
					nm.add(n);
				}
		 }catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				return nm;}}
