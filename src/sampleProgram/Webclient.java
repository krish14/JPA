import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;


public class Webclient {
	public static void main(String args []){
        try {
//Configure and open a connection to the site you will send the request
            URL url = new URL("http://cas.tn.gov.in:8080/eDistrict_service/resources/citizenregistration/pushapplog/");
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();

            System.out.println("connected");
    //by setting doOutput property to true we indicate that we will use this urlConnection to write data
String xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?><applog>"+
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
    

   
    urlConnection.setRequestMethod("POST");
       
   // by setting content-type property setrequestproperty( content-type application/xml )to  application/x-www-form-urlencoded we define that
  // the data that we intent to write on the request's body consist of  key/value pairs

    urlConnection.setRequestProperty("content-type","application/xml");
    urlConnection.setRequestProperty("Accept", "text/plain");
   // urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
    urlConnection.setDoOutput(true);
// Get the request's output stream 
    OutputStreamWriter out = new OutputStreamWriter(urlConnection.getOutputStream());
  
// write the data to the request body
   // out.write(xml.trim().toString());
    
    out.flush();

    out.close();
//Read server's response
    System.out.println(urlConnection.getResponseCode());

    
    BufferedReader in = new BufferedReader(new InputStreamReader(
    		urlConnection.getInputStream()));
    String inputLine;
    
    while ((inputLine = in.readLine()) != null) 
        System.out.println(inputLine);
    in.close();

   /* InputStream inputStream = urlConnection.getInputStream();
    String encoding = urlConnection.getContentEncoding();
    */
   // System.out.println("enc"+encoding+""+inputStream);
    
  //  String body = IOUtils.toString(inputStream, encoding);
    //System.out.println(body);
        } catch (IOException ex) {
        	
        	ex.printStackTrace();
           // Logger.getLogger(RequestTest.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
