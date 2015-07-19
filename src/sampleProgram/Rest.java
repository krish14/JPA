import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;

public class Rest {
	
	public static void main(String[] args) {

	  try {

		URL url = new URL("http://cas.tn.gov.in:8080/eDistrict_service/resources/citizenregistration/getTxnDetailsForGivenDate/1/12/2014");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//conn.setDoOutput(true);
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-Type", "application/xml");

		
		String xml="<applog>"+
	    "<user_id>login_user_name</user_id>"+
	    "<dept_id>14</dept_id>"+
	    "<service_code>1401</service_code>"+
	    "<district_code>17</district_code>"+
	    "<taluk_code>01</taluk_code>"+
	    "<village_code>029</village_code>"+
	    "<urban_unit_code></urban_unit_code>"+
	    "<appl_dt>2014-12-08</appl_dt>"+
	    "<appl_status>03</appl_status>"+
	    "<update_dt>2014-12-08 11:00:52</update_dt>"+
	    "<appl_id>unique number</appl_id>"+
	    "<survey_no>0</survey_no>"+
	    "<subdiv_no>0</subdiv_no>"+
	    "<patta_no>0</patta_no>"+
	    "<role_id>1</role_id>"+
	    "<source_id>00</source_id>"+
	    "<csc_charge>0</csc_charge>"+
	    "<govt_charge>0</govt_charge>"+
	    "<can></can>"+
	    "<despatch_date></despatch_date>"+
	    "<received_date></received_date>"+
	    "<ip_address>ur_server_ip</ip_address>"+
	    "<generated_date>2014-12-08 11:00:52</generated_date>"+
	    "<source_name>login_user_name</source_name>"+
	    "<renewal_no></renewal_no>"+
	"</applog>";             

	Authenticator.setDefault (new Authenticator() {
	    protected PasswordAuthentication getPasswordAuthentication() {
	        return new PasswordAuthentication ("elog", "pgrd4834".toCharArray());
	    }
	});
		
		String input = "{\"qty\":100,\"name\":\"iPad 4\"}";

		//OutputStream os = conn.getOutputStream();
	//	os.write(xml.getBytes());
		//os.flush();

		/*if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ conn.getResponseCode());
		}*/

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

