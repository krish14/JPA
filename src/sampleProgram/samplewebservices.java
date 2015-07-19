import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;


public class samplewebservices {
	
	public static void main(String[] args) {

	  try {
     
     		  
		//URL url = new URL("http://localhost:8080/webservices/xml/car/getCarDetails");	
		//  URL url = new URL("http://cas.tn.gov.in:8080/eDistrict_service/resources/citizenregistration/pushapplog");
		  
		  URL url = new URL("http://10.163.14.48:9090/eDistrict_NewService_D/resources/citizenregistration/pushapplog");
		  
		  
		  
		  HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		
		System.out.println("==>" +conn.getURL());
	 
	 
	    conn.setRequestMethod("POST");
	   
	    conn.setRequestProperty("Accept-Type", "text/plain");
	    conn.setRequestProperty("Content-Type", MediaType.APPLICATION_XML);
		 
		conn.setDoOutput(true);
	 	conn.setDoInput(true);	
		conn.connect();
		 
		 
		 
		/* 
		applog app = new applog();
		app.setUser_id("cscari");
		app.setDept_id("14");
		app.setService_code("1401");
		app.setDistrict_code("22");
		app.setVillage_code("21");
		app.setTaluk_code("44");
		app.setAppl_dt("2013");	
		app.setAppl_id("2015/0101/01/1198/S");
		app.setUrban_unit_code("100");
		app.setAppl_status("01");
		app.setUpdate_dt("2015-02-03 10:30:30");
		app.setSurvey_no("001");
		app.setSubdiv_no("01");
		app.setPatta_no(11);
		app.setRole_id(1);
		app.setSource_id("600");
		app.setCsc_charge(60);
		app.setGovt_charge(30);
		app.setCan("xyz");
		app.setDespatch_date("02/01/2015");
		app.setReceived_date("05/01/2015");
		app.setIp_address("57");
		app.setGenerated_date("11/01/2015");
		app.setSource_name("rama");
		app.setRenewal_no(40);*/
		
		String xml="<applog>" +
				"<user_id>cscari</user_id>" +
				"<dept_id>01</dept_id>" +
				"<service_code>0101</service_code>" +
				"<district_code>01</district_code>" +
				"<taluk_code>01</taluk_code>" +
				"<village_code>001</village_code>" +
				"<urban_unit_code>B001</urban_unit_code>" +
				"<appl_dt>2015-02-02</appl_dt>" +
				"<appl_status>01</appl_status>" +
				"<update_dt>2015-02-03 10:30:30</update_dt>" +
				"<appl_id>2015/0202/01/1235/Z</appl_id>" +
				"<survey_no>001</survey_no>" +
				"<subdiv_no>01</subdiv_no>" +
				"<patta_no>11</patta_no>" +
				"<role_id>1</role_id>" +
				"<source_id>00</source_id>" +
				"<csc_charge>60</csc_charge>" +
				"<govt_charge>70</govt_charge>" +
				"<can>00103000001</can>" +
				"<despatch_date>2015-02-03</despatch_date>" +
				"<received_date>2015-02-035</received_date>" +
				"<ip_address>48</ip_address>" +
				"<generated_date>2015-02-03</generated_date>" +
				"<source_name>cscari</source_name>" +
				"<renewal_no>50</renewal_no>" +
				"</applog>";
		
		
		 //String xml="<applog><user_id>cscari</user_id><appl_status>01</appl_status><update_dt>2015-02-03 10:30:30</update_dt><appl_id>2015/0202/01/0000/Z</appl_id><role_id>1</role_id></applog>";

		Authenticator.setDefault (new Authenticator() {
	    protected PasswordAuthentication getPasswordAuthentication() {
	        return new PasswordAuthentication ("elog", "pqrd4834".toCharArray());
	    }
		});
		
	 
	 //XStream xstream = new XStream();
    // xstream.toXML(app, conn.getOutputStream());
		 OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
         out.write(xml.toString());
         out.close();
		 
     //conn.getOutputStream().close();
     //System.out.println(xstream.toXML(app));
     
	
	
   System.out.println(conn.getResponseCode());
 
  
	// if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
	if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}

	BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

 	conn.disconnect();

	  } catch (MalformedURLException e) {
		e.printStackTrace();

	  } catch (IOException e) {
		e.printStackTrace();
	 }
	}
	
}


/*public class samplewebservices {
	
	public static void main(String[] args) {

	  try {
     
     		  
		URL url = new URL("http://localhost:8082/webservices/xml/car/getCarDetails");	
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		System.out.println("==>" +conn.getURL());
	 
	 
	    conn.setRequestMethod("POST");
	    conn.setRequestProperty("Accept-Type", "text/plain");
	    conn.setRequestProperty("Content-Type", MediaType.APPLICATION_XML);
		 
		conn.setDoOutput(true);
	 	conn.setDoInput(true);	
		conn.connect();
		 
		applog app = new applog();
		app.setAppl_dt("2013");
		app.setAppl_id("CNT");
		app.setDept_id("14");
		app.setService_code("1401");
		app.setUser_id("1");

		Authenticator.setDefault (new Authenticator() {
	    protected PasswordAuthentication getPasswordAuthentication() {
	        return new PasswordAuthentication ("elog", "pgrd4834".toCharArray());
	    }
		});
	 
	 
	 XStream xstream = new XStream();
     xstream.toXML(app, conn.getOutputStream());
     conn.getOutputStream().close();
     System.out.println(xstream.toXML(app));
     
	
	
   System.out.println(conn.getResponseCode());
 
  
	//if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
	if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}

	BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

		String output;
		System.out.println("Output from Server .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

 	conn.disconnect();

	  } catch (MalformedURLException e) {
		e.printStackTrace();

	  } catch (IOException e) {
		e.printStackTrace();
	 }
	}
	
}*/

