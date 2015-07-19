



import java.net.URL;
import java.security.cert.X509Certificate;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
public class WebClientsbi {

	@WebService(name ="TamilTaxPortType", targetNamespace = "http://userfunctions.mswitch.tcs.com")
	public interface TamilTax {
		@WebMethod(operationName="DealerVerification")
		String DealerVerification(String getLicenseData);
	}

	public static void main(String[] args) throws Exception {

		try{

				
                        //to access ssl site from java  

			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}
				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}
				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			} };
			// Install the all-trusting trust manager
			final SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			// Create all-trusting host name verifier
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};

			// Install the all-trusting host verifier
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);


                           
                        //Invoking WSDL file

			Service serv = Service.create(new URL(
			"https://115.114.131.65:8443/TAMIL/services/TamilTax?wsdl"), 
			new QName("http://userfunctions.mswitch.tcs.com", "TamilTax"));
			
            //encrypted String for <?xml version=\"1.0\" encoding=\"UTF-8\" ?><counterpay><appl_id>S01HARTST201408250000433</appl_id><tran_id>REG20140825000011</tran_id><dcode>TNREG</dcode><total_amt>2.00</total_amt><payment_mode>O</payment_mode></counterpay>

			String sbi="vGRDJgEuAFrsoMb9MflO+vFy4WQrYOWxiD0Zsb+gXGAM4QPdOqfbtTK03VntP3UGFqEcKIAO2oWZ"+
			"DdQ3PkbmBX2FEl7JrniMwlPwvcLvIXB3/OXTT/NVk5sfYPXWnSGc3RcMPkrL7u/38SLjMU5+zU6e"+
			"vpcxZxAJNwrwhttC+c9E4FtlqqyWfX3f98U8RHC4mQt2wtdOJLT87OMPnerbomAIkpKCmuJbEq0w"+
			"J7Xhf8Ouozb9vlCvw+qlg2KmbGURl/yePymCsEF6yM0RFL1SzingjMMUM6Nxe4G7aWVWs+g=";
				
			TamilTax port = serv.getPort(TamilTax.class);

			BindingProvider bp = (BindingProvider)port;

			String parameter="DEPT_CODE=TNREG&BANk_CODE=SBI&encdata="+sbi;
			
			bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://115.114.131.65:8443/TAMIL/services/TamilTax");

			System.out.println("webservice"+port.DealerVerification(parameter));
		}
		catch (MalformedURLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (Exception e2) {
			e2.printStackTrace();
			// TODO: handle exception
		}
	}
}